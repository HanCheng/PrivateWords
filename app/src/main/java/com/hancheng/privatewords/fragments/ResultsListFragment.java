package com.hancheng.privatewords.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.hancheng.privatewords.R;
import com.hancheng.privatewords.adapters.ContentResultsAdapter;

/**
 * Created by chan on 4/29/15.
 */
public class ResultsListFragment extends Fragment {

    private View mErrorView;
    private ListView mListView;
    private View mPaddingHeaderView;
    private ContentResultsAdapter mAdapter;

    public static ResultsListFragment getInstance() {
        ResultsListFragment resultsListFragment = new ResultsListFragment();
        Bundle args = new Bundle();
        resultsListFragment.setArguments(args);
        return resultsListFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results_list_view, container, false);
        mListView = (ListView) view.findViewById(R.id.results_list);
        mErrorView = view.findViewById(R.id.error_view);
        mPaddingHeaderView = inflater.inflate(R.layout.padding_header, container, false);
        mAdapter = new ContentResultsAdapter(getActivity(), );
        mListView.addHeaderView(mPaddingHeaderView);
        mListView.setAdapter(mAdapter);
        mListView.removeHeaderView(mPaddingHeaderView);
        return view;
    }

    public void notifyDataSetChanged() {

    }

}
