package com.pioneeralpha.amarischool.ui.settings.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentGeneralSettingsBinding;
import com.pioneeralpha.amarischool.databinding.FragmentHomeBinding;

public class GeneralSettingsFragment extends Fragment implements
        AdapterView.OnItemSelectedListener {
    private FragmentGeneralSettingsBinding mBinding;
    String[] lang = { "English(us)"};

    public GeneralSettingsFragment() {
        // Required empty public constructor
    }

    public static GeneralSettingsFragment newInstance() {
        GeneralSettingsFragment fragment = new GeneralSettingsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentGeneralSettingsBinding.inflate(inflater, container, false);


        mBinding.spinner.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,lang);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        mBinding.spinner.setAdapter(aa);

        // Inflate the layout for this fragment
        return mBinding.getRoot();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}