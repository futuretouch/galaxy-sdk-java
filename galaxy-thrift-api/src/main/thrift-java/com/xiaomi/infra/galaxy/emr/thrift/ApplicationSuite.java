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
public class ApplicationSuite implements libthrift091.TBase<ApplicationSuite, ApplicationSuite._Fields>, java.io.Serializable, Cloneable, Comparable<ApplicationSuite> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ApplicationSuite");

  private static final libthrift091.protocol.TField NAME_FIELD_DESC = new libthrift091.protocol.TField("name", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField VERSION_FIELD_DESC = new libthrift091.protocol.TField("version", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField CORE_APPLICATIONS_FIELD_DESC = new libthrift091.protocol.TField("coreApplications", libthrift091.protocol.TType.LIST, (short)3);
  private static final libthrift091.protocol.TField AUX_APPLICATIONS_FIELD_DESC = new libthrift091.protocol.TField("auxApplications", libthrift091.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ApplicationSuiteStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ApplicationSuiteTupleSchemeFactory());
  }

  public String name; // optional
  public String version; // optional
  public List<ApplicationInfo> coreApplications; // required
  public List<ApplicationInfo> auxApplications; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    NAME((short)1, "name"),
    VERSION((short)2, "version"),
    CORE_APPLICATIONS((short)3, "coreApplications"),
    AUX_APPLICATIONS((short)4, "auxApplications");

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
        case 1: // NAME
          return NAME;
        case 2: // VERSION
          return VERSION;
        case 3: // CORE_APPLICATIONS
          return CORE_APPLICATIONS;
        case 4: // AUX_APPLICATIONS
          return AUX_APPLICATIONS;
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
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.VERSION};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new libthrift091.meta_data.FieldMetaData("name", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new libthrift091.meta_data.FieldMetaData("version", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CORE_APPLICATIONS, new libthrift091.meta_data.FieldMetaData("coreApplications", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, ApplicationInfo.class))));
    tmpMap.put(_Fields.AUX_APPLICATIONS, new libthrift091.meta_data.FieldMetaData("auxApplications", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, ApplicationInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ApplicationSuite.class, metaDataMap);
  }

  public ApplicationSuite() {
  }

  public ApplicationSuite(
    List<ApplicationInfo> coreApplications,
    List<ApplicationInfo> auxApplications)
  {
    this();
    this.coreApplications = coreApplications;
    this.auxApplications = auxApplications;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ApplicationSuite(ApplicationSuite other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetCoreApplications()) {
      List<ApplicationInfo> __this__coreApplications = new ArrayList<ApplicationInfo>(other.coreApplications.size());
      for (ApplicationInfo other_element : other.coreApplications) {
        __this__coreApplications.add(new ApplicationInfo(other_element));
      }
      this.coreApplications = __this__coreApplications;
    }
    if (other.isSetAuxApplications()) {
      List<ApplicationInfo> __this__auxApplications = new ArrayList<ApplicationInfo>(other.auxApplications.size());
      for (ApplicationInfo other_element : other.auxApplications) {
        __this__auxApplications.add(new ApplicationInfo(other_element));
      }
      this.auxApplications = __this__auxApplications;
    }
  }

  public ApplicationSuite deepCopy() {
    return new ApplicationSuite(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.version = null;
    this.coreApplications = null;
    this.auxApplications = null;
  }

  public String getName() {
    return this.name;
  }

  public ApplicationSuite setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getVersion() {
    return this.version;
  }

  public ApplicationSuite setVersion(String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public int getCoreApplicationsSize() {
    return (this.coreApplications == null) ? 0 : this.coreApplications.size();
  }

  public java.util.Iterator<ApplicationInfo> getCoreApplicationsIterator() {
    return (this.coreApplications == null) ? null : this.coreApplications.iterator();
  }

  public void addToCoreApplications(ApplicationInfo elem) {
    if (this.coreApplications == null) {
      this.coreApplications = new ArrayList<ApplicationInfo>();
    }
    this.coreApplications.add(elem);
  }

  public List<ApplicationInfo> getCoreApplications() {
    return this.coreApplications;
  }

  public ApplicationSuite setCoreApplications(List<ApplicationInfo> coreApplications) {
    this.coreApplications = coreApplications;
    return this;
  }

  public void unsetCoreApplications() {
    this.coreApplications = null;
  }

  /** Returns true if field coreApplications is set (has been assigned a value) and false otherwise */
  public boolean isSetCoreApplications() {
    return this.coreApplications != null;
  }

  public void setCoreApplicationsIsSet(boolean value) {
    if (!value) {
      this.coreApplications = null;
    }
  }

  public int getAuxApplicationsSize() {
    return (this.auxApplications == null) ? 0 : this.auxApplications.size();
  }

  public java.util.Iterator<ApplicationInfo> getAuxApplicationsIterator() {
    return (this.auxApplications == null) ? null : this.auxApplications.iterator();
  }

  public void addToAuxApplications(ApplicationInfo elem) {
    if (this.auxApplications == null) {
      this.auxApplications = new ArrayList<ApplicationInfo>();
    }
    this.auxApplications.add(elem);
  }

  public List<ApplicationInfo> getAuxApplications() {
    return this.auxApplications;
  }

  public ApplicationSuite setAuxApplications(List<ApplicationInfo> auxApplications) {
    this.auxApplications = auxApplications;
    return this;
  }

  public void unsetAuxApplications() {
    this.auxApplications = null;
  }

  /** Returns true if field auxApplications is set (has been assigned a value) and false otherwise */
  public boolean isSetAuxApplications() {
    return this.auxApplications != null;
  }

  public void setAuxApplicationsIsSet(boolean value) {
    if (!value) {
      this.auxApplications = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((String)value);
      }
      break;

    case CORE_APPLICATIONS:
      if (value == null) {
        unsetCoreApplications();
      } else {
        setCoreApplications((List<ApplicationInfo>)value);
      }
      break;

    case AUX_APPLICATIONS:
      if (value == null) {
        unsetAuxApplications();
      } else {
        setAuxApplications((List<ApplicationInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case VERSION:
      return getVersion();

    case CORE_APPLICATIONS:
      return getCoreApplications();

    case AUX_APPLICATIONS:
      return getAuxApplications();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case VERSION:
      return isSetVersion();
    case CORE_APPLICATIONS:
      return isSetCoreApplications();
    case AUX_APPLICATIONS:
      return isSetAuxApplications();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ApplicationSuite)
      return this.equals((ApplicationSuite)that);
    return false;
  }

  public boolean equals(ApplicationSuite that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_coreApplications = true && this.isSetCoreApplications();
    boolean that_present_coreApplications = true && that.isSetCoreApplications();
    if (this_present_coreApplications || that_present_coreApplications) {
      if (!(this_present_coreApplications && that_present_coreApplications))
        return false;
      if (!this.coreApplications.equals(that.coreApplications))
        return false;
    }

    boolean this_present_auxApplications = true && this.isSetAuxApplications();
    boolean that_present_auxApplications = true && that.isSetAuxApplications();
    if (this_present_auxApplications || that_present_auxApplications) {
      if (!(this_present_auxApplications && that_present_auxApplications))
        return false;
      if (!this.auxApplications.equals(that.auxApplications))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_version = true && (isSetVersion());
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_coreApplications = true && (isSetCoreApplications());
    list.add(present_coreApplications);
    if (present_coreApplications)
      list.add(coreApplications);

    boolean present_auxApplications = true && (isSetAuxApplications());
    list.add(present_auxApplications);
    if (present_auxApplications)
      list.add(auxApplications);

    return list.hashCode();
  }

  @Override
  public int compareTo(ApplicationSuite other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCoreApplications()).compareTo(other.isSetCoreApplications());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoreApplications()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.coreApplications, other.coreApplications);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuxApplications()).compareTo(other.isSetAuxApplications());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuxApplications()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.auxApplications, other.auxApplications);
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
    StringBuilder sb = new StringBuilder("ApplicationSuite(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("coreApplications:");
    if (this.coreApplications == null) {
      sb.append("null");
    } else {
      sb.append(this.coreApplications);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("auxApplications:");
    if (this.auxApplications == null) {
      sb.append("null");
    } else {
      sb.append(this.auxApplications);
    }
    first = false;
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ApplicationSuiteStandardSchemeFactory implements SchemeFactory {
    public ApplicationSuiteStandardScheme getScheme() {
      return new ApplicationSuiteStandardScheme();
    }
  }

  private static class ApplicationSuiteStandardScheme extends StandardScheme<ApplicationSuite> {

    public void read(libthrift091.protocol.TProtocol iprot, ApplicationSuite struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CORE_APPLICATIONS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.coreApplications = new ArrayList<ApplicationInfo>(_list0.size);
                ApplicationInfo _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ApplicationInfo();
                  _elem1.read(iprot);
                  struct.coreApplications.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setCoreApplicationsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AUX_APPLICATIONS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list3 = iprot.readListBegin();
                struct.auxApplications = new ArrayList<ApplicationInfo>(_list3.size);
                ApplicationInfo _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new ApplicationInfo();
                  _elem4.read(iprot);
                  struct.auxApplications.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setAuxApplicationsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ApplicationSuite struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          oprot.writeString(struct.version);
          oprot.writeFieldEnd();
        }
      }
      if (struct.coreApplications != null) {
        oprot.writeFieldBegin(CORE_APPLICATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.coreApplications.size()));
          for (ApplicationInfo _iter6 : struct.coreApplications)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.auxApplications != null) {
        oprot.writeFieldBegin(AUX_APPLICATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.auxApplications.size()));
          for (ApplicationInfo _iter7 : struct.auxApplications)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ApplicationSuiteTupleSchemeFactory implements SchemeFactory {
    public ApplicationSuiteTupleScheme getScheme() {
      return new ApplicationSuiteTupleScheme();
    }
  }

  private static class ApplicationSuiteTupleScheme extends TupleScheme<ApplicationSuite> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ApplicationSuite struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetVersion()) {
        optionals.set(1);
      }
      if (struct.isSetCoreApplications()) {
        optionals.set(2);
      }
      if (struct.isSetAuxApplications()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
      if (struct.isSetCoreApplications()) {
        {
          oprot.writeI32(struct.coreApplications.size());
          for (ApplicationInfo _iter8 : struct.coreApplications)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetAuxApplications()) {
        {
          oprot.writeI32(struct.auxApplications.size());
          for (ApplicationInfo _iter9 : struct.auxApplications)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ApplicationSuite struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TList _list10 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.coreApplications = new ArrayList<ApplicationInfo>(_list10.size);
          ApplicationInfo _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new ApplicationInfo();
            _elem11.read(iprot);
            struct.coreApplications.add(_elem11);
          }
        }
        struct.setCoreApplicationsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          libthrift091.protocol.TList _list13 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.auxApplications = new ArrayList<ApplicationInfo>(_list13.size);
          ApplicationInfo _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new ApplicationInfo();
            _elem14.read(iprot);
            struct.auxApplications.add(_elem14);
          }
        }
        struct.setAuxApplicationsIsSet(true);
      }
    }
  }

}

