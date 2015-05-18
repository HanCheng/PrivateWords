package com.hancheng.privatewords.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.hancheng.privatewords.R;

/**
 * Created by chan on 4/27/15.
 */
public class RobotoTextView extends TextView {

    public RobotoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RobotoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void setCustomFont(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.RobotoTextView);
        String customFont = typedArray.getString(R.)
    }

}
