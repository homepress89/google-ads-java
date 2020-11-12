// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/user_lists.proto

package com.google.ads.googleads.v6.common;

public interface DateSpecificRuleUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.DateSpecificRuleUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Boolean rule that defines visitor of a page.
   * Required for creating a date specific rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.UserListRuleInfo rule = 1;</code>
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   * <pre>
   * Boolean rule that defines visitor of a page.
   * Required for creating a date specific rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.UserListRuleInfo rule = 1;</code>
   * @return The rule.
   */
  com.google.ads.googleads.v6.common.UserListRuleInfo getRule();
  /**
   * <pre>
   * Boolean rule that defines visitor of a page.
   * Required for creating a date specific rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.common.UserListRuleInfo rule = 1;</code>
   */
  com.google.ads.googleads.v6.common.UserListRuleInfoOrBuilder getRuleOrBuilder();

  /**
   * <pre>
   * Start date of users visit. If set to 2000-01-01, then the list includes all
   * users before end_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Start date of users visit. If set to 2000-01-01, then the list includes all
   * users before end_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Start date of users visit. If set to 2000-01-01, then the list includes all
   * users before end_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * End date of users visit. If set to 2037-12-30, then the list includes all
   * users after start_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * End date of users visit. If set to 2037-12-30, then the list includes all
   * users after start_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * End date of users visit. If set to 2037-12-30, then the list includes all
   * users after start_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
