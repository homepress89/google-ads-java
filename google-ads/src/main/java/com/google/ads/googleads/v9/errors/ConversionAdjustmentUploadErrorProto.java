// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/errors/conversion_adjustment_upload_error.proto

package com.google.ads.googleads.v9.errors;

public final class ConversionAdjustmentUploadErrorProto {
  private ConversionAdjustmentUploadErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v9_errors_ConversionAdjustmentUploadErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v9_errors_ConversionAdjustmentUploadErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v9/errors/convers" +
      "ion_adjustment_upload_error.proto\022\036googl" +
      "e.ads.googleads.v9.errors\032\034google/api/an" +
      "notations.proto\"\312\006\n#ConversionAdjustment" +
      "UploadErrorEnum\"\242\006\n\037ConversionAdjustment" +
      "UploadError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020" +
      "\001\022 \n\034TOO_RECENT_CONVERSION_ACTION\020\002\022\035\n\031I" +
      "NVALID_CONVERSION_ACTION\020\003\022 \n\034CONVERSION" +
      "_ALREADY_RETRACTED\020\004\022\030\n\024CONVERSION_NOT_F" +
      "OUND\020\005\022\026\n\022CONVERSION_EXPIRED\020\006\022\"\n\036ADJUST" +
      "MENT_PRECEDES_CONVERSION\020\007\022!\n\035MORE_RECEN" +
      "T_RESTATEMENT_FOUND\020\010\022\031\n\025TOO_RECENT_CONV" +
      "ERSION\020\t\022N\nJCANNOT_RESTATE_CONVERSION_AC" +
      "TION_THAT_ALWAYS_USES_DEFAULT_CONVERSION" +
      "_VALUE\020\n\022#\n\037TOO_MANY_ADJUSTMENTS_IN_REQU" +
      "EST\020\013\022\030\n\024TOO_MANY_ADJUSTMENTS\020\014\022\036\n\032RESTA" +
      "TEMENT_ALREADY_EXISTS\020\r\022#\n\037DUPLICATE_ADJ" +
      "USTMENT_IN_REQUEST\020\016\022-\n)CUSTOMER_NOT_ACC" +
      "EPTED_CUSTOMER_DATA_TERMS\020\017\0222\n.CONVERSIO" +
      "N_ACTION_NOT_ELIGIBLE_FOR_ENHANCEMENT\020\020\022" +
      "\033\n\027INVALID_USER_IDENTIFIER\020\021\022\037\n\033UNSUPPOR" +
      "TED_USER_IDENTIFIER\020\022\022.\n*GCLID_DATE_TIME" +
      "_PAIR_AND_ORDER_ID_BOTH_SET\020\024\022\037\n\033CONVERS" +
      "ION_ALREADY_ENHANCED\020\025\022$\n DUPLICATE_ENHA" +
      "NCEMENT_IN_REQUEST\020\026B\377\001\n\"com.google.ads." +
      "googleads.v9.errorsB$ConversionAdjustmen" +
      "tUploadErrorProtoP\001ZDgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v9/erro" +
      "rs;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V" +
      "9.Errors\312\002\036Google\\Ads\\GoogleAds\\V9\\Error" +
      "s\352\002\"Google::Ads::GoogleAds::V9::Errorsb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v9_errors_ConversionAdjustmentUploadErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v9_errors_ConversionAdjustmentUploadErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v9_errors_ConversionAdjustmentUploadErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}