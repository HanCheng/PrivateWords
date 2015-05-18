package com.hancheng.privatewords.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import com.hancheng.privatewords.fragments.ResultsListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chan on 4/29/15.
 */
public class ResultsFragmentPagerAdapter extends FragmentPagerAdapter {
    public static final int FRAGMENT_COUNT = 3;

    private SparseArray<ResultsListFragment> mListFragments;
    private final List<String> mTitles = new ArrayList<>(FRAGMENT_COUNT);

    public ResultsFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        mListFragments = new SparseArray<>(FRAGMENT_COUNT);
    }

    @Override
    public Fragment getItem(int position) {
        ResultsListFragment fragment = new ResultsListFragment();
        mListFragments.append(position, fragment);
        return fragment;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
