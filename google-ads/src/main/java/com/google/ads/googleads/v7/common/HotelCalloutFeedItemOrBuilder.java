// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/extensions.proto

package com.google.ads.googleads.v7.common;

public interface HotelCalloutFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.HotelCalloutFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string text = 3;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string text = 3;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string text = 3;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The language of the hotel callout text.
   * IETF BCP 47 compliant language code.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The language of the hotel callout text.
   * IETF BCP 47 compliant language code.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language of the hotel callout text.
   * IETF BCP 47 compliant language code.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
