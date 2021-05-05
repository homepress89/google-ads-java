// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/conversion_custom_variable.proto

package com.google.ads.googleads.v7.resources;

public final class ConversionCustomVariableProto {
  private ConversionCustomVariableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_ConversionCustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_ConversionCustomVariable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v7/resources/conv" +
      "ersion_custom_variable.proto\022!google.ads" +
      ".googleads.v7.resources\032Egoogle/ads/goog" +
      "leads/v7/enums/conversion_custom_variabl" +
      "e_status.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\034goog" +
      "le/api/annotations.proto\"\347\003\n\030ConversionC" +
      "ustomVariable\022P\n\rresource_name\030\001 \001(\tB9\340A" +
      "\005\372A3\n1googleads.googleapis.com/Conversio" +
      "nCustomVariable\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\021\n\004name" +
      "\030\003 \001(\tB\003\340A\002\022\023\n\003tag\030\004 \001(\tB\006\340A\002\340A\005\022p\n\006stat" +
      "us\030\005 \001(\0162`.google.ads.googleads.v7.enums" +
      ".ConversionCustomVariableStatusEnum.Conv" +
      "ersionCustomVariableStatus\022A\n\016owner_cust" +
      "omer\030\006 \001(\tB)\340A\003\372A#\n!googleads.googleapis" +
      ".com/Customer:\212\001\352A\206\001\n1googleads.googleap" +
      "is.com/ConversionCustomVariable\022Qcustome" +
      "rs/{customer_id}/conversionCustomVariabl" +
      "es/{conversion_custom_variable_id}B\212\002\n%c" +
      "om.google.ads.googleads.v7.resourcesB\035Co" +
      "nversionCustomVariableProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v7/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V7.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V7\\Resources\352\002%Google::Ads::G" +
      "oogleAds::V7::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.enums.ConversionCustomVariableStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_ConversionCustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_ConversionCustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_ConversionCustomVariable_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Tag", "Status", "OwnerCustomer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.enums.ConversionCustomVariableStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
