/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baifendian.swordfish.rpc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-10")
public class HeartBeatData implements org.apache.thrift.TBase<HeartBeatData, HeartBeatData._Fields>, java.io.Serializable, Cloneable, Comparable<HeartBeatData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartBeatData");

  private static final org.apache.thrift.protocol.TField REPORT_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("reportDate", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField CPU_USED_FIELD_DESC = new org.apache.thrift.protocol.TField("cpuUsed", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField MEM_USED_FIELD_DESC = new org.apache.thrift.protocol.TField("memUsed", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeartBeatDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeartBeatDataTupleSchemeFactory());
  }

  /**
   * 汇报时间 *
   */
  public long reportDate; // required
  /**
   * cpu使用率 *
   */
  public double cpuUsed; // required
  /**
   * 内存使用率 *
   */
  public double memUsed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 汇报时间 *
     */
    REPORT_DATE((short)1, "reportDate"),
    /**
     * cpu使用率 *
     */
    CPU_USED((short)2, "cpuUsed"),
    /**
     * 内存使用率 *
     */
    MEM_USED((short)3, "memUsed");

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
        case 1: // REPORT_DATE
          return REPORT_DATE;
        case 2: // CPU_USED
          return CPU_USED;
        case 3: // MEM_USED
          return MEM_USED;
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
  private static final int __REPORTDATE_ISSET_ID = 0;
  private static final int __CPUUSED_ISSET_ID = 1;
  private static final int __MEMUSED_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REPORT_DATE, new org.apache.thrift.meta_data.FieldMetaData("reportDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CPU_USED, new org.apache.thrift.meta_data.FieldMetaData("cpuUsed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MEM_USED, new org.apache.thrift.meta_data.FieldMetaData("memUsed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartBeatData.class, metaDataMap);
  }

  public HeartBeatData() {
  }

  public HeartBeatData(
    long reportDate,
    double cpuUsed,
    double memUsed)
  {
    this();
    this.reportDate = reportDate;
    setReportDateIsSet(true);
    this.cpuUsed = cpuUsed;
    setCpuUsedIsSet(true);
    this.memUsed = memUsed;
    setMemUsedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartBeatData(HeartBeatData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.reportDate = other.reportDate;
    this.cpuUsed = other.cpuUsed;
    this.memUsed = other.memUsed;
  }

  public HeartBeatData deepCopy() {
    return new HeartBeatData(this);
  }

  @Override
  public void clear() {
    setReportDateIsSet(false);
    this.reportDate = 0;
    setCpuUsedIsSet(false);
    this.cpuUsed = 0.0;
    setMemUsedIsSet(false);
    this.memUsed = 0.0;
  }

  /**
   * 汇报时间 *
   */
  public long getReportDate() {
    return this.reportDate;
  }

  /**
   * 汇报时间 *
   */
  public HeartBeatData setReportDate(long reportDate) {
    this.reportDate = reportDate;
    setReportDateIsSet(true);
    return this;
  }

  public void unsetReportDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REPORTDATE_ISSET_ID);
  }

  /** Returns true if field reportDate is set (has been assigned a value) and false otherwise */
  public boolean isSetReportDate() {
    return EncodingUtils.testBit(__isset_bitfield, __REPORTDATE_ISSET_ID);
  }

  public void setReportDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REPORTDATE_ISSET_ID, value);
  }

  /**
   * cpu使用率 *
   */
  public double getCpuUsed() {
    return this.cpuUsed;
  }

  /**
   * cpu使用率 *
   */
  public HeartBeatData setCpuUsed(double cpuUsed) {
    this.cpuUsed = cpuUsed;
    setCpuUsedIsSet(true);
    return this;
  }

  public void unsetCpuUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CPUUSED_ISSET_ID);
  }

  /** Returns true if field cpuUsed is set (has been assigned a value) and false otherwise */
  public boolean isSetCpuUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __CPUUSED_ISSET_ID);
  }

  public void setCpuUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CPUUSED_ISSET_ID, value);
  }

  /**
   * 内存使用率 *
   */
  public double getMemUsed() {
    return this.memUsed;
  }

  /**
   * 内存使用率 *
   */
  public HeartBeatData setMemUsed(double memUsed) {
    this.memUsed = memUsed;
    setMemUsedIsSet(true);
    return this;
  }

  public void unsetMemUsed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEMUSED_ISSET_ID);
  }

  /** Returns true if field memUsed is set (has been assigned a value) and false otherwise */
  public boolean isSetMemUsed() {
    return EncodingUtils.testBit(__isset_bitfield, __MEMUSED_ISSET_ID);
  }

  public void setMemUsedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEMUSED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REPORT_DATE:
      if (value == null) {
        unsetReportDate();
      } else {
        setReportDate((Long)value);
      }
      break;

    case CPU_USED:
      if (value == null) {
        unsetCpuUsed();
      } else {
        setCpuUsed((Double)value);
      }
      break;

    case MEM_USED:
      if (value == null) {
        unsetMemUsed();
      } else {
        setMemUsed((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REPORT_DATE:
      return getReportDate();

    case CPU_USED:
      return getCpuUsed();

    case MEM_USED:
      return getMemUsed();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REPORT_DATE:
      return isSetReportDate();
    case CPU_USED:
      return isSetCpuUsed();
    case MEM_USED:
      return isSetMemUsed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartBeatData)
      return this.equals((HeartBeatData)that);
    return false;
  }

  public boolean equals(HeartBeatData that) {
    if (that == null)
      return false;

    boolean this_present_reportDate = true;
    boolean that_present_reportDate = true;
    if (this_present_reportDate || that_present_reportDate) {
      if (!(this_present_reportDate && that_present_reportDate))
        return false;
      if (this.reportDate != that.reportDate)
        return false;
    }

    boolean this_present_cpuUsed = true;
    boolean that_present_cpuUsed = true;
    if (this_present_cpuUsed || that_present_cpuUsed) {
      if (!(this_present_cpuUsed && that_present_cpuUsed))
        return false;
      if (this.cpuUsed != that.cpuUsed)
        return false;
    }

    boolean this_present_memUsed = true;
    boolean that_present_memUsed = true;
    if (this_present_memUsed || that_present_memUsed) {
      if (!(this_present_memUsed && that_present_memUsed))
        return false;
      if (this.memUsed != that.memUsed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_reportDate = true;
    list.add(present_reportDate);
    if (present_reportDate)
      list.add(reportDate);

    boolean present_cpuUsed = true;
    list.add(present_cpuUsed);
    if (present_cpuUsed)
      list.add(cpuUsed);

    boolean present_memUsed = true;
    list.add(present_memUsed);
    if (present_memUsed)
      list.add(memUsed);

    return list.hashCode();
  }

  @Override
  public int compareTo(HeartBeatData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReportDate()).compareTo(other.isSetReportDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReportDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reportDate, other.reportDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCpuUsed()).compareTo(other.isSetCpuUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpuUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cpuUsed, other.cpuUsed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMemUsed()).compareTo(other.isSetMemUsed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemUsed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memUsed, other.memUsed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HeartBeatData(");
    boolean first = true;

    sb.append("reportDate:");
    sb.append(this.reportDate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cpuUsed:");
    sb.append(this.cpuUsed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("memUsed:");
    sb.append(this.memUsed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeartBeatDataStandardSchemeFactory implements SchemeFactory {
    public HeartBeatDataStandardScheme getScheme() {
      return new HeartBeatDataStandardScheme();
    }
  }

  private static class HeartBeatDataStandardScheme extends StandardScheme<HeartBeatData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartBeatData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REPORT_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.reportDate = iprot.readI64();
              struct.setReportDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CPU_USED
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.cpuUsed = iprot.readDouble();
              struct.setCpuUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MEM_USED
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.memUsed = iprot.readDouble();
              struct.setMemUsedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartBeatData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REPORT_DATE_FIELD_DESC);
      oprot.writeI64(struct.reportDate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CPU_USED_FIELD_DESC);
      oprot.writeDouble(struct.cpuUsed);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MEM_USED_FIELD_DESC);
      oprot.writeDouble(struct.memUsed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartBeatDataTupleSchemeFactory implements SchemeFactory {
    public HeartBeatDataTupleScheme getScheme() {
      return new HeartBeatDataTupleScheme();
    }
  }

  private static class HeartBeatDataTupleScheme extends TupleScheme<HeartBeatData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartBeatData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReportDate()) {
        optionals.set(0);
      }
      if (struct.isSetCpuUsed()) {
        optionals.set(1);
      }
      if (struct.isSetMemUsed()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetReportDate()) {
        oprot.writeI64(struct.reportDate);
      }
      if (struct.isSetCpuUsed()) {
        oprot.writeDouble(struct.cpuUsed);
      }
      if (struct.isSetMemUsed()) {
        oprot.writeDouble(struct.memUsed);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartBeatData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.reportDate = iprot.readI64();
        struct.setReportDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cpuUsed = iprot.readDouble();
        struct.setCpuUsedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.memUsed = iprot.readDouble();
        struct.setMemUsedIsSet(true);
      }
    }
  }

}

