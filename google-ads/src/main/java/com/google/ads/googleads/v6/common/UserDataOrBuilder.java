// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/offline_user_data.proto

package com.google.ads.googleads.v6.common;

public interface UserDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.UserData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.UserIdentifier user_identifiers = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v6.common.UserIdentifier> 
      getUserIdentifiersList();
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.UserIdentifier user_identifiers = 1;</code>
   */
  com.google.ads.googleads.v6.common.UserIdentifier getUserIdentifiers(int index);
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.UserIdentifier user_identifiers = 1;</code>
   */
  int getUserIdentifiersCount();
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.UserIdentifier user_identifiers = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.common.UserIdentifierOrBuilder> 
      getUserIdentifiersOrBuilderList();
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.UserIdentifier user_identifiers = 1;</code>
   */
  com.google.ads.googleads.v6.common.UserIdentifierOrBuilder getUserIdentifiersOrBuilder(
      int index);

  /**
   * <pre>
   * Additional transactions/attributes associated with the user.
   * Required when updating store sales data.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.TransactionAttribute transaction_attribute = 2;</code>
   * @return Whether the transactionAttribute field is set.
   */
  boolean hasTransactionAttribute();
  /**
   * <pre>
   * Additional transactions/attributes associated with the user.
   * Required when updating store sales data.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.TransactionAttribute transaction_attribute = 2;</code>
   * @return The transactionAttribute.
   */
  com.google.ads.googleads.v6.common.TransactionAttribute getTransactionAttribute();
  /**
   * <pre>
   * Additional transactions/attributes associated with the user.
   * Required when updating store sales data.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.TransactionAttribute transaction_attribute = 2;</code>
   */
  com.google.ads.googleads.v6.common.TransactionAttributeOrBuilder getTransactionAttributeOrBuilder();

  /**
   * <pre>
   * Additional attributes associated with the user. Required when updating
   * customer match attributes. These have an expiration of 540 days.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.UserAttribute user_attribute = 3;</code>
   * @return Whether the userAttribute field is set.
   */
  boolean hasUserAttribute();
  /**
   * <pre>
   * Additional attributes associated with the user. Required when updating
   * customer match attributes. These have an expiration of 540 days.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.UserAttribute user_attribute = 3;</code>
   * @return The userAttribute.
   */
  com.google.ads.googleads.v6.common.UserAttribute getUserAttribute();
  /**
   * <pre>
   * Additional attributes associated with the user. Required when updating
   * customer match attributes. These have an expiration of 540 days.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.UserAttribute user_attribute = 3;</code>
   */
  com.google.ads.googleads.v6.common.UserAttributeOrBuilder getUserAttributeOrBuilder();
}
