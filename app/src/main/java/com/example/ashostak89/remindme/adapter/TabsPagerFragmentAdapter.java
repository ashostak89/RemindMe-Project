package com.example.ashostak89.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ashostak89.remindme.fragments.AbstractTabFragment;
import com.example.ashostak89.remindme.fragments.BirthdaysFragment;
import com.example.ashostak89.remindme.fragments.HistoryFragment;
import com.example.ashostak89.remindme.fragments.IdeasFragment;
import com.example.ashostak89.remindme.fragments.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashostak89 on 8/11/2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer,AbstractTabFragment> tabs;
   private Context context;
    public TabsPagerFragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context=context;
        initTabMap(context);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return   tabs.size();
    }

    private void initTabMap(Context context) {
        tabs=new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
