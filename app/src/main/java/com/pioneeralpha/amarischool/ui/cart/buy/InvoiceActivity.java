package com.pioneeralpha.amarischool.ui.cart.buy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.adapters.HomeRecyclerAdapter;
import com.pioneeralpha.amarischool.databinding.ActivityHomePageBinding;
import com.pioneeralpha.amarischool.databinding.ActivityInvoiceBinding;
import com.pioneeralpha.amarischool.databinding.FragmentHomeBinding;
import com.pioneeralpha.amarischool.models.InvoiceModel;
import com.pioneeralpha.amarischool.ui.cart.invoice.InvoiceAdapter;

import java.util.ArrayList;
import java.util.List;

public class InvoiceActivity extends AppCompatActivity {
    private ActivityInvoiceBinding mBinding;
    private HomeRecyclerAdapter mAdapter;
    View view;
    InvoiceAdapter adapter;
    List<InvoiceModel> invoiceModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityInvoiceBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        invoiceModels.add(new InvoiceModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        invoiceModels.add(new InvoiceModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));
        invoiceModels.add(new InvoiceModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        invoiceModels.add(new InvoiceModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));


        adapter = new InvoiceAdapter(this, view.getContext(),  invoiceModels);
        mBinding.invoiceRv.setHasFixedSize(true);
        mBinding.invoiceRv.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        mBinding.invoiceRv.setAdapter(adapter);
    }
}