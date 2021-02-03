package com.example.appagriculture.fragment;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MainAdapter extends FragmentPagerAdapter {

    private Context context;
    private int totalTabs;

    public MainAdapter(@NonNull FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new InformationFragment();
                break;
            case 1:
                fragment=new ControlFragment();
                break;
            case 2:
                fragment=new CheckoutFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return this.totalTabs;
    }
}
