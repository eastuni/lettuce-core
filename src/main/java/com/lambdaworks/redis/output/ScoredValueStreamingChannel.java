package com.lambdaworks.redis.output;

import com.lambdaworks.redis.ScoredValue;

/**
 * Streaming API for multiple Keys. You can implement this interface in order to receive a call to {@code onValue} on every
 * value.
 * 
 * @param <V> Value type.
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 3.0
 */
@FunctionalInterface
public interface ScoredValueStreamingChannel<V> {
    /**
     * Called on every incoming ScoredValue.
     * 
     * @param value the scored value
     */
    void onValue(ScoredValue<V> value);
}