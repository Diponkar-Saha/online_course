package com.pioneeralpha.amarischool.ui.cart.invoice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pioneeralpha.amarischool.databinding.FragmentInvoiceBinding;
import com.pioneeralpha.amarischool.models.InvoiceModel;
import java.util.ArrayList;
import java.util.List;


public class InvoiceFragment extends Fragment {

    private FragmentInvoiceBinding mBinding;
    View view;
    InvoiceAdapter adapter;
    List<InvoiceModel> invoiceModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentInvoiceBinding.inflate(inflater, container, false);
        view =  mBinding.getRoot();


        invoiceModels.add(new InvoiceModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        invoiceModels.add(new InvoiceModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));
        invoiceModels.add(new InvoiceModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        invoiceModels.add(new InvoiceModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));


        adapter = new InvoiceAdapter(getActivity(), view.getContext(),  invoiceModels);
        mBinding.invoiceRv.setHasFixedSize(true);
        mBinding.invoiceRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.invoiceRv.setAdapter(adapter);

        return view;    }
}