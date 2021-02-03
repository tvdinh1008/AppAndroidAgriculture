package com.example.appagriculture.fragment;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class StartAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public StartAdapter(@NonNull FragmentManager fm,Context context, int totalTabs) {
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag=new LoginFragment();
                break;
            case 1:
                frag=new SignupFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
