// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/ad_group_ad_label.proto

package com.google.ads.googleads.v7.resources;

public interface AdGroupAdLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.resources.AdGroupAdLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group ad label.
   * Ad group ad label resource names have the form:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group ad label.
   * Ad group ad label resource names have the form:
   * `customers/{customer_id}/adGroupAdLabels/{ad_group_id}~{ad_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group ad to which the label is attached.
   * </pre>
   *
   * <code>string ad_group_ad = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupAd field is set.
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * Immutable. The ad group ad to which the label is attached.
   * </pre>
   *
   * <code>string ad_group_ad = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAd.
   */
  java.lang.String getAdGroupAd();
  /**
   * <pre>
   * Immutable. The ad group ad to which the label is attached.
   * </pre>
   *
   * <code>string ad_group_ad = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupAd.
   */
  com.google.protobuf.ByteString
      getAdGroupAdBytes();

  /**
   * <pre>
   * Immutable. The label assigned to the ad group ad.
   * </pre>
   *
   * <code>string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group ad.
   * </pre>
   *
   * <code>string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group ad.
   * </pre>
   *
   * <code>string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();
}
