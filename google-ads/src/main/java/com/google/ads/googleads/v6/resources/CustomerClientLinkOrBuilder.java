// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/customer_client_link.proto

package com.google.ads.googleads.v6.resources;

public interface CustomerClientLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.resources.CustomerClientLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerClientLink resource names have the form:
   * `customers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerClientLink resource names have the form:
   * `customers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The client customer linked to this customer.
   * </pre>
   *
   * <code>string client_customer = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the clientCustomer field is set.
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * Immutable. The client customer linked to this customer.
   * </pre>
   *
   * <code>string client_customer = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The clientCustomer.
   */
  java.lang.String getClientCustomer();
  /**
   * <pre>
   * Immutable. The client customer linked to this customer.
   * </pre>
   *
   * <code>string client_customer = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for clientCustomer.
   */
  com.google.protobuf.ByteString
      getClientCustomerBytes();

  /**
   * <pre>
   * Output only. This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>int64 manager_link_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the managerLinkId field is set.
   */
  boolean hasManagerLinkId();
  /**
   * <pre>
   * Output only. This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>int64 manager_link_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The managerLinkId.
   */
  long getManagerLinkId();

  /**
   * <pre>
   * This is the status of the link between client and manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * This is the status of the link between client and manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v6.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus();

  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the Google Ads UI.
   * Default value is false
   * </pre>
   *
   * <code>bool hidden = 9;</code>
   * @return Whether the hidden field is set.
   */
  boolean hasHidden();
  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the Google Ads UI.
   * Default value is false
   * </pre>
   *
   * <code>bool hidden = 9;</code>
   * @return The hidden.
   */
  boolean getHidden();
}
