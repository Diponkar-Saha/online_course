package com.pioneeralpha.amarischool.ui.forget_password;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class ForgetPasswordFragmentPageAdapter extends FragmentPagerAdapter {


    public ForgetPasswordFragmentPageAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ForgetPassEmailInputFragment();
            case 1:
                return new ForgetPassVarificationFragment();
            case 2:
                return new ForgetPassNewPassInputFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
