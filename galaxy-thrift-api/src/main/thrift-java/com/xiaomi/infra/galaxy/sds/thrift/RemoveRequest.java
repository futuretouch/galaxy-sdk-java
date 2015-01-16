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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-16")
public class RemoveRequest implements libthrift091.TBase<RemoveRequest, RemoveRequest._Fields>, java.io.Serializable, Cloneable, Comparable<RemoveRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RemoveRequest");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField KEYS_FIELD_DESC = new libthrift091.protocol.TField("keys", libthrift091.protocol.TType.MAP, (short)2);
  private static final libthrift091.protocol.TField ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("attributes", libthrift091.protocol.TType.LIST, (short)3);
  private static final libthrift091.protocol.TField CONDITION_FIELD_DESC = new libthrift091.protocol.TField("condition", libthrift091.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoveRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoveRequestTupleSchemeFactory());
  }

  public String tableName; // optional
  /**
   * 待删除的记录主键
   */
  public Map<String,Datum> keys; // optional
  /**
   * 待删除的属性列表，不指定表示删除整条记录。
   * 当删除部分属性时，即使所有属性均已被删除，记录仍存在，删除整条记录需要显式删除
   */
  public List<String> attributes; // optional
  /**
   * 仅当满足指定条件时执行删除操作
   */
  public SimpleCondition condition; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    TABLE_NAME((short)1, "tableName"),
    /**
     * 待删除的记录主键
     */
    KEYS((short)2, "keys"),
    /**
     * 待删除的属性列表，不指定表示删除整条记录。
     * 当删除部分属性时，即使所有属性均已被删除，记录仍存在，删除整条记录需要显式删除
     */
    ATTRIBUTES((short)3, "attributes"),
    /**
     * 仅当满足指定条件时执行删除操作
     */
    CONDITION((short)4, "condition");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // KEYS
          return KEYS;
        case 3: // ATTRIBUTES
          return ATTRIBUTES;
        case 4: // CONDITION
          return CONDITION;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.KEYS,_Fields.ATTRIBUTES,_Fields.CONDITION};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEYS, new libthrift091.meta_data.FieldMetaData("keys", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("attributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.LIST        , "Attributes")));
    tmpMap.put(_Fields.CONDITION, new libthrift091.meta_data.FieldMetaData("condition", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, SimpleCondition.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RemoveRequest.class, metaDataMap);
  }

  public RemoveRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoveRequest(RemoveRequest other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetKeys()) {
      this.keys = other.keys;
    }
    if (other.isSetAttributes()) {
      this.attributes = other.attributes;
    }
    if (other.isSetCondition()) {
      this.condition = new SimpleCondition(other.condition);
    }
  }

  public RemoveRequest deepCopy() {
    return new RemoveRequest(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.keys = null;
    this.attributes = null;
    this.condition = null;
  }

  public String getTableName() {
    return this.tableName;
  }

  public RemoveRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public void putToKeys(String key, Datum val) {
    if (this.keys == null) {
      this.keys = new HashMap<String,Datum>();
    }
    this.keys.put(key, val);
  }

  /**
   * 待删除的记录主键
   */
  public Map<String,Datum> getKeys() {
    return this.keys;
  }

  /**
   * 待删除的记录主键
   */
  public RemoveRequest setKeys(Map<String,Datum> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public java.util.Iterator<String> getAttributesIterator() {
    return (this.attributes == null) ? null : this.attributes.iterator();
  }

  public void addToAttributes(String elem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<String>();
    }
    this.attributes.add(elem);
  }

  /**
   * 待删除的属性列表，不指定表示删除整条记录。
   * 当删除部分属性时，即使所有属性均已被删除，记录仍存在，删除整条记录需要显式删除
   */
  public List<String> getAttributes() {
    return this.attributes;
  }

  /**
   * 待删除的属性列表，不指定表示删除整条记录。
   * 当删除部分属性时，即使所有属性均已被删除，记录仍存在，删除整条记录需要显式删除
   */
  public RemoveRequest setAttributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  /**
   * 仅当满足指定条件时执行删除操作
   */
  public SimpleCondition getCondition() {
    return this.condition;
  }

  /**
   * 仅当满足指定条件时执行删除操作
   */
  public RemoveRequest setCondition(SimpleCondition condition) {
    this.condition = condition;
    return this;
  }

  public void unsetCondition() {
    this.condition = null;
  }

  /** Returns true if field condition is set (has been assigned a value) and false otherwise */
  public boolean isSetCondition() {
    return this.condition != null;
  }

  public void setConditionIsSet(boolean value) {
    if (!value) {
      this.condition = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((Map<String,Datum>)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((List<String>)value);
      }
      break;

    case CONDITION:
      if (value == null) {
        unsetCondition();
      } else {
        setCondition((SimpleCondition)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case KEYS:
      return getKeys();

    case ATTRIBUTES:
      return getAttributes();

    case CONDITION:
      return getCondition();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case KEYS:
      return isSetKeys();
    case ATTRIBUTES:
      return isSetAttributes();
    case CONDITION:
      return isSetCondition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoveRequest)
      return this.equals((RemoveRequest)that);
    return false;
  }

  public boolean equals(RemoveRequest that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_condition = true && this.isSetCondition();
    boolean that_present_condition = true && that.isSetCondition();
    if (this_present_condition || that_present_condition) {
      if (!(this_present_condition && that_present_condition))
        return false;
      if (!this.condition.equals(that.condition))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    boolean present_condition = true && (isSetCondition());
    list.add(present_condition);
    if (present_condition)
      list.add(condition);

    return list.hashCode();
  }

  @Override
  public int compareTo(RemoveRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keys, other.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCondition()).compareTo(other.isSetCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCondition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.condition, other.condition);
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
    StringBuilder sb = new StringBuilder("RemoveRequest(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetKeys()) {
      if (!first) sb.append(", ");
      sb.append("keys:");
      if (this.keys == null) {
        sb.append("null");
      } else {
        sb.append(this.keys);
      }
      first = false;
    }
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    if (isSetCondition()) {
      if (!first) sb.append(", ");
      sb.append("condition:");
      if (this.condition == null) {
        sb.append("null");
      } else {
        sb.append(this.condition);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (condition != null) {
      condition.validate();
    }
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

  private static class RemoveRequestStandardSchemeFactory implements SchemeFactory {
    public RemoveRequestStandardScheme getScheme() {
      return new RemoveRequestStandardScheme();
    }
  }

  private static class RemoveRequestStandardScheme extends StandardScheme<RemoveRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, RemoveRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEYS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map222 = iprot.readMapBegin();
                struct.keys = new HashMap<String,Datum>(2*_map222.size);
                String _key223;
                Datum _val224;
                for (int _i225 = 0; _i225 < _map222.size; ++_i225)
                {
                  _key223 = iprot.readString();
                  _val224 = new Datum();
                  _val224.read(iprot);
                  struct.keys.put(_key223, _val224);
                }
                iprot.readMapEnd();
              }
              struct.setKeysIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list226 = iprot.readListBegin();
                struct.attributes = new ArrayList<String>(_list226.size);
                String _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  _elem227 = iprot.readString();
                  struct.attributes.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONDITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.condition = new SimpleCondition();
              struct.condition.read(iprot);
              struct.setConditionIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, RemoveRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.keys != null) {
        if (struct.isSetKeys()) {
          oprot.writeFieldBegin(KEYS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.keys.size()));
            for (Map.Entry<String, Datum> _iter229 : struct.keys.entrySet())
            {
              oprot.writeString(_iter229.getKey());
              _iter229.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.attributes.size()));
            for (String _iter230 : struct.attributes)
            {
              oprot.writeString(_iter230);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.condition != null) {
        if (struct.isSetCondition()) {
          oprot.writeFieldBegin(CONDITION_FIELD_DESC);
          struct.condition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoveRequestTupleSchemeFactory implements SchemeFactory {
    public RemoveRequestTupleScheme getScheme() {
      return new RemoveRequestTupleScheme();
    }
  }

  private static class RemoveRequestTupleScheme extends TupleScheme<RemoveRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RemoveRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetKeys()) {
        optionals.set(1);
      }
      if (struct.isSetAttributes()) {
        optionals.set(2);
      }
      if (struct.isSetCondition()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (Map.Entry<String, Datum> _iter231 : struct.keys.entrySet())
          {
            oprot.writeString(_iter231.getKey());
            _iter231.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (String _iter232 : struct.attributes)
          {
            oprot.writeString(_iter232);
          }
        }
      }
      if (struct.isSetCondition()) {
        struct.condition.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RemoveRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map233 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.keys = new HashMap<String,Datum>(2*_map233.size);
          String _key234;
          Datum _val235;
          for (int _i236 = 0; _i236 < _map233.size; ++_i236)
          {
            _key234 = iprot.readString();
            _val235 = new Datum();
            _val235.read(iprot);
            struct.keys.put(_key234, _val235);
          }
        }
        struct.setKeysIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TList _list237 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.attributes = new ArrayList<String>(_list237.size);
          String _elem238;
          for (int _i239 = 0; _i239 < _list237.size; ++_i239)
          {
            _elem238 = iprot.readString();
            struct.attributes.add(_elem238);
          }
        }
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.condition = new SimpleCondition();
        struct.condition.read(iprot);
        struct.setConditionIsSet(true);
      }
    }
  }

}

