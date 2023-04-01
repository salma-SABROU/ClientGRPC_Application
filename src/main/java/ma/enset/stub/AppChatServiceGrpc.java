package ma.enset.stub;

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
    comments = "Source: chat.proto")
public final class AppChatServiceGrpc {

  private AppChatServiceGrpc() {}

  public static final String SERVICE_NAME = "AppChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stub.Chat.MessageRequest,
      ma.enset.stub.Chat.MessageRespense> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = ma.enset.stub.Chat.MessageRequest.class,
      responseType = ma.enset.stub.Chat.MessageRespense.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stub.Chat.MessageRequest,
      ma.enset.stub.Chat.MessageRespense> getSendMessageMethod() {
    io.grpc.MethodDescriptor<ma.enset.stub.Chat.MessageRequest, ma.enset.stub.Chat.MessageRespense> getSendMessageMethod;
    if ((getSendMessageMethod = AppChatServiceGrpc.getSendMessageMethod) == null) {
      synchronized (AppChatServiceGrpc.class) {
        if ((getSendMessageMethod = AppChatServiceGrpc.getSendMessageMethod) == null) {
          AppChatServiceGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stub.Chat.MessageRequest, ma.enset.stub.Chat.MessageRespense>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AppChatService", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stub.Chat.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stub.Chat.MessageRespense.getDefaultInstance()))
                  .setSchemaDescriptor(new AppChatServiceMethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppChatServiceStub newStub(io.grpc.Channel channel) {
    return new AppChatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AppChatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AppChatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AppChatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stub.Chat.MessageRequest> sendMessage(
        io.grpc.stub.StreamObserver<ma.enset.stub.Chat.MessageRespense> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stub.Chat.MessageRequest,
                ma.enset.stub.Chat.MessageRespense>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class AppChatServiceStub extends io.grpc.stub.AbstractStub<AppChatServiceStub> {
    private AppChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppChatServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stub.Chat.MessageRequest> sendMessage(
        io.grpc.stub.StreamObserver<ma.enset.stub.Chat.MessageRespense> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AppChatServiceBlockingStub extends io.grpc.stub.AbstractStub<AppChatServiceBlockingStub> {
    private AppChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppChatServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class AppChatServiceFutureStub extends io.grpc.stub.AbstractStub<AppChatServiceFutureStub> {
    private AppChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppChatServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMessage(
              (io.grpc.stub.StreamObserver<ma.enset.stub.Chat.MessageRespense>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AppChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stub.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppChatService");
    }
  }

  private static final class AppChatServiceFileDescriptorSupplier
      extends AppChatServiceBaseDescriptorSupplier {
    AppChatServiceFileDescriptorSupplier() {}
  }

  private static final class AppChatServiceMethodDescriptorSupplier
      extends AppChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppChatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppChatServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
