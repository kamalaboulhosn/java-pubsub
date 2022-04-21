/**
 * Holds the parameters for <b>hedging</b> logic with jitter and exponential
 * backoff. Actual implementation of the logic is elsewhere.
 */
public class HedgingSettings {
  /**
   * TotalTimeout has ultimate control over how long the logic should keep trying the remote call
   * until it gives up completely. The higher the total timeout, the more retries can be attempted.
   * The default value is {@code Duration.ZERO}.
   */
  public Duration getTotalTimeout();

  /**
   * InitialHedgeDelay controls the delay before the first hedge. Subsequent retries will use this
   * value adjusted according to the RetryDelayMultiplier. The default value is {@code
   * Duration.ZERO}.
   */
  public Duration getInitialHedgeDelay();

  /**
   * RetryDelayMultiplier controls the change in retry delay. The retry delay of the previous call
   * is multiplied by the RetryDelayMultiplier to calculate the retry delay for the next call. The
   * default value is {@code 1.0}.
   */
  public double getHedgeDelayMultiplier();

  /**
   * MaxHedgeDelay puts a limit on the value of the retry delay, so that the RetryDelayMultiplier
   * can't increase the retry delay higher than this amount. The default value is {@code
   * Duration.ZERO}.
   */
  public Duration getMaxHedgeDelay();

  /**
   * MaxSimultaneousAttempts defines the maximum number of attempts to perform simultaneously. The default value is {@code 0}.
   * If this value is greater than 0, and the number of attempts reaches this limit, the logic will
   * not start another attempt if this number of attmepts is already in flight, even if the next hedge
   * delay has been reached. If one of the hedged requests returns while at this maximum and it was already time to start another,
   * then another attempt is started immediately.
   */
  public int getMaxSimultaneousAttempts();
}
