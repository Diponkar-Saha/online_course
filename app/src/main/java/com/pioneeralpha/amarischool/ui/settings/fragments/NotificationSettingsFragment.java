package com.pioneeralpha.amarischool.ui.settings.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.pioneeralpha.amarischool.R;

public class NotificationSettingsFragment extends Fragment {
    View view;
    String[] activityEmailsChoice ={"As soon as possible","Once every 10 mins","Once every hour","Once every 8 hour","Daily","Off"};
    public NotificationSettingsFragment() {
        // Required empty public constructor
    }

    public static NotificationSettingsFragment newInstance() {
        NotificationSettingsFragment fragment = new NotificationSettingsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_notification_settings, container, false);

        AutoCompleteTextView activityEmailsAutoCompleteTextView = (AutoCompleteTextView) view.findViewById(R.id.activityEmailsAutoCompleteTextView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity(),
                R.layout.item_spinner, activityEmailsChoice);;
        activityEmailsAutoCompleteTextView.setAdapter(adapter);


        TextView textView = view.findViewById(R.id.text);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        return view;
    }
}