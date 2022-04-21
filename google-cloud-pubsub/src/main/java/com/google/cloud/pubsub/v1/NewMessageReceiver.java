/** This interface can be implemented by users of {@link Subscriber} to receive messages. */
public interface NewMessageReceiver {
  /**
   * Called when a message is received by the subscriber. The implementation must arrange for {@link
   * ReceivedMessage#ack()} or {@link ReceivedMessage#nack()} to be called after processing the
   * {@code message}.
   */
  void receiveMessage(final ReceivedMessage message);
}
