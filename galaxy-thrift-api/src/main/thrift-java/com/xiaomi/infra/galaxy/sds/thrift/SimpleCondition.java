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
 * 简单条件，用于checkAndPut/Delete操作，判定逻辑为: value operator field
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-12")
public class SimpleCondition implements libthrift091.TBase<SimpleCondition, SimpleCondition._Fields>, java.io.Serializable, Cloneable, Comparable<SimpleCondition> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SimpleCondition");

  private static final libthrift091.protocol.TField OPERATOR_FIELD_DESC = new libthrift091.protocol.TField("operator", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField FIELD_FIELD_DESC = new libthrift091.protocol.TField("field", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField VALUE_FIELD_DESC = new libthrift091.protocol.TField("value", libthrift091.protocol.TType.STRUCT, (short)3);
  private static final libthrift091.protocol.TField ROW_EXIST_FIELD_DESC = new libthrift091.protocol.TField("rowExist", libthrift091.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SimpleConditionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SimpleConditionTupleSchemeFactory());
  }

  /**
   * 
   * @see OperatorType
   */
  public OperatorType operator; // optional
  public String field; // optional
  public Datum value; // optional
  public boolean rowExist; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see OperatorType
     */
    OPERATOR((short)1, "operator"),
    FIELD((short)2, "field"),
    VALUE((short)3, "value"),
    ROW_EXIST((short)4, "rowExist");

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
        case 1: // OPERATOR
          return OPERATOR;
        case 2: // FIELD
          return FIELD;
        case 3: // VALUE
          return VALUE;
        case 4: // ROW_EXIST
          return ROW_EXIST;
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
  private static final int __ROWEXIST_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPERATOR,_Fields.FIELD,_Fields.VALUE,_Fields.ROW_EXIST};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATOR, new libthrift091.meta_data.FieldMetaData("operator", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, OperatorType.class)));
    tmpMap.put(_Fields.FIELD, new libthrift091.meta_data.FieldMetaData("field", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new libthrift091.meta_data.FieldMetaData("value", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Datum.class)));
    tmpMap.put(_Fields.ROW_EXIST, new libthrift091.meta_data.FieldMetaData("rowExist", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SimpleCondition.class, metaDataMap);
  }

  public SimpleCondition() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SimpleCondition(SimpleCondition other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOperator()) {
      this.operator = other.operator;
    }
    if (other.isSetField()) {
      this.field = other.field;
    }
    if (other.isSetValue()) {
      this.value = new Datum(other.value);
    }
    this.rowExist = other.rowExist;
  }

  public SimpleCondition deepCopy() {
    return new SimpleCondition(this);
  }

  @Override
  public void clear() {
    this.operator = null;
    this.field = null;
    this.value = null;
    setRowExistIsSet(false);
    this.rowExist = false;
  }

  /**
   * 
   * @see OperatorType
   */
  public OperatorType getOperator() {
    return this.operator;
  }

  /**
   * 
   * @see OperatorType
   */
  public SimpleCondition setOperator(OperatorType operator) {
    this.operator = operator;
    return this;
  }

  public void unsetOperator() {
    this.operator = null;
  }

  /** Returns true if field operator is set (has been assigned a value) and false otherwise */
  public boolean isSetOperator() {
    return this.operator != null;
  }

  public void setOperatorIsSet(boolean value) {
    if (!value) {
      this.operator = null;
    }
  }

  public String getField() {
    return this.field;
  }

  public SimpleCondition setField(String field) {
    this.field = field;
    return this;
  }

  public void unsetField() {
    this.field = null;
  }

  /** Returns true if field field is set (has been assigned a value) and false otherwise */
  public boolean isSetField() {
    return this.field != null;
  }

  public void setFieldIsSet(boolean value) {
    if (!value) {
      this.field = null;
    }
  }

  public Datum getValue() {
    return this.value;
  }

  public SimpleCondition setValue(Datum value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public boolean isRowExist() {
    return this.rowExist;
  }

  public SimpleCondition setRowExist(boolean rowExist) {
    this.rowExist = rowExist;
    setRowExistIsSet(true);
    return this;
  }

  public void unsetRowExist() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWEXIST_ISSET_ID);
  }

  /** Returns true if field rowExist is set (has been assigned a value) and false otherwise */
  public boolean isSetRowExist() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWEXIST_ISSET_ID);
  }

  public void setRowExistIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWEXIST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATOR:
      if (value == null) {
        unsetOperator();
      } else {
        setOperator((OperatorType)value);
      }
      break;

    case FIELD:
      if (value == null) {
        unsetField();
      } else {
        setField((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((Datum)value);
      }
      break;

    case ROW_EXIST:
      if (value == null) {
        unsetRowExist();
      } else {
        setRowExist((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATOR:
      return getOperator();

    case FIELD:
      return getField();

    case VALUE:
      return getValue();

    case ROW_EXIST:
      return Boolean.valueOf(isRowExist());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATOR:
      return isSetOperator();
    case FIELD:
      return isSetField();
    case VALUE:
      return isSetValue();
    case ROW_EXIST:
      return isSetRowExist();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SimpleCondition)
      return this.equals((SimpleCondition)that);
    return false;
  }

  public boolean equals(SimpleCondition that) {
    if (that == null)
      return false;

    boolean this_present_operator = true && this.isSetOperator();
    boolean that_present_operator = true && that.isSetOperator();
    if (this_present_operator || that_present_operator) {
      if (!(this_present_operator && that_present_operator))
        return false;
      if (!this.operator.equals(that.operator))
        return false;
    }

    boolean this_present_field = true && this.isSetField();
    boolean that_present_field = true && that.isSetField();
    if (this_present_field || that_present_field) {
      if (!(this_present_field && that_present_field))
        return false;
      if (!this.field.equals(that.field))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_rowExist = true && this.isSetRowExist();
    boolean that_present_rowExist = true && that.isSetRowExist();
    if (this_present_rowExist || that_present_rowExist) {
      if (!(this_present_rowExist && that_present_rowExist))
        return false;
      if (this.rowExist != that.rowExist)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_operator = true && (isSetOperator());
    list.add(present_operator);
    if (present_operator)
      list.add(operator.getValue());

    boolean present_field = true && (isSetField());
    list.add(present_field);
    if (present_field)
      list.add(field);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_rowExist = true && (isSetRowExist());
    list.add(present_rowExist);
    if (present_rowExist)
      list.add(rowExist);

    return list.hashCode();
  }

  @Override
  public int compareTo(SimpleCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOperator()).compareTo(other.isSetOperator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperator()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.operator, other.operator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetField()).compareTo(other.isSetField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.field, other.field);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowExist()).compareTo(other.isSetRowExist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowExist()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rowExist, other.rowExist);
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
    StringBuilder sb = new StringBuilder("SimpleCondition(");
    boolean first = true;

    if (isSetOperator()) {
      sb.append("operator:");
      if (this.operator == null) {
        sb.append("null");
      } else {
        sb.append(this.operator);
      }
      first = false;
    }
    if (isSetField()) {
      if (!first) sb.append(", ");
      sb.append("field:");
      if (this.field == null) {
        sb.append("null");
      } else {
        sb.append(this.field);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
    }
    if (isSetRowExist()) {
      if (!first) sb.append(", ");
      sb.append("rowExist:");
      sb.append(this.rowExist);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (value != null) {
      value.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SimpleConditionStandardSchemeFactory implements SchemeFactory {
    public SimpleConditionStandardScheme getScheme() {
      return new SimpleConditionStandardScheme();
    }
  }

  private static class SimpleConditionStandardScheme extends StandardScheme<SimpleCondition> {

    public void read(libthrift091.protocol.TProtocol iprot, SimpleCondition struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.operator = com.xiaomi.infra.galaxy.sds.thrift.OperatorType.findByValue(iprot.readI32());
              struct.setOperatorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FIELD
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.field = iprot.readString();
              struct.setFieldIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.value = new Datum();
              struct.value.read(iprot);
              struct.setValueIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROW_EXIST
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.rowExist = iprot.readBool();
              struct.setRowExistIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SimpleCondition struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operator != null) {
        if (struct.isSetOperator()) {
          oprot.writeFieldBegin(OPERATOR_FIELD_DESC);
          oprot.writeI32(struct.operator.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.field != null) {
        if (struct.isSetField()) {
          oprot.writeFieldBegin(FIELD_FIELD_DESC);
          oprot.writeString(struct.field);
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          struct.value.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRowExist()) {
        oprot.writeFieldBegin(ROW_EXIST_FIELD_DESC);
        oprot.writeBool(struct.rowExist);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SimpleConditionTupleSchemeFactory implements SchemeFactory {
    public SimpleConditionTupleScheme getScheme() {
      return new SimpleConditionTupleScheme();
    }
  }

  private static class SimpleConditionTupleScheme extends TupleScheme<SimpleCondition> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SimpleCondition struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperator()) {
        optionals.set(0);
      }
      if (struct.isSetField()) {
        optionals.set(1);
      }
      if (struct.isSetValue()) {
        optionals.set(2);
      }
      if (struct.isSetRowExist()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOperator()) {
        oprot.writeI32(struct.operator.getValue());
      }
      if (struct.isSetField()) {
        oprot.writeString(struct.field);
      }
      if (struct.isSetValue()) {
        struct.value.write(oprot);
      }
      if (struct.isSetRowExist()) {
        oprot.writeBool(struct.rowExist);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SimpleCondition struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.operator = com.xiaomi.infra.galaxy.sds.thrift.OperatorType.findByValue(iprot.readI32());
        struct.setOperatorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.field = iprot.readString();
        struct.setFieldIsSet(true);
      }
      if (incoming.get(2)) {
        struct.value = new Datum();
        struct.value.read(iprot);
        struct.setValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rowExist = iprot.readBool();
        struct.setRowExistIsSet(true);
      }
    }
  }

}

