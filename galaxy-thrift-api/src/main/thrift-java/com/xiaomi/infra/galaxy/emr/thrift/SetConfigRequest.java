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
public class SetConfigRequest implements libthrift091.TBase<SetConfigRequest, SetConfigRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetConfigRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SetConfigRequest");

  private static final libthrift091.protocol.TField TASK_ID_FIELD_DESC = new libthrift091.protocol.TField("taskId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField CLUSTER_FIELD_DESC = new libthrift091.protocol.TField("cluster", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField CONFIG_FIELD_DESC = new libthrift091.protocol.TField("config", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField MERGE_ENABLED_FIELD_DESC = new libthrift091.protocol.TField("mergeEnabled", libthrift091.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetConfigRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetConfigRequestTupleSchemeFactory());
  }

  public String taskId; // optional
  public String cluster; // optional
  public String config; // optional
  public boolean mergeEnabled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    CLUSTER((short)2, "cluster"),
    CONFIG((short)3, "config"),
    MERGE_ENABLED((short)4, "mergeEnabled");

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
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // CLUSTER
          return CLUSTER;
        case 3: // CONFIG
          return CONFIG;
        case 4: // MERGE_ENABLED
          return MERGE_ENABLED;
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
  private static final int __MERGEENABLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TASK_ID,_Fields.CLUSTER,_Fields.CONFIG,_Fields.MERGE_ENABLED};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new libthrift091.meta_data.FieldMetaData("taskId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLUSTER, new libthrift091.meta_data.FieldMetaData("cluster", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONFIG, new libthrift091.meta_data.FieldMetaData("config", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MERGE_ENABLED, new libthrift091.meta_data.FieldMetaData("mergeEnabled", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SetConfigRequest.class, metaDataMap);
  }

  public SetConfigRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetConfigRequest(SetConfigRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTaskId()) {
      this.taskId = other.taskId;
    }
    if (other.isSetCluster()) {
      this.cluster = other.cluster;
    }
    if (other.isSetConfig()) {
      this.config = other.config;
    }
    this.mergeEnabled = other.mergeEnabled;
  }

  public SetConfigRequest deepCopy() {
    return new SetConfigRequest(this);
  }

  @Override
  public void clear() {
    this.taskId = null;
    this.cluster = null;
    this.config = null;
    setMergeEnabledIsSet(false);
    this.mergeEnabled = false;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public SetConfigRequest setTaskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  public String getCluster() {
    return this.cluster;
  }

  public SetConfigRequest setCluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

  public void unsetCluster() {
    this.cluster = null;
  }

  /** Returns true if field cluster is set (has been assigned a value) and false otherwise */
  public boolean isSetCluster() {
    return this.cluster != null;
  }

  public void setClusterIsSet(boolean value) {
    if (!value) {
      this.cluster = null;
    }
  }

  public String getConfig() {
    return this.config;
  }

  public SetConfigRequest setConfig(String config) {
    this.config = config;
    return this;
  }

  public void unsetConfig() {
    this.config = null;
  }

  /** Returns true if field config is set (has been assigned a value) and false otherwise */
  public boolean isSetConfig() {
    return this.config != null;
  }

  public void setConfigIsSet(boolean value) {
    if (!value) {
      this.config = null;
    }
  }

  public boolean isMergeEnabled() {
    return this.mergeEnabled;
  }

  public SetConfigRequest setMergeEnabled(boolean mergeEnabled) {
    this.mergeEnabled = mergeEnabled;
    setMergeEnabledIsSet(true);
    return this;
  }

  public void unsetMergeEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MERGEENABLED_ISSET_ID);
  }

  /** Returns true if field mergeEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetMergeEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __MERGEENABLED_ISSET_ID);
  }

  public void setMergeEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MERGEENABLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((String)value);
      }
      break;

    case CLUSTER:
      if (value == null) {
        unsetCluster();
      } else {
        setCluster((String)value);
      }
      break;

    case CONFIG:
      if (value == null) {
        unsetConfig();
      } else {
        setConfig((String)value);
      }
      break;

    case MERGE_ENABLED:
      if (value == null) {
        unsetMergeEnabled();
      } else {
        setMergeEnabled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case CLUSTER:
      return getCluster();

    case CONFIG:
      return getConfig();

    case MERGE_ENABLED:
      return Boolean.valueOf(isMergeEnabled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case CLUSTER:
      return isSetCluster();
    case CONFIG:
      return isSetConfig();
    case MERGE_ENABLED:
      return isSetMergeEnabled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetConfigRequest)
      return this.equals((SetConfigRequest)that);
    return false;
  }

  public boolean equals(SetConfigRequest that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_cluster = true && this.isSetCluster();
    boolean that_present_cluster = true && that.isSetCluster();
    if (this_present_cluster || that_present_cluster) {
      if (!(this_present_cluster && that_present_cluster))
        return false;
      if (!this.cluster.equals(that.cluster))
        return false;
    }

    boolean this_present_config = true && this.isSetConfig();
    boolean that_present_config = true && that.isSetConfig();
    if (this_present_config || that_present_config) {
      if (!(this_present_config && that_present_config))
        return false;
      if (!this.config.equals(that.config))
        return false;
    }

    boolean this_present_mergeEnabled = true && this.isSetMergeEnabled();
    boolean that_present_mergeEnabled = true && that.isSetMergeEnabled();
    if (this_present_mergeEnabled || that_present_mergeEnabled) {
      if (!(this_present_mergeEnabled && that_present_mergeEnabled))
        return false;
      if (this.mergeEnabled != that.mergeEnabled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskId = true && (isSetTaskId());
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_cluster = true && (isSetCluster());
    list.add(present_cluster);
    if (present_cluster)
      list.add(cluster);

    boolean present_config = true && (isSetConfig());
    list.add(present_config);
    if (present_config)
      list.add(config);

    boolean present_mergeEnabled = true && (isSetMergeEnabled());
    list.add(present_mergeEnabled);
    if (present_mergeEnabled)
      list.add(mergeEnabled);

    return list.hashCode();
  }

  @Override
  public int compareTo(SetConfigRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCluster()).compareTo(other.isSetCluster());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCluster()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.cluster, other.cluster);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfig()).compareTo(other.isSetConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfig()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.config, other.config);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMergeEnabled()).compareTo(other.isSetMergeEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMergeEnabled()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.mergeEnabled, other.mergeEnabled);
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
    StringBuilder sb = new StringBuilder("SetConfigRequest(");
    boolean first = true;

    if (isSetTaskId()) {
      sb.append("taskId:");
      if (this.taskId == null) {
        sb.append("null");
      } else {
        sb.append(this.taskId);
      }
      first = false;
    }
    if (isSetCluster()) {
      if (!first) sb.append(", ");
      sb.append("cluster:");
      if (this.cluster == null) {
        sb.append("null");
      } else {
        sb.append(this.cluster);
      }
      first = false;
    }
    if (isSetConfig()) {
      if (!first) sb.append(", ");
      sb.append("config:");
      if (this.config == null) {
        sb.append("null");
      } else {
        sb.append(this.config);
      }
      first = false;
    }
    if (isSetMergeEnabled()) {
      if (!first) sb.append(", ");
      sb.append("mergeEnabled:");
      sb.append(this.mergeEnabled);
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

  private static class SetConfigRequestStandardSchemeFactory implements SchemeFactory {
    public SetConfigRequestStandardScheme getScheme() {
      return new SetConfigRequestStandardScheme();
    }
  }

  private static class SetConfigRequestStandardScheme extends StandardScheme<SetConfigRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SetConfigRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.taskId = iprot.readString();
              struct.setTaskIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.cluster = iprot.readString();
              struct.setClusterIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONFIG
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.config = iprot.readString();
              struct.setConfigIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MERGE_ENABLED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.mergeEnabled = iprot.readBool();
              struct.setMergeEnabledIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SetConfigRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskId != null) {
        if (struct.isSetTaskId()) {
          oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
          oprot.writeString(struct.taskId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cluster != null) {
        if (struct.isSetCluster()) {
          oprot.writeFieldBegin(CLUSTER_FIELD_DESC);
          oprot.writeString(struct.cluster);
          oprot.writeFieldEnd();
        }
      }
      if (struct.config != null) {
        if (struct.isSetConfig()) {
          oprot.writeFieldBegin(CONFIG_FIELD_DESC);
          oprot.writeString(struct.config);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMergeEnabled()) {
        oprot.writeFieldBegin(MERGE_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.mergeEnabled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetConfigRequestTupleSchemeFactory implements SchemeFactory {
    public SetConfigRequestTupleScheme getScheme() {
      return new SetConfigRequestTupleScheme();
    }
  }

  private static class SetConfigRequestTupleScheme extends TupleScheme<SetConfigRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SetConfigRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetCluster()) {
        optionals.set(1);
      }
      if (struct.isSetConfig()) {
        optionals.set(2);
      }
      if (struct.isSetMergeEnabled()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTaskId()) {
        oprot.writeString(struct.taskId);
      }
      if (struct.isSetCluster()) {
        oprot.writeString(struct.cluster);
      }
      if (struct.isSetConfig()) {
        oprot.writeString(struct.config);
      }
      if (struct.isSetMergeEnabled()) {
        oprot.writeBool(struct.mergeEnabled);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SetConfigRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.taskId = iprot.readString();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cluster = iprot.readString();
        struct.setClusterIsSet(true);
      }
      if (incoming.get(2)) {
        struct.config = iprot.readString();
        struct.setConfigIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mergeEnabled = iprot.readBool();
        struct.setMergeEnabledIsSet(true);
      }
    }
  }

}

