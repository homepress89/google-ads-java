// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/value.proto

package com.google.ads.googleads.v6.common;

public final class ValueProto {
  private ValueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/ads/googleads/v6/common/value.p" +
      "roto\022\036google.ads.googleads.v6.common\032\034go" +
      "ogle/api/annotations.proto\"\207\001\n\005Value\022\027\n\r" +
      "boolean_value\030\001 \001(\010H\000\022\025\n\013int64_value\030\002 \001" +
      "(\003H\000\022\025\n\013float_value\030\003 \001(\002H\000\022\026\n\014double_va" +
      "lue\030\004 \001(\001H\000\022\026\n\014string_value\030\005 \001(\tH\000B\007\n\005v" +
      "alueB\345\001\n\"com.google.ads.googleads.v6.com" +
      "monB\nValueProtoP\001ZDgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v6/common" +
      ";common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6." +
      "Common\312\002\036Google\\Ads\\GoogleAds\\V6\\Common\352" +
      "\002\"Google::Ads::GoogleAds::V6::Commonb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_common_Value_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_common_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_Value_descriptor,
        new java.lang.String[] { "BooleanValue", "Int64Value", "FloatValue", "DoubleValue", "StringValue", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
