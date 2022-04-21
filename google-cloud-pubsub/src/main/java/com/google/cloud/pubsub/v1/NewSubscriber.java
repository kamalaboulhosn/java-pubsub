/**
 * A Cloud Pub/Sub <a href="https://cloud.google.com/pubsub/docs/subscriber">subscriber</a> that is
 * associated with a specific subscription at creation.
 *
 * <p>A {@link Subscriber} allows you to provide an implementation of a {@link MessageReceiver
 * receiver} to which messages are going to be delivered as soon as they are received by the
 * subscriber. The delivered messages then can be {@link AckReplyConsumer#ack() acked} or {@link
 * AckReplyConsumer#nack() nacked} at will as they get processed by the receiver. Nacking a messages
 * implies a later redelivery of such message.
 *
 * <p>The subscriber handles the ack management, by automatically extending the ack deadline while
 * the message is being processed, to then issue the ack or nack of such message when the processing
 * is done (see {@link Builder#setMaxAckExtensionPeriod(Duration)}). <strong>Note:</strong> message
 * redelivery is still possible.
 *
 * <p>It also provides customizable options that control:
 *
 * <ul>
 *   <li>Ack deadline extension: such as the amount of time ahead to trigger the extension of
 *       message acknowledgement expiration.
 *   <li>Flow control: such as the maximum outstanding messages or maximum outstanding bytes to keep
 *       in memory before the receiver either ack or nack them.
 * </ul>
 *
 * <p>{@link Subscriber} will use the credentials set on the channel, which uses application default
 * credentials through {@link GoogleCredentials#getApplicationDefault} by default.
 *
 * <p>{@code Subscriber} is implemented using <a
 * href="http://google.github.io/guava/releases/snapshot/api/docs/com/google/common/util/concurrent/Service.html">Guava's
 * Service</a> and provides the same methods. See <a
 * href="https://github.com/google/guava/wiki/ServiceExplained">Guava documentation</a> for more
 * details.
 */
public class Subscriber {
  enum OutstandingMessageAction {
    // Immediately nack any messages still outstanding
    NACK,
    // Stop tracking messages outstanding and do nothing with them
    DROP,
    // Deliver messages to the callback and wait for them to be processed
    DELIVER,
  };

  public static final class Builder {
    /**
     * {@code ChannelProvider} to use to create Channels, which must point at Cloud Pub/Sub
     * endpoint.
     *
     * <p>For performance, this client benefits from having multiple channels open at once. Users
     * are encouraged to provide instances of {@code ChannelProvider} that creates new channels
     * instead of returning pre-initialized ones.
     */
    public Builder setChannelProvider(TransportChannelProvider channelProvider) {
      return this;
    }

    /**
     * Sets the flow control settings. Flow control settings apply per
     * underlying stream.
     *
     * <p>In the example below, the {@link Subscriber} will make sure that
     *
     * <ul>
     *   <li>there are at most ten thousand outstanding messages, and
     *   <li>the combined size of outstanding messages does not exceed 1GB.
     * </ul>
     *
     * "Outstanding messages" here means the messages that have already been given to {@link
     * MessageReceiver} but not yet {@code acked()} or {@code nacked()}.
     *
     * <pre>{@code
     * FlowControlSettings flowControlSettings =
     *  FlowControlSettings.newBuilder()
     *      .setMaxOutstandingElementCount(10_000L)
     *      .setMaxOutstandingRequestBytes(1_000_000_000L)
     *      .build();
     * Subscriber subscriber =
     *     Subscriber.newBuilder(subscriptionName, receiver)
     *         .setFlowControlSettings(flowControlSettings)
     *         .build();
     * }</pre>
     */
    public Builder setFlowControlSettings(FlowControlSettings flowControlSettings) {
      return this;
    }

    /**
     * Sets the ack extension settings.
     */
    public Builder setAckExtensionsSettings(AckExtensionSettings ackExtensionSettings) {
      return this;
    }

    /**
     * Sets the number of StreamingPull streams to pull messages from the subscription. Defaults to
     * one.
     */
    public Builder setParallelStreamCount(int parallelStreamCount) {
      return this;
    }

    /** Gives the ability to override the gRPC endpoint. */
    public Builder setEndpoint(String endpoint) {
      return this;
    }

    /**
     * Gives the ability to set a custom executor. {@link ExecutorProvider#getExecutor()} will be
     * called {@link Builder#setParallelStreamCount} times.
     */
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      return this;
    }

    /**
     * Gives the ability to set a custom executor for managing lease extensions. If none is provided
     * a shared one will be used by all {@link Subscriber} instances.
     */
    // DO WE NEED THIS? Maybe just get rid of it and use ExecutorProvider?
    public Builder setSystemExecutorProvider(ExecutorProvider executorProvider) {
      return this;
    }

    /** {@code CredentialsProvider} to use to create Credentials to authenticate calls. */
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      return this;
    }

    /** NewMessageReceiver to process messages when using streaming pull. */
    public Builder setMessageReceiver(NewMessageReceiver messageReceiver) {
      return this;
    }

    /** ExceptionProcessor to process non-fatal exceptions. */
    public Builder setExceptionProcessor(NewExceptionProcessor exceptionProcessor) {
      return this;
    }
  }

  /**
   * Constructs a new {@link Builder}.
   *
   * @param subscription Cloud Pub/Sub subscription to bind the subscriber to
   */
  public static Builder newBuilder(ProjectSubscriptionName subscription) {
  }

  /**
   * Initiates the startup of streaming pull. Returns a future that completes
   * when streaming pulls stop for any reason.
   */
  @Override
  public ApiFuture<> start() {
  }

  /**
   * Stops streaming pull requests. {@code outstandingMessageAction} indicates
   * what should be done with messages in the client. Returns a future that
   * completes once all actions have completed.
   */
  @Override
  public ApiFuture<> stop(OutstandingMessageAction outstandingMessageAction) {
  }

  /**
   * Pull up to {@code maxMessages} messages using the unary pull operation.
   * Returns a future that is fulfilled with the messages pulled. These messages
   * have their deadlines extended and are handled just like messages recieved
   * with streaming pull. Returns an error if {@code start} has been called on
   * the {@code Subscriber}.
   */
  public ApiFuture<List<ReceivedMessage>> pull(int maxMessages) {
  }

  /**
   * Acknowledge a list of messages via their {@code ackIds} that were retrieved
   * via a call to {@code ReceivedMessage.release}.
   */
  public void ack(List<String> ackIds) {
  }

  /**
   * Nack a list of messages via their {@code ackIds} that were retrieved
   * via a call to {@code ReceivedMessage.release}.
   */
  public void nack(List<String> ackIds) {
  }

  /**
   * Acknowledge a list of messages via their {@code ackIds} that were retrieved
   * via a call to {@code ReceivedMessage.release}. Returns a future that
   * completes with a {@code Map} from the {@code ackId} to the server's
   * {@code AckResponse} for that {@code ackId}.
   */
  public ApiFuture<Map<string,AckResponse>> ack(List<String> ackIds) {
  }

  /**
   * Nack a list of messages via their {@code ackIds} that were retrieved
   * via a call to {@code ReceivedMessage.release}. Returns a future that
   * completes with a {@code Map} from the {@code ackId} to the server's
   * {@code AckResponse} for that {@code ackId}.
   */
  public ApiFuture<Map<string,AckResponse>> nack(List<String> ackIds) {
  }
}
