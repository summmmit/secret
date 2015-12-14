package com.example.jetnixx.secret.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jetnixx.secret.fragments.AccountProfileFragment;
import com.example.jetnixx.secret.fragments.GeneralProfileFragment;

/**
 * Created by 1084760 on 2015/12/10.
 */
public class ViewPagerProfileAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumberOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerProfileAdapter(FragmentManager fm, CharSequence mTitles[], int mNumberOfTabs) {
        super(fm);

        this.Titles = mTitles;
        this.NumberOfTabs = mNumberOfTabs;
    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            GeneralProfileFragment generalProfileFragment = new GeneralProfileFragment();
            return generalProfileFragment;
        } else if (position == 1) {
            AccountProfileFragment accountProfileFragment = new AccountProfileFragment();
            return accountProfileFragment;
        }

        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip
    @Override
    public CharSequence getPageTitle(int position) {
        //return super.getPageTitle(position);
        return Titles[position];
    }


    @Override
    public int getCount() {
        //return 0;
        return NumberOfTabs;
    }
}
