package com.pbsi2.mytownvisit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                EconomyFragment tab1 = new EconomyFragment();
                return tab1;
            case 1:
                PeopleFragment tab2 = new PeopleFragment();
                return tab2;
            case 2:
                PublicExibitsFragment tab3 = new PublicExibitsFragment();
                return tab3;
            case 3:
                RestaurantsFragment tab4 = new RestaurantsFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}