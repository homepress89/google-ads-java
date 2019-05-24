// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/campaign_error.proto

package com.google.ads.googleads.v1.errors;

public final class CampaignErrorProto {
  private CampaignErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_CampaignErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_CampaignErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v1/errors/campaig" +
      "n_error.proto\022\036google.ads.googleads.v1.e" +
      "rrors\032\034google/api/annotations.proto\"\231\r\n\021" +
      "CampaignErrorEnum\"\203\r\n\rCampaignError\022\017\n\013U" +
      "NSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n\035CANNOT_TARG" +
      "ET_CONTENT_NETWORK\020\003\022 \n\034CANNOT_TARGET_SE" +
      "ARCH_NETWORK\020\004\0226\n2CANNOT_TARGET_SEARCH_N" +
      "ETWORK_WITHOUT_GOOGLE_SEARCH\020\005\0220\n,CANNOT" +
      "_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN\020\006" +
      "\022-\n)CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NE" +
      "TWORK\020\007\022(\n$CANNOT_TARGET_PARTNER_SEARCH_" +
      "NETWORK\020\010\022K\nGCANNOT_TARGET_CONTENT_NETWO" +
      "RK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRA" +
      "TEGY\020\t\0226\n2CAMPAIGN_DURATION_MUST_CONTAIN" +
      "_ALL_RUNNABLE_TRIALS\020\n\022$\n CANNOT_MODIFY_" +
      "FOR_TRIAL_CAMPAIGN\020\013\022\033\n\027DUPLICATE_CAMPAI" +
      "GN_NAME\020\014\022\037\n\033INCOMPATIBLE_CAMPAIGN_FIELD" +
      "\020\r\022\031\n\025INVALID_CAMPAIGN_NAME\020\016\022*\n&INVALID" +
      "_AD_SERVING_OPTIMIZATION_STATUS\020\017\022\030\n\024INV" +
      "ALID_TRACKING_URL\020\020\022>\n:CANNOT_SET_BOTH_T" +
      "RACKING_URL_TEMPLATE_AND_TRACKING_SETTIN" +
      "G\020\021\022 \n\034MAX_IMPRESSIONS_NOT_IN_RANGE\020\022\022\033\n" +
      "\027TIME_UNIT_NOT_SUPPORTED\020\023\0221\n-INVALID_OP" +
      "ERATION_IF_SERVING_STATUS_HAS_ENDED\020\024\022\033\n" +
      "\027BUDGET_CANNOT_BE_SHARED\020\025\022%\n!CAMPAIGN_C" +
      "ANNOT_USE_SHARED_BUDGET\020\026\0220\n,CANNOT_CHAN" +
      "GE_BUDGET_ON_CAMPAIGN_WITH_TRIALS\020\027\022!\n\035C" +
      "AMPAIGN_LABEL_DOES_NOT_EXIST\020\030\022!\n\035CAMPAI" +
      "GN_LABEL_ALREADY_EXISTS\020\031\022\034\n\030MISSING_SHO" +
      "PPING_SETTING\020\032\022\"\n\036INVALID_SHOPPING_SALE" +
      "S_COUNTRY\020\033\022*\n&MISSING_UNIVERSAL_APP_CAM" +
      "PAIGN_SETTING\020\036\022;\n7ADVERTISING_CHANNEL_T" +
      "YPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE\020\037\022(\n$" +
      "INVALID_ADVERTISING_CHANNEL_SUB_TYPE\020 \022," +
      "\n(AT_LEAST_ONE_CONVERSION_MUST_BE_SELECT" +
      "ED\020!\022\037\n\033CANNOT_SET_AD_ROTATION_MODE\020\"\022/\n" +
      "+CANNOT_MODIFY_START_DATE_IF_ALREADY_STA" +
      "RTED\020#\022\033\n\027CANNOT_SET_DATE_TO_PAST\020$\022\037\n\033M" +
      "ISSING_HOTEL_CUSTOMER_LINK\020%\022\037\n\033INVALID_" +
      "HOTEL_CUSTOMER_LINK\020&\022\031\n\025MISSING_HOTEL_S" +
      "ETTING\020\'\022B\n>CANNOT_USE_SHARED_CAMPAIGN_B" +
      "UDGET_WHILE_PART_OF_CAMPAIGN_GROUP\020(\022\021\n\r" +
      "APP_NOT_FOUND\020)\0229\n5SHOPPING_ENABLE_LOCAL" +
      "_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE\020*\0223\n/ME" +
      "RCHANT_NOT_ALLOWED_FOR_COMPARISON_LISTIN" +
      "G_ADS\020+B\355\001\n\"com.google.ads.googleads.v1." +
      "errorsB\022CampaignErrorProtoP\001ZDgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v1/errors;errors\242\002\003GAA\252\002\036Google.Ads.Go" +
      "ogleAds.V1.Errors\312\002\036Google\\Ads\\GoogleAds" +
      "\\V1\\Errors\352\002\"Google::Ads::GoogleAds::V1:" +
      ":Errorsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_errors_CampaignErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_CampaignErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_CampaignErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
