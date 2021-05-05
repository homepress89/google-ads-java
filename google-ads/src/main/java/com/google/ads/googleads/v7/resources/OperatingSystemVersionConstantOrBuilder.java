// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/operating_system_version_constant.proto

package com.google.ads.googleads.v7.resources;

public interface OperatingSystemVersionConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.resources.OperatingSystemVersionConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the operating system version constant.
   * Operating system version constant resource names have the form:
   * `operatingSystemVersionConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the operating system version constant.
   * Operating system version constant resource names have the form:
   * `operatingSystemVersionConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the operating system version.
   * </pre>
   *
   * <code>int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the operating system version.
   * </pre>
   *
   * <code>int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Name of the operating system.
   * </pre>
   *
   * <code>string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. Name of the operating system.
   * </pre>
   *
   * <code>string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Name of the operating system.
   * </pre>
   *
   * <code>string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The OS Major Version number.
   * </pre>
   *
   * <code>int32 os_major_version = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the osMajorVersion field is set.
   */
  boolean hasOsMajorVersion();
  /**
   * <pre>
   * Output only. The OS Major Version number.
   * </pre>
   *
   * <code>int32 os_major_version = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The osMajorVersion.
   */
  int getOsMajorVersion();

  /**
   * <pre>
   * Output only. The OS Minor Version number.
   * </pre>
   *
   * <code>int32 os_minor_version = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the osMinorVersion field is set.
   */
  boolean hasOsMinorVersion();
  /**
   * <pre>
   * Output only. The OS Minor Version number.
   * </pre>
   *
   * <code>int32 os_minor_version = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The osMinorVersion.
   */
  int getOsMinorVersion();

  /**
   * <pre>
   * Output only. Determines whether this constant represents a single version or a range of
   * versions.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.OperatingSystemVersionOperatorTypeEnum.OperatingSystemVersionOperatorType operator_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for operatorType.
   */
  int getOperatorTypeValue();
  /**
   * <pre>
   * Output only. Determines whether this constant represents a single version or a range of
   * versions.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.OperatingSystemVersionOperatorTypeEnum.OperatingSystemVersionOperatorType operator_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operatorType.
   */
  com.google.ads.googleads.v7.enums.OperatingSystemVersionOperatorTypeEnum.OperatingSystemVersionOperatorType getOperatorType();
}
