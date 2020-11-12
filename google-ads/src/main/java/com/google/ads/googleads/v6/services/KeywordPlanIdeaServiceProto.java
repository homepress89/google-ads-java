// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v6.services;

public final class KeywordPlanIdeaServiceProto {
  private KeywordPlanIdeaServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeasRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_KeywordAndUrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_KeywordAndUrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_KeywordSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_KeywordSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_SiteSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_SiteSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_UrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v6/services/keywo" +
      "rd_plan_idea_service.proto\022 google.ads.g" +
      "oogleads.v6.services\0328google/ads/googlea" +
      "ds/v6/common/keyword_plan_common.proto\0328" +
      "google/ads/googleads/v6/enums/keyword_pl" +
      "an_network.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\"\307\004\n\033Gene" +
      "rateKeywordIdeasRequest\022\023\n\013customer_id\030\001" +
      " \001(\t\022\025\n\010language\030\016 \001(\tH\001\210\001\001\022\034\n\024geo_targe" +
      "t_constants\030\017 \003(\t\022\036\n\026include_adult_keywo" +
      "rds\030\n \001(\010\022\022\n\npage_token\030\014 \001(\t\022\021\n\tpage_si" +
      "ze\030\r \001(\005\022f\n\024keyword_plan_network\030\t \001(\0162H" +
      ".google.ads.googleads.v6.enums.KeywordPl" +
      "anNetworkEnum.KeywordPlanNetwork\022S\n\024keyw" +
      "ord_and_url_seed\030\002 \001(\01323.google.ads.goog" +
      "leads.v6.services.KeywordAndUrlSeedH\000\022E\n" +
      "\014keyword_seed\030\003 \001(\0132-.google.ads.googlea" +
      "ds.v6.services.KeywordSeedH\000\022=\n\010url_seed" +
      "\030\005 \001(\0132).google.ads.googleads.v6.service" +
      "s.UrlSeedH\000\022?\n\tsite_seed\030\013 \001(\0132*.google." +
      "ads.googleads.v6.services.SiteSeedH\000B\006\n\004" +
      "seedB\013\n\t_language\"?\n\021KeywordAndUrlSeed\022\020" +
      "\n\003url\030\003 \001(\tH\000\210\001\001\022\020\n\010keywords\030\004 \003(\tB\006\n\004_u" +
      "rl\"\037\n\013KeywordSeed\022\020\n\010keywords\030\002 \003(\t\"&\n\010S" +
      "iteSeed\022\021\n\004site\030\002 \001(\tH\000\210\001\001B\007\n\005_site\"#\n\007U" +
      "rlSeed\022\020\n\003url\030\002 \001(\tH\000\210\001\001B\006\n\004_url\"\230\001\n\033Gen" +
      "erateKeywordIdeaResponse\022L\n\007results\030\001 \003(" +
      "\0132;.google.ads.googleads.v6.services.Gen" +
      "erateKeywordIdeaResult\022\027\n\017next_page_toke" +
      "n\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\003\"\223\001\n\031Generate" +
      "KeywordIdeaResult\022\021\n\004text\030\005 \001(\tH\000\210\001\001\022Z\n\024" +
      "keyword_idea_metrics\030\003 \001(\0132<.google.ads." +
      "googleads.v6.common.KeywordPlanHistorica" +
      "lMetricsB\007\n\005_text2\213\002\n\026KeywordPlanIdeaSer" +
      "vice\022\323\001\n\024GenerateKeywordIdeas\022=.google.a" +
      "ds.googleads.v6.services.GenerateKeyword" +
      "IdeasRequest\032=.google.ads.googleads.v6.s" +
      "ervices.GenerateKeywordIdeaResponse\"=\202\323\344" +
      "\223\0027\"2/v6/customers/{customer_id=*}:gener" +
      "ateKeywordIdeas:\001*\032\033\312A\030googleads.googlea" +
      "pis.comB\202\002\n$com.google.ads.googleads.v6." +
      "servicesB\033KeywordPlanIdeaServiceProtoP\001Z" +
      "Hgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v6/services;services\242\002\003GAA\252" +
      "\002 Google.Ads.GoogleAds.V6.Services\312\002 Goo" +
      "gle\\Ads\\GoogleAds\\V6\\Services\352\002$Google::" +
      "Ads::GoogleAds::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.KeywordPlanCommonProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeasRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeasRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeasRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Language", "GeoTargetConstants", "IncludeAdultKeywords", "PageToken", "PageSize", "KeywordPlanNetwork", "KeywordAndUrlSeed", "KeywordSeed", "UrlSeed", "SiteSeed", "Seed", "Language", });
    internal_static_google_ads_googleads_v6_services_KeywordAndUrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_KeywordAndUrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_KeywordAndUrlSeed_descriptor,
        new java.lang.String[] { "Url", "Keywords", "Url", });
    internal_static_google_ads_googleads_v6_services_KeywordSeed_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_KeywordSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_KeywordSeed_descriptor,
        new java.lang.String[] { "Keywords", });
    internal_static_google_ads_googleads_v6_services_SiteSeed_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_SiteSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_SiteSeed_descriptor,
        new java.lang.String[] { "Site", "Site", });
    internal_static_google_ads_googleads_v6_services_UrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_UrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_UrlSeed_descriptor,
        new java.lang.String[] { "Url", "Url", });
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", "TotalSize", });
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GenerateKeywordIdeaResult_descriptor,
        new java.lang.String[] { "Text", "KeywordIdeaMetrics", "Text", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.KeywordPlanCommonProto.getDescriptor();
    com.google.ads.googleads.v6.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
