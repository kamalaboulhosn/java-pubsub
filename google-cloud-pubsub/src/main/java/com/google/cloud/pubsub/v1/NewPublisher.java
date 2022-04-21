/**
 * A Cloud Pub/Sub <a href="https://cloud.google.com/pubsub/docs/publisher">publisher</a>, that is
 * associated with a specific topic at creation.
 *
 * <p>A {@link Publisher} provides built-in capabilities to automatically handle batching of
 * messages, controlling memory utilization, and retrying API calls on transient errors.
 *
 * <p>With customizable options that control:
 *
 * <ul>
 *   <li>Message batching: such as number of messages or max batch byte size.
 *   <li>Retries: such as the maximum duration of retries for a failing batch of messages.
 * </ul>
 *
 * <p>{@link Publisher} will use the credentials set on the channel, which uses application default
 * credentials through {@link GoogleCredentials#getApplicationDefault} by default.
 */
public class Publisher {
  /**
   * Constructs a new {@link Builder} using the given topic.
   *
   * <p>Example of creating a {@code Publisher}.
   *
   * <pre>{@code
   * String topic = "projects/my_project/topics/my_topic";
   * Publisher publisher = Publisher.newBuilder(topic).build();
   * try {
   *   // ...
   * } finally {
   *   // When finished with the publisher, make sure to shutdown to free up resources.
   *   publisher.shutdown();
   *   publisher.awaitTermination(1, TimeUnit.MINUTES);
   * }
   * }</pre>
   */
  public static final class Builder {
    /**
     * {@code ChannelProvider} to use to create Channels, which must point at Cloud Pub/Sub
     * endpoint.
     *
     * <p>For performance, this client benefits from having multiple underlying connections. See
     * {@link com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder#setPoolSize(int)}.
     */
    public Builder setChannelProvider(TransportChannelProvider channelProvider) {
      return this;
    }

    /** {@code CredentialsProvider} to use to create Credentials to authenticate calls. */
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      return this;
    }

    // Batching options
    public Builder setBatchingSettings(BatchingSettings batchingSettings) {
      return this;
    }

    // Batching options
    public Builder setFlowControlSettings(FlowControlSettings flowControlSettings) {
      return this;
    }

    /** Configures the Publisher's hedging parameters. */
    public Builder setHedgingSettings(HedgingSettings hedgingSettings) {
      return this;
    }

    /** Sets the message ordering option. */
    @BetaApi("Ordering is not yet fully supported and requires special project enablements.")
    public Builder setEnableMessageOrdering(boolean enableMessageOrdering) {
      this.enableMessageOrdering = enableMessageOrdering;
      return this;
    }

    /** Gives the ability to set a custom executor to be used by the library. */
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      return this;
    }

    /** Gives the ability to override the gRPC endpoint. */
    public Builder setEndpoint(String endpoint) {
      return this;
    }
  }

  /**
   * Schedules the publishing of a message. The publishing of the message may occur immediately or
   * be delayed based on the publisher batching options.
   *
   * <p>This method blocks in the downcall if using LimitExceededBehavior.Block in the flow control
   * settings.
   *
   * <p>Example of publishing a message.
   *
   * <pre>{@code
   * String message = "my_message";
   * ByteString data = ByteString.copyFromUtf8(message);
   * PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();
   * ApiFuture<String> messageIdFuture = publisher.publish(pubsubMessage);
   * ApiFutures.addCallback(messageIdFuture, new ApiFutureCallback<String>() {
   *   public void onSuccess(String messageId) {
   *     System.out.println("published with message id: " + messageId);
   *   }
   *
   *   public void onFailure(Throwable t) {
   *     System.out.println("failed to publish: " + t);
   *   }
   * }, MoreExecutors.directExecutor());
   * }</pre>
   *
   * @param message the message to publish.
   * @return the message ID wrapped in a future.
   */
  public ApiFuture<String> publish(PubsubMessage message) {
  }

  /**
   * There may be non-recoverable problems with a request for an ordering key. In that case, all
   * subsequent requests will fail until this method is called. If the key is not currently paused,
   * calling this method will be a no-op.
   *
   * @param key The key for which to resume publishing.
   */
  public void resumePublish(String key) {
  }

  /**
   * Immediately sends all outstanding messages. If messages have the same
   * ordering key, the publishes may be done sequentially and not in parallel
   * so that order is maintained. Returns immediately, so the individual
   * ApiFutures returned from {@code publish} calls should be used to track when
   * all messages have completed sending.
   */
  public void flush() {
  }

  /**
   * Stop accepting new publishes. If {@code flushOutstandingMessages} is true,
   * then send messages that were alreaady outstanding. Returns a future that
   * completes once both of these are complete.
   */
  public ApiFuture<> shutdown(bool flushOutstandingMessages) {

  }
}
