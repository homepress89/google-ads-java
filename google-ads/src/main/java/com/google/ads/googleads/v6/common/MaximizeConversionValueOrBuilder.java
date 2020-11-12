// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/bidding.proto

package com.google.ads.googleads.v6.common;

public interface MaximizeConversionValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.MaximizeConversionValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>double target_roas = 2;</code>
   * @return Whether the targetRoas field is set.
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>double target_roas = 2;</code>
   * @return The targetRoas.
   */
  double getTargetRoas();
}
