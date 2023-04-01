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
    comments = "Source: nbrMagique.proto")
public final class NombreMagiqueGrpc {

  private NombreMagiqueGrpc() {}

  public static final String SERVICE_NAME = "NombreMagique";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stub.NbrMagique.BroadMsgRequest,
      ma.enset.stub.NbrMagique.BroadMsgResponse> getBroadcastMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "broadcastMsg",
      requestType = ma.enset.stub.NbrMagique.BroadMsgRequest.class,
      responseType = ma.enset.stub.NbrMagique.BroadMsgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stub.NbrMagique.BroadMsgRequest,
      ma.enset.stub.NbrMagique.BroadMsgResponse> getBroadcastMsgMethod() {
    io.grpc.MethodDescriptor<ma.enset.stub.NbrMagique.BroadMsgRequest, ma.enset.stub.NbrMagique.BroadMsgResponse> getBroadcastMsgMethod;
    if ((getBroadcastMsgMethod = NombreMagiqueGrpc.getBroadcastMsgMethod) == null) {
      synchronized (NombreMagiqueGrpc.class) {
        if ((getBroadcastMsgMethod = NombreMagiqueGrpc.getBroadcastMsgMethod) == null) {
          NombreMagiqueGrpc.getBroadcastMsgMethod = getBroadcastMsgMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stub.NbrMagique.BroadMsgRequest, ma.enset.stub.NbrMagique.BroadMsgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "NombreMagique", "broadcastMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stub.NbrMagique.BroadMsgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stub.NbrMagique.BroadMsgResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NombreMagiqueMethodDescriptorSupplier("broadcastMsg"))
                  .build();
          }
        }
     }
     return getBroadcastMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NombreMagiqueStub newStub(io.grpc.Channel channel) {
    return new NombreMagiqueStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NombreMagiqueBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NombreMagiqueBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NombreMagiqueFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NombreMagiqueFutureStub(channel);
  }

  /**
   */
  public static abstract class NombreMagiqueImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stub.NbrMagique.BroadMsgRequest> broadcastMsg(
        io.grpc.stub.StreamObserver<ma.enset.stub.NbrMagique.BroadMsgResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBroadcastMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBroadcastMsgMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stub.NbrMagique.BroadMsgRequest,
                ma.enset.stub.NbrMagique.BroadMsgResponse>(
                  this, METHODID_BROADCAST_MSG)))
          .build();
    }
  }

  /**
   */
  public static final class NombreMagiqueStub extends io.grpc.stub.AbstractStub<NombreMagiqueStub> {
    private NombreMagiqueStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NombreMagiqueStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NombreMagiqueStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NombreMagiqueStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stub.NbrMagique.BroadMsgRequest> broadcastMsg(
        io.grpc.stub.StreamObserver<ma.enset.stub.NbrMagique.BroadMsgResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBroadcastMsgMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NombreMagiqueBlockingStub extends io.grpc.stub.AbstractStub<NombreMagiqueBlockingStub> {
    private NombreMagiqueBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NombreMagiqueBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NombreMagiqueBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NombreMagiqueBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class NombreMagiqueFutureStub extends io.grpc.stub.AbstractStub<NombreMagiqueFutureStub> {
    private NombreMagiqueFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NombreMagiqueFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NombreMagiqueFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NombreMagiqueFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BROADCAST_MSG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NombreMagiqueImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NombreMagiqueImplBase serviceImpl, int methodId) {
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
        case METHODID_BROADCAST_MSG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.broadcastMsg(
              (io.grpc.stub.StreamObserver<ma.enset.stub.NbrMagique.BroadMsgResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NombreMagiqueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NombreMagiqueBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stub.NbrMagique.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NombreMagique");
    }
  }

  private static final class NombreMagiqueFileDescriptorSupplier
      extends NombreMagiqueBaseDescriptorSupplier {
    NombreMagiqueFileDescriptorSupplier() {}
  }

  private static final class NombreMagiqueMethodDescriptorSupplier
      extends NombreMagiqueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NombreMagiqueMethodDescriptorSupplier(String methodName) {
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
      synchronized (NombreMagiqueGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NombreMagiqueFileDescriptorSupplier())
              .addMethod(getBroadcastMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
