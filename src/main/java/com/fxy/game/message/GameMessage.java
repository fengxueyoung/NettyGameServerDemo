// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: message_wrapper.proto
// Protobuf Java Version: 4.31.1

package com.fxy.game.message;

@com.google.protobuf.Generated
public final class GameMessage {
  private GameMessage() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      GameMessage.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_Wrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_Wrapper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_AuthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_AuthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_AuthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_AuthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_ChatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_ChatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_ChatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_ChatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_GameAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_GameAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_GameState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_GameState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_Player_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_Player_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_ShopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_ShopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_ShopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_ShopResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_MailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_MailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_MailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_MailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_Mail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_Mail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_RoleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_RoleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_RoleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_RoleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_Role_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_game_Role_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025message_wrapper.proto\022\004game\032\037google/pr" +
      "otobuf/timestamp.proto\"\214\004\n\007Wrapper\022(\n\013au" +
      "thRequest\030\001 \001(\0132\021.game.AuthRequestH\000\022*\n\014" +
      "authResponse\030\002 \001(\0132\022.game.AuthResponseH\000" +
      "\022(\n\013chatRequest\030\003 \001(\0132\021.game.ChatRequest" +
      "H\000\022*\n\014chatResponse\030\004 \001(\0132\022.game.ChatResp" +
      "onseH\000\022&\n\ngameAction\030\005 \001(\0132\020.game.GameAc" +
      "tionH\000\022$\n\tgameState\030\006 \001(\0132\017.game.GameSta" +
      "teH\000\022(\n\013shopRequest\030\007 \001(\0132\021.game.ShopReq" +
      "uestH\000\022*\n\014shopResponse\030\010 \001(\0132\022.game.Shop" +
      "ResponseH\000\022(\n\013mailRequest\030\t \001(\0132\021.game.M" +
      "ailRequestH\000\022*\n\014mailResponse\030\n \001(\0132\022.gam" +
      "e.MailResponseH\000\022(\n\013roleRequest\030\013 \001(\0132\021." +
      "game.RoleRequestH\000\022*\n\014roleResponse\030\014 \001(\013" +
      "2\022.game.RoleResponseH\000B\005\n\003msg\"\212\001\n\013AuthRe" +
      "quest\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(" +
      "\t\022-\n\004type\030\003 \001(\0162\037.game.AuthRequest.Opera" +
      "tionType\"(\n\rOperationType\022\014\n\010REGISTER\020\000\022" +
      "\t\n\005LOGIN\020\001\"C\n\014AuthResponse\022\017\n\007success\030\001 " +
      "\001(\010\022\017\n\007message\030\002 \001(\t\022\021\n\tsessionId\030\003 \001(\t\"" +
      ":\n\013ChatRequest\022\021\n\tsessionId\030\001 \001(\t\022\014\n\004tex" +
      "t\030\002 \001(\t\022\n\n\002to\030\003 \003(\t\"Y\n\014ChatResponse\022\014\n\004f" +
      "rom\030\001 \001(\t\022\014\n\004text\030\002 \001(\t\022-\n\ttimestamp\030\003 \001" +
      "(\0132\032.google.protobuf.Timestamp\"\242\001\n\nGameA" +
      "ction\022\021\n\tsessionId\030\001 \001(\t\022)\n\004type\030\002 \001(\0162\033" +
      ".game.GameAction.ActionType\022\t\n\001x\030\003 \001(\005\022\t" +
      "\n\001y\030\004 \001(\005\022\r\n\005destX\030\005 \001(\005\022\r\n\005destY\030\006 \001(\005\"" +
      "\"\n\nActionType\022\010\n\004MOVE\020\000\022\n\n\006ATTACK\020\001\"Z\n\tG" +
      "ameState\022\035\n\007players\030\001 \003(\0132\014.game.Player\022" +
      ".\n\nserverTime\030\002 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\"q\n\006Player\022\021\n\tsessionId\030\001 \001(\t\022\t\n\001" +
      "x\030\003 \001(\005\022\t\n\001y\030\004 \001(\005\022\n\n\002hp\030\005 \001(\005\022\013\n\003atk\030\006 " +
      "\001(\005\022\013\n\003dfs\030\007 \001(\005\022\030\n\004role\030\010 \001(\0132\n.game.Ro" +
      "le\"E\n\013ShopRequest\022\021\n\tsessionId\030\001 \001(\t\022\016\n\006" +
      "itemId\030\002 \001(\005\022\023\n\013purchaseNum\030\003 \001(\005\"A\n\014Sho" +
      "pResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007message\030\002 " +
      "\001(\t\022\017\n\007balance\030\003 \001(\005\"\231\001\n\013MailRequest\022\021\n\t" +
      "sessionId\030\001 \001(\t\022$\n\002op\030\002 \001(\0162\030.game.MailR" +
      "equest.MailOp\022\n\n\002to\030\003 \001(\t\022\017\n\007subject\030\004 \001" +
      "(\t\022\014\n\004body\030\005 \001(\t\"&\n\006MailOp\022\010\n\004SEND\020\000\022\010\n\004" +
      "LIST\020\001\022\010\n\004READ\020\002\":\n\014MailResponse\022\017\n\007succ" +
      "ess\030\001 \001(\010\022\031\n\005mails\030\002 \003(\0132\n.game.Mail\"{\n\004" +
      "Mail\022\n\n\002id\030\001 \001(\t\022\014\n\004from\030\002 \001(\t\022\017\n\007subjec" +
      "t\030\003 \001(\t\022\014\n\004body\030\004 \001(\t\022\014\n\004read\030\005 \001(\010\022,\n\010s" +
      "entTime\030\006 \001(\0132\032.google.protobuf.Timestam" +
      "p\"\203\001\n\013RoleRequest\022\021\n\tsessionId\030\001 \001(\t\022 \n\002" +
      "op\030\002 \001(\0162\024.game.RoleRequest.Op\022\020\n\010roleNa" +
      "me\030\003 \001(\t\022\020\n\010username\030\004 \001(\t\"\033\n\002Op\022\n\n\006CREA" +
      "TE\020\000\022\t\n\005QUERY\020\001\"J\n\014RoleResponse\022\017\n\007succe" +
      "ss\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\022\030\n\004role\030\003 \001(\0132" +
      "\n.game.Role\"4\n\004Role\022\020\n\010roleName\030\001 \001(\t\022\r\n" +
      "\005level\030\002 \001(\005\022\013\n\003exp\030\003 \001(\005B%\n\024com.fxy.gam" +
      "e.messageB\013GameMessageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_game_Wrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_game_Wrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_Wrapper_descriptor,
        new java.lang.String[] { "AuthRequest", "AuthResponse", "ChatRequest", "ChatResponse", "GameAction", "GameState", "ShopRequest", "ShopResponse", "MailRequest", "MailResponse", "RoleRequest", "RoleResponse", "Msg", });
    internal_static_game_AuthRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_game_AuthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_AuthRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Type", });
    internal_static_game_AuthResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_game_AuthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_AuthResponse_descriptor,
        new java.lang.String[] { "Success", "Message", "SessionId", });
    internal_static_game_ChatRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_game_ChatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_ChatRequest_descriptor,
        new java.lang.String[] { "SessionId", "Text", "To", });
    internal_static_game_ChatResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_game_ChatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_ChatResponse_descriptor,
        new java.lang.String[] { "From", "Text", "Timestamp", });
    internal_static_game_GameAction_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_game_GameAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_GameAction_descriptor,
        new java.lang.String[] { "SessionId", "Type", "X", "Y", "DestX", "DestY", });
    internal_static_game_GameState_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_game_GameState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_GameState_descriptor,
        new java.lang.String[] { "Players", "ServerTime", });
    internal_static_game_Player_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_game_Player_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_Player_descriptor,
        new java.lang.String[] { "SessionId", "X", "Y", "Hp", "Atk", "Dfs", "Role", });
    internal_static_game_ShopRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_game_ShopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_ShopRequest_descriptor,
        new java.lang.String[] { "SessionId", "ItemId", "PurchaseNum", });
    internal_static_game_ShopResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_game_ShopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_ShopResponse_descriptor,
        new java.lang.String[] { "Success", "Message", "Balance", });
    internal_static_game_MailRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_game_MailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_MailRequest_descriptor,
        new java.lang.String[] { "SessionId", "Op", "To", "Subject", "Body", });
    internal_static_game_MailResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_game_MailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_MailResponse_descriptor,
        new java.lang.String[] { "Success", "Mails", });
    internal_static_game_Mail_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_game_Mail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_Mail_descriptor,
        new java.lang.String[] { "Id", "From", "Subject", "Body", "Read", "SentTime", });
    internal_static_game_RoleRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_game_RoleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_RoleRequest_descriptor,
        new java.lang.String[] { "SessionId", "Op", "RoleName", "Username", });
    internal_static_game_RoleResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_game_RoleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_RoleResponse_descriptor,
        new java.lang.String[] { "Success", "Message", "Role", });
    internal_static_game_Role_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_game_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_game_Role_descriptor,
        new java.lang.String[] { "RoleName", "Level", "Exp", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
