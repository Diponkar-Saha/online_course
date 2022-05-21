package com.pioneeralpha.amarischool.ui.menu.subscription;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentSubscriptionBinding;
import com.pioneeralpha.amarischool.models.SubscriptionModel;

import java.util.ArrayList;
import java.util.List;


public class SubscriptionFragment extends Fragment implements SubscriptionAdapter.OnItemClickListener {
    private FragmentSubscriptionBinding mBinding;
    View view;
    SubscriptionAdapter adapter;
    List<SubscriptionModel> mySubscriptionModelModels = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentSubscriptionBinding.inflate(inflater, container, false);
        view =  mBinding.getRoot();


        mySubscriptionModelModels.add(new SubscriptionModel("Introduction to data structure"));
        mySubscriptionModelModels.add(new SubscriptionModel("Machine Learning"));
        mySubscriptionModelModels.add(new SubscriptionModel("Machine Learning"));
        mySubscriptionModelModels.add(new SubscriptionModel("Design" ));

        adapter = new SubscriptionAdapter(getActivity(), view.getContext(), mySubscriptionModelModels,this);
        mBinding.subscriptionRv.setHasFixedSize(true);
        mBinding.subscriptionRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.subscriptionRv.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(int position) {
        changeFragment(new SubscriptionDetailsFragment());
    }
    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}