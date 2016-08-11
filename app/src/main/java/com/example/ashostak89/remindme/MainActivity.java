package com.example.ashostak89.remindme;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.ashostak89.remindme.adapter.TabsPagerFragmentAdapter;

public class MainActivity extends AppCompatActivity{
     final static int ROOT_LAYAOUT=R.layout.activity_main;


    DrawerLayout drawerLayout;
    Toolbar toolbar;

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppDefult);
        super.onCreate(savedInstanceState);
        setContentView(ROOT_LAYAOUT);
        initToolbar();
        initNavigationView();
        initTabLayout();
    }

    private void initToolbar() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {
        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,
                                                                    R.string.navigation_item_open,
                                                                     R.string.navigation_item_close);

        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView= (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                     @Override
                        public boolean onNavigationItemSelected(MenuItem menuItem) {
                                                 drawerLayout.closeDrawers();
                         switch (menuItem.getItemId()){
                             case R.id.menu_item_notification:
                                 showNotificationTab();
                                 break;
                         }
                         return true;
                                                             }
                                                         }
        );
    }

    private void initTabLayout() {
        viewPager= (ViewPager) findViewById(R.id.viewpager);
        TabsPagerFragmentAdapter adapter=new TabsPagerFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void showNotificationTab(){
        viewPager.setCurrentItem(Constans.TAB_TWO);
    }
}
