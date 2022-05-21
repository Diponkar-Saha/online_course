package com.pioneeralpha.amarischool.ui.settings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.ActivitySettingsBinding;
import com.pioneeralpha.amarischool.ui.settings.fragments.CalendarSyncSettingsFragment;
import com.pioneeralpha.amarischool.ui.settings.fragments.ClubPartnershipSettingsFragment;
import com.pioneeralpha.amarischool.ui.settings.fragments.GeneralSettingsFragment;
import com.pioneeralpha.amarischool.ui.settings.fragments.NotificationSettingsFragment;
import com.pioneeralpha.amarischool.ui.settings.fragments.PaymentSettingsFragment;
import com.pioneeralpha.amarischool.ui.settings.fragments.PermissionSettingsFragment;

import java.security.Permission;

public class SettingsActivity extends AppCompatActivity {

    private ActivitySettingsBinding settingsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_settings);
        settingsBinding = ActivitySettingsBinding.inflate(getLayoutInflater());
        View view = settingsBinding.getRoot();
        setContentView(view);

        settingsBinding.toolbar.setTitle("Settings");
        setSupportActionBar(settingsBinding.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        final String[] tabTitles = {
                "General",
                "Notification",
                "Permission",
                "Payment",
                "Calendar Sync",
                "Club Partnership"
        };

        TabLayout settingsTabLayout = settingsBinding.settingsTabLayout;

        for (String title : tabTitles) {
            settingsTabLayout.addTab(settingsTabLayout.newTab().setText(title));
        }

        SettingsViewPagerAdapter viewPagerAdapter = new SettingsViewPagerAdapter(this);
        viewPagerAdapter.addFragment(GeneralSettingsFragment.newInstance());
        viewPagerAdapter.addFragment(NotificationSettingsFragment.newInstance());
        viewPagerAdapter.addFragment(PermissionSettingsFragment.newInstance());
        viewPagerAdapter.addFragment(PaymentSettingsFragment.newInstance());
        viewPagerAdapter.addFragment(CalendarSyncSettingsFragment.newInstance());
        viewPagerAdapter.addFragment(ClubPartnershipSettingsFragment.newInstance());

        ViewPager2 settingsViewPager = settingsBinding.settingsViewPager;
        settingsViewPager.setAdapter(viewPagerAdapter);

        new TabLayoutMediator(
                settingsTabLayout,
                settingsViewPager,
                ((tab, position) -> tab.setText(tabTitles[position]))
        ).attach();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        // return true so that the menu pop up is opened
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_notification) {
            Toast.makeText(this, "notification clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}