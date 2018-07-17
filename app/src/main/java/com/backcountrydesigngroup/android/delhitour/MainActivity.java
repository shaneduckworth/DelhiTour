package com.backcountrydesigngroup.android.delhitour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the viewPager to allow user swiping between fragments
        ViewPager viewPagerInstance = (ViewPager) findViewById(R.id.viewpager);

        // Create the adapter that sets up the flow of fragments
        FragmentAdapter FragAdapter = new FragmentAdapter(getSupportFragmentManager());

        // Set the adapter on the viewPager
        viewPagerInstance.setAdapter(FragAdapter);

        // Add tab titles
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPagerInstance);

    }
}
