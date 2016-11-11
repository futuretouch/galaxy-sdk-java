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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-11-11")
public class ListTopicsResponse implements libthrift091.TBase<ListTopicsResponse, ListTopicsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ListTopicsResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListTopicsResponse");

  private static final libthrift091.protocol.TField TOPIC_INFOS_FIELD_DESC = new libthrift091.protocol.TField("topicInfos", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListTopicsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListTopicsResponseTupleSchemeFactory());
  }

  /**
   * The topicInfos;
   * 
   */
  public List<TopicInfo> topicInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The topicInfos;
     * 
     */
    TOPIC_INFOS((short)1, "topicInfos");

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
        case 1: // TOPIC_INFOS
          return TOPIC_INFOS;
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
    tmpMap.put(_Fields.TOPIC_INFOS, new libthrift091.meta_data.FieldMetaData("topicInfos", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListTopicsResponse.class, metaDataMap);
  }

  public ListTopicsResponse() {
  }

  public ListTopicsResponse(
    List<TopicInfo> topicInfos)
  {
    this();
    this.topicInfos = topicInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListTopicsResponse(ListTopicsResponse other) {
    if (other.isSetTopicInfos()) {
      List<TopicInfo> __this__topicInfos = new ArrayList<TopicInfo>(other.topicInfos.size());
      for (TopicInfo other_element : other.topicInfos) {
        __this__topicInfos.add(new TopicInfo(other_element));
      }
      this.topicInfos = __this__topicInfos;
    }
  }

  public ListTopicsResponse deepCopy() {
    return new ListTopicsResponse(this);
  }

  @Override
  public void clear() {
    this.topicInfos = null;
  }

  public int getTopicInfosSize() {
    return (this.topicInfos == null) ? 0 : this.topicInfos.size();
  }

  public java.util.Iterator<TopicInfo> getTopicInfosIterator() {
    return (this.topicInfos == null) ? null : this.topicInfos.iterator();
  }

  public void addToTopicInfos(TopicInfo elem) {
    if (this.topicInfos == null) {
      this.topicInfos = new ArrayList<TopicInfo>();
    }
    this.topicInfos.add(elem);
  }

  /**
   * The topicInfos;
   * 
   */
  public List<TopicInfo> getTopicInfos() {
    return this.topicInfos;
  }

  /**
   * The topicInfos;
   * 
   */
  public ListTopicsResponse setTopicInfos(List<TopicInfo> topicInfos) {
    this.topicInfos = topicInfos;
    return this;
  }

  public void unsetTopicInfos() {
    this.topicInfos = null;
  }

  /** Returns true if field topicInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicInfos() {
    return this.topicInfos != null;
  }

  public void setTopicInfosIsSet(boolean value) {
    if (!value) {
      this.topicInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_INFOS:
      if (value == null) {
        unsetTopicInfos();
      } else {
        setTopicInfos((List<TopicInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_INFOS:
      return getTopicInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_INFOS:
      return isSetTopicInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListTopicsResponse)
      return this.equals((ListTopicsResponse)that);
    return false;
  }

  public boolean equals(ListTopicsResponse that) {
    if (that == null)
      return false;

    boolean this_present_topicInfos = true && this.isSetTopicInfos();
    boolean that_present_topicInfos = true && that.isSetTopicInfos();
    if (this_present_topicInfos || that_present_topicInfos) {
      if (!(this_present_topicInfos && that_present_topicInfos))
        return false;
      if (!this.topicInfos.equals(that.topicInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicInfos = true && (isSetTopicInfos());
    list.add(present_topicInfos);
    if (present_topicInfos)
      list.add(topicInfos);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListTopicsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicInfos()).compareTo(other.isSetTopicInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicInfos()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicInfos, other.topicInfos);
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
    StringBuilder sb = new StringBuilder("ListTopicsResponse(");
    boolean first = true;

    sb.append("topicInfos:");
    if (this.topicInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.topicInfos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicInfos == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicInfos' was not present! Struct: " + toString());
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

  private static class ListTopicsResponseStandardSchemeFactory implements SchemeFactory {
    public ListTopicsResponseStandardScheme getScheme() {
      return new ListTopicsResponseStandardScheme();
    }
  }

  private static class ListTopicsResponseStandardScheme extends StandardScheme<ListTopicsResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ListTopicsResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_INFOS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list48 = iprot.readListBegin();
                struct.topicInfos = new ArrayList<TopicInfo>(_list48.size);
                TopicInfo _elem49;
                for (int _i50 = 0; _i50 < _list48.size; ++_i50)
                {
                  _elem49 = new TopicInfo();
                  _elem49.read(iprot);
                  struct.topicInfos.add(_elem49);
                }
                iprot.readListEnd();
              }
              struct.setTopicInfosIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListTopicsResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicInfos != null) {
        oprot.writeFieldBegin(TOPIC_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.topicInfos.size()));
          for (TopicInfo _iter51 : struct.topicInfos)
          {
            _iter51.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListTopicsResponseTupleSchemeFactory implements SchemeFactory {
    public ListTopicsResponseTupleScheme getScheme() {
      return new ListTopicsResponseTupleScheme();
    }
  }

  private static class ListTopicsResponseTupleScheme extends TupleScheme<ListTopicsResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListTopicsResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.topicInfos.size());
        for (TopicInfo _iter52 : struct.topicInfos)
        {
          _iter52.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListTopicsResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list53 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.topicInfos = new ArrayList<TopicInfo>(_list53.size);
        TopicInfo _elem54;
        for (int _i55 = 0; _i55 < _list53.size; ++_i55)
        {
          _elem54 = new TopicInfo();
          _elem54.read(iprot);
          struct.topicInfos.add(_elem54);
        }
      }
      struct.setTopicInfosIsSet(true);
    }
  }

}

