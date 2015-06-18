package com.hancheng.privatewords.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.hancheng.privatewords.R;
import com.hancheng.privatewords.adapters.ResultsFragmentPagerAdapter;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

public class PrivateWordsResultsActivity extends FragmentActivity {

    private ResultsFragmentPagerAdapter mResultsFragmentPagerAdapter;
    private View mRootView;
    private PagerSlidingTabStrip mResultsPagerSlidingTabStrip;
    private ViewPager mResultsViewPager;

    private int currentColor = 0xFF666666;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_words_results);

        mRootView = findViewById(R.id.results_root_view);
        mResultsPagerSlidingTabStrip = (PagerSlidingTabStrip) mRootView.findViewById(R.id.pager_tabs);
        mResultsViewPager = (ViewPager) mRootView.findViewById(R.id.pager);
        List<String> defaultInitialTitles = Arrays.asList(
                format("%s", getString(R.string.new_posted).toUpperCase()),
                format("%s", getString(R.string.most_liked).toUpperCase()),
                format("%s", getString(R.string.most_posted).toUpperCase())
        );
        mResultsFragmentPagerAdapter = new ResultsFragmentPagerAdapter(getSupportFragmentManager());
        mResultsFragmentPagerAdapter.setTitles(defaultInitialTitles);
        mResultsViewPager.setAdapter(mResultsFragmentPagerAdapter);
        mResultsPagerSlidingTabStrip.setViewPager(mResultsViewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
