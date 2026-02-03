/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsub.v1;

import com.google.api.gax.retrying.RetrySettings;
import com.google.common.base.Preconditions;
import javax.annotation.Nullable;
import java.time.Duration;

/** Settings for hedging. */
public final class HedgingSettings {
  private final Duration totalTimeout;
  private final Duration initialRpcDeadline;
  private final double rpcHedgeMultiplier;
  private final Duration maxHedgeDelay;
  private final int maxAttempts;
  private final RetrySettings retrySettings;

  private HedgingSettings(Builder builder) {
    this.totalTimeout = builder.totalTimeout;
    this.initialRpcDeadline = builder.initialRpcDeadline;
    this.rpcHedgeMultiplier = builder.rpcHedgeMultiplier;
    this.maxHedgeDelay = builder.maxHedgeDelay;
    this.maxAttempts = builder.maxAttempts;
    this.retrySettings = builder.retrySettings;
  }

  /** Returns the total timeout for the hedged operation. */
  public Duration getTotalTimeout() {
    return totalTimeout;
  }

  /** Returns the initial deadline for the first RPC attempt. */
  public Duration getInitialRpcDeadline() {
    return initialRpcDeadline;
  }

  /** Returns the multiplier for increasing the deadline of subsequent hedge attempts. */
  public double getRpcHedgeMultiplier() {
    return rpcHedgeMultiplier;
  }

  /** Returns the maximum delay before scheduling the next hedge attempt. */
  public Duration getMaxHedgeDelay() {
    return maxHedgeDelay;
  }

  /** Returns the maximum number of attempts (including the initial attempt). */
  public int getMaxAttempts() {
    return maxAttempts;
  }

  /** Returns the retry settings used for each individual RPC attempt. */
  public RetrySettings getRetrySettings() {
    return retrySettings;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  /** Builder for {@link HedgingSettings}. */
  public static class Builder {
    private Duration totalTimeout = Duration.ofSeconds(600);
    private Duration initialRpcDeadline = Duration.ofSeconds(1);
    private double rpcHedgeMultiplier = 4.0;
    private Duration maxHedgeDelay = Duration.ZERO;
    private int maxAttempts = 2;
    private RetrySettings retrySettings;

    private Builder() {}

    private Builder(HedgingSettings settings) {
      this.totalTimeout = settings.totalTimeout;
      this.initialRpcDeadline = settings.initialRpcDeadline;
      this.rpcHedgeMultiplier = settings.rpcHedgeMultiplier;
      this.maxHedgeDelay = settings.maxHedgeDelay;
      this.maxAttempts = settings.maxAttempts;
      this.retrySettings = settings.retrySettings;
    }

    /**
     * Sets the total timeout for the entire hedged operation. This limits the total time
     * allowed for all attempts combined.
     *
     * Default: 600 seconds
     */
    public Builder setTotalTimeout(Duration totalTimeout) {
      this.totalTimeout = Preconditions.checkNotNull(totalTimeout);
      return this;
    }

    /**
     * Sets the initial deadline for the first RPC attempt.
     *
     * Default: 1 second
     */
    public Builder setInitialRpcDeadline(Duration initialRpcDeadline) {
      this.initialRpcDeadline = Preconditions.checkNotNull(initialRpcDeadline);
      return this;
    }

    /**
     * Sets the multiplier for increasing the deadline of subsequent hedge attempts.
     *
     * Default: 4.0
     */
    public Builder setRpcHedgeMultiplier(double rpcHedgeMultiplier) {
      this.rpcHedgeMultiplier = rpcHedgeMultiplier;
      return this;
    }

    /**
     * Sets the maximum delay before scheduling the next hedge attempt.
     *
     * Default: 0 (disabled)
     */
    public Builder setMaxHedgeDelay(Duration maxHedgeDelay) {
      this.maxHedgeDelay = Preconditions.checkNotNull(maxHedgeDelay);
      return this;
    }

    /**
     * Sets the maximum number of attempts (including the initial attempt).
     *
     * Default: 2
     */
    public Builder setMaxAttempts(int maxAttempts) {
      this.maxAttempts = maxAttempts;
      return this;
    }

    /**
     * Sets the retry settings used for each individual RPC attempt.
     */
    public Builder setRetrySettings(RetrySettings retrySettings) {
      this.retrySettings = Preconditions.checkNotNull(retrySettings);
      return this;
    }

    public HedgingSettings build() {
      Preconditions.checkNotNull(totalTimeout, "Total timeout must be set");
      Preconditions.checkNotNull(initialRpcDeadline, "Initial RPC deadline must be set");
      Preconditions.checkNotNull(maxHedgeDelay, "Max hedge delay must be set");
      Preconditions.checkArgument(maxAttempts > 1, "Max attempts must be greater than 1");
      Preconditions.checkArgument(maxAttempts <= 3, "Max attempts must be at most 3");

      return new HedgingSettings(this);
    }
  }
}
