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
/**
 * metrics time series data
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-5-11")
public class TimeSeriesData implements libthrift091.TBase<TimeSeriesData, TimeSeriesData._Fields>, java.io.Serializable, Cloneable, Comparable<TimeSeriesData> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TimeSeriesData");

  private static final libthrift091.protocol.TField METRIC_FIELD_DESC = new libthrift091.protocol.TField("metric", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TAGS_FIELD_DESC = new libthrift091.protocol.TField("tags", libthrift091.protocol.TType.MAP, (short)2);
  private static final libthrift091.protocol.TField DATA_FIELD_DESC = new libthrift091.protocol.TField("data", libthrift091.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeSeriesDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeSeriesDataTupleSchemeFactory());
  }

  /**
   * metric name
   */
  public String metric; // optional
  /**
   * tags
   */
  public Map<String,String> tags; // optional
  /**
   * data, {timestamp => value}
   */
  public Map<Long,Double> data; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * metric name
     */
    METRIC((short)1, "metric"),
    /**
     * tags
     */
    TAGS((short)2, "tags"),
    /**
     * data, {timestamp => value}
     */
    DATA((short)3, "data");

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
        case 1: // METRIC
          return METRIC;
        case 2: // TAGS
          return TAGS;
        case 3: // DATA
          return DATA;
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
  private static final _Fields optionals[] = {_Fields.METRIC,_Fields.TAGS,_Fields.DATA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRIC, new libthrift091.meta_data.FieldMetaData("metric", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAGS, new libthrift091.meta_data.FieldMetaData("tags", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.DATA, new libthrift091.meta_data.FieldMetaData("data", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TimeSeriesData.class, metaDataMap);
  }

  public TimeSeriesData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeSeriesData(TimeSeriesData other) {
    if (other.isSetMetric()) {
      this.metric = other.metric;
    }
    if (other.isSetTags()) {
      Map<String,String> __this__tags = new HashMap<String,String>(other.tags);
      this.tags = __this__tags;
    }
    if (other.isSetData()) {
      Map<Long,Double> __this__data = new HashMap<Long,Double>(other.data);
      this.data = __this__data;
    }
  }

  public TimeSeriesData deepCopy() {
    return new TimeSeriesData(this);
  }

  @Override
  public void clear() {
    this.metric = null;
    this.tags = null;
    this.data = null;
  }

  /**
   * metric name
   */
  public String getMetric() {
    return this.metric;
  }

  /**
   * metric name
   */
  public TimeSeriesData setMetric(String metric) {
    this.metric = metric;
    return this;
  }

  public void unsetMetric() {
    this.metric = null;
  }

  /** Returns true if field metric is set (has been assigned a value) and false otherwise */
  public boolean isSetMetric() {
    return this.metric != null;
  }

  public void setMetricIsSet(boolean value) {
    if (!value) {
      this.metric = null;
    }
  }

  public int getTagsSize() {
    return (this.tags == null) ? 0 : this.tags.size();
  }

  public void putToTags(String key, String val) {
    if (this.tags == null) {
      this.tags = new HashMap<String,String>();
    }
    this.tags.put(key, val);
  }

  /**
   * tags
   */
  public Map<String,String> getTags() {
    return this.tags;
  }

  /**
   * tags
   */
  public TimeSeriesData setTags(Map<String,String> tags) {
    this.tags = tags;
    return this;
  }

  public void unsetTags() {
    this.tags = null;
  }

  /** Returns true if field tags is set (has been assigned a value) and false otherwise */
  public boolean isSetTags() {
    return this.tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.tags = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public void putToData(long key, double val) {
    if (this.data == null) {
      this.data = new HashMap<Long,Double>();
    }
    this.data.put(key, val);
  }

  /**
   * data, {timestamp => value}
   */
  public Map<Long,Double> getData() {
    return this.data;
  }

  /**
   * data, {timestamp => value}
   */
  public TimeSeriesData setData(Map<Long,Double> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRIC:
      if (value == null) {
        unsetMetric();
      } else {
        setMetric((String)value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((Map<String,String>)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Map<Long,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC:
      return getMetric();

    case TAGS:
      return getTags();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRIC:
      return isSetMetric();
    case TAGS:
      return isSetTags();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeSeriesData)
      return this.equals((TimeSeriesData)that);
    return false;
  }

  public boolean equals(TimeSeriesData that) {
    if (that == null)
      return false;

    boolean this_present_metric = true && this.isSetMetric();
    boolean that_present_metric = true && that.isSetMetric();
    if (this_present_metric || that_present_metric) {
      if (!(this_present_metric && that_present_metric))
        return false;
      if (!this.metric.equals(that.metric))
        return false;
    }

    boolean this_present_tags = true && this.isSetTags();
    boolean that_present_tags = true && that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags))
        return false;
      if (!this.tags.equals(that.tags))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metric = true && (isSetMetric());
    list.add(present_metric);
    if (present_metric)
      list.add(metric);

    boolean present_tags = true && (isSetTags());
    list.add(present_tags);
    if (present_tags)
      list.add(tags);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimeSeriesData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetric()).compareTo(other.isSetMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetric()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metric, other.metric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTags()).compareTo(other.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tags, other.tags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.data, other.data);
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
    StringBuilder sb = new StringBuilder("TimeSeriesData(");
    boolean first = true;

    if (isSetMetric()) {
      sb.append("metric:");
      if (this.metric == null) {
        sb.append("null");
      } else {
        sb.append(this.metric);
      }
      first = false;
    }
    if (isSetTags()) {
      if (!first) sb.append(", ");
      sb.append("tags:");
      if (this.tags == null) {
        sb.append("null");
      } else {
        sb.append(this.tags);
      }
      first = false;
    }
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimeSeriesDataStandardSchemeFactory implements SchemeFactory {
    public TimeSeriesDataStandardScheme getScheme() {
      return new TimeSeriesDataStandardScheme();
    }
  }

  private static class TimeSeriesDataStandardScheme extends StandardScheme<TimeSeriesData> {

    public void read(libthrift091.protocol.TProtocol iprot, TimeSeriesData struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRIC
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.metric = iprot.readString();
              struct.setMetricIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TAGS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map82 = iprot.readMapBegin();
                struct.tags = new HashMap<String,String>(2*_map82.size);
                String _key83;
                String _val84;
                for (int _i85 = 0; _i85 < _map82.size; ++_i85)
                {
                  _key83 = iprot.readString();
                  _val84 = iprot.readString();
                  struct.tags.put(_key83, _val84);
                }
                iprot.readMapEnd();
              }
              struct.setTagsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map86 = iprot.readMapBegin();
                struct.data = new HashMap<Long,Double>(2*_map86.size);
                long _key87;
                double _val88;
                for (int _i89 = 0; _i89 < _map86.size; ++_i89)
                {
                  _key87 = iprot.readI64();
                  _val88 = iprot.readDouble();
                  struct.data.put(_key87, _val88);
                }
                iprot.readMapEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TimeSeriesData struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metric != null) {
        if (struct.isSetMetric()) {
          oprot.writeFieldBegin(METRIC_FIELD_DESC);
          oprot.writeString(struct.metric);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tags != null) {
        if (struct.isSetTags()) {
          oprot.writeFieldBegin(TAGS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.tags.size()));
            for (Map.Entry<String, String> _iter90 : struct.tags.entrySet())
            {
              oprot.writeString(_iter90.getKey());
              oprot.writeString(_iter90.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.I64, libthrift091.protocol.TType.DOUBLE, struct.data.size()));
            for (Map.Entry<Long, Double> _iter91 : struct.data.entrySet())
            {
              oprot.writeI64(_iter91.getKey());
              oprot.writeDouble(_iter91.getValue());
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

  private static class TimeSeriesDataTupleSchemeFactory implements SchemeFactory {
    public TimeSeriesDataTupleScheme getScheme() {
      return new TimeSeriesDataTupleScheme();
    }
  }

  private static class TimeSeriesDataTupleScheme extends TupleScheme<TimeSeriesData> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TimeSeriesData struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetric()) {
        optionals.set(0);
      }
      if (struct.isSetTags()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMetric()) {
        oprot.writeString(struct.metric);
      }
      if (struct.isSetTags()) {
        {
          oprot.writeI32(struct.tags.size());
          for (Map.Entry<String, String> _iter92 : struct.tags.entrySet())
          {
            oprot.writeString(_iter92.getKey());
            oprot.writeString(_iter92.getValue());
          }
        }
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (Map.Entry<Long, Double> _iter93 : struct.data.entrySet())
          {
            oprot.writeI64(_iter93.getKey());
            oprot.writeDouble(_iter93.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TimeSeriesData struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.metric = iprot.readString();
        struct.setMetricIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map94 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.tags = new HashMap<String,String>(2*_map94.size);
          String _key95;
          String _val96;
          for (int _i97 = 0; _i97 < _map94.size; ++_i97)
          {
            _key95 = iprot.readString();
            _val96 = iprot.readString();
            struct.tags.put(_key95, _val96);
          }
        }
        struct.setTagsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map98 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.I64, libthrift091.protocol.TType.DOUBLE, iprot.readI32());
          struct.data = new HashMap<Long,Double>(2*_map98.size);
          long _key99;
          double _val100;
          for (int _i101 = 0; _i101 < _map98.size; ++_i101)
          {
            _key99 = iprot.readI64();
            _val100 = iprot.readDouble();
            struct.data.put(_key99, _val100);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

