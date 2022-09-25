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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: greating_service.proto")
public final class SimpleServiceGrpc {

  private SimpleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.SimpleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreatingService.Request,
      com.example.grpc.GreatingService.Response> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.example.grpc.GreatingService.Request.class,
      responseType = com.example.grpc.GreatingService.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreatingService.Request,
      com.example.grpc.GreatingService.Response> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreatingService.Request, com.example.grpc.GreatingService.Response> getGreetingMethod;
    if ((getGreetingMethod = SimpleServiceGrpc.getGreetingMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getGreetingMethod = SimpleServiceGrpc.getGreetingMethod) == null) {
          SimpleServiceGrpc.getGreetingMethod = getGreetingMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreatingService.Request, com.example.grpc.GreatingService.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreatingService.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreatingService.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("greeting"))
              .build();
        }
      }
    }
    return getGreetingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleServiceStub newStub(io.grpc.Channel channel) {
    return new SimpleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SimpleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SimpleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SimpleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.example.grpc.GreatingService.Request request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreatingService.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreatingService.Request,
                com.example.grpc.GreatingService.Response>(
                  this, METHODID_GREETING)))
          .build();
    }
  }

  /**
   */
  public static final class SimpleServiceStub extends io.grpc.stub.AbstractStub<SimpleServiceStub> {
    private SimpleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleServiceStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.example.grpc.GreatingService.Request request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreatingService.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SimpleServiceBlockingStub extends io.grpc.stub.AbstractStub<SimpleServiceBlockingStub> {
    private SimpleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.GreatingService.Response greeting(com.example.grpc.GreatingService.Request request) {
      return blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimpleServiceFutureStub extends io.grpc.stub.AbstractStub<SimpleServiceFutureStub> {
    private SimpleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreatingService.Response> greeting(
        com.example.grpc.GreatingService.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimpleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.example.grpc.GreatingService.Request) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreatingService.Response>) responseObserver);
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

  private static abstract class SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.GreatingService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimpleService");
    }
  }

  private static final class SimpleServiceFileDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier {
    SimpleServiceFileDescriptorSupplier() {}
  }

  private static final class SimpleServiceMethodDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimpleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimpleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleServiceFileDescriptorSupplier())
              .addMethod(getGreetingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
