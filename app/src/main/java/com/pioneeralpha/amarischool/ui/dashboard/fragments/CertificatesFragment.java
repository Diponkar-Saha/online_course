package com.pioneeralpha.amarischool.ui.dashboard.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.pioneeralpha.amarischool.databinding.FragmentCertificatesBinding;
import com.pioneeralpha.amarischool.databinding.FragmentOverviewBinding;

public class CertificatesFragment extends Fragment {
    private FragmentCertificatesBinding mBinding;

    public CertificatesFragment() {
        // Required empty public constructor
    }

    public static CertificatesFragment newInstance() {
        return new CertificatesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentCertificatesBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
