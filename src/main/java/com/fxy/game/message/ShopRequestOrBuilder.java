// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: message_wrapper.proto
// Protobuf Java Version: 4.31.1

package com.fxy.game.message;

@com.google.protobuf.Generated
public interface ShopRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:game.ShopRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sessionId = 1;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string sessionId = 1;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>int32 itemId = 2;</code>
   * @return The itemId.
   */
  int getItemId();

  /**
   * <code>int32 purchaseNum = 3;</code>
   * @return The purchaseNum.
   */
  int getPurchaseNum();
}
