package com.hancheng.privatewords.collect;


import com.hancheng.privatewords.util.Function;

import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kurry Tran Email: ktran@tripadvisor.com Date: 6/2/14
 */
public final class Maps {
    private Maps() {}
    private enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY {
            @Override
            @Nullable
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @Override
            @Nullable
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }
    @SuppressWarnings("unchecked")
    static <K> Function<Map.Entry<K, ?>, K> keyFunction() {
        return (Function) EntryFunction.KEY;
    }

    public static <V, K> Map<V, K> invert(Map<K, V> map) {
        Map<V, K> invertedMap = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }
}
