package com.hancheng.privatewords.functions;

import com.hancheng.privatewords.models.PrivateMessage;
import com.hancheng.privatewords.util.Function;

import org.jetbrains.annotations.Nullable;

/**
 * Created by ChengHan on 5/18/15.
 */
public class MessagePostedNumberFunction implements Function<PrivateMessage, Integer> {
    @Nullable
    @Override
    public Integer apply(@Nullable PrivateMessage input) {
        return input == null ? null : input.getPostedNumber();
    }
}
