// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: message_wrapper.proto
// Protobuf Java Version: 4.31.1

package com.fxy.game.message;

@com.google.protobuf.Generated
public interface MailResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:game.MailResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>repeated .game.Mail mails = 2;</code>
   */
  java.util.List<com.fxy.game.message.Mail> 
      getMailsList();
  /**
   * <code>repeated .game.Mail mails = 2;</code>
   */
  com.fxy.game.message.Mail getMails(int index);
  /**
   * <code>repeated .game.Mail mails = 2;</code>
   */
  int getMailsCount();
  /**
   * <code>repeated .game.Mail mails = 2;</code>
   */
  java.util.List<? extends com.fxy.game.message.MailOrBuilder> 
      getMailsOrBuilderList();
  /**
   * <code>repeated .game.Mail mails = 2;</code>
   */
  com.fxy.game.message.MailOrBuilder getMailsOrBuilder(
      int index);
}
