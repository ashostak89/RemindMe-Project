package com.example.ashostak89.remindme.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ashostak89.remindme.R;

/**
 * Created by ashostak89 on 8/11/2016.
 */
public class ExampleFragment extends Fragment {
    private final static int LAYAOUT= R.layout.example_fragment;
private View view;

    public static ExampleFragment getInstance() {
Bundle args=new Bundle();
        ExampleFragment fragment=new ExampleFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(LAYAOUT,container,false);
        return view;




    }
}
