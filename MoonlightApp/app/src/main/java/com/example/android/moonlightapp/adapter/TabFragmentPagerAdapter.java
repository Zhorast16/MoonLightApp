package com.example.android.moonlightapp.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.moonlightapp.fragment.tab1Fragment;
import com.example.android.moonlightapp.fragment.tab2Fragment;

/**
 * Created by Ariyan on 11/28/2017.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[] title = new String[]{
      "Menu", "Paket"
    };

    public TabFragmentPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new tab1Fragment();
                break;
            case 1:
                fragment = new tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
