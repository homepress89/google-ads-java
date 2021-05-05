// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/google_ads_field.proto

package com.google.ads.googleads.v7.resources;

public final class GoogleAdsFieldProto {
  private GoogleAdsFieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_GoogleAdsField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_GoogleAdsField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v7/resources/goog" +
      "le_ads_field.proto\022!google.ads.googleads" +
      ".v7.resources\032=google/ads/googleads/v7/e" +
      "nums/google_ads_field_category.proto\032>go" +
      "ogle/ads/googleads/v7/enums/google_ads_f" +
      "ield_data_type.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032\034google/api/annotations.proto\"\200\006\n\016Googl" +
      "eAdsField\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)" +
      "\n\'googleads.googleapis.com/GoogleAdsFiel" +
      "d\022\026\n\004name\030\025 \001(\tB\003\340A\003H\000\210\001\001\022g\n\010category\030\003 " +
      "\001(\0162P.google.ads.googleads.v7.enums.Goog" +
      "leAdsFieldCategoryEnum.GoogleAdsFieldCat" +
      "egoryB\003\340A\003\022\034\n\nselectable\030\026 \001(\010B\003\340A\003H\001\210\001\001" +
      "\022\034\n\nfilterable\030\027 \001(\010B\003\340A\003H\002\210\001\001\022\032\n\010sortab" +
      "le\030\030 \001(\010B\003\340A\003H\003\210\001\001\022\034\n\017selectable_with\030\031 " +
      "\003(\tB\003\340A\003\022 \n\023attribute_resources\030\032 \003(\tB\003\340" +
      "A\003\022\024\n\007metrics\030\033 \003(\tB\003\340A\003\022\025\n\010segments\030\034 \003" +
      "(\tB\003\340A\003\022\030\n\013enum_values\030\035 \003(\tB\003\340A\003\022h\n\tdat" +
      "a_type\030\014 \001(\0162P.google.ads.googleads.v7.e" +
      "nums.GoogleAdsFieldDataTypeEnum.GoogleAd" +
      "sFieldDataTypeB\003\340A\003\022\032\n\010type_url\030\036 \001(\tB\003\340" +
      "A\003H\004\210\001\001\022\035\n\013is_repeated\030\037 \001(\010B\003\340A\003H\005\210\001\001:P" +
      "\352AM\n\'googleads.googleapis.com/GoogleAdsF" +
      "ield\022\"googleAdsFields/{google_ads_field}" +
      "B\007\n\005_nameB\r\n\013_selectableB\r\n\013_filterableB" +
      "\013\n\t_sortableB\013\n\t_type_urlB\016\n\014_is_repeate" +
      "dB\200\002\n%com.google.ads.googleads.v7.resour" +
      "cesB\023GoogleAdsFieldProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v7/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V7.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V7\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V7::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.enums.GoogleAdsFieldCategoryProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.GoogleAdsFieldDataTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_GoogleAdsField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_GoogleAdsField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_GoogleAdsField_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Category", "Selectable", "Filterable", "Sortable", "SelectableWith", "AttributeResources", "Metrics", "Segments", "EnumValues", "DataType", "TypeUrl", "IsRepeated", "Name", "Selectable", "Filterable", "Sortable", "TypeUrl", "IsRepeated", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.enums.GoogleAdsFieldCategoryProto.getDescriptor();
    com.google.ads.googleads.v7.enums.GoogleAdsFieldDataTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
