package com.pioneeralpha.amarischool.ui.menu.subscription.details.subscription;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity)
    {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return  new SubsPageOneFragment();
            case 1:
                return  new SubsPageTweFragment();
            default:
                return  new SubsPageThirdFragment();
        }
    }
    @Override
    public int getItemCount() {return 3; }
}
