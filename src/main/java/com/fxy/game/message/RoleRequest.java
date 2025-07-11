// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: message_wrapper.proto
// Protobuf Java Version: 4.31.1

package com.fxy.game.message;

/**
 * Protobuf type {@code game.RoleRequest}
 */
@com.google.protobuf.Generated
public final class RoleRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:game.RoleRequest)
    RoleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 1,
      /* suffix= */ "",
      RoleRequest.class.getName());
  }
  // Use RoleRequest.newBuilder() to construct.
  private RoleRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RoleRequest() {
    sessionId_ = "";
    op_ = 0;
    roleName_ = "";
    username_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fxy.game.message.GameMessage.internal_static_game_RoleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fxy.game.message.GameMessage.internal_static_game_RoleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fxy.game.message.RoleRequest.class, com.fxy.game.message.RoleRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code game.RoleRequest.Op}
   */
  public enum Op
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CREATE = 0;</code>
     */
    CREATE(0),
    /**
     * <code>QUERY = 1;</code>
     */
    QUERY(1),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 31,
        /* patch= */ 1,
        /* suffix= */ "",
        Op.class.getName());
    }
    /**
     * <code>CREATE = 0;</code>
     */
    public static final int CREATE_VALUE = 0;
    /**
     * <code>QUERY = 1;</code>
     */
    public static final int QUERY_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Op valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Op forNumber(int value) {
      switch (value) {
        case 0: return CREATE;
        case 1: return QUERY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Op>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Op> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Op>() {
            public Op findValueByNumber(int number) {
              return Op.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.fxy.game.message.RoleRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Op[] VALUES = values();

    public static Op valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Op(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:game.RoleRequest.Op)
  }

  public static final int SESSIONID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionId_ = "";
  /**
   * <code>string sessionId = 1;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string sessionId = 1;</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OP_FIELD_NUMBER = 2;
  private int op_ = 0;
  /**
   * <code>.game.RoleRequest.Op op = 2;</code>
   * @return The enum numeric value on the wire for op.
   */
  @java.lang.Override public int getOpValue() {
    return op_;
  }
  /**
   * <code>.game.RoleRequest.Op op = 2;</code>
   * @return The op.
   */
  @java.lang.Override public com.fxy.game.message.RoleRequest.Op getOp() {
    com.fxy.game.message.RoleRequest.Op result = com.fxy.game.message.RoleRequest.Op.forNumber(op_);
    return result == null ? com.fxy.game.message.RoleRequest.Op.UNRECOGNIZED : result;
  }

  public static final int ROLENAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object roleName_ = "";
  /**
   * <code>string roleName = 3;</code>
   * @return The roleName.
   */
  @java.lang.Override
  public java.lang.String getRoleName() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleName_ = s;
      return s;
    }
  }
  /**
   * <code>string roleName = 3;</code>
   * @return The bytes for roleName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleNameBytes() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <code>string username = 4;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 4;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sessionId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, sessionId_);
    }
    if (op_ != com.fxy.game.message.RoleRequest.Op.CREATE.getNumber()) {
      output.writeEnum(2, op_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(roleName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, roleName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, username_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sessionId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, sessionId_);
    }
    if (op_ != com.fxy.game.message.RoleRequest.Op.CREATE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, op_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(roleName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, roleName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, username_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.fxy.game.message.RoleRequest)) {
      return super.equals(obj);
    }
    com.fxy.game.message.RoleRequest other = (com.fxy.game.message.RoleRequest) obj;

    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (op_ != other.op_) return false;
    if (!getRoleName()
        .equals(other.getRoleName())) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    hash = (37 * hash) + ROLENAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoleName().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fxy.game.message.RoleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.fxy.game.message.RoleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.fxy.game.message.RoleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.fxy.game.message.RoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.fxy.game.message.RoleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code game.RoleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:game.RoleRequest)
      com.fxy.game.message.RoleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fxy.game.message.GameMessage.internal_static_game_RoleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fxy.game.message.GameMessage.internal_static_game_RoleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fxy.game.message.RoleRequest.class, com.fxy.game.message.RoleRequest.Builder.class);
    }

    // Construct using com.fxy.game.message.RoleRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sessionId_ = "";
      op_ = 0;
      roleName_ = "";
      username_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fxy.game.message.GameMessage.internal_static_game_RoleRequest_descriptor;
    }

    @java.lang.Override
    public com.fxy.game.message.RoleRequest getDefaultInstanceForType() {
      return com.fxy.game.message.RoleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.fxy.game.message.RoleRequest build() {
      com.fxy.game.message.RoleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fxy.game.message.RoleRequest buildPartial() {
      com.fxy.game.message.RoleRequest result = new com.fxy.game.message.RoleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.fxy.game.message.RoleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionId_ = sessionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.op_ = op_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.roleName_ = roleName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.username_ = username_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.fxy.game.message.RoleRequest) {
        return mergeFrom((com.fxy.game.message.RoleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fxy.game.message.RoleRequest other) {
      if (other == com.fxy.game.message.RoleRequest.getDefaultInstance()) return this;
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (!other.getRoleName().isEmpty()) {
        roleName_ = other.roleName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              sessionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              op_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              roleName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              username_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string sessionId = 1;</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sessionId = 1;</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sessionId = 1;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      sessionId_ = getDefaultInstance().getSessionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 1;</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int op_ = 0;
    /**
     * <code>.game.RoleRequest.Op op = 2;</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.game.RoleRequest.Op op = 2;</code>
     * @param value The enum numeric value on the wire for op to set.
     * @return This builder for chaining.
     */
    public Builder setOpValue(int value) {
      op_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.game.RoleRequest.Op op = 2;</code>
     * @return The op.
     */
    @java.lang.Override
    public com.fxy.game.message.RoleRequest.Op getOp() {
      com.fxy.game.message.RoleRequest.Op result = com.fxy.game.message.RoleRequest.Op.forNumber(op_);
      return result == null ? com.fxy.game.message.RoleRequest.Op.UNRECOGNIZED : result;
    }
    /**
     * <code>.game.RoleRequest.Op op = 2;</code>
     * @param value The op to set.
     * @return This builder for chaining.
     */
    public Builder setOp(com.fxy.game.message.RoleRequest.Op value) {
      if (value == null) { throw new NullPointerException(); }
      bitField0_ |= 0x00000002;
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.game.RoleRequest.Op op = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      op_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object roleName_ = "";
    /**
     * <code>string roleName = 3;</code>
     * @return The roleName.
     */
    public java.lang.String getRoleName() {
      java.lang.Object ref = roleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roleName = 3;</code>
     * @return The bytes for roleName.
     */
    public com.google.protobuf.ByteString
        getRoleNameBytes() {
      java.lang.Object ref = roleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roleName = 3;</code>
     * @param value The roleName to set.
     * @return This builder for chaining.
     */
    public Builder setRoleName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      roleName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string roleName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleName() {
      roleName_ = getDefaultInstance().getRoleName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string roleName = 3;</code>
     * @param value The bytes for roleName to set.
     * @return This builder for chaining.
     */
    public Builder setRoleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      roleName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 4;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 4;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 4;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string username = 4;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:game.RoleRequest)
  }

  // @@protoc_insertion_point(class_scope:game.RoleRequest)
  private static final com.fxy.game.message.RoleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fxy.game.message.RoleRequest();
  }

  public static com.fxy.game.message.RoleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoleRequest>
      PARSER = new com.google.protobuf.AbstractParser<RoleRequest>() {
    @java.lang.Override
    public RoleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RoleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fxy.game.message.RoleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

