public AckExtensionSettings {
  public static final class Builder {
    /**
     * Set the maximum period a message ack deadline will be extended. Defaults to one hour.
     *
     * <p>It is recommended to set this value to a reasonable upper bound of the subscriber time to
     * process any message. This maximum period avoids messages to be <i>locked</i> by a subscriber
     * in cases when the ack reply is lost.
     *
     * <p>A zero duration effectively disables auto deadline extensions.
     */
    public Builder setMaxAckExtensionPeriod(Duration maxAckExtensionPeriod) {
      return this;
    }

    /**
     * Set the upper bound for a single mod ack extention period.
     *
     * <p>The ack deadline will continue to be extended by up to this duration until
     * MaxAckExtensionPeriod is reached. Setting MaxDurationPerAckExtension bounds the maximum
     * amount of time before a mesage re-delivery in the event the Subscriber fails to extend the
     * deadline.
     *
     * <p>MaxDurationPerAckExtension configuration can be disabled by specifying a zero duration.
     */
    public Builder setMaxDurationPerAckExtension(Duration maxDurationPerAckExtension) {
      return this;
    }

    /**
     * Set the lower bound for a single mod ack extention period.
     *
     * <p>The ack deadline will continue to be extended by up to this duration until
     * MinAckExtensionPeriod is reached. Setting MinDurationPerAckExtension bounds the minimum
     * amount of time before a mesage re-delivery in the event the Subscriber fails to extend the
     * deadline.
     *
     * <p>MinDurationPerAckExtension configuration can be disabled by specifying a zero duration.
     */
    public Builder setMinDurationPerAckExtension(Duration minDurationPerAckExtension) {
      return this;
    }
  }
}
