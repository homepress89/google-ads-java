// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/user_location_view.proto

package com.google.ads.googleads.v7.resources;

public interface UserLocationViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.resources.UserLocationView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the user location view.
   * UserLocation view resource names have the form:
   * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the user location view.
   * UserLocation view resource names have the form:
   * `customers/{customer_id}/userLocationViews/{country_criterion_id}~{targeting_location}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCriterionId field is set.
   */
  boolean hasCountryCriterionId();
  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>int64 country_criterion_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCriterionId.
   */
  long getCountryCriterionId();

  /**
   * <pre>
   * Output only. Indicates whether location was targeted or not.
   * </pre>
   *
   * <code>bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetingLocation field is set.
   */
  boolean hasTargetingLocation();
  /**
   * <pre>
   * Output only. Indicates whether location was targeted or not.
   * </pre>
   *
   * <code>bool targeting_location = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetingLocation.
   */
  boolean getTargetingLocation();
}
