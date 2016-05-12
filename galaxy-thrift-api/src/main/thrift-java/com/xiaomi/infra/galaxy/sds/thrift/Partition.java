/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
/**
 * 表分区信息，包括分区id，起始和结束的row key
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-12")
public class Partition implements libthrift091.TBase<Partition, Partition._Fields>, java.io.Serializable, Cloneable, Comparable<Partition> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Partition");

  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField START_KEY_FIELD_DESC = new libthrift091.protocol.TField("startKey", libthrift091.protocol.TType.MAP, (short)2);
  private static final libthrift091.protocol.TField STOP_KEY_FIELD_DESC = new libthrift091.protocol.TField("stopKey", libthrift091.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionTupleSchemeFactory());
  }

  public int partitionId; // optional
  public Map<String,Datum> startKey; // optional
  public Map<String,Datum> stopKey; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    PARTITION_ID((short)1, "partitionId"),
    START_KEY((short)2, "startKey"),
    STOP_KEY((short)3, "stopKey");

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
        case 1: // PARTITION_ID
          return PARTITION_ID;
        case 2: // START_KEY
          return START_KEY;
        case 3: // STOP_KEY
          return STOP_KEY;
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
  private static final int __PARTITIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION_ID,_Fields.START_KEY,_Fields.STOP_KEY};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.START_KEY, new libthrift091.meta_data.FieldMetaData("startKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.STOP_KEY, new libthrift091.meta_data.FieldMetaData("stopKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Partition.class, metaDataMap);
  }

  public Partition() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Partition(Partition other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partitionId = other.partitionId;
    if (other.isSetStartKey()) {
      this.startKey = other.startKey;
    }
    if (other.isSetStopKey()) {
      this.stopKey = other.stopKey;
    }
  }

  public Partition deepCopy() {
    return new Partition(this);
  }

  @Override
  public void clear() {
    setPartitionIdIsSet(false);
    this.partitionId = 0;
    this.startKey = null;
    this.stopKey = null;
  }

  public int getPartitionId() {
    return this.partitionId;
  }

  public Partition setPartitionId(int partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  public int getStartKeySize() {
    return (this.startKey == null) ? 0 : this.startKey.size();
  }

  public void putToStartKey(String key, Datum val) {
    if (this.startKey == null) {
      this.startKey = new HashMap<String,Datum>();
    }
    this.startKey.put(key, val);
  }

  public Map<String,Datum> getStartKey() {
    return this.startKey;
  }

  public Partition setStartKey(Map<String,Datum> startKey) {
    this.startKey = startKey;
    return this;
  }

  public void unsetStartKey() {
    this.startKey = null;
  }

  /** Returns true if field startKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKey() {
    return this.startKey != null;
  }

  public void setStartKeyIsSet(boolean value) {
    if (!value) {
      this.startKey = null;
    }
  }

  public int getStopKeySize() {
    return (this.stopKey == null) ? 0 : this.stopKey.size();
  }

  public void putToStopKey(String key, Datum val) {
    if (this.stopKey == null) {
      this.stopKey = new HashMap<String,Datum>();
    }
    this.stopKey.put(key, val);
  }

  public Map<String,Datum> getStopKey() {
    return this.stopKey;
  }

  public Partition setStopKey(Map<String,Datum> stopKey) {
    this.stopKey = stopKey;
    return this;
  }

  public void unsetStopKey() {
    this.stopKey = null;
  }

  /** Returns true if field stopKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStopKey() {
    return this.stopKey != null;
  }

  public void setStopKeyIsSet(boolean value) {
    if (!value) {
      this.stopKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Integer)value);
      }
      break;

    case START_KEY:
      if (value == null) {
        unsetStartKey();
      } else {
        setStartKey((Map<String,Datum>)value);
      }
      break;

    case STOP_KEY:
      if (value == null) {
        unsetStopKey();
      } else {
        setStopKey((Map<String,Datum>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_ID:
      return Integer.valueOf(getPartitionId());

    case START_KEY:
      return getStartKey();

    case STOP_KEY:
      return getStopKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_ID:
      return isSetPartitionId();
    case START_KEY:
      return isSetStartKey();
    case STOP_KEY:
      return isSetStopKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Partition)
      return this.equals((Partition)that);
    return false;
  }

  public boolean equals(Partition that) {
    if (that == null)
      return false;

    boolean this_present_partitionId = true && this.isSetPartitionId();
    boolean that_present_partitionId = true && that.isSetPartitionId();
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    boolean this_present_startKey = true && this.isSetStartKey();
    boolean that_present_startKey = true && that.isSetStartKey();
    if (this_present_startKey || that_present_startKey) {
      if (!(this_present_startKey && that_present_startKey))
        return false;
      if (!this.startKey.equals(that.startKey))
        return false;
    }

    boolean this_present_stopKey = true && this.isSetStopKey();
    boolean that_present_stopKey = true && that.isSetStopKey();
    if (this_present_stopKey || that_present_stopKey) {
      if (!(this_present_stopKey && that_present_stopKey))
        return false;
      if (!this.stopKey.equals(that.stopKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partitionId = true && (isSetPartitionId());
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    boolean present_startKey = true && (isSetStartKey());
    list.add(present_startKey);
    if (present_startKey)
      list.add(startKey);

    boolean present_stopKey = true && (isSetStopKey());
    list.add(present_stopKey);
    if (present_stopKey)
      list.add(stopKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(Partition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartKey()).compareTo(other.isSetStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startKey, other.startKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStopKey()).compareTo(other.isSetStopKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.stopKey, other.stopKey);
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
    StringBuilder sb = new StringBuilder("Partition(");
    boolean first = true;

    if (isSetPartitionId()) {
      sb.append("partitionId:");
      sb.append(this.partitionId);
      first = false;
    }
    if (isSetStartKey()) {
      if (!first) sb.append(", ");
      sb.append("startKey:");
      if (this.startKey == null) {
        sb.append("null");
      } else {
        sb.append(this.startKey);
      }
      first = false;
    }
    if (isSetStopKey()) {
      if (!first) sb.append(", ");
      sb.append("stopKey:");
      if (this.stopKey == null) {
        sb.append("null");
      } else {
        sb.append(this.stopKey);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionStandardSchemeFactory implements SchemeFactory {
    public PartitionStandardScheme getScheme() {
      return new PartitionStandardScheme();
    }
  }

  private static class PartitionStandardScheme extends StandardScheme<Partition> {

    public void read(libthrift091.protocol.TProtocol iprot, Partition struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionId = iprot.readI32();
              struct.setPartitionIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_KEY
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map154 = iprot.readMapBegin();
                struct.startKey = new HashMap<String,Datum>(2*_map154.size);
                String _key155;
                Datum _val156;
                for (int _i157 = 0; _i157 < _map154.size; ++_i157)
                {
                  _key155 = iprot.readString();
                  _val156 = new Datum();
                  _val156.read(iprot);
                  struct.startKey.put(_key155, _val156);
                }
                iprot.readMapEnd();
              }
              struct.setStartKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STOP_KEY
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map158 = iprot.readMapBegin();
                struct.stopKey = new HashMap<String,Datum>(2*_map158.size);
                String _key159;
                Datum _val160;
                for (int _i161 = 0; _i161 < _map158.size; ++_i161)
                {
                  _key159 = iprot.readString();
                  _val160 = new Datum();
                  _val160.read(iprot);
                  struct.stopKey.put(_key159, _val160);
                }
                iprot.readMapEnd();
              }
              struct.setStopKeyIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Partition struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPartitionId()) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        oprot.writeI32(struct.partitionId);
        oprot.writeFieldEnd();
      }
      if (struct.startKey != null) {
        if (struct.isSetStartKey()) {
          oprot.writeFieldBegin(START_KEY_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.startKey.size()));
            for (Map.Entry<String, Datum> _iter162 : struct.startKey.entrySet())
            {
              oprot.writeString(_iter162.getKey());
              _iter162.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.stopKey != null) {
        if (struct.isSetStopKey()) {
          oprot.writeFieldBegin(STOP_KEY_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.stopKey.size()));
            for (Map.Entry<String, Datum> _iter163 : struct.stopKey.entrySet())
            {
              oprot.writeString(_iter163.getKey());
              _iter163.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionTupleSchemeFactory implements SchemeFactory {
    public PartitionTupleScheme getScheme() {
      return new PartitionTupleScheme();
    }
  }

  private static class PartitionTupleScheme extends TupleScheme<Partition> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Partition struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionId()) {
        optionals.set(0);
      }
      if (struct.isSetStartKey()) {
        optionals.set(1);
      }
      if (struct.isSetStopKey()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPartitionId()) {
        oprot.writeI32(struct.partitionId);
      }
      if (struct.isSetStartKey()) {
        {
          oprot.writeI32(struct.startKey.size());
          for (Map.Entry<String, Datum> _iter164 : struct.startKey.entrySet())
          {
            oprot.writeString(_iter164.getKey());
            _iter164.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetStopKey()) {
        {
          oprot.writeI32(struct.stopKey.size());
          for (Map.Entry<String, Datum> _iter165 : struct.stopKey.entrySet())
          {
            oprot.writeString(_iter165.getKey());
            _iter165.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Partition struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.partitionId = iprot.readI32();
        struct.setPartitionIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map166 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.startKey = new HashMap<String,Datum>(2*_map166.size);
          String _key167;
          Datum _val168;
          for (int _i169 = 0; _i169 < _map166.size; ++_i169)
          {
            _key167 = iprot.readString();
            _val168 = new Datum();
            _val168.read(iprot);
            struct.startKey.put(_key167, _val168);
          }
        }
        struct.setStartKeyIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map170 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.stopKey = new HashMap<String,Datum>(2*_map170.size);
          String _key171;
          Datum _val172;
          for (int _i173 = 0; _i173 < _map170.size; ++_i173)
          {
            _key171 = iprot.readString();
            _val172 = new Datum();
            _val172.read(iprot);
            struct.stopKey.put(_key171, _val172);
          }
        }
        struct.setStopKeyIsSet(true);
      }
    }
  }

}

