package com.example.sampleproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener, ViewPager.OnPageChangeListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView tabOne;
    private TextView tabTwo;
    private TextView tabThree;
    private ViewPager viewPagerImg;
    private CirclePageIndicator indicatorImg;
    private PagerImageAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the tabLayout
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        //Initializing getViewPager
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPagerImg = (ViewPager) findViewById(R.id.viewpager_img);
        indicatorImg = (CirclePageIndicator) findViewById(R.id.indicator_img);

        setDashboardPagerAdapter();
        tabLayout.setupWithViewPager(viewPager);
        createTabIcons();
        //Adding onTabSelectedListener to swipe views
        tabLayout.addOnTabSelectedListener(this);
        viewPager.addOnPageChangeListener(this);

        adapter = new PagerImageAdapter(this);

        viewPagerImg.setAdapter(adapter);
        indicatorImg.setViewPager(viewPagerImg);

    }

    private void setDashboardPagerAdapter() {
        //Creating our pager adapter
        DashboardPagerAdapter pagerAdapter = new DashboardPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }


    private void createTabIcons() {

        tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_tab, null);
        tabOne.setText("VIDEOS");
        tabOne.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_video, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_tab, null);
        tabTwo.setText("IMAGES");
        tabTwo.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_image, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_tab, null);
        tabThree.setText("MILESTONE");
        tabThree.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_milestone, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0:
                tabOne.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_video, 0, 0);
                tabLayout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_image, 0, 0);
                tabLayout.getTabAt(1).setCustomView(tabTwo);
                tabThree.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_milestone, 0, 0);
                tabLayout.getTabAt(2).setCustomView(tabThree);
                break;
            case 1:
                tabOne.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_video, 0, 0);
                tabLayout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_image, 0, 0);
                tabLayout.getTabAt(1).setCustomView(tabTwo);
                tabThree.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_milestone, 0, 0);
                tabLayout.getTabAt(2).setCustomView(tabThree);
                break;
            case 2:
                tabOne.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_video, 0, 0);
                tabLayout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_image, 0, 0);
                tabLayout.getTabAt(1).setCustomView(tabTwo);
                tabThree.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_milestone, 0, 0);
                tabLayout.getTabAt(2).setCustomView(tabThree);
                break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        switch (position) {
            case 0:
                tabOne.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_video, 0, 0);
                tabLayout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_image, 0, 0);
                tabLayout.getTabAt(1).setCustomView(tabTwo);
                tabThree.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_milestone, 0, 0);
                tabLayout.getTabAt(2).setCustomView(tabThree);
                break;
            case 1:
                tabOne.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_video, 0, 0);
                tabLayout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_image, 0, 0);
                tabLayout.getTabAt(1).setCustomView(tabTwo);
                tabThree.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_milestone, 0, 0);
                tabLayout.getTabAt(2).setCustomView(tabThree);
                break;
            case 2:
                tabOne.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_video, 0, 0);
                tabLayout.getTabAt(0).setCustomView(tabOne);
                tabTwo.setTextColor(ContextCompat.getColor(this, R.color.tabTextColor));
                tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_image, 0, 0);
                tabLayout.getTabAt(1).setCustomView(tabTwo);
                tabThree.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_select_milestone, 0, 0);
                tabLayout.getTabAt(2).setCustomView(tabThree);
                break;
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
