// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto.proto

package russvslizards.server;

public final class Proto {
  private Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_russvslizards_server_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_russvslizards_server_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_russvslizards_server_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_russvslizards_server_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013proto.proto\022\024russvslizards.server\"\t\n\007R" +
      "equest\"\032\n\010Response\022\016\n\006phrase\030\001 \001(\t2R\n\007Se" +
      "rvice\022G\n\006Phrase\022\035.russvslizards.server.R" +
      "equest\032\036.russvslizards.server.ResponseB\002" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_russvslizards_server_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_russvslizards_server_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_russvslizards_server_Request_descriptor,
        new java.lang.String[] { });
    internal_static_russvslizards_server_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_russvslizards_server_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_russvslizards_server_Response_descriptor,
        new java.lang.String[] { "Phrase", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}