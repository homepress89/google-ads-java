// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_draft_service.proto

package com.google.ads.googleads.v6.services;

public interface MutateCampaignDraftResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.MutateCampaignDraftResult)
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
   * The mutated campaign draft with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignDraft campaign_draft = 2;</code>
   * @return Whether the campaignDraft field is set.
   */
  boolean hasCampaignDraft();
  /**
   * <pre>
   * The mutated campaign draft with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignDraft campaign_draft = 2;</code>
   * @return The campaignDraft.
   */
  com.google.ads.googleads.v6.resources.CampaignDraft getCampaignDraft();
  /**
   * <pre>
   * The mutated campaign draft with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignDraft campaign_draft = 2;</code>
   */
  com.google.ads.googleads.v6.resources.CampaignDraftOrBuilder getCampaignDraftOrBuilder();
}
