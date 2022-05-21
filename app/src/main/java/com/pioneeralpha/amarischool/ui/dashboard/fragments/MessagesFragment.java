package com.pioneeralpha.amarischool.ui.dashboard.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.pioneeralpha.amarischool.databinding.FragmentMessagesBinding;
import com.pioneeralpha.amarischool.databinding.FragmentOverviewBinding;

public class MessagesFragment extends Fragment {
    private FragmentMessagesBinding mBinding;

    public MessagesFragment() {
        // Required empty public constructor
    }

    public static MessagesFragment newInstance() {
        return new MessagesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentMessagesBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
