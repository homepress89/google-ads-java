// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/carrier_constant.proto

package com.google.ads.googleads.v7.resources;

public interface CarrierConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.resources.CarrierConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the carrier criterion.
   * Carrier criterion resource names have the form:
   * `carrierConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the carrier criterion.
   * Carrier criterion resource names have the form:
   * `carrierConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the carrier criterion.
   * </pre>
   *
   * <code>int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the carrier criterion.
   * </pre>
   *
   * <code>int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The full name of the carrier in English.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The full name of the carrier in English.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The full name of the carrier in English.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The country code of the country where the carrier is located, e.g., "AR",
   * "FR", etc.
   * </pre>
   *
   * <code>string country_code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Output only. The country code of the country where the carrier is located, e.g., "AR",
   * "FR", etc.
   * </pre>
   *
   * <code>string country_code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Output only. The country code of the country where the carrier is located, e.g., "AR",
   * "FR", etc.
   * </pre>
   *
   * <code>string country_code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();
}
