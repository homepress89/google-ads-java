// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/asset_types.proto

package com.google.ads.googleads.v7.common;

public interface LeadFormFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.LeadFormField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes the input type, which may be a predefined type such as
   * "full name" or a pre-vetted question like "Do you own a car?".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
   * @return The enum numeric value on the wire for inputType.
   */
  int getInputTypeValue();
  /**
   * <pre>
   * Describes the input type, which may be a predefined type such as
   * "full name" or a pre-vetted question like "Do you own a car?".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType input_type = 1;</code>
   * @return The inputType.
   */
  com.google.ads.googleads.v7.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType getInputType();

  /**
   * <pre>
   * Answer configuration for a single choice question. Can be set only for
   * pre-vetted question fields. Minimum of 2 answers required and maximum of
   * 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   * @return Whether the singleChoiceAnswers field is set.
   */
  boolean hasSingleChoiceAnswers();
  /**
   * <pre>
   * Answer configuration for a single choice question. Can be set only for
   * pre-vetted question fields. Minimum of 2 answers required and maximum of
   * 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   * @return The singleChoiceAnswers.
   */
  com.google.ads.googleads.v7.common.LeadFormSingleChoiceAnswers getSingleChoiceAnswers();
  /**
   * <pre>
   * Answer configuration for a single choice question. Can be set only for
   * pre-vetted question fields. Minimum of 2 answers required and maximum of
   * 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   */
  com.google.ads.googleads.v7.common.LeadFormSingleChoiceAnswersOrBuilder getSingleChoiceAnswersOrBuilder();

  public com.google.ads.googleads.v7.common.LeadFormField.AnswersCase getAnswersCase();
}
