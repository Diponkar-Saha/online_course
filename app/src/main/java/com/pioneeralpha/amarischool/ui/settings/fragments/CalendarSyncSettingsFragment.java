package com.pioneeralpha.amarischool.ui.settings.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentCalendarSyncSettingsBinding;
import com.pioneeralpha.amarischool.databinding.FragmentHomeBinding;

public class CalendarSyncSettingsFragment extends Fragment {

    private FragmentCalendarSyncSettingsBinding mBinding;

    public CalendarSyncSettingsFragment() {
        // Required empty public constructor
    }

    public static CalendarSyncSettingsFragment newInstance() {
        return new CalendarSyncSettingsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentCalendarSyncSettingsBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

}