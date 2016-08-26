/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-8-18")
public class EMRUser implements libthrift091.TBase<EMRUser, EMRUser._Fields>, java.io.Serializable, Cloneable, Comparable<EMRUser> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("EMRUser");

  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField CLUSTER_IDS_FIELD_DESC = new libthrift091.protocol.TField("clusterIds", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EMRUserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EMRUserTupleSchemeFactory());
  }

  /**
   * XiaoMi developer ID (NOTE: different from XiaoMi ID)
   */
  public String developerId; // required
  public List<String> clusterIds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * XiaoMi developer ID (NOTE: different from XiaoMi ID)
     */
    DEVELOPER_ID((short)1, "developerId"),
    CLUSTER_IDS((short)2, "clusterIds");

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
        case 1: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 2: // CLUSTER_IDS
          return CLUSTER_IDS;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER_IDS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLUSTER_IDS, new libthrift091.meta_data.FieldMetaData("clusterIds", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(EMRUser.class, metaDataMap);
  }

  public EMRUser() {
  }

  public EMRUser(
    String developerId)
  {
    this();
    this.developerId = developerId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EMRUser(EMRUser other) {
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetClusterIds()) {
      List<String> __this__clusterIds = new ArrayList<String>(other.clusterIds);
      this.clusterIds = __this__clusterIds;
    }
  }

  public EMRUser deepCopy() {
    return new EMRUser(this);
  }

  @Override
  public void clear() {
    this.developerId = null;
    this.clusterIds = null;
  }

  /**
   * XiaoMi developer ID (NOTE: different from XiaoMi ID)
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * XiaoMi developer ID (NOTE: different from XiaoMi ID)
   */
  public EMRUser setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  public int getClusterIdsSize() {
    return (this.clusterIds == null) ? 0 : this.clusterIds.size();
  }

  public java.util.Iterator<String> getClusterIdsIterator() {
    return (this.clusterIds == null) ? null : this.clusterIds.iterator();
  }

  public void addToClusterIds(String elem) {
    if (this.clusterIds == null) {
      this.clusterIds = new ArrayList<String>();
    }
    this.clusterIds.add(elem);
  }

  public List<String> getClusterIds() {
    return this.clusterIds;
  }

  public EMRUser setClusterIds(List<String> clusterIds) {
    this.clusterIds = clusterIds;
    return this;
  }

  public void unsetClusterIds() {
    this.clusterIds = null;
  }

  /** Returns true if field clusterIds is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterIds() {
    return this.clusterIds != null;
  }

  public void setClusterIdsIsSet(boolean value) {
    if (!value) {
      this.clusterIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case CLUSTER_IDS:
      if (value == null) {
        unsetClusterIds();
      } else {
        setClusterIds((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVELOPER_ID:
      return getDeveloperId();

    case CLUSTER_IDS:
      return getClusterIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case CLUSTER_IDS:
      return isSetClusterIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EMRUser)
      return this.equals((EMRUser)that);
    return false;
  }

  public boolean equals(EMRUser that) {
    if (that == null)
      return false;

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_clusterIds = true && this.isSetClusterIds();
    boolean that_present_clusterIds = true && that.isSetClusterIds();
    if (this_present_clusterIds || that_present_clusterIds) {
      if (!(this_present_clusterIds && that_present_clusterIds))
        return false;
      if (!this.clusterIds.equals(that.clusterIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_clusterIds = true && (isSetClusterIds());
    list.add(present_clusterIds);
    if (present_clusterIds)
      list.add(clusterIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(EMRUser other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClusterIds()).compareTo(other.isSetClusterIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterIds()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clusterIds, other.clusterIds);
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
    StringBuilder sb = new StringBuilder("EMRUser(");
    boolean first = true;

    sb.append("developerId:");
    if (this.developerId == null) {
      sb.append("null");
    } else {
      sb.append(this.developerId);
    }
    first = false;
    if (isSetClusterIds()) {
      if (!first) sb.append(", ");
      sb.append("clusterIds:");
      if (this.clusterIds == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterIds);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (developerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'developerId' was not present! Struct: " + toString());
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

  private static class EMRUserStandardSchemeFactory implements SchemeFactory {
    public EMRUserStandardScheme getScheme() {
      return new EMRUserStandardScheme();
    }
  }

  private static class EMRUserStandardScheme extends StandardScheme<EMRUser> {

    public void read(libthrift091.protocol.TProtocol iprot, EMRUser struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER_IDS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list16 = iprot.readListBegin();
                struct.clusterIds = new ArrayList<String>(_list16.size);
                String _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readString();
                  struct.clusterIds.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setClusterIdsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, EMRUser struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.developerId != null) {
        oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
        oprot.writeString(struct.developerId);
        oprot.writeFieldEnd();
      }
      if (struct.clusterIds != null) {
        if (struct.isSetClusterIds()) {
          oprot.writeFieldBegin(CLUSTER_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.clusterIds.size()));
            for (String _iter19 : struct.clusterIds)
            {
              oprot.writeString(_iter19);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EMRUserTupleSchemeFactory implements SchemeFactory {
    public EMRUserTupleScheme getScheme() {
      return new EMRUserTupleScheme();
    }
  }

  private static class EMRUserTupleScheme extends TupleScheme<EMRUser> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, EMRUser struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.developerId);
      BitSet optionals = new BitSet();
      if (struct.isSetClusterIds()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetClusterIds()) {
        {
          oprot.writeI32(struct.clusterIds.size());
          for (String _iter20 : struct.clusterIds)
          {
            oprot.writeString(_iter20);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, EMRUser struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.developerId = iprot.readString();
      struct.setDeveloperIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list21 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.clusterIds = new ArrayList<String>(_list21.size);
          String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.clusterIds.add(_elem22);
          }
        }
        struct.setClusterIdsIsSet(true);
      }
    }
  }

}

