// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/display_keyword_view.proto

package com.google.ads.googleads.v6.resources;

public interface DisplayKeywordViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.resources.DisplayKeywordView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the display keyword view.
   * Display Keyword view resource names have the form:
   * `customers/{customer_id}/displayKeywordViews/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the display keyword view.
   * Display Keyword view resource names have the form:
   * `customers/{customer_id}/displayKeywordViews/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();
}
