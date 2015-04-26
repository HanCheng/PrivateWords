package com.hancheng.privatewords.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.hancheng.privatewords.R;


public class WelcomeActivity extends Activity {

    private static final long INITIAL_DELAY = 3000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView imageView = (ImageView) this.findViewById(R.id.welcome_screen);
        imageView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(WelcomeActivity.this, InstructionActivity.class);
                        startActivity(intent);
                    }
                }, INITIAL_DELAY);
    }
}
