package com.pioneeralpha.amarischool.ui.cart.buy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.ui.cart.invoice.InvoiceFragment;
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

public class SslMainActivity extends AppCompatActivity implements SSLCTransactionResponseListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssl_main);

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
                .getInstance(SslMainActivity.this)
                .addSSLCommerzInitialization(sslCommerzInitialization)
                .addCustomerInfoInitializer(customerInfoInitializer)
                .addProductInitializer(productInitializer)
                .buildApiCall(this);



    }

    @Override
    public void transactionSuccess(SSLCTransactionInfoModel sslcTransactionInfoModel) {
        Toast.makeText(this, "transactionSuccess", Toast.LENGTH_SHORT).show();
        Intent startssL = new Intent(this, InvoiceActivity.class);
        startActivity(startssL);

    }

    @Override
    public void transactionFail(String s) {
        Toast.makeText(this, "transactionFail", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void merchantValidationError(String s) {
        Toast.makeText(this, "merchantValidationError", Toast.LENGTH_SHORT).show();

    }

}