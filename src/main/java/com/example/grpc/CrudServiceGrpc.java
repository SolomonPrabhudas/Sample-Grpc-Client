package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: crud.proto")
public final class CrudServiceGrpc {

  private CrudServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.CrudService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Crud.CreateRequest,
      com.example.grpc.Crud.Employee> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.example.grpc.Crud.CreateRequest.class,
      responseType = com.example.grpc.Crud.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Crud.CreateRequest,
      com.example.grpc.Crud.Employee> getCreateMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Crud.CreateRequest, com.example.grpc.Crud.Employee> getCreateMethod;
    if ((getCreateMethod = CrudServiceGrpc.getCreateMethod) == null) {
      synchronized (CrudServiceGrpc.class) {
        if ((getCreateMethod = CrudServiceGrpc.getCreateMethod) == null) {
          CrudServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Crud.CreateRequest, com.example.grpc.Crud.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.CrudService", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudServiceMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Crud.UpdateRequest,
      com.example.grpc.Crud.Employee> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.example.grpc.Crud.UpdateRequest.class,
      responseType = com.example.grpc.Crud.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Crud.UpdateRequest,
      com.example.grpc.Crud.Employee> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Crud.UpdateRequest, com.example.grpc.Crud.Employee> getUpdateMethod;
    if ((getUpdateMethod = CrudServiceGrpc.getUpdateMethod) == null) {
      synchronized (CrudServiceGrpc.class) {
        if ((getUpdateMethod = CrudServiceGrpc.getUpdateMethod) == null) {
          CrudServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Crud.UpdateRequest, com.example.grpc.Crud.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.CrudService", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudServiceMethodDescriptorSupplier("update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Crud.DeleteRequest,
      com.example.grpc.Crud.Employee> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.example.grpc.Crud.DeleteRequest.class,
      responseType = com.example.grpc.Crud.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Crud.DeleteRequest,
      com.example.grpc.Crud.Employee> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Crud.DeleteRequest, com.example.grpc.Crud.Employee> getDeleteMethod;
    if ((getDeleteMethod = CrudServiceGrpc.getDeleteMethod) == null) {
      synchronized (CrudServiceGrpc.class) {
        if ((getDeleteMethod = CrudServiceGrpc.getDeleteMethod) == null) {
          CrudServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Crud.DeleteRequest, com.example.grpc.Crud.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.CrudService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Crud.GetRequest,
      com.example.grpc.Crud.Employee> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.example.grpc.Crud.GetRequest.class,
      responseType = com.example.grpc.Crud.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Crud.GetRequest,
      com.example.grpc.Crud.Employee> getGetMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Crud.GetRequest, com.example.grpc.Crud.Employee> getGetMethod;
    if ((getGetMethod = CrudServiceGrpc.getGetMethod) == null) {
      synchronized (CrudServiceGrpc.class) {
        if ((getGetMethod = CrudServiceGrpc.getGetMethod) == null) {
          CrudServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Crud.GetRequest, com.example.grpc.Crud.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.CrudService", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Crud.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudServiceMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CrudServiceStub newStub(io.grpc.Channel channel) {
    return new CrudServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CrudServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CrudServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CrudServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CrudServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CrudServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.example.grpc.Crud.CreateRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.example.grpc.Crud.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.example.grpc.Crud.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void get(com.example.grpc.Crud.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Crud.CreateRequest,
                com.example.grpc.Crud.Employee>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Crud.UpdateRequest,
                com.example.grpc.Crud.Employee>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Crud.DeleteRequest,
                com.example.grpc.Crud.Employee>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Crud.GetRequest,
                com.example.grpc.Crud.Employee>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class CrudServiceStub extends io.grpc.stub.AbstractStub<CrudServiceStub> {
    private CrudServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrudServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrudServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrudServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.example.grpc.Crud.CreateRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.grpc.Crud.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.example.grpc.Crud.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.example.grpc.Crud.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CrudServiceBlockingStub extends io.grpc.stub.AbstractStub<CrudServiceBlockingStub> {
    private CrudServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrudServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrudServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrudServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Crud.Employee create(com.example.grpc.Crud.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Crud.Employee update(com.example.grpc.Crud.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Crud.Employee delete(com.example.grpc.Crud.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Crud.Employee get(com.example.grpc.Crud.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CrudServiceFutureStub extends io.grpc.stub.AbstractStub<CrudServiceFutureStub> {
    private CrudServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrudServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrudServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrudServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Crud.Employee> create(
        com.example.grpc.Crud.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Crud.Employee> update(
        com.example.grpc.Crud.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Crud.Employee> delete(
        com.example.grpc.Crud.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Crud.Employee> get(
        com.example.grpc.Crud.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_GET = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CrudServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CrudServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.example.grpc.Crud.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.grpc.Crud.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.example.grpc.Crud.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.example.grpc.Crud.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Crud.Employee>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CrudServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CrudServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.Crud.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CrudService");
    }
  }

  private static final class CrudServiceFileDescriptorSupplier
      extends CrudServiceBaseDescriptorSupplier {
    CrudServiceFileDescriptorSupplier() {}
  }

  private static final class CrudServiceMethodDescriptorSupplier
      extends CrudServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CrudServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CrudServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CrudServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
