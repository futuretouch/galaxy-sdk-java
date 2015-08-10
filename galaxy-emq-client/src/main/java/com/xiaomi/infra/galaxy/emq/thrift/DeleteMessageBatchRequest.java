/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-6")
public class DeleteMessageBatchRequest implements libthrift091.TBase<DeleteMessageBatchRequest, DeleteMessageBatchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteMessageBatchRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeleteMessageBatchRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST_FIELD_DESC = new libthrift091.protocol.TField("deleteMessageBatchRequestEntryList", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteMessageBatchRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteMessageBatchRequestTupleSchemeFactory());
  }

  /**
   * Queue name;
   * 
   */
  public String queueName; // required
  /**
   * List of DeleteMessageRequest;
   * 
   */
  public List<DeleteMessageBatchRequestEntry> deleteMessageBatchRequestEntryList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * List of DeleteMessageRequest;
     * 
     */
    DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST((short)2, "deleteMessageBatchRequestEntryList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST
          return DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST, new libthrift091.meta_data.FieldMetaData("deleteMessageBatchRequestEntryList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, DeleteMessageBatchRequestEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeleteMessageBatchRequest.class, metaDataMap);
  }

  public DeleteMessageBatchRequest() {
  }

  public DeleteMessageBatchRequest(
    String queueName,
    List<DeleteMessageBatchRequestEntry> deleteMessageBatchRequestEntryList)
  {
    this();
    this.queueName = queueName;
    this.deleteMessageBatchRequestEntryList = deleteMessageBatchRequestEntryList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteMessageBatchRequest(DeleteMessageBatchRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetDeleteMessageBatchRequestEntryList()) {
      List<DeleteMessageBatchRequestEntry> __this__deleteMessageBatchRequestEntryList = new ArrayList<DeleteMessageBatchRequestEntry>(other.deleteMessageBatchRequestEntryList.size());
      for (DeleteMessageBatchRequestEntry other_element : other.deleteMessageBatchRequestEntryList) {
        __this__deleteMessageBatchRequestEntryList.add(new DeleteMessageBatchRequestEntry(other_element));
      }
      this.deleteMessageBatchRequestEntryList = __this__deleteMessageBatchRequestEntryList;
    }
  }

  public DeleteMessageBatchRequest deepCopy() {
    return new DeleteMessageBatchRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.deleteMessageBatchRequestEntryList = null;
  }

  /**
   * Queue name;
   * 
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   * 
   */
  public DeleteMessageBatchRequest setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public int getDeleteMessageBatchRequestEntryListSize() {
    return (this.deleteMessageBatchRequestEntryList == null) ? 0 : this.deleteMessageBatchRequestEntryList.size();
  }

  public java.util.Iterator<DeleteMessageBatchRequestEntry> getDeleteMessageBatchRequestEntryListIterator() {
    return (this.deleteMessageBatchRequestEntryList == null) ? null : this.deleteMessageBatchRequestEntryList.iterator();
  }

  public void addToDeleteMessageBatchRequestEntryList(DeleteMessageBatchRequestEntry elem) {
    if (this.deleteMessageBatchRequestEntryList == null) {
      this.deleteMessageBatchRequestEntryList = new ArrayList<DeleteMessageBatchRequestEntry>();
    }
    this.deleteMessageBatchRequestEntryList.add(elem);
  }

  /**
   * List of DeleteMessageRequest;
   * 
   */
  public List<DeleteMessageBatchRequestEntry> getDeleteMessageBatchRequestEntryList() {
    return this.deleteMessageBatchRequestEntryList;
  }

  /**
   * List of DeleteMessageRequest;
   * 
   */
  public DeleteMessageBatchRequest setDeleteMessageBatchRequestEntryList(List<DeleteMessageBatchRequestEntry> deleteMessageBatchRequestEntryList) {
    this.deleteMessageBatchRequestEntryList = deleteMessageBatchRequestEntryList;
    return this;
  }

  public void unsetDeleteMessageBatchRequestEntryList() {
    this.deleteMessageBatchRequestEntryList = null;
  }

  /** Returns true if field deleteMessageBatchRequestEntryList is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteMessageBatchRequestEntryList() {
    return this.deleteMessageBatchRequestEntryList != null;
  }

  public void setDeleteMessageBatchRequestEntryListIsSet(boolean value) {
    if (!value) {
      this.deleteMessageBatchRequestEntryList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      if (value == null) {
        unsetDeleteMessageBatchRequestEntryList();
      } else {
        setDeleteMessageBatchRequestEntryList((List<DeleteMessageBatchRequestEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      return getDeleteMessageBatchRequestEntryList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST:
      return isSetDeleteMessageBatchRequestEntryList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteMessageBatchRequest)
      return this.equals((DeleteMessageBatchRequest)that);
    return false;
  }

  public boolean equals(DeleteMessageBatchRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_deleteMessageBatchRequestEntryList = true && this.isSetDeleteMessageBatchRequestEntryList();
    boolean that_present_deleteMessageBatchRequestEntryList = true && that.isSetDeleteMessageBatchRequestEntryList();
    if (this_present_deleteMessageBatchRequestEntryList || that_present_deleteMessageBatchRequestEntryList) {
      if (!(this_present_deleteMessageBatchRequestEntryList && that_present_deleteMessageBatchRequestEntryList))
        return false;
      if (!this.deleteMessageBatchRequestEntryList.equals(that.deleteMessageBatchRequestEntryList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_deleteMessageBatchRequestEntryList = true && (isSetDeleteMessageBatchRequestEntryList());
    list.add(present_deleteMessageBatchRequestEntryList);
    if (present_deleteMessageBatchRequestEntryList)
      list.add(deleteMessageBatchRequestEntryList);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteMessageBatchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteMessageBatchRequestEntryList()).compareTo(other.isSetDeleteMessageBatchRequestEntryList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteMessageBatchRequestEntryList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.deleteMessageBatchRequestEntryList, other.deleteMessageBatchRequestEntryList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DeleteMessageBatchRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deleteMessageBatchRequestEntryList:");
    if (this.deleteMessageBatchRequestEntryList == null) {
      sb.append("null");
    } else {
      sb.append(this.deleteMessageBatchRequestEntryList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (deleteMessageBatchRequestEntryList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'deleteMessageBatchRequestEntryList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteMessageBatchRequestStandardSchemeFactory implements SchemeFactory {
    public DeleteMessageBatchRequestStandardScheme getScheme() {
      return new DeleteMessageBatchRequestStandardScheme();
    }
  }

  private static class DeleteMessageBatchRequestStandardScheme extends StandardScheme<DeleteMessageBatchRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, DeleteMessageBatchRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list72 = iprot.readListBegin();
                struct.deleteMessageBatchRequestEntryList = new ArrayList<DeleteMessageBatchRequestEntry>(_list72.size);
                DeleteMessageBatchRequestEntry _elem73;
                for (int _i74 = 0; _i74 < _list72.size; ++_i74)
                {
                  _elem73 = new DeleteMessageBatchRequestEntry();
                  _elem73.read(iprot);
                  struct.deleteMessageBatchRequestEntryList.add(_elem73);
                }
                iprot.readListEnd();
              }
              struct.setDeleteMessageBatchRequestEntryListIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, DeleteMessageBatchRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.deleteMessageBatchRequestEntryList != null) {
        oprot.writeFieldBegin(DELETE_MESSAGE_BATCH_REQUEST_ENTRY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.deleteMessageBatchRequestEntryList.size()));
          for (DeleteMessageBatchRequestEntry _iter75 : struct.deleteMessageBatchRequestEntryList)
          {
            _iter75.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteMessageBatchRequestTupleSchemeFactory implements SchemeFactory {
    public DeleteMessageBatchRequestTupleScheme getScheme() {
      return new DeleteMessageBatchRequestTupleScheme();
    }
  }

  private static class DeleteMessageBatchRequestTupleScheme extends TupleScheme<DeleteMessageBatchRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeleteMessageBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      {
        oprot.writeI32(struct.deleteMessageBatchRequestEntryList.size());
        for (DeleteMessageBatchRequestEntry _iter76 : struct.deleteMessageBatchRequestEntryList)
        {
          _iter76.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeleteMessageBatchRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      {
        libthrift091.protocol.TList _list77 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.deleteMessageBatchRequestEntryList = new ArrayList<DeleteMessageBatchRequestEntry>(_list77.size);
        DeleteMessageBatchRequestEntry _elem78;
        for (int _i79 = 0; _i79 < _list77.size; ++_i79)
        {
          _elem78 = new DeleteMessageBatchRequestEntry();
          _elem78.read(iprot);
          struct.deleteMessageBatchRequestEntryList.add(_elem78);
        }
      }
      struct.setDeleteMessageBatchRequestEntryListIsSet(true);
    }
  }

}

