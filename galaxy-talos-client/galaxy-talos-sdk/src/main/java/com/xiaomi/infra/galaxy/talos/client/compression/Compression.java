/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: xiajun@xiaomi.com
 */

package com.xiaomi.infra.galaxy.talos.client.compression;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xiaomi.infra.galaxy.talos.client.serialization.MessageSerialization;
import com.xiaomi.infra.galaxy.talos.thrift.Message;
import com.xiaomi.infra.galaxy.talos.thrift.MessageAndOffset;
import com.xiaomi.infra.galaxy.talos.thrift.MessageBlock;
import com.xiaomi.infra.galaxy.talos.thrift.MessageCompressionType;

public class Compression {
  private static final Logger LOG = LoggerFactory.getLogger(Compression.class);

  public static MessageBlock compress(List<Message> messageList,
      MessageCompressionType compressionType) throws IOException {
    MessageBlock messageBlock = new MessageBlock();
    messageBlock.setCompressionType(compressionType);
    messageBlock.setMessageNumber(messageList.size());

    int size = getMessageListSize(messageList);
    try {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream(size);
      DataOutputStream dataOutputStream = CompressionFactory.
          getConpressedOutputStream(compressionType, outputStream);
      for (Message message : messageList) {
        MessageSerialization.serializeMessage(message, dataOutputStream);
      }

      // close dataOutputStream;
      dataOutputStream.close();

      byte[] messageBlockData = outputStream.toByteArray();
      messageBlock.setMessageBlock(messageBlockData);
      messageBlock.setMessageBlockSize(messageBlockData.length);
    } catch (IOException e) {
      LOG.info("compress MessageList failed", e);
      throw e;
    }


    return messageBlock;
  }

  public static List<MessageAndOffset> decompress(List<MessageBlock> messageBlockList,
      long unHandledMessageNumber) throws IOException {
    List<MessageAndOffset> messageAndOffsetList = new ArrayList<MessageAndOffset>();
    long unHandledNumber = unHandledMessageNumber;

    for (int i = messageBlockList.size() - 1; i >= 0; --i) {
      List<MessageAndOffset> list = decompress(messageBlockList.get(i), unHandledNumber);
      unHandledNumber += list.size();
      messageAndOffsetList.addAll(0, list);
    }

    return messageAndOffsetList;
  }

  public static List<MessageAndOffset> decompress(MessageBlock messageBlock,
      long unHandledNumber) throws IOException {
    DataInputStream dataInputStream = CompressionFactory.getDeconpressedInputStream(
        messageBlock.getCompressionType(), ByteBuffer.wrap(messageBlock.getMessageBlock()));
    int messageNumber = messageBlock.getMessageNumber();

    List<MessageAndOffset> messageAndOffsetList =
        new ArrayList<MessageAndOffset>(messageNumber);
    try {
      for (int i = 0; i < messageNumber; ++i) {
        MessageAndOffset messageAndOffset = new MessageAndOffset();
        messageAndOffset.setMessageOffset(messageBlock.getStartMessageOffset() + i);
        Message message = MessageSerialization.deserializeMessage(dataInputStream);
        messageAndOffset.setMessage(message);
        messageAndOffset.setUnHandledMessageNumber(unHandledNumber + messageNumber - 1 - i);

        // add message to messageList;
        messageAndOffsetList.add(messageAndOffset);
      }
    } catch (EOFException e) {
      LOG.error("Decompress messageBlock failed", e);
      throw e;
//      Preconditions.checkArgument(false, "Decompress messageBlock failed, " + e);
    } catch (IOException e) {
      LOG.error("Decompress messageBlock failed", e);
      throw e;
    }

    return messageAndOffsetList;
  }

  private static int getMessageListSize(List<Message> messageList) {
    int size = 0;
    for (Message message : messageList) {
      size += MessageSerialization.getMessageSize(message);
    }

    return size;
  }
}
