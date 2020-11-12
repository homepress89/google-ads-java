// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/errors/errors.proto

package com.google.ads.googleads.v6.errors;

public interface ErrorLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.errors.ErrorLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A field path that indicates which field was invalid in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement field_path_elements = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement> 
      getFieldPathElementsList();
  /**
   * <pre>
   * A field path that indicates which field was invalid in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement field_path_elements = 2;</code>
   */
  com.google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement getFieldPathElements(int index);
  /**
   * <pre>
   * A field path that indicates which field was invalid in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement field_path_elements = 2;</code>
   */
  int getFieldPathElementsCount();
  /**
   * <pre>
   * A field path that indicates which field was invalid in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement field_path_elements = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.errors.ErrorLocation.FieldPathElementOrBuilder> 
      getFieldPathElementsOrBuilderList();
  /**
   * <pre>
   * A field path that indicates which field was invalid in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.errors.ErrorLocation.FieldPathElement field_path_elements = 2;</code>
   */
  com.google.ads.googleads.v6.errors.ErrorLocation.FieldPathElementOrBuilder getFieldPathElementsOrBuilder(
      int index);
}
