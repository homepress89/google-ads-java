// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/ad_group_ad_service.proto

package com.google.ads.googleads.v7.services;

public interface AdGroupAdOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.AdGroupAdOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Configuration for how policies are validated.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.PolicyValidationParameter policy_validation_parameter = 5;</code>
   * @return Whether the policyValidationParameter field is set.
   */
  boolean hasPolicyValidationParameter();
  /**
   * <pre>
   * Configuration for how policies are validated.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.PolicyValidationParameter policy_validation_parameter = 5;</code>
   * @return The policyValidationParameter.
   */
  com.google.ads.googleads.v7.common.PolicyValidationParameter getPolicyValidationParameter();
  /**
   * <pre>
   * Configuration for how policies are validated.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.PolicyValidationParameter policy_validation_parameter = 5;</code>
   */
  com.google.ads.googleads.v7.common.PolicyValidationParameterOrBuilder getPolicyValidationParameterOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupAd create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupAd create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v7.resources.AdGroupAd getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupAd create = 1;</code>
   */
  com.google.ads.googleads.v7.resources.AdGroupAdOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The ad is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupAd update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupAd update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v7.resources.AdGroupAd getUpdate();
  /**
   * <pre>
   * Update operation: The ad is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.AdGroupAd update = 2;</code>
   */
  com.google.ads.googleads.v7.resources.AdGroupAdOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed ad is expected,
   * in this format:
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad is expected,
   * in this format:
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad is expected,
   * in this format:
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v7.services.AdGroupAdOperation.OperationCase getOperationCase();
}
