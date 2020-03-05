package com.example.themoviedbapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.themoviedbapplication.R;
import com.example.themoviedbapplication.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout_main);
        viewPager = (ViewPager)findViewById(R.id.view_page_main);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new MovieFragment(),"Movie");
        viewPagerAdapter.addFragment(new TVShowsFragment(),"TV Shows");
        this.viewPager.setAdapter(viewPagerAdapter);
    }
}
