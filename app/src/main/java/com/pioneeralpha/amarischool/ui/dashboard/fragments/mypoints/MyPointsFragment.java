package com.pioneeralpha.amarischool.ui.dashboard.fragments.mypoints;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.adapters.WishListAdapter;
import com.pioneeralpha.amarischool.databinding.FragmentMyPointsBinding;
import com.pioneeralpha.amarischool.databinding.WishlistLayoutBinding;
import com.pioneeralpha.amarischool.models.MyPointsModel;
import com.pioneeralpha.amarischool.models.WishListModel;

import java.util.ArrayList;
import java.util.List;

public class MyPointsFragment extends Fragment {
    private FragmentMyPointsBinding mBinding;
    View view;
    MyPointsListAdapter adapter;
    List<MyPointsModel> myPointsModelswishListModels = new ArrayList<>();
    //RecyclerView wishlistItemsRecyclerview;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentMyPointsBinding.inflate(inflater, container, false);
        view =  mBinding.getRoot();


        myPointsModelswishListModels.add(new MyPointsModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        myPointsModelswishListModels.add(new MyPointsModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));

        adapter = new MyPointsListAdapter(getActivity(), view.getContext(), myPointsModelswishListModels);
        mBinding.pointRv.setHasFixedSize(true);
        mBinding.pointRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.pointRv.setAdapter(adapter);

        return view;
    }
}