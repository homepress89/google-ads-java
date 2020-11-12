// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/keyword_plan_service.proto

package com.google.ads.googleads.v6.services;

public interface KeywordPlanOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.KeywordPlanOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The FieldMask that determines which resource fields are modified in an
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new keyword plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.KeywordPlan create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new keyword plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.KeywordPlan create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v6.resources.KeywordPlan getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new keyword plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.KeywordPlan create = 1;</code>
   */
  com.google.ads.googleads.v6.resources.KeywordPlanOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The keyword plan is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.KeywordPlan update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The keyword plan is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.KeywordPlan update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v6.resources.KeywordPlan getUpdate();
  /**
   * <pre>
   * Update operation: The keyword plan is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.KeywordPlan update = 2;</code>
   */
  com.google.ads.googleads.v6.resources.KeywordPlanOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed keyword plan is
   * expected in this format:
   * `customers/{customer_id}/keywordPlans/{keyword_plan_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed keyword plan is
   * expected in this format:
   * `customers/{customer_id}/keywordPlans/{keyword_plan_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v6.services.KeywordPlanOperation.OperationCase getOperationCase();
}
