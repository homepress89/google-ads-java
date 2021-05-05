// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/keyword_plan_common.proto

package com.google.ads.googleads.v7.common;

public interface HistoricalMetricsOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.HistoricalMetricsOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.YearMonthRange year_month_range = 1;</code>
   * @return Whether the yearMonthRange field is set.
   */
  boolean hasYearMonthRange();
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.YearMonthRange year_month_range = 1;</code>
   * @return The yearMonthRange.
   */
  com.google.ads.googleads.v7.common.YearMonthRange getYearMonthRange();
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.YearMonthRange year_month_range = 1;</code>
   */
  com.google.ads.googleads.v7.common.YearMonthRangeOrBuilder getYearMonthRangeOrBuilder();
}
