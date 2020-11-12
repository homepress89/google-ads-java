// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/customer_service.proto

package com.google.ads.googleads.v6.services;

public interface CustomerOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.CustomerOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.Customer update = 1;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.Customer update = 1;</code>
   * @return The update.
   */
  com.google.ads.googleads.v6.resources.Customer getUpdate();
  /**
   * <pre>
   * Mutate operation. Only updates are supported for customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.Customer update = 1;</code>
   */
  com.google.ads.googleads.v6.resources.CustomerOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
