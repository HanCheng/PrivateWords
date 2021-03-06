package com.hancheng.privatewords.collect;/*
 * Copyright (C) 2007 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** An ordering that compares objects according to a given order. */
final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
  final Map<T, Integer> rankMap;

  ExplicitOrdering(List<T> valuesInOrder) {
    this(buildRankMap(valuesInOrder));
  }

  ExplicitOrdering(Map<T, Integer> rankMap) {
    this.rankMap = rankMap;
  }

  @Override public int compare(T left, T right) {
    return rank(left) - rank(right); // safe because both are nonnegative
  }

  private int rank(T value) {
    Integer rank = rankMap.get(value);
    if (rank == null) {
      throw new IncomparableValueException(value);
    }
    return rank;
  }

  private static <T> Map<T, Integer> buildRankMap(
      List<T> valuesInOrder) {
    Map<T, Integer> map = new HashMap<T, Integer>();
    int rank = 0;
    for (T value : valuesInOrder) {
      map.put(value, rank++);
    }
    return map;
  }

  @Override public boolean equals(@Nullable Object object) {
    if (object instanceof ExplicitOrdering) {
      ExplicitOrdering<?> that = (ExplicitOrdering<?>) object;
      return this.rankMap.equals(that.rankMap);
    }
    return false;
  }

  @Override public int hashCode() {
    return rankMap.hashCode();
  }

  @Override public String toString() {
    return "Ordering.explicit(" + rankMap.keySet() + ")";
  }

  private static final long serialVersionUID = 0;
}
