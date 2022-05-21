package com.pioneeralpha.amarischool;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.adapters.WishListAdapter;
import com.pioneeralpha.amarischool.models.WishListModel;
import com.pioneeralpha.amarischool.databinding.WishlistLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class WishlistFragment extends Fragment implements WishListAdapter.OnWishListCardListener {
    private WishlistLayoutBinding mBinding;
    View view;
    WishListAdapter adapter;
    List<WishListModel> wishListModels = new ArrayList<>();
    RecyclerView wishlistItemsRecyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.wishlist_layout, container, false);
        wishlistItemsRecyclerview=view.findViewById(R.id.wishlistRecyclerview);
        wishListModels.add(new WishListModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        wishListModels.add(new WishListModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));

        adapter = new WishListAdapter(getActivity(), view.getContext(), wishListModels,  this);
        wishlistItemsRecyclerview.setHasFixedSize(true);
        wishlistItemsRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        wishlistItemsRecyclerview.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    @Override
    public void onCardClick(int position) {

    }

    @Override
    public void onBuyBtnClick(int position) {

    }
}
