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
public class TerminateClusterRequest implements libthrift091.TBase<TerminateClusterRequest, TerminateClusterRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TerminateClusterRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TerminateClusterRequest");

  private static final libthrift091.protocol.TField CLUSTER_ID_FIELD_DESC = new libthrift091.protocol.TField("clusterId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField FORCE_FIELD_DESC = new libthrift091.protocol.TField("force", libthrift091.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TerminateClusterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TerminateClusterRequestTupleSchemeFactory());
  }

  public String clusterId; // required
  /**
   * true  terminate right now
   * false waiting for all jobs completed
   */
  public boolean force; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    CLUSTER_ID((short)1, "clusterId"),
    /**
     * true  terminate right now
     * false waiting for all jobs completed
     */
    FORCE((short)2, "force");

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
        case 1: // CLUSTER_ID
          return CLUSTER_ID;
        case 2: // FORCE
          return FORCE;
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
  private static final int __FORCE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FORCE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_ID, new libthrift091.meta_data.FieldMetaData("clusterId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.FORCE, new libthrift091.meta_data.FieldMetaData("force", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TerminateClusterRequest.class, metaDataMap);
  }

  public TerminateClusterRequest() {
  }

  public TerminateClusterRequest(
    String clusterId)
  {
    this();
    this.clusterId = clusterId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TerminateClusterRequest(TerminateClusterRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetClusterId()) {
      this.clusterId = other.clusterId;
    }
    this.force = other.force;
  }

  public TerminateClusterRequest deepCopy() {
    return new TerminateClusterRequest(this);
  }

  @Override
  public void clear() {
    this.clusterId = null;
    setForceIsSet(false);
    this.force = false;
  }

  public String getClusterId() {
    return this.clusterId;
  }

  public TerminateClusterRequest setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public void unsetClusterId() {
    this.clusterId = null;
  }

  /** Returns true if field clusterId is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterId() {
    return this.clusterId != null;
  }

  public void setClusterIdIsSet(boolean value) {
    if (!value) {
      this.clusterId = null;
    }
  }

  /**
   * true  terminate right now
   * false waiting for all jobs completed
   */
  public boolean isForce() {
    return this.force;
  }

  /**
   * true  terminate right now
   * false waiting for all jobs completed
   */
  public TerminateClusterRequest setForce(boolean force) {
    this.force = force;
    setForceIsSet(true);
    return this;
  }

  public void unsetForce() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FORCE_ISSET_ID);
  }

  /** Returns true if field force is set (has been assigned a value) and false otherwise */
  public boolean isSetForce() {
    return EncodingUtils.testBit(__isset_bitfield, __FORCE_ISSET_ID);
  }

  public void setForceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FORCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLUSTER_ID:
      if (value == null) {
        unsetClusterId();
      } else {
        setClusterId((String)value);
      }
      break;

    case FORCE:
      if (value == null) {
        unsetForce();
      } else {
        setForce((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_ID:
      return getClusterId();

    case FORCE:
      return Boolean.valueOf(isForce());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER_ID:
      return isSetClusterId();
    case FORCE:
      return isSetForce();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TerminateClusterRequest)
      return this.equals((TerminateClusterRequest)that);
    return false;
  }

  public boolean equals(TerminateClusterRequest that) {
    if (that == null)
      return false;

    boolean this_present_clusterId = true && this.isSetClusterId();
    boolean that_present_clusterId = true && that.isSetClusterId();
    if (this_present_clusterId || that_present_clusterId) {
      if (!(this_present_clusterId && that_present_clusterId))
        return false;
      if (!this.clusterId.equals(that.clusterId))
        return false;
    }

    boolean this_present_force = true && this.isSetForce();
    boolean that_present_force = true && that.isSetForce();
    if (this_present_force || that_present_force) {
      if (!(this_present_force && that_present_force))
        return false;
      if (this.force != that.force)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_clusterId = true && (isSetClusterId());
    list.add(present_clusterId);
    if (present_clusterId)
      list.add(clusterId);

    boolean present_force = true && (isSetForce());
    list.add(present_force);
    if (present_force)
      list.add(force);

    return list.hashCode();
  }

  @Override
  public int compareTo(TerminateClusterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClusterId()).compareTo(other.isSetClusterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clusterId, other.clusterId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetForce()).compareTo(other.isSetForce());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForce()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.force, other.force);
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
    StringBuilder sb = new StringBuilder("TerminateClusterRequest(");
    boolean first = true;

    sb.append("clusterId:");
    if (this.clusterId == null) {
      sb.append("null");
    } else {
      sb.append(this.clusterId);
    }
    first = false;
    if (isSetForce()) {
      if (!first) sb.append(", ");
      sb.append("force:");
      sb.append(this.force);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (clusterId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'clusterId' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TerminateClusterRequestStandardSchemeFactory implements SchemeFactory {
    public TerminateClusterRequestStandardScheme getScheme() {
      return new TerminateClusterRequestStandardScheme();
    }
  }

  private static class TerminateClusterRequestStandardScheme extends StandardScheme<TerminateClusterRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, TerminateClusterRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.clusterId = iprot.readString();
              struct.setClusterIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FORCE
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.force = iprot.readBool();
              struct.setForceIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TerminateClusterRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clusterId != null) {
        oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
        oprot.writeString(struct.clusterId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetForce()) {
        oprot.writeFieldBegin(FORCE_FIELD_DESC);
        oprot.writeBool(struct.force);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TerminateClusterRequestTupleSchemeFactory implements SchemeFactory {
    public TerminateClusterRequestTupleScheme getScheme() {
      return new TerminateClusterRequestTupleScheme();
    }
  }

  private static class TerminateClusterRequestTupleScheme extends TupleScheme<TerminateClusterRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TerminateClusterRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.clusterId);
      BitSet optionals = new BitSet();
      if (struct.isSetForce()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetForce()) {
        oprot.writeBool(struct.force);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TerminateClusterRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.clusterId = iprot.readString();
      struct.setClusterIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.force = iprot.readBool();
        struct.setForceIsSet(true);
      }
    }
  }

}

