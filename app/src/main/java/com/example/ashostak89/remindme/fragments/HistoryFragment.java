package com.example.ashostak89.remindme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ashostak89.remindme.R;

/**
 * Created by ashostak89 on 8/11/2016.
 */
public class HistoryFragment extends AbstractTabFragment {
    private final static int LAYAOUT= R.layout.example_fragment;


    public void setContext(Context context) {
        this.context = context;
    }

    public static HistoryFragment getInstance(Context context) {
Bundle args=new Bundle();
        HistoryFragment fragment=new HistoryFragment();
        fragment.setArguments(args);
        fragment.context=context;
        fragment.setTitle(context.getString(R.string.tab_name_history));
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(LAYAOUT,container,false);
        return view;




    }
}
