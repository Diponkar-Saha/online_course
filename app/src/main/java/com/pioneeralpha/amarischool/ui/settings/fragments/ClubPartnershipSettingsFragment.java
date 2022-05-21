package com.pioneeralpha.amarischool.ui.settings.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pioneeralpha.amarischool.R;

public class ClubPartnershipSettingsFragment extends Fragment {

    public ClubPartnershipSettingsFragment() {
        // Required empty public constructor
    }

    public static ClubPartnershipSettingsFragment newInstance() {
        ClubPartnershipSettingsFragment fragment = new ClubPartnershipSettingsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_club_partnership_settings, container, false);
    }
}