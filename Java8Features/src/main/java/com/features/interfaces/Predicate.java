
package com.features.interfaces;

import java.util.Function;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T param);
}
