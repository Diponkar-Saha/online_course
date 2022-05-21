package com.pioneeralpha.amarischool.ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.adapters.CartAdapter;
import com.pioneeralpha.amarischool.databinding.FragmentCartBinding;
import com.pioneeralpha.amarischool.models.CartModel;

import java.util.ArrayList;
import java.util.List;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.ui.cart.buy.BuyFragment;
import com.pioneeralpha.amarischool.ui.dashboard.fragments.mypoints.MyPointsFragment;

public class CartFragment extends Fragment implements CartAdapter.OnCardListener {
    FragmentCartBinding mBinding;
    CartAdapter cartAdapter;
    List<CartModel> cartModels = new ArrayList<>();
    RecyclerView cartItemsRecyclerview;
    View view;
    TextView subtotalTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentCartBinding.inflate(inflater, container, false);
        view = mBinding.getRoot();


        cartItemsRecyclerview = view.findViewById(R.id.cartItemsRecyclerview);
        subtotalTextView = view.findViewById(R.id.subtotalTextView);
        cartModels.clear();
        cartModels.add(new CartModel("Introduction to data structure", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg", "4500", "4.5", "468", "Basic Algos,", "C++,Arrays,"));
        cartModels.add(new CartModel("Machine Learning", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg", "5500", "4", "458", "Numpy and Pandas,", "Numpy and Pandas,"));
        int subtotal = 4500 + 5500;
        subtotalTextView.setText(Integer.toString(subtotal));
        cartAdapter = new CartAdapter(getActivity(), view.getContext(), cartModels, this);


        cartItemsRecyclerview.setHasFixedSize(true);
        cartItemsRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        cartItemsRecyclerview.setAdapter(cartAdapter);


        mBinding.buyNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new BuyFragment());

            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    @Override
    public void onCardClick(int position) {
        Toast.makeText(getActivity().getApplicationContext(), "Card Clicked:" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBuyBtnClick(int position) {
        //Toast.makeText(getActivity().getApplicationContext(), "Buy Btn Clicked:" + position, Toast.LENGTH_SHORT).show();
        changeFragment(new BuyFragment());
    }

    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
