package com.pioneeralpha.amarischool.ui.dashboard.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.pioneeralpha.amarischool.databinding.FragmentForumsBinding;
import com.pioneeralpha.amarischool.databinding.FragmentOverviewBinding;

public class ForumsFragment extends Fragment {
    private FragmentForumsBinding mBinding;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public ForumsFragment() {
        // Required empty public constructor
    }

    public static ForumsFragment newInstance() {
        return new ForumsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentForumsBinding.inflate(inflater, container, false);

        tabLayout = mBinding.tabLayout;
        viewPager = mBinding.viewPager;
        tabLayout.addTab(tabLayout.newTab().setText("Forums"));
        tabLayout.addTab(tabLayout.newTab().setText("All Threads"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final MyAdapter adapter = new MyAdapter(getContext(),  ((AppCompatActivity) getActivity()).getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }
        });
        
        return mBinding.getRoot();
    }

    class MyAdapter extends FragmentPagerAdapter {
        Context context;
        int totalTabs;
        public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
            super(fm);
            context = c;
            this.totalTabs = totalTabs;
        }
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    ForumList forumlist = new ForumList();
                    return forumlist;
                case 1:
                    AllThreadsFragment allThreadsFragment = new AllThreadsFragment();
                    return allThreadsFragment;

                    default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return totalTabs;
        }
    }
}
