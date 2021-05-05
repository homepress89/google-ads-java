// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/criteria.proto

package com.google.ads.googleads.v7.common;

public interface WebpageConditionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.WebpageConditionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Operand of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
   * @return The enum numeric value on the wire for operand.
   */
  int getOperandValue();
  /**
   * <pre>
   * Operand of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.WebpageConditionOperandEnum.WebpageConditionOperand operand = 1;</code>
   * @return The operand.
   */
  com.google.ads.googleads.v7.enums.WebpageConditionOperandEnum.WebpageConditionOperand getOperand();

  /**
   * <pre>
   * Operator of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Operator of webpage targeting condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.WebpageConditionOperatorEnum.WebpageConditionOperator operator = 2;</code>
   * @return The operator.
   */
  com.google.ads.googleads.v7.enums.WebpageConditionOperatorEnum.WebpageConditionOperator getOperator();

  /**
   * <pre>
   * Argument of webpage targeting condition.
   * </pre>
   *
   * <code>string argument = 4;</code>
   * @return Whether the argument field is set.
   */
  boolean hasArgument();
  /**
   * <pre>
   * Argument of webpage targeting condition.
   * </pre>
   *
   * <code>string argument = 4;</code>
   * @return The argument.
   */
  java.lang.String getArgument();
  /**
   * <pre>
   * Argument of webpage targeting condition.
   * </pre>
   *
   * <code>string argument = 4;</code>
   * @return The bytes for argument.
   */
  com.google.protobuf.ByteString
      getArgumentBytes();
}
