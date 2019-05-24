// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/campaign_draft_error.proto

package com.google.ads.googleads.v1.errors;

public final class CampaignDraftErrorProto {
  private CampaignDraftErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_CampaignDraftErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_CampaignDraftErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v1/errors/campaig" +
      "n_draft_error.proto\022\036google.ads.googlead" +
      "s.v1.errors\032\034google/api/annotations.prot" +
      "o\"\310\003\n\026CampaignDraftErrorEnum\"\255\003\n\022Campaig" +
      "nDraftError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020" +
      "\001\022\030\n\024DUPLICATE_DRAFT_NAME\020\002\022*\n&INVALID_S" +
      "TATUS_TRANSITION_FROM_REMOVED\020\003\022+\n\'INVAL" +
      "ID_STATUS_TRANSITION_FROM_PROMOTED\020\004\0221\n-" +
      "INVALID_STATUS_TRANSITION_FROM_PROMOTE_F" +
      "AILED\020\005\022 \n\034CUSTOMER_CANNOT_CREATE_DRAFT\020" +
      "\006\022 \n\034CAMPAIGN_CANNOT_CREATE_DRAFT\020\007\022\030\n\024I" +
      "NVALID_DRAFT_CHANGE\020\010\022\035\n\031INVALID_STATUS_" +
      "TRANSITION\020\t\022-\n)MAX_NUMBER_OF_DRAFTS_PER" +
      "_CAMPAIGN_REACHED\020\n\022\'\n#LIST_ERRORS_FOR_P" +
      "ROMOTED_DRAFT_ONLY\020\013B\362\001\n\"com.google.ads." +
      "googleads.v1.errorsB\027CampaignDraftErrorP" +
      "rotoP\001ZDgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v1/errors;errors\242\002\003G" +
      "AA\252\002\036Google.Ads.GoogleAds.V1.Errors\312\002\036Go" +
      "ogle\\Ads\\GoogleAds\\V1\\Errors\352\002\"Google::A" +
      "ds::GoogleAds::V1::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v1_errors_CampaignDraftErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_CampaignDraftErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_CampaignDraftErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
