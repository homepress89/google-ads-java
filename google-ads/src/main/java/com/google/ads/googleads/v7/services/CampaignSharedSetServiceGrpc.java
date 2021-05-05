package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign shared sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/campaign_shared_set_service.proto")
public final class CampaignSharedSetServiceGrpc {

  private CampaignSharedSetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.CampaignSharedSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest,
      com.google.ads.googleads.v7.resources.CampaignSharedSet> getGetCampaignSharedSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignSharedSet",
      requestType = com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest.class,
      responseType = com.google.ads.googleads.v7.resources.CampaignSharedSet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest,
      com.google.ads.googleads.v7.resources.CampaignSharedSet> getGetCampaignSharedSetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest, com.google.ads.googleads.v7.resources.CampaignSharedSet> getGetCampaignSharedSetMethod;
    if ((getGetCampaignSharedSetMethod = CampaignSharedSetServiceGrpc.getGetCampaignSharedSetMethod) == null) {
      synchronized (CampaignSharedSetServiceGrpc.class) {
        if ((getGetCampaignSharedSetMethod = CampaignSharedSetServiceGrpc.getGetCampaignSharedSetMethod) == null) {
          CampaignSharedSetServiceGrpc.getGetCampaignSharedSetMethod = getGetCampaignSharedSetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest, com.google.ads.googleads.v7.resources.CampaignSharedSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignSharedSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.CampaignSharedSet.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignSharedSetServiceMethodDescriptorSupplier("GetCampaignSharedSet"))
              .build();
        }
      }
    }
    return getGetCampaignSharedSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignSharedSets",
      requestType = com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest.class,
      responseType = com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest, com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod;
    if ((getMutateCampaignSharedSetsMethod = CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod) == null) {
      synchronized (CampaignSharedSetServiceGrpc.class) {
        if ((getMutateCampaignSharedSetsMethod = CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod) == null) {
          CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod = getMutateCampaignSharedSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest, com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignSharedSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignSharedSetServiceMethodDescriptorSupplier("MutateCampaignSharedSets"))
              .build();
        }
      }
    }
    return getMutateCampaignSharedSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignSharedSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceStub>() {
        @java.lang.Override
        public CampaignSharedSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSharedSetServiceStub(channel, callOptions);
        }
      };
    return CampaignSharedSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignSharedSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceBlockingStub>() {
        @java.lang.Override
        public CampaignSharedSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSharedSetServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignSharedSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignSharedSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceFutureStub>() {
        @java.lang.Override
        public CampaignSharedSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSharedSetServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignSharedSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static abstract class CampaignSharedSetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignSharedSet(com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CampaignSharedSet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignSharedSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignSharedSets(com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignSharedSetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignSharedSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest,
                com.google.ads.googleads.v7.resources.CampaignSharedSet>(
                  this, METHODID_GET_CAMPAIGN_SHARED_SET)))
          .addMethod(
            getMutateCampaignSharedSetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest,
                com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_SHARED_SETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignSharedSetServiceStub> {
    private CampaignSharedSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignSharedSet(com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CampaignSharedSet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignSharedSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignSharedSets(com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignSharedSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignSharedSetServiceBlockingStub> {
    private CampaignSharedSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.CampaignSharedSet getCampaignSharedSet(com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignSharedSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse mutateCampaignSharedSets(com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignSharedSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignSharedSetServiceFutureStub> {
    private CampaignSharedSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.CampaignSharedSet> getCampaignSharedSet(
        com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignSharedSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse> mutateCampaignSharedSets(
        com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignSharedSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_SHARED_SET = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_SHARED_SETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignSharedSetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignSharedSetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_SHARED_SET:
          serviceImpl.getCampaignSharedSet((com.google.ads.googleads.v7.services.GetCampaignSharedSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.CampaignSharedSet>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_SHARED_SETS:
          serviceImpl.mutateCampaignSharedSets((com.google.ads.googleads.v7.services.MutateCampaignSharedSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateCampaignSharedSetsResponse>) responseObserver);
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

  private static abstract class CampaignSharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignSharedSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignSharedSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignSharedSetService");
    }
  }

  private static final class CampaignSharedSetServiceFileDescriptorSupplier
      extends CampaignSharedSetServiceBaseDescriptorSupplier {
    CampaignSharedSetServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignSharedSetServiceMethodDescriptorSupplier
      extends CampaignSharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignSharedSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignSharedSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignSharedSetServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignSharedSetMethod())
              .addMethod(getMutateCampaignSharedSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
