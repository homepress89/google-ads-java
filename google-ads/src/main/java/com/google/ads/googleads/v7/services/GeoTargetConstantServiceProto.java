// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/geo_target_constant_service.proto

package com.google.ads.googleads.v7.services;

public final class GeoTargetConstantServiceProto {
  private GeoTargetConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetGeoTargetConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetGeoTargetConstantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_LocationNames_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_LocationNames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_GeoTargets_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_GeoTargets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GeoTargetConstantSuggestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GeoTargetConstantSuggestion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v7/services/geo_t" +
      "arget_constant_service.proto\022 google.ads" +
      ".googleads.v7.services\032;google/ads/googl" +
      "eads/v7/resources/geo_target_constant.pr" +
      "oto\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\"h" +
      "\n\033GetGeoTargetConstantRequest\022I\n\rresourc" +
      "e_name\030\001 \001(\tB2\340A\002\372A,\n*googleads.googleap" +
      "is.com/GeoTargetConstant\"\225\003\n SuggestGeoT" +
      "argetConstantsRequest\022\023\n\006locale\030\006 \001(\tH\001\210" +
      "\001\001\022\031\n\014country_code\030\007 \001(\tH\002\210\001\001\022j\n\016locatio" +
      "n_names\030\001 \001(\0132P.google.ads.googleads.v7." +
      "services.SuggestGeoTargetConstantsReques" +
      "t.LocationNamesH\000\022d\n\013geo_targets\030\002 \001(\0132M" +
      ".google.ads.googleads.v7.services.Sugges" +
      "tGeoTargetConstantsRequest.GeoTargetsH\000\032" +
      "\036\n\rLocationNames\022\r\n\005names\030\002 \003(\t\032*\n\nGeoTa" +
      "rgets\022\034\n\024geo_target_constants\030\002 \003(\tB\007\n\005q" +
      "ueryB\t\n\007_localeB\017\n\r_country_code\"\213\001\n!Sug" +
      "gestGeoTargetConstantsResponse\022f\n\037geo_ta" +
      "rget_constant_suggestions\030\001 \003(\0132=.google" +
      ".ads.googleads.v7.services.GeoTargetCons" +
      "tantSuggestion\"\263\002\n\033GeoTargetConstantSugg" +
      "estion\022\023\n\006locale\030\006 \001(\tH\000\210\001\001\022\022\n\005reach\030\007 \001" +
      "(\003H\001\210\001\001\022\030\n\013search_term\030\010 \001(\tH\002\210\001\001\022Q\n\023geo" +
      "_target_constant\030\004 \001(\01324.google.ads.goog" +
      "leads.v7.resources.GeoTargetConstant\022Y\n\033" +
      "geo_target_constant_parents\030\005 \003(\01324.goog" +
      "le.ads.googleads.v7.resources.GeoTargetC" +
      "onstantB\t\n\007_localeB\010\n\006_reachB\016\n\014_search_" +
      "term2\203\004\n\030GeoTargetConstantService\022\315\001\n\024Ge" +
      "tGeoTargetConstant\022=.google.ads.googlead" +
      "s.v7.services.GetGeoTargetConstantReques" +
      "t\0324.google.ads.googleads.v7.resources.Ge" +
      "oTargetConstant\"@\202\323\344\223\002*\022(/v7/{resource_n" +
      "ame=geoTargetConstants/*}\332A\rresource_nam" +
      "e\022\317\001\n\031SuggestGeoTargetConstants\022B.google" +
      ".ads.googleads.v7.services.SuggestGeoTar" +
      "getConstantsRequest\032C.google.ads.googlea" +
      "ds.v7.services.SuggestGeoTargetConstants" +
      "Response\")\202\323\344\223\002#\"\036/v7/geoTargetConstants" +
      ":suggest:\001*\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\204\002\n$com.google.ads.googleads.v7.servi" +
      "cesB\035GeoTargetConstantServiceProtoP\001ZHgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v7/services;services\242\002\003GAA\252\002 G" +
      "oogle.Ads.GoogleAds.V7.Services\312\002 Google" +
      "\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads" +
      "::GoogleAds::V7::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.resources.GeoTargetConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetGeoTargetConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetGeoTargetConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetGeoTargetConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_descriptor,
        new java.lang.String[] { "Locale", "CountryCode", "LocationNames", "GeoTargets", "Query", "Locale", "CountryCode", });
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_LocationNames_descriptor =
      internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_LocationNames_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_LocationNames_descriptor,
        new java.lang.String[] { "Names", });
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_GeoTargets_descriptor =
      internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_GeoTargets_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsRequest_GeoTargets_descriptor,
        new java.lang.String[] { "GeoTargetConstants", });
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_SuggestGeoTargetConstantsResponse_descriptor,
        new java.lang.String[] { "GeoTargetConstantSuggestions", });
    internal_static_google_ads_googleads_v7_services_GeoTargetConstantSuggestion_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v7_services_GeoTargetConstantSuggestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GeoTargetConstantSuggestion_descriptor,
        new java.lang.String[] { "Locale", "Reach", "SearchTerm", "GeoTargetConstant", "GeoTargetConstantParents", "Locale", "Reach", "SearchTerm", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.resources.GeoTargetConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
