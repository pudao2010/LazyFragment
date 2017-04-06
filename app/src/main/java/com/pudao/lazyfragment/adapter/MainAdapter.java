package com.pudao.lazyfragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import com.pudao.lazyfragment.fragment.FragmentA;
import com.pudao.lazyfragment.fragment.FragmentB;
import com.pudao.lazyfragment.fragment.FragmentC;
import com.pudao.lazyfragment.fragment.FragmentD;

/**
 * Created by pucheng on 2017/4/6.
 */

public class MainAdapter extends FragmentPagerAdapter{

    private SparseArray<Fragment> mFragments;

    public MainAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new SparseArray<>();
        mFragments.put(0, new FragmentA());
        mFragments.put(1, new FragmentB());
        mFragments.put(2, new FragmentC());
        mFragments.put(3, new FragmentD());
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
