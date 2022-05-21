package com.pioneeralpha.amarischool.ui.cart.buy;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentBuyBinding;
import com.pioneeralpha.amarischool.databinding.FragmentMyPointsBinding;
import com.pioneeralpha.amarischool.models.BuyModel;
import com.pioneeralpha.amarischool.models.MyPointsModel;
import com.pioneeralpha.amarischool.ui.cart.invoice.InvoiceFragment;
import com.pioneeralpha.amarischool.ui.dashboard.fragments.mypoints.MyPointsListAdapter;
import com.sslwireless.sslcommerzlibrary.model.initializer.SSLCAdditionalInitializer;
import com.sslwireless.sslcommerzlibrary.model.initializer.SSLCCustomerInfoInitializer;
import com.sslwireless.sslcommerzlibrary.model.initializer.SSLCProductInitializer;
import com.sslwireless.sslcommerzlibrary.model.initializer.SSLCShipmentInfoInitializer;
import com.sslwireless.sslcommerzlibrary.model.initializer.SSLCommerzInitialization;
import com.sslwireless.sslcommerzlibrary.model.response.SSLCTransactionInfoModel;
import com.sslwireless.sslcommerzlibrary.model.util.SSLCCurrencyType;
import com.sslwireless.sslcommerzlibrary.model.util.SSLCSdkType;
import com.sslwireless.sslcommerzlibrary.view.singleton.IntegrateSSLCommerz;
import com.sslwireless.sslcommerzlibrary.viewmodel.listener.SSLCTransactionResponseListener;

import java.util.ArrayList;
import java.util.List;


public class BuyFragment extends Fragment implements SSLCTransactionResponseListener {
    private FragmentBuyBinding mBinding;
    View view;
    BuyAdapter adapter;
    List<BuyModel> buyModels = new ArrayList<>();
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentBuyBinding.inflate(inflater, container, false);
        view =  mBinding.getRoot();

        mBinding.radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                ViewGroup viewGroup = view.findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.invoicecustomview, viewGroup, false);
                Button dialogButton = dialogView.findViewById(R.id.appCompatPay);
                //TextInputEditText totalTk=dialogView.findViewById(R.id.pointAmountEditText);
                builder.setView(dialogView);
                AlertDialog alertDialog = builder.create();



                // if button is clicked, close the custom dialog

                alertDialog.show();
                dialogButton.setOnClickListener(v1 -> {
                     //alertDialog.dismiss();

                    Intent startssL = new Intent(getActivity(), SslMainActivity.class);
                    startActivity(startssL);
                     //setUpSsl();
                     //String totalAmount=totalTk.getText().toString();
                    //Toast.makeText(requireContext(),"Dismissed..!!",Toast.LENGTH_SHORT).show();
                });


            }
        });


        buyModels.add(new BuyModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        buyModels.add(new BuyModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));
        buyModels.add(new BuyModel("Introduction to data structure", "4500", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg"));
        buyModels.add(new BuyModel("Machine Learning" ,"5500", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg"));


        adapter = new BuyAdapter(getActivity(), view.getContext(), buyModels);
        mBinding.cardDetailsRv.setHasFixedSize(true);
        mBinding.cardDetailsRv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mBinding.cardDetailsRv.setAdapter(adapter);

        return view;
    }
    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void transactionSuccess(SSLCTransactionInfoModel sslcTransactionInfoModel) {

        changeFragment(new InvoiceFragment());
        Toast.makeText(context, "error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void transactionFail(String s) {

        Toast.makeText(context, "failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void merchantValidationError(String s) {
        Toast.makeText(context, "merchantValidationError", Toast.LENGTH_SHORT).show();

    }
    private void setUpSsl(){
        final SSLCommerzInitialization sslCommerzInitialization = new SSLCommerzInitialization("pione62262b6b55c91","pione62262b6b55c91@ssl", 10, SSLCCurrencyType.BDT,"123456789098765", "yourProductType", SSLCSdkType.TESTBOX);


        final SSLCCustomerInfoInitializer customerInfoInitializer= new SSLCCustomerInfoInitializer("dip", "customer email",
                "address", "dhaka", "1214", "Bangladesh", "01798501356");


        final SSLCProductInitializer productInitializer = new SSLCProductInitializer("food", "food",
                new SSLCProductInitializer.ProductProfile.TravelVertical("Travel", "10",
                        "A", "12", "Dhk-Syl"));

        final SSLCShipmentInfoInitializer shipmentInfoInitializer = new SSLCShipmentInfoInitializer("Courier",
                2, new SSLCShipmentInfoInitializer.ShipmentDetails("AA","Address 1",
                "Dhaka","1000","BD"));

        final SSLCAdditionalInitializer additionalInitializer = new SSLCAdditionalInitializer();
        additionalInitializer.setValueA("Value Option 1");
        additionalInitializer.setValueB("Value Option 1");
        additionalInitializer.setValueC("Value Option 1");
        additionalInitializer.setValueD("Value Option 1");

        IntegrateSSLCommerz
                .getInstance(context)
                .addSSLCommerzInitialization(sslCommerzInitialization)
                .addCustomerInfoInitializer(customerInfoInitializer)
                .addProductInitializer(productInitializer)
                .buildApiCall(this);




    }
}