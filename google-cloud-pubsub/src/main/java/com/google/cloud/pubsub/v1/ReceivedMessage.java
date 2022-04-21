/**
 * A message that has been received by a Cloud Pub/Sub subscriber.
 */
public Received Message {
  /**
   * Returns the {@code PubsubMessage} that was received.
   */
  public PubsubMessage getMessage() {}

  /**
   * Acknowledge the message. Throws an {@code IllegalStateException} if the
   * message has been released.
   */
  public void ack() throws IllegalStateException {}

  /**
   * Acknowledge the message and returns a future that completes with the
   * server's response. Throws an {@code IllegalStateException} if the
   * message has been released.
   */
  public ApiFuture<AckResponse> ackWithResponse() throws IllegalStateException {}

  /**
   * Nack the message. Throws an {@code IllegalStateException} if the message
   * has been released.
   */
  public void nack() throws IllegalStateException {}

  /**
   * Nacks the message and returns a future that completes with the
   * server's response. Throws an {@code IllegalStateException} if the
   * message has been released.
   */
  public ApiFuture<AckResponse> nackWithResponse() throws IllegalStateException {}

  /**
   * Stops the tracking of the message's lifetime and auto extension of
   * the ack deadline. Once called, ack and nack no longer function. Returns
   * the ackID for the message. Throws an {@code IllegalStateException} if
   * the message has alread been released.
   */
  public String release() throws IllegalStateException {}

  /**
   * Returns the number of delivery attmepts, if available. This is only
   * available for subscriptions that have a dead letter topic attached.
   * Throws an {@code IllegalStateException} if the message does not have
   * an available delivery count.
   */
  public int deliveryCount() throws IllegalStateException {}
 }
