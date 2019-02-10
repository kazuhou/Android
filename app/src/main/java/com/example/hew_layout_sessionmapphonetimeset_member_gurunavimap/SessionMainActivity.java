package com.example.hew_layout_sessionmapphonetimeset_member_gurunavimap;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SessionMainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.session_main);

        tabLayout = (TabLayout)findViewById(R.id.session_tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.session_viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

//      ViewPagerAdapter.AddFragment
        adapter.AddFragment(new FragmentInProgress(),"進行中");
        adapter.AddFragment(new FragmentWatingForPayment(),"支払い待ち");
        adapter.AddFragment(new FragmentTheHistory(),"履歴");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}
