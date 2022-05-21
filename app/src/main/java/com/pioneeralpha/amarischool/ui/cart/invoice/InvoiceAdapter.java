package com.pioneeralpha.amarischool.ui.cart.invoice;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.models.InvoiceModel;

import java.util.List;

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceAdapter.InvoicelistViewHolder> {
    ViewGroup parent;
    private Context context;
    private Activity activity;
    List<InvoiceModel> invoiceModels;


    public InvoiceAdapter(FragmentActivity activity, Context context, List<InvoiceModel> invoiceModels) {
        this.activity = activity;
        this.context = context;
        this.invoiceModels = invoiceModels;


    }

    @NonNull
    @Override
    public InvoiceAdapter.InvoicelistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_invoice, parent, false);
        this.parent = parent;
        return new InvoiceAdapter.InvoicelistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InvoiceAdapter.InvoicelistViewHolder holder, int position) {
        InvoiceModel invoiceModel = invoiceModels.get(position);
        holder.buyTitle.setText(invoiceModel.getInvoiceTitle());
    }


    @Override
    public int getItemCount() {
        return invoiceModels.size();
    }

    class InvoicelistViewHolder extends RecyclerView.ViewHolder {
        TextView buyTitle, buytk;


        public InvoicelistViewHolder(@NonNull View itemView) {
            super(itemView);
            buyTitle = itemView.findViewById(R.id.appCompatTextViewBuyTitle);


        }
    }


}



