package com.earlcommunications.sacco;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.earlcommunications.sacco.FirstFragment;
import com.earlcommunications.sacco.SecondFragment;
import com.earlcommunications.sacco.ThirdFragment;

/**
 * Created by user on 1/12/2020.
 */

public class IntroAdapter extends FragmentPagerAdapter{

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
