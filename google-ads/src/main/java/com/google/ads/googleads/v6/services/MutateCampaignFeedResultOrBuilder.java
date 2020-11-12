// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_feed_service.proto

package com.google.ads.googleads.v6.services;

public interface MutateCampaignFeedResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.MutateCampaignFeedResult)
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
   * The mutated campaign feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignFeed campaign_feed = 2;</code>
   * @return Whether the campaignFeed field is set.
   */
  boolean hasCampaignFeed();
  /**
   * <pre>
   * The mutated campaign feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignFeed campaign_feed = 2;</code>
   * @return The campaignFeed.
   */
  com.google.ads.googleads.v6.resources.CampaignFeed getCampaignFeed();
  /**
   * <pre>
   * The mutated campaign feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignFeed campaign_feed = 2;</code>
   */
  com.google.ads.googleads.v6.resources.CampaignFeedOrBuilder getCampaignFeedOrBuilder();
}
