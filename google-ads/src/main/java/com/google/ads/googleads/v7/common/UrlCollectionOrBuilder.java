// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/url_collection.proto

package com.google.ads.googleads.v7.common;

public interface UrlCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.UrlCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier for this UrlCollection instance.
   * </pre>
   *
   * <code>string url_collection_id = 5;</code>
   * @return Whether the urlCollectionId field is set.
   */
  boolean hasUrlCollectionId();
  /**
   * <pre>
   * Unique identifier for this UrlCollection instance.
   * </pre>
   *
   * <code>string url_collection_id = 5;</code>
   * @return The urlCollectionId.
   */
  java.lang.String getUrlCollectionId();
  /**
   * <pre>
   * Unique identifier for this UrlCollection instance.
   * </pre>
   *
   * <code>string url_collection_id = 5;</code>
   * @return The bytes for urlCollectionId.
   */
  com.google.protobuf.ByteString
      getUrlCollectionIdBytes();

  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated string final_urls = 6;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated string final_urls = 6;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated string final_urls = 6;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs.
   * </pre>
   *
   * <code>repeated string final_urls = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 7;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 7;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 7;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>string tracking_url_template = 8;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>string tracking_url_template = 8;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>string tracking_url_template = 8;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();
}
