// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/reach_plan_service.proto

package com.google.ads.googleads.v7.services;

public interface ListPlannableLocationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.services.ListPlannableLocationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries, DMAs see
   * https://developers.google.com/adwords/api/docs/appendix/geotargeting for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannableLocation plannable_locations = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v7.services.PlannableLocation> 
      getPlannableLocationsList();
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries, DMAs see
   * https://developers.google.com/adwords/api/docs/appendix/geotargeting for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannableLocation plannable_locations = 1;</code>
   */
  com.google.ads.googleads.v7.services.PlannableLocation getPlannableLocations(int index);
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries, DMAs see
   * https://developers.google.com/adwords/api/docs/appendix/geotargeting for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannableLocation plannable_locations = 1;</code>
   */
  int getPlannableLocationsCount();
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries, DMAs see
   * https://developers.google.com/adwords/api/docs/appendix/geotargeting for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannableLocation plannable_locations = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v7.services.PlannableLocationOrBuilder> 
      getPlannableLocationsOrBuilderList();
  /**
   * <pre>
   * The list of locations available for planning (Countries, DMAs,
   * sub-countries).
   * For locations like Countries, DMAs see
   * https://developers.google.com/adwords/api/docs/appendix/geotargeting for
   * more information.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v7.services.PlannableLocation plannable_locations = 1;</code>
   */
  com.google.ads.googleads.v7.services.PlannableLocationOrBuilder getPlannableLocationsOrBuilder(
      int index);
}
