// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/topic_constant.proto

package com.google.ads.googleads.v7.resources;

public final class TopicConstantProto {
  private TopicConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_TopicConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_TopicConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v7/resources/topi" +
      "c_constant.proto\022!google.ads.googleads.v" +
      "7.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\034google/" +
      "api/annotations.proto\"\274\002\n\rTopicConstant\022" +
      "E\n\rresource_name\030\001 \001(\tB.\340A\003\372A(\n&googlead" +
      "s.googleapis.com/TopicConstant\022\024\n\002id\030\005 \001" +
      "(\003B\003\340A\003H\000\210\001\001\022R\n\025topic_constant_parent\030\006 " +
      "\001(\tB.\340A\003\372A(\n&googleads.googleapis.com/To" +
      "picConstantH\001\210\001\001\022\021\n\004path\030\007 \003(\tB\003\340A\003:F\352AC" +
      "\n&googleads.googleapis.com/TopicConstant" +
      "\022\031topicConstants/{topic_id}B\005\n\003_idB\030\n\026_t" +
      "opic_constant_parentB\377\001\n%com.google.ads." +
      "googleads.v7.resourcesB\022TopicConstantPro" +
      "toP\001ZJgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v7/resources;resources" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resourc" +
      "es\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002" +
      "%Google::Ads::GoogleAds::V7::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_TopicConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_TopicConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_TopicConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "TopicConstantParent", "Path", "Id", "TopicConstantParent", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
