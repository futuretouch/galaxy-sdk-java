/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-10-20")
public class SetPermissionRequest implements libthrift091.TBase<SetPermissionRequest, SetPermissionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetPermissionRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SetPermissionRequest");

  private static final libthrift091.protocol.TField TOPIC_RESOURCE_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicResourceName", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField GRANT_FIELD_DESC = new libthrift091.protocol.TField("grant", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField PERMISSION_FIELD_DESC = new libthrift091.protocol.TField("permission", libthrift091.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetPermissionRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetPermissionRequestTupleSchemeFactory());
  }

  /**
   * Topic resource name for which to set permission;
   * 
   */
  public TopicTalosResourceName topicResourceName; // required
  /**
   * The Grantee to set permission;
   * the Grantee must be specified a appId or accountId.
   * we support for cross-authorization based on 'accountId'
   * 
   */
  public com.xiaomi.infra.galaxy.rpc.thrift.Grantee grant; // required
  /**
   * The permission to set;
   * 
   * 
   * @see Permission
   */
  public Permission permission; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Topic resource name for which to set permission;
     * 
     */
    TOPIC_RESOURCE_NAME((short)1, "topicResourceName"),
    /**
     * The Grantee to set permission;
     * the Grantee must be specified a appId or accountId.
     * we support for cross-authorization based on 'accountId'
     * 
     */
    GRANT((short)2, "grant"),
    /**
     * The permission to set;
     * 
     * 
     * @see Permission
     */
    PERMISSION((short)3, "permission");

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
        case 1: // TOPIC_RESOURCE_NAME
          return TOPIC_RESOURCE_NAME;
        case 2: // GRANT
          return GRANT;
        case 3: // PERMISSION
          return PERMISSION;
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
    tmpMap.put(_Fields.TOPIC_RESOURCE_NAME, new libthrift091.meta_data.FieldMetaData("topicResourceName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicTalosResourceName.class)));
    tmpMap.put(_Fields.GRANT, new libthrift091.meta_data.FieldMetaData("grant", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.rpc.thrift.Grantee.class)));
    tmpMap.put(_Fields.PERMISSION, new libthrift091.meta_data.FieldMetaData("permission", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Permission.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SetPermissionRequest.class, metaDataMap);
  }

  public SetPermissionRequest() {
  }

  public SetPermissionRequest(
    TopicTalosResourceName topicResourceName,
    com.xiaomi.infra.galaxy.rpc.thrift.Grantee grant,
    Permission permission)
  {
    this();
    this.topicResourceName = topicResourceName;
    this.grant = grant;
    this.permission = permission;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetPermissionRequest(SetPermissionRequest other) {
    if (other.isSetTopicResourceName()) {
      this.topicResourceName = new TopicTalosResourceName(other.topicResourceName);
    }
    if (other.isSetGrant()) {
      this.grant = new com.xiaomi.infra.galaxy.rpc.thrift.Grantee(other.grant);
    }
    if (other.isSetPermission()) {
      this.permission = other.permission;
    }
  }

  public SetPermissionRequest deepCopy() {
    return new SetPermissionRequest(this);
  }

  @Override
  public void clear() {
    this.topicResourceName = null;
    this.grant = null;
    this.permission = null;
  }

  /**
   * Topic resource name for which to set permission;
   * 
   */
  public TopicTalosResourceName getTopicResourceName() {
    return this.topicResourceName;
  }

  /**
   * Topic resource name for which to set permission;
   * 
   */
  public SetPermissionRequest setTopicResourceName(TopicTalosResourceName topicResourceName) {
    this.topicResourceName = topicResourceName;
    return this;
  }

  public void unsetTopicResourceName() {
    this.topicResourceName = null;
  }

  /** Returns true if field topicResourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicResourceName() {
    return this.topicResourceName != null;
  }

  public void setTopicResourceNameIsSet(boolean value) {
    if (!value) {
      this.topicResourceName = null;
    }
  }

  /**
   * The Grantee to set permission;
   * the Grantee must be specified a appId or accountId.
   * we support for cross-authorization based on 'accountId'
   * 
   */
  public com.xiaomi.infra.galaxy.rpc.thrift.Grantee getGrant() {
    return this.grant;
  }

  /**
   * The Grantee to set permission;
   * the Grantee must be specified a appId or accountId.
   * we support for cross-authorization based on 'accountId'
   * 
   */
  public SetPermissionRequest setGrant(com.xiaomi.infra.galaxy.rpc.thrift.Grantee grant) {
    this.grant = grant;
    return this;
  }

  public void unsetGrant() {
    this.grant = null;
  }

  /** Returns true if field grant is set (has been assigned a value) and false otherwise */
  public boolean isSetGrant() {
    return this.grant != null;
  }

  public void setGrantIsSet(boolean value) {
    if (!value) {
      this.grant = null;
    }
  }

  /**
   * The permission to set;
   * 
   * 
   * @see Permission
   */
  public Permission getPermission() {
    return this.permission;
  }

  /**
   * The permission to set;
   * 
   * 
   * @see Permission
   */
  public SetPermissionRequest setPermission(Permission permission) {
    this.permission = permission;
    return this;
  }

  public void unsetPermission() {
    this.permission = null;
  }

  /** Returns true if field permission is set (has been assigned a value) and false otherwise */
  public boolean isSetPermission() {
    return this.permission != null;
  }

  public void setPermissionIsSet(boolean value) {
    if (!value) {
      this.permission = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_RESOURCE_NAME:
      if (value == null) {
        unsetTopicResourceName();
      } else {
        setTopicResourceName((TopicTalosResourceName)value);
      }
      break;

    case GRANT:
      if (value == null) {
        unsetGrant();
      } else {
        setGrant((com.xiaomi.infra.galaxy.rpc.thrift.Grantee)value);
      }
      break;

    case PERMISSION:
      if (value == null) {
        unsetPermission();
      } else {
        setPermission((Permission)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_RESOURCE_NAME:
      return getTopicResourceName();

    case GRANT:
      return getGrant();

    case PERMISSION:
      return getPermission();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_RESOURCE_NAME:
      return isSetTopicResourceName();
    case GRANT:
      return isSetGrant();
    case PERMISSION:
      return isSetPermission();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetPermissionRequest)
      return this.equals((SetPermissionRequest)that);
    return false;
  }

  public boolean equals(SetPermissionRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicResourceName = true && this.isSetTopicResourceName();
    boolean that_present_topicResourceName = true && that.isSetTopicResourceName();
    if (this_present_topicResourceName || that_present_topicResourceName) {
      if (!(this_present_topicResourceName && that_present_topicResourceName))
        return false;
      if (!this.topicResourceName.equals(that.topicResourceName))
        return false;
    }

    boolean this_present_grant = true && this.isSetGrant();
    boolean that_present_grant = true && that.isSetGrant();
    if (this_present_grant || that_present_grant) {
      if (!(this_present_grant && that_present_grant))
        return false;
      if (!this.grant.equals(that.grant))
        return false;
    }

    boolean this_present_permission = true && this.isSetPermission();
    boolean that_present_permission = true && that.isSetPermission();
    if (this_present_permission || that_present_permission) {
      if (!(this_present_permission && that_present_permission))
        return false;
      if (!this.permission.equals(that.permission))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicResourceName = true && (isSetTopicResourceName());
    list.add(present_topicResourceName);
    if (present_topicResourceName)
      list.add(topicResourceName);

    boolean present_grant = true && (isSetGrant());
    list.add(present_grant);
    if (present_grant)
      list.add(grant);

    boolean present_permission = true && (isSetPermission());
    list.add(present_permission);
    if (present_permission)
      list.add(permission.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(SetPermissionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicResourceName()).compareTo(other.isSetTopicResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicResourceName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicResourceName, other.topicResourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrant()).compareTo(other.isSetGrant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrant()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.grant, other.grant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPermission()).compareTo(other.isSetPermission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermission()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.permission, other.permission);
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
    StringBuilder sb = new StringBuilder("SetPermissionRequest(");
    boolean first = true;

    sb.append("topicResourceName:");
    if (this.topicResourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicResourceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grant:");
    if (this.grant == null) {
      sb.append("null");
    } else {
      sb.append(this.grant);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("permission:");
    if (this.permission == null) {
      sb.append("null");
    } else {
      sb.append(this.permission);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicResourceName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicResourceName' was not present! Struct: " + toString());
    }
    if (grant == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'grant' was not present! Struct: " + toString());
    }
    if (permission == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'permission' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicResourceName != null) {
      topicResourceName.validate();
    }
    if (grant != null) {
      grant.validate();
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

  private static class SetPermissionRequestStandardSchemeFactory implements SchemeFactory {
    public SetPermissionRequestStandardScheme getScheme() {
      return new SetPermissionRequestStandardScheme();
    }
  }

  private static class SetPermissionRequestStandardScheme extends StandardScheme<SetPermissionRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SetPermissionRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_RESOURCE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicResourceName = new TopicTalosResourceName();
              struct.topicResourceName.read(iprot);
              struct.setTopicResourceNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GRANT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.grant = new com.xiaomi.infra.galaxy.rpc.thrift.Grantee();
              struct.grant.read(iprot);
              struct.setGrantIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERMISSION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.permission = com.xiaomi.infra.galaxy.talos.thrift.Permission.findByValue(iprot.readI32());
              struct.setPermissionIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SetPermissionRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicResourceName != null) {
        oprot.writeFieldBegin(TOPIC_RESOURCE_NAME_FIELD_DESC);
        struct.topicResourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.grant != null) {
        oprot.writeFieldBegin(GRANT_FIELD_DESC);
        struct.grant.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.permission != null) {
        oprot.writeFieldBegin(PERMISSION_FIELD_DESC);
        oprot.writeI32(struct.permission.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetPermissionRequestTupleSchemeFactory implements SchemeFactory {
    public SetPermissionRequestTupleScheme getScheme() {
      return new SetPermissionRequestTupleScheme();
    }
  }

  private static class SetPermissionRequestTupleScheme extends TupleScheme<SetPermissionRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SetPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicResourceName.write(oprot);
      struct.grant.write(oprot);
      oprot.writeI32(struct.permission.getValue());
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SetPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicResourceName = new TopicTalosResourceName();
      struct.topicResourceName.read(iprot);
      struct.setTopicResourceNameIsSet(true);
      struct.grant = new com.xiaomi.infra.galaxy.rpc.thrift.Grantee();
      struct.grant.read(iprot);
      struct.setGrantIsSet(true);
      struct.permission = com.xiaomi.infra.galaxy.talos.thrift.Permission.findByValue(iprot.readI32());
      struct.setPermissionIsSet(true);
    }
  }

}

