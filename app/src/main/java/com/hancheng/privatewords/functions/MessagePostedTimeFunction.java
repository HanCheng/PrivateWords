package com.hancheng.privatewords.functions;

import com.hancheng.privatewords.models.PrivateMessage;
import com.hancheng.privatewords.util.Function;

import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

/**
 * Created by ChengHan on 5/18/15.
 */
public class MessagePostedTimeFunction implements Function<PrivateMessage, DateTime> {
    @Nullable
    @Override
    public DateTime apply(@Nullable PrivateMessage input) {
        return input == null ? null : input.getSentTime();
    }
}
