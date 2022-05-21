package com.pioneeralpha.amarischool.ui.settings.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.pioneeralpha.amarischool.R;

import java.util.ArrayList;
import java.util.Locale;

public class PaymentSettingsFragment extends Fragment {
    View view;
    ArrayList<String> countryChoice = new ArrayList<String>();

    public PaymentSettingsFragment() {
        // Required empty public constructor
    }

    public static PaymentSettingsFragment newInstance() {
        PaymentSettingsFragment fragment = new PaymentSettingsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_payment_settings, container, false);

        String[] isoCountryCodes = Locale.getISOCountries();
        for (String countryCode : isoCountryCodes) {
            Locale locale = new Locale("", countryCode);
            countryChoice.add(locale.getDisplayCountry());
        }
        AutoCompleteTextView activityEmailsAutoCompleteTextView = (AutoCompleteTextView) view.findViewById(R.id.countryAutoCompleteTextView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity(),
                R.layout.item_spinner, countryChoice);;
        activityEmailsAutoCompleteTextView.setAdapter(adapter);

        return view;
    }
}