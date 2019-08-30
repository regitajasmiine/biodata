package com.example.biodata;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class BiodataActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata_activity);

        initViews();

    }

    private void initViews() {
        // setting toolbar
        Toolbar toolbar1 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);

        // setting view pager
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        MainFragmentPagerAdapter mainFragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.addFragment(new AboutFragment(), getString(R.string.about));
        mainFragmentPagerAdapter.addFragment(new HobbyFragment(), getString(R.string.hobby));
        mainFragmentPagerAdapter.addFragment(new ContactFragment(), getString(R.string.contact));
        viewPager.setAdapter(mainFragmentPagerAdapter);
    }
}