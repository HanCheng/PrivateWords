package com.hancheng.privatewords.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hancheng.privatewords.R;

public class InstructionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        // TODO : automatic login for user, each user should have unique user id for each device
        this.findViewById(R.id.click_to_enter_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //TODO: after finishing the server, this should be automatic login for user
                Intent intent = new Intent(InstructionActivity.this, PrivateWordsResultsActivity.class);
                startActivity(intent);
            }
        });
    }
}
