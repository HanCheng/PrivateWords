package com.hancheng.privatewords.activities;

import android.app.Activity;
import android.os.Bundle;

import com.hancheng.privatewords.R;
import com.hancheng.privatewords.adapters.ResultsFragmentPagerAdapter;

public class PrivateWordsResultsActivity extends Activity {

    private ResultsFragmentPagerAdapter mResultsFragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_words_results);
    }
}
