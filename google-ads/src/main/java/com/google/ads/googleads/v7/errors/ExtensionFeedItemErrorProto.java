// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/errors/extension_feed_item_error.proto

package com.google.ads.googleads.v7.errors;

public final class ExtensionFeedItemErrorProto {
  private ExtensionFeedItemErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_errors_ExtensionFeedItemErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_errors_ExtensionFeedItemErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v7/errors/extensi" +
      "on_feed_item_error.proto\022\036google.ads.goo" +
      "gleads.v7.errors\032\034google/api/annotations" +
      ".proto\"\366\r\n\032ExtensionFeedItemErrorEnum\"\327\r" +
      "\n\026ExtensionFeedItemError\022\017\n\013UNSPECIFIED\020" +
      "\000\022\013\n\007UNKNOWN\020\001\022\026\n\022VALUE_OUT_OF_RANGE\020\002\022\025" +
      "\n\021URL_LIST_TOO_LONG\020\003\0222\n.CANNOT_HAVE_RES" +
      "TRICTION_ON_EMPTY_GEO_TARGETING\020\004\022\036\n\032CAN" +
      "NOT_SET_WITH_FINAL_URLS\020\005\022!\n\035CANNOT_SET_" +
      "WITHOUT_FINAL_URLS\020\006\022\030\n\024INVALID_PHONE_NU" +
      "MBER\020\007\022*\n&PHONE_NUMBER_NOT_SUPPORTED_FOR" +
      "_COUNTRY\020\010\022-\n)CARRIER_SPECIFIC_SHORT_NUM" +
      "BER_NOT_ALLOWED\020\t\022#\n\037PREMIUM_RATE_NUMBER" +
      "_NOT_ALLOWED\020\n\022\032\n\026DISALLOWED_NUMBER_TYPE" +
      "\020\013\022(\n$INVALID_DOMESTIC_PHONE_NUMBER_FORM" +
      "AT\020\014\022#\n\037VANITY_PHONE_NUMBER_NOT_ALLOWED\020" +
      "\r\022\"\n\036INVALID_CALL_CONVERSION_ACTION\020\016\022.\n" +
      "*CUSTOMER_NOT_ON_ALLOWLIST_FOR_CALLTRACK" +
      "ING\020/\022*\n&CALLTRACKING_NOT_SUPPORTED_FOR_" +
      "COUNTRY\020\020\0220\n,CUSTOMER_CONSENT_FOR_CALL_R" +
      "ECORDING_REQUIRED\020\021\022\022\n\016INVALID_APP_ID\020\022\022" +
      "&\n\"QUOTES_IN_REVIEW_EXTENSION_SNIPPET\020\023\022" +
      "\'\n#HYPHENS_IN_REVIEW_EXTENSION_SNIPPET\020\024" +
      "\022&\n\"REVIEW_EXTENSION_SOURCE_INELIGIBLE\020\025" +
      "\022(\n$SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT" +
      "\020\026\022\037\n\033INCONSISTENT_CURRENCY_CODES\020\027\022*\n&P" +
      "RICE_EXTENSION_HAS_DUPLICATED_HEADERS\020\030\022" +
      "4\n0PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_" +
      "DESCRIPTION\020\031\022%\n!PRICE_EXTENSION_HAS_TOO" +
      "_FEW_ITEMS\020\032\022&\n\"PRICE_EXTENSION_HAS_TOO_" +
      "MANY_ITEMS\020\033\022\025\n\021UNSUPPORTED_VALUE\020\034\022*\n&U" +
      "NSUPPORTED_VALUE_IN_SELECTED_LANGUAGE\020\035\022" +
      "\035\n\031INVALID_DEVICE_PREFERENCE\020\036\022\030\n\024INVALI" +
      "D_SCHEDULE_END\020\037\022*\n&DATE_TIME_MUST_BE_IN" +
      "_ACCOUNT_TIME_ZONE\020 \022\033\n\027INVALID_SNIPPETS" +
      "_HEADER\020!\022\'\n#CANNOT_OPERATE_ON_REMOVED_F" +
      "EED_ITEM\020\"\022<\n8PHONE_NUMBER_NOT_SUPPORTED" +
      "_WITH_CALLTRACKING_FOR_COUNTRY\020#\022(\n$CONF" +
      "LICTING_CALL_CONVERSION_SETTINGS\020$\022\033\n\027EX" +
      "TENSION_TYPE_MISMATCH\020%\022\036\n\032EXTENSION_SUB" +
      "TYPE_REQUIRED\020&\022\036\n\032EXTENSION_TYPE_UNSUPP" +
      "ORTED\020\'\0221\n-CANNOT_OPERATE_ON_FEED_WITH_M" +
      "ULTIPLE_MAPPINGS\020(\022.\n*CANNOT_OPERATE_ON_" +
      "FEED_WITH_KEY_ATTRIBUTES\020)\022\030\n\024INVALID_PR" +
      "ICE_FORMAT\020*\022\032\n\026PROMOTION_INVALID_TIME\020+" +
      "\022%\n!TOO_MANY_DECIMAL_PLACES_SPECIFIED\020,\022" +
      "$\n CONCRETE_EXTENSION_TYPE_REQUIRED\020-\022 \n" +
      "\034SCHEDULE_END_NOT_AFTER_START\020.B\366\001\n\"com." +
      "google.ads.googleads.v7.errorsB\033Extensio" +
      "nFeedItemErrorProtoP\001ZDgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v7/er" +
      "rors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds" +
      ".V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Err" +
      "ors\352\002\"Google::Ads::GoogleAds::V7::Errors" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_errors_ExtensionFeedItemErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_errors_ExtensionFeedItemErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_errors_ExtensionFeedItemErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
