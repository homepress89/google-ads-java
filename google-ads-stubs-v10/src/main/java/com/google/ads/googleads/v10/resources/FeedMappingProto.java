// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/feed_mapping.proto

package com.google.ads.googleads.v10.resources;

public final class FeedMappingProto {
  private FeedMappingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_FeedMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_FeedMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AttributeFieldMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AttributeFieldMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v10/resources/fee" +
      "d_mapping.proto\022\"google.ads.googleads.v1" +
      "0.resources\032Dgoogle/ads/googleads/v10/en" +
      "ums/ad_customizer_placeholder_field.prot" +
      "o\032Igoogle/ads/googleads/v10/enums/affili" +
      "ate_location_placeholder_field.proto\032:go" +
      "ogle/ads/googleads/v10/enums/app_placeho" +
      "lder_field.proto\032;google/ads/googleads/v" +
      "10/enums/call_placeholder_field.proto\032>g" +
      "oogle/ads/googleads/v10/enums/callout_pl" +
      "aceholder_field.proto\032=google/ads/google" +
      "ads/v10/enums/custom_placeholder_field.p" +
      "roto\032Bgoogle/ads/googleads/v10/enums/dsa" +
      "_page_feed_criterion_field.proto\032@google" +
      "/ads/googleads/v10/enums/education_place" +
      "holder_field.proto\032@google/ads/googleads" +
      "/v10/enums/feed_mapping_criterion_type.p" +
      "roto\0328google/ads/googleads/v10/enums/fee" +
      "d_mapping_status.proto\032=google/ads/googl" +
      "eads/v10/enums/flight_placeholder_field." +
      "proto\032<google/ads/googleads/v10/enums/ho" +
      "tel_placeholder_field.proto\032<google/ads/" +
      "googleads/v10/enums/image_placeholder_fi" +
      "eld.proto\032:google/ads/googleads/v10/enum" +
      "s/job_placeholder_field.proto\032<google/ad" +
      "s/googleads/v10/enums/local_placeholder_" +
      "field.proto\032Qgoogle/ads/googleads/v10/en" +
      "ums/location_extension_targeting_criteri" +
      "on_field.proto\032?google/ads/googleads/v10" +
      "/enums/location_placeholder_field.proto\032" +
      ">google/ads/googleads/v10/enums/message_" +
      "placeholder_field.proto\0325google/ads/goog" +
      "leads/v10/enums/placeholder_type.proto\032<" +
      "google/ads/googleads/v10/enums/price_pla" +
      "ceholder_field.proto\032@google/ads/googlea" +
      "ds/v10/enums/promotion_placeholder_field" +
      ".proto\032Bgoogle/ads/googleads/v10/enums/r" +
      "eal_estate_placeholder_field.proto\032?goog" +
      "le/ads/googleads/v10/enums/sitelink_plac" +
      "eholder_field.proto\032Igoogle/ads/googlead" +
      "s/v10/enums/structured_snippet_placehold" +
      "er_field.proto\032=google/ads/googleads/v10" +
      "/enums/travel_placeholder_field.proto\032\034g" +
      "oogle/api/annotations.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\"\250\005\n\013FeedMapping\022C\n\rresource_name" +
      "\030\001 \001(\tB,\340A\005\372A&\n$googleads.googleapis.com" +
      "/FeedMapping\0228\n\004feed\030\007 \001(\tB%\340A\005\372A\037\n\035goog" +
      "leads.googleapis.com/FeedH\001\210\001\001\022`\n\030attrib" +
      "ute_field_mappings\030\005 \003(\01329.google.ads.go" +
      "ogleads.v10.resources.AttributeFieldMapp" +
      "ingB\003\340A\005\022\\\n\006status\030\006 \001(\0162G.google.ads.go" +
      "ogleads.v10.enums.FeedMappingStatusEnum." +
      "FeedMappingStatusB\003\340A\003\022d\n\020placeholder_ty" +
      "pe\030\003 \001(\0162C.google.ads.googleads.v10.enum" +
      "s.PlaceholderTypeEnum.PlaceholderTypeB\003\340" +
      "A\005H\000\022t\n\016criterion_type\030\004 \001(\0162U.google.ad" +
      "s.googleads.v10.enums.FeedMappingCriteri" +
      "onTypeEnum.FeedMappingCriterionTypeB\003\340A\005" +
      "H\000:k\352Ah\n$googleads.googleapis.com/FeedMa" +
      "pping\022@customers/{customer_id}/feedMappi" +
      "ngs/{feed_id}~{feed_mapping_id}B\010\n\006targe" +
      "tB\007\n\005_feed\"\323\025\n\025AttributeFieldMapping\022#\n\021" +
      "feed_attribute_id\030\030 \001(\003B\003\340A\005H\001\210\001\001\022\032\n\010fie" +
      "ld_id\030\031 \001(\003B\003\340A\003H\002\210\001\001\022t\n\016sitelink_field\030" +
      "\003 \001(\0162U.google.ads.googleads.v10.enums.S" +
      "itelinkPlaceholderFieldEnum.SitelinkPlac" +
      "eholderFieldB\003\340A\005H\000\022h\n\ncall_field\030\004 \001(\0162" +
      "M.google.ads.googleads.v10.enums.CallPla" +
      "ceholderFieldEnum.CallPlaceholderFieldB\003" +
      "\340A\005H\000\022e\n\tapp_field\030\005 \001(\0162K.google.ads.go" +
      "ogleads.v10.enums.AppPlaceholderFieldEnu" +
      "m.AppPlaceholderFieldB\003\340A\005H\000\022t\n\016location" +
      "_field\030\006 \001(\0162U.google.ads.googleads.v10." +
      "enums.LocationPlaceholderFieldEnum.Locat" +
      "ionPlaceholderFieldB\003\340A\003H\000\022\220\001\n\030affiliate" +
      "_location_field\030\007 \001(\0162g.google.ads.googl" +
      "eads.v10.enums.AffiliateLocationPlacehol" +
      "derFieldEnum.AffiliateLocationPlaceholde" +
      "rFieldB\003\340A\003H\000\022q\n\rcallout_field\030\010 \001(\0162S.g" +
      "oogle.ads.googleads.v10.enums.CalloutPla" +
      "ceholderFieldEnum.CalloutPlaceholderFiel" +
      "dB\003\340A\005H\000\022\220\001\n\030structured_snippet_field\030\t " +
      "\001(\0162g.google.ads.googleads.v10.enums.Str" +
      "ucturedSnippetPlaceholderFieldEnum.Struc" +
      "turedSnippetPlaceholderFieldB\003\340A\005H\000\022q\n\rm" +
      "essage_field\030\n \001(\0162S.google.ads.googlead" +
      "s.v10.enums.MessagePlaceholderFieldEnum." +
      "MessagePlaceholderFieldB\003\340A\005H\000\022k\n\013price_" +
      "field\030\013 \001(\0162O.google.ads.googleads.v10.e" +
      "nums.PricePlaceholderFieldEnum.PricePlac" +
      "eholderFieldB\003\340A\005H\000\022w\n\017promotion_field\030\014" +
      " \001(\0162W.google.ads.googleads.v10.enums.Pr" +
      "omotionPlaceholderFieldEnum.PromotionPla" +
      "ceholderFieldB\003\340A\005H\000\022\201\001\n\023ad_customizer_f" +
      "ield\030\r \001(\0162].google.ads.googleads.v10.en" +
      "ums.AdCustomizerPlaceholderFieldEnum.AdC" +
      "ustomizerPlaceholderFieldB\003\340A\005H\000\022{\n\023dsa_" +
      "page_feed_field\030\016 \001(\0162W.google.ads.googl" +
      "eads.v10.enums.DsaPageFeedCriterionField" +
      "Enum.DsaPageFeedCriterionFieldB\003\340A\005H\000\022\250\001" +
      "\n\"location_extension_targeting_field\030\017 \001" +
      "(\0162u.google.ads.googleads.v10.enums.Loca" +
      "tionExtensionTargetingCriterionFieldEnum" +
      ".LocationExtensionTargetingCriterionFiel" +
      "dB\003\340A\005H\000\022w\n\017education_field\030\020 \001(\0162W.goog" +
      "le.ads.googleads.v10.enums.EducationPlac" +
      "eholderFieldEnum.EducationPlaceholderFie" +
      "ldB\003\340A\005H\000\022n\n\014flight_field\030\021 \001(\0162Q.google" +
      ".ads.googleads.v10.enums.FlightPlacehold" +
      "erFieldEnum.FlightPlaceholderFieldB\003\340A\005H" +
      "\000\022n\n\014custom_field\030\022 \001(\0162Q.google.ads.goo" +
      "gleads.v10.enums.CustomPlaceholderFieldE" +
      "num.CustomPlaceholderFieldB\003\340A\005H\000\022k\n\013hot" +
      "el_field\030\023 \001(\0162O.google.ads.googleads.v1" +
      "0.enums.HotelPlaceholderFieldEnum.HotelP" +
      "laceholderFieldB\003\340A\005H\000\022{\n\021real_estate_fi" +
      "eld\030\024 \001(\0162Y.google.ads.googleads.v10.enu" +
      "ms.RealEstatePlaceholderFieldEnum.RealEs" +
      "tatePlaceholderFieldB\003\340A\005H\000\022n\n\014travel_fi" +
      "eld\030\025 \001(\0162Q.google.ads.googleads.v10.enu" +
      "ms.TravelPlaceholderFieldEnum.TravelPlac" +
      "eholderFieldB\003\340A\005H\000\022k\n\013local_field\030\026 \001(\016" +
      "2O.google.ads.googleads.v10.enums.LocalP" +
      "laceholderFieldEnum.LocalPlaceholderFiel" +
      "dB\003\340A\005H\000\022e\n\tjob_field\030\027 \001(\0162K.google.ads" +
      ".googleads.v10.enums.JobPlaceholderField" +
      "Enum.JobPlaceholderFieldB\003\340A\005H\000\022k\n\013image" +
      "_field\030\032 \001(\0162O.google.ads.googleads.v10." +
      "enums.ImagePlaceholderFieldEnum.ImagePla" +
      "ceholderFieldB\003\340A\005H\000B\007\n\005fieldB\024\n\022_feed_a" +
      "ttribute_idB\013\n\t_field_idB\202\002\n&com.google." +
      "ads.googleads.v10.resourcesB\020FeedMapping" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v10/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V10::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AdCustomizerPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CallPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CalloutPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CustomPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.DsaPageFeedCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.EducationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedMappingCriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedMappingStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FlightsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.HotelsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ImagePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.JobsPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.LocalPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.LocationPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.MessagePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PricePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.RealEstatePlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SitelinkPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.TravelPlaceholderFieldProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_FeedMapping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_FeedMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_FeedMapping_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AttributeFieldMappings", "Status", "PlaceholderType", "CriterionType", "Target", "Feed", });
    internal_static_google_ads_googleads_v10_resources_AttributeFieldMapping_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_AttributeFieldMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AttributeFieldMapping_descriptor,
        new java.lang.String[] { "FeedAttributeId", "FieldId", "SitelinkField", "CallField", "AppField", "LocationField", "AffiliateLocationField", "CalloutField", "StructuredSnippetField", "MessageField", "PriceField", "PromotionField", "AdCustomizerField", "DsaPageFeedField", "LocationExtensionTargetingField", "EducationField", "FlightField", "CustomField", "HotelField", "RealEstateField", "TravelField", "LocalField", "JobField", "ImageField", "Field", "FeedAttributeId", "FieldId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AdCustomizerPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AffiliateLocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CallPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CalloutPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CustomPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.DsaPageFeedCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.EducationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedMappingCriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedMappingStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FlightsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.HotelsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ImagePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.JobsPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.LocalPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.LocationExtensionTargetingCriterionFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.LocationPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.MessagePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PricePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.RealEstatePlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SitelinkPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.StructuredSnippetPlaceholderFieldProto.getDescriptor();
    com.google.ads.googleads.v10.enums.TravelPlaceholderFieldProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}