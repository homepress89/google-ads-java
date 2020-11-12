// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/customer.proto

package com.google.ads.googleads.v6.resources;

public final class CustomerProto {
  private CustomerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_Customer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_Customer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_CallReportingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_CallReportingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_ConversionTrackingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_ConversionTrackingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_RemarketingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_RemarketingSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v6/resources/cust" +
      "omer.proto\022!google.ads.googleads.v6.reso" +
      "urces\032Zgoogle/ads/googleads/v6/enums/cus" +
      "tomer_pay_per_conversion_eligibility_fai" +
      "lure_reason.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\034g" +
      "oogle/api/annotations.proto\"\303\t\n\010Customer" +
      "\022@\n\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!googlea" +
      "ds.googleapis.com/Customer\022\024\n\002id\030\023 \001(\003B\003" +
      "\340A\003H\000\210\001\001\022\035\n\020descriptive_name\030\024 \001(\tH\001\210\001\001\022" +
      "\037\n\rcurrency_code\030\025 \001(\tB\003\340A\005H\002\210\001\001\022\033\n\ttime" +
      "_zone\030\026 \001(\tB\003\340A\005H\003\210\001\001\022\"\n\025tracking_url_te" +
      "mplate\030\027 \001(\tH\004\210\001\001\022\035\n\020final_url_suffix\030\030 " +
      "\001(\tH\005\210\001\001\022!\n\024auto_tagging_enabled\030\031 \001(\010H\006" +
      "\210\001\001\022$\n\022has_partners_badge\030\032 \001(\010B\003\340A\003H\007\210\001" +
      "\001\022\031\n\007manager\030\033 \001(\010B\003\340A\003H\010\210\001\001\022\036\n\014test_acc" +
      "ount\030\034 \001(\010B\003\340A\003H\t\210\001\001\022W\n\026call_reporting_s" +
      "etting\030\n \001(\01327.google.ads.googleads.v6.r" +
      "esources.CallReportingSetting\022f\n\033convers" +
      "ion_tracking_setting\030\016 \001(\0132<.google.ads." +
      "googleads.v6.resources.ConversionTrackin" +
      "gSettingB\003\340A\003\022W\n\023remarketing_setting\030\017 \001" +
      "(\01325.google.ads.googleads.v6.resources.R" +
      "emarketingSettingB\003\340A\003\022\302\001\n.pay_per_conve" +
      "rsion_eligibility_failure_reasons\030\020 \003(\0162" +
      "\204\001.google.ads.googleads.v6.enums.Custome" +
      "rPayPerConversionEligibilityFailureReaso" +
      "nEnum.CustomerPayPerConversionEligibilit" +
      "yFailureReasonB\003\340A\003\022$\n\022optimization_scor" +
      "e\030\035 \001(\001B\003\340A\003H\n\210\001\001\022&\n\031optimization_score_" +
      "weight\030\036 \001(\001B\003\340A\003:?\352A<\n!googleads.google" +
      "apis.com/Customer\022\027customers/{customer_i" +
      "d}B\005\n\003_idB\023\n\021_descriptive_nameB\020\n\016_curre" +
      "ncy_codeB\014\n\n_time_zoneB\030\n\026_tracking_url_" +
      "templateB\023\n\021_final_url_suffixB\027\n\025_auto_t" +
      "agging_enabledB\025\n\023_has_partners_badgeB\n\n" +
      "\010_managerB\017\n\r_test_accountB\025\n\023_optimizat" +
      "ion_score\"\234\002\n\024CallReportingSetting\022#\n\026ca" +
      "ll_reporting_enabled\030\n \001(\010H\000\210\001\001\022.\n!call_" +
      "conversion_reporting_enabled\030\013 \001(\010H\001\210\001\001\022" +
      "S\n\026call_conversion_action\030\014 \001(\tB.\372A+\n)go" +
      "ogleads.googleapis.com/ConversionActionH" +
      "\002\210\001\001B\031\n\027_call_reporting_enabledB$\n\"_call" +
      "_conversion_reporting_enabledB\031\n\027_call_c" +
      "onversion_action\"\301\001\n\031ConversionTrackingS" +
      "etting\022(\n\026conversion_tracking_id\030\003 \001(\003B\003" +
      "\340A\003H\000\210\001\001\0226\n$cross_account_conversion_tra" +
      "cking_id\030\004 \001(\003B\003\340A\003H\001\210\001\001B\031\n\027_conversion_" +
      "tracking_idB\'\n%_cross_account_conversion" +
      "_tracking_id\"Y\n\022RemarketingSetting\022(\n\026go" +
      "ogle_global_site_tag\030\002 \001(\tB\003\340A\003H\000\210\001\001B\031\n\027" +
      "_google_global_site_tagB\372\001\n%com.google.a" +
      "ds.googleads.v6.resourcesB\rCustomerProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v6/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V6.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V6\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V6::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.CustomerPayPerConversionEligibilityFailureReasonProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_Customer_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "DescriptiveName", "CurrencyCode", "TimeZone", "TrackingUrlTemplate", "FinalUrlSuffix", "AutoTaggingEnabled", "HasPartnersBadge", "Manager", "TestAccount", "CallReportingSetting", "ConversionTrackingSetting", "RemarketingSetting", "PayPerConversionEligibilityFailureReasons", "OptimizationScore", "OptimizationScoreWeight", "Id", "DescriptiveName", "CurrencyCode", "TimeZone", "TrackingUrlTemplate", "FinalUrlSuffix", "AutoTaggingEnabled", "HasPartnersBadge", "Manager", "TestAccount", "OptimizationScore", });
    internal_static_google_ads_googleads_v6_resources_CallReportingSetting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_resources_CallReportingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_CallReportingSetting_descriptor,
        new java.lang.String[] { "CallReportingEnabled", "CallConversionReportingEnabled", "CallConversionAction", "CallReportingEnabled", "CallConversionReportingEnabled", "CallConversionAction", });
    internal_static_google_ads_googleads_v6_resources_ConversionTrackingSetting_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_resources_ConversionTrackingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_ConversionTrackingSetting_descriptor,
        new java.lang.String[] { "ConversionTrackingId", "CrossAccountConversionTrackingId", "ConversionTrackingId", "CrossAccountConversionTrackingId", });
    internal_static_google_ads_googleads_v6_resources_RemarketingSetting_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_resources_RemarketingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_RemarketingSetting_descriptor,
        new java.lang.String[] { "GoogleGlobalSiteTag", "GoogleGlobalSiteTag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.CustomerPayPerConversionEligibilityFailureReasonProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
