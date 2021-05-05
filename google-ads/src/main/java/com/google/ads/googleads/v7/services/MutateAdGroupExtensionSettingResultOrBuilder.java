// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/ad_group_extension_setting_service.proto

package com.google.ads.googleads.v7.services;

public interface MutateAdGroupExtensionSettingResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.MutateAdGroupExtensionSettingResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
   * @return Whether the adGroupExtensionSetting field is set.
   */
  boolean hasAdGroupExtensionSetting();
  /**
   * <pre>
   * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
   * @return The adGroupExtensionSetting.
   */
  com.google.ads.googleads.v7.resources.AdGroupExtensionSetting getAdGroupExtensionSetting();
  /**
   * <pre>
   * The mutated AdGroupExtensionSetting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupExtensionSetting ad_group_extension_setting = 2;</code>
   */
  com.google.ads.googleads.v7.resources.AdGroupExtensionSettingOrBuilder getAdGroupExtensionSettingOrBuilder();
}
