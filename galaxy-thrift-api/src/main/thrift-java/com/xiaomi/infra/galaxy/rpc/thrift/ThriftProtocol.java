/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.rpc.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * thrift传输协议
 */
public enum ThriftProtocol implements libthrift091.TEnum {
  /**
   * TCompactProtocl
   */
  TCOMPACT(0),
  /**
   * TJSONProtocol
   */
  TJSON(1),
  /**
   * TBINARYProtocol
   */
  TBINARY(2);

  private final int value;

  private ThriftProtocol(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftProtocol findByValue(int value) { 
    switch (value) {
      case 0:
        return TCOMPACT;
      case 1:
        return TJSON;
      case 2:
        return TBINARY;
      default:
        return null;
    }
  }
}
