package com.example.sampleproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 13/6/17.
 */

public class DashboardPagerAdapter extends FragmentStatePagerAdapter {
    private String tabOwnerTitles[] = new String[]{"VIDEOS", "IMAGES", "MILESTONES"};

    public DashboardPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return tabOwnerTitles.length;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment currentFragment = null;
        switch (position) {
            case 0:
                currentFragment = new ItemFragment();
                break;
            case 1:
                currentFragment = new ItemFragment();
                break;
            case 2:
                currentFragment = new ItemFragment();
                break;
        }

        return currentFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabOwnerTitles[position];
    }
}
