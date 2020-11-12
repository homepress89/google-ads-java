// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/asset_policy.proto

package com.google.ads.googleads.v6.common;

public interface AdAssetPolicySummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.AdAssetPolicySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v6.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v6.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * The list of policy findings for this asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v6.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Where in the review process this asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2;</code>
   * @return The enum numeric value on the wire for reviewStatus.
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Where in the review process this asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2;</code>
   * @return The reviewStatus.
   */
  com.google.ads.googleads.v6.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * The overall approval status of this asset, which is calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3;</code>
   * @return The enum numeric value on the wire for approvalStatus.
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * The overall approval status of this asset, which is calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3;</code>
   * @return The approvalStatus.
   */
  com.google.ads.googleads.v6.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();
}
