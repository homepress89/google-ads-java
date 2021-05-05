// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/call_view.proto

package com.google.ads.googleads.v7.resources;

public interface CallViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.resources.CallView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the call view.
   * Call view resource names have the form:
   * `customers/{customer_id}/callViews/{call_detail_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the call view.
   * Call view resource names have the form:
   * `customers/{customer_id}/callViews/{call_detail_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Region code of the caller.
   * </pre>
   *
   * <code>string caller_region_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callerRegionCode.
   */
  java.lang.String getCallerRegionCode();
  /**
   * <pre>
   * Output only. Region code of the caller.
   * </pre>
   *
   * <code>string caller_region_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for callerRegionCode.
   */
  com.google.protobuf.ByteString
      getCallerRegionCodeBytes();

  /**
   * <pre>
   * Output only. Area code of the caller. Null if the call duration is shorter than 15
   * seconds.
   * </pre>
   *
   * <code>string caller_area_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callerAreaCode.
   */
  java.lang.String getCallerAreaCode();
  /**
   * <pre>
   * Output only. Area code of the caller. Null if the call duration is shorter than 15
   * seconds.
   * </pre>
   *
   * <code>string caller_area_code = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for callerAreaCode.
   */
  com.google.protobuf.ByteString
      getCallerAreaCodeBytes();

  /**
   * <pre>
   * Output only. The advertiser-provided call duration in seconds.
   * </pre>
   *
   * <code>int64 call_duration_seconds = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callDurationSeconds.
   */
  long getCallDurationSeconds();

  /**
   * <pre>
   * Output only. The advertiser-provided call start date time.
   * </pre>
   *
   * <code>string start_call_date_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startCallDateTime.
   */
  java.lang.String getStartCallDateTime();
  /**
   * <pre>
   * Output only. The advertiser-provided call start date time.
   * </pre>
   *
   * <code>string start_call_date_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for startCallDateTime.
   */
  com.google.protobuf.ByteString
      getStartCallDateTimeBytes();

  /**
   * <pre>
   * Output only. The advertiser-provided call end date time.
   * </pre>
   *
   * <code>string end_call_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endCallDateTime.
   */
  java.lang.String getEndCallDateTime();
  /**
   * <pre>
   * Output only. The advertiser-provided call end date time.
   * </pre>
   *
   * <code>string end_call_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for endCallDateTime.
   */
  com.google.protobuf.ByteString
      getEndCallDateTimeBytes();

  /**
   * <pre>
   * Output only. The call tracking display location.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CallTrackingDisplayLocationEnum.CallTrackingDisplayLocation call_tracking_display_location = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for callTrackingDisplayLocation.
   */
  int getCallTrackingDisplayLocationValue();
  /**
   * <pre>
   * Output only. The call tracking display location.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CallTrackingDisplayLocationEnum.CallTrackingDisplayLocation call_tracking_display_location = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callTrackingDisplayLocation.
   */
  com.google.ads.googleads.v7.enums.CallTrackingDisplayLocationEnum.CallTrackingDisplayLocation getCallTrackingDisplayLocation();

  /**
   * <pre>
   * Output only. The type of the call.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CallTypeEnum.CallType type = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the call.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CallTypeEnum.CallType type = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v7.enums.CallTypeEnum.CallType getType();

  /**
   * <pre>
   * Output only. The status of the call.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.GoogleVoiceCallStatusEnum.GoogleVoiceCallStatus call_status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for callStatus.
   */
  int getCallStatusValue();
  /**
   * <pre>
   * Output only. The status of the call.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.GoogleVoiceCallStatusEnum.GoogleVoiceCallStatus call_status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callStatus.
   */
  com.google.ads.googleads.v7.enums.GoogleVoiceCallStatusEnum.GoogleVoiceCallStatus getCallStatus();
}
