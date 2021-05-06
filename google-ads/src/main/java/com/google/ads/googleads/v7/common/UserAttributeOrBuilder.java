// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/offline_user_data.proto

package com.google.ads.googleads.v7.common;

public interface UserAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.UserAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Advertiser defined lifetime value for the user.
   * </pre>
   *
   * <code>int64 lifetime_value_micros = 1;</code>
   * @return Whether the lifetimeValueMicros field is set.
   */
  boolean hasLifetimeValueMicros();
  /**
   * <pre>
   * Advertiser defined lifetime value for the user.
   * </pre>
   *
   * <code>int64 lifetime_value_micros = 1;</code>
   * @return The lifetimeValueMicros.
   */
  long getLifetimeValueMicros();

  /**
   * <pre>
   * Advertiser defined lifetime value bucket for the user. The valid range for
   * a lifetime value bucket is from 1 (low) to 10 (high), except for remove
   * operation where 0 will also be accepted.
   * </pre>
   *
   * <code>int32 lifetime_value_bucket = 2;</code>
   * @return Whether the lifetimeValueBucket field is set.
   */
  boolean hasLifetimeValueBucket();
  /**
   * <pre>
   * Advertiser defined lifetime value bucket for the user. The valid range for
   * a lifetime value bucket is from 1 (low) to 10 (high), except for remove
   * operation where 0 will also be accepted.
   * </pre>
   *
   * <code>int32 lifetime_value_bucket = 2;</code>
   * @return The lifetimeValueBucket.
   */
  int getLifetimeValueBucket();
}