package com.pioneeralpha.amarischool.ui.menu.subscription;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentSubscriptionDetailsBinding;
import com.pioneeralpha.amarischool.models.SubscriptionModel;
import com.pioneeralpha.amarischool.ui.menu.subscription.details.SubscribeUpdateCourseAdapter;
import com.pioneeralpha.amarischool.ui.menu.subscription.details.SubscriptionDetailsAdapter;
import com.pioneeralpha.amarischool.ui.menu.subscription.details.subscription.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class SubscriptionDetailsFragment extends Fragment implements SubscriptionDetailsAdapter.OnItemClickListener {

    private FragmentSubscriptionDetailsBinding mBinding;
    View view;
    SubscriptionDetailsAdapter adapter;
    SubscribeUpdateCourseAdapter subscribeUpdateCourseAdapter;
    SubscriptionAdapter subscriptionAdapter;
    List<SubscriptionModel> mySubscriptionModelModels = new ArrayList<>();







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentSubscriptionDetailsBinding.inflate(inflater, container, false);
        view =  mBinding.getRoot();
        ArrayList<String> sList = new ArrayList<String>();
        sList.add("Monthly");
        sList.add("Yearly");
        sList.add("Lifetime");


        //< get elements >

        ViewPagerAdapter adapter1 = new ViewPagerAdapter(requireActivity());
        mBinding.viewPager.setAdapter(adapter1);

        new TabLayoutMediator(mBinding.tabs, mBinding.viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(sList.get(position));
                    }
                }).attach();

        for (int i=0;i<3;i++){
            TextView textView = (TextView) LayoutInflater.from(requireContext()).inflate(R.layout.tab_title,null);
            mBinding.tabs.getTabAt(i).setCustomView(textView);
        }


        mySubscriptionModelModels.add(new SubscriptionModel("Adobe Photoshop 2021 Crash Course | Advance Photo Editing"));
        mySubscriptionModelModels.add(new SubscriptionModel("Adobe Photoshop 2021 Crash Course | Advance Photo Editing"));
        mySubscriptionModelModels.add(new SubscriptionModel("Adobe Photoshop 2021 Crash Course | Advance Photo Editing"));
        mySubscriptionModelModels.add(new SubscriptionModel("Adobe Photoshop 2021 Crash Course | Advance Photo Editing" ));

        adapter = new SubscriptionDetailsAdapter(getActivity(), view.getContext(), mySubscriptionModelModels,this);
        mBinding.alCourseRv.setHasFixedSize(true);
        mBinding.alCourseRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.alCourseRv.setAdapter(adapter);

        subscribeUpdateCourseAdapter = new SubscribeUpdateCourseAdapter(getActivity(), view.getContext(), mySubscriptionModelModels,this);
        mBinding.updateCourseRv.setHasFixedSize(true);
        mBinding.updateCourseRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.updateCourseRv.setAdapter(subscribeUpdateCourseAdapter);


        subscriptionAdapter = new SubscriptionAdapter(getActivity(), view.getContext(), mySubscriptionModelModels,this::onItemClick);
        mBinding.similarCourseRv.setHasFixedSize(true);
        mBinding.similarCourseRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.similarCourseRv.setAdapter(subscriptionAdapter);


        return view;
    }

    @Override
    public void onItemClick(int position) {

    }
}