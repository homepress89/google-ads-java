// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/detail_placement_view.proto

package com.google.ads.googleads.v6.resources;

public interface DetailPlacementViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.resources.DetailPlacementView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the detail placement view.
   * Detail placement view resource names have the form:
   * `customers/{customer_id}/detailPlacementViews/{ad_group_id}~{base64_placement}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the detail placement view.
   * Detail placement view resource names have the form:
   * `customers/{customer_id}/detailPlacementViews/{ad_group_id}~{base64_placement}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The automatic placement string at detail level, e. g. website URL, mobile
   * application ID, or a YouTube video ID.
   * </pre>
   *
   * <code>string placement = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Output only. The automatic placement string at detail level, e. g. website URL, mobile
   * application ID, or a YouTube video ID.
   * </pre>
   *
   * <code>string placement = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placement.
   */
  java.lang.String getPlacement();
  /**
   * <pre>
   * Output only. The automatic placement string at detail level, e. g. website URL, mobile
   * application ID, or a YouTube video ID.
   * </pre>
   *
   * <code>string placement = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for placement.
   */
  com.google.protobuf.ByteString
      getPlacementBytes();

  /**
   * <pre>
   * Output only. The display name is URL name for websites, YouTube video name for YouTube
   * videos, and translated mobile app name for mobile apps.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the displayName field is set.
   */
  boolean hasDisplayName();
  /**
   * <pre>
   * Output only. The display name is URL name for websites, YouTube video name for YouTube
   * videos, and translated mobile app name for mobile apps.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. The display name is URL name for websites, YouTube video name for YouTube
   * videos, and translated mobile app name for mobile apps.
   * </pre>
   *
   * <code>string display_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. URL of the group placement, e.g. domain, link to the mobile application in
   * app store, or a YouTube channel URL.
   * </pre>
   *
   * <code>string group_placement_target_url = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the groupPlacementTargetUrl field is set.
   */
  boolean hasGroupPlacementTargetUrl();
  /**
   * <pre>
   * Output only. URL of the group placement, e.g. domain, link to the mobile application in
   * app store, or a YouTube channel URL.
   * </pre>
   *
   * <code>string group_placement_target_url = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The groupPlacementTargetUrl.
   */
  java.lang.String getGroupPlacementTargetUrl();
  /**
   * <pre>
   * Output only. URL of the group placement, e.g. domain, link to the mobile application in
   * app store, or a YouTube channel URL.
   * </pre>
   *
   * <code>string group_placement_target_url = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for groupPlacementTargetUrl.
   */
  com.google.protobuf.ByteString
      getGroupPlacementTargetUrlBytes();

  /**
   * <pre>
   * Output only. URL of the placement, e.g. website, link to the mobile application in app
   * store, or a YouTube video URL.
   * </pre>
   *
   * <code>string target_url = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetUrl field is set.
   */
  boolean hasTargetUrl();
  /**
   * <pre>
   * Output only. URL of the placement, e.g. website, link to the mobile application in app
   * store, or a YouTube video URL.
   * </pre>
   *
   * <code>string target_url = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetUrl.
   */
  java.lang.String getTargetUrl();
  /**
   * <pre>
   * Output only. URL of the placement, e.g. website, link to the mobile application in app
   * store, or a YouTube video URL.
   * </pre>
   *
   * <code>string target_url = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for targetUrl.
   */
  com.google.protobuf.ByteString
      getTargetUrlBytes();

  /**
   * <pre>
   * Output only. Type of the placement, e.g. Website, YouTube Video, and Mobile Application.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PlacementTypeEnum.PlacementType placement_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for placementType.
   */
  int getPlacementTypeValue();
  /**
   * <pre>
   * Output only. Type of the placement, e.g. Website, YouTube Video, and Mobile Application.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PlacementTypeEnum.PlacementType placement_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placementType.
   */
  com.google.ads.googleads.v6.enums.PlacementTypeEnum.PlacementType getPlacementType();
}
