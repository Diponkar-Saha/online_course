package com.pioneeralpha.amarischool.ui.settings;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class SettingsViewPagerAdapter extends FragmentStateAdapter {

    private final List<Fragment> settingsFragments = new ArrayList<>();
    private List<String> settingsTitles = new ArrayList<>();

    public SettingsViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return settingsFragments.get(position);
    }

    @Override
    public int getItemCount() {
        return settingsFragments.size();
    }

    public void addFragment(Fragment fragment) {//, String title) {
        settingsFragments.add(fragment);
//        settingsTitles.add(title);
    }
}
