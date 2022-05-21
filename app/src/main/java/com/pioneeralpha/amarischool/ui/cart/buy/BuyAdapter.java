package com.pioneeralpha.amarischool.ui.cart.buy;

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
import com.pioneeralpha.amarischool.models.BuyModel;

import java.util.List;

public class BuyAdapter extends RecyclerView.Adapter<BuyAdapter.BuylistViewHolder> {
    ViewGroup parent;
    private Context context;
    private Activity activity;
    List<BuyModel> buyModels;


    public BuyAdapter(FragmentActivity activity, Context context, List<BuyModel> buyModels) {
        this.activity = activity;
        this.context = context;
        this.buyModels = buyModels;


    }

    @NonNull
    @Override
    public BuyAdapter.BuylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buy_card_details, parent, false);
        this.parent = parent;
        return new BuyAdapter.BuylistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuyAdapter.BuylistViewHolder holder, int position) {
        BuyModel buyModel = buyModels.get(position);
        holder.buyTitle.setText(buyModel.getbTitle());
    }


    @Override
    public int getItemCount() {
        return buyModels.size();
    }

    class BuylistViewHolder extends RecyclerView.ViewHolder {
        TextView buyTitle, buytk;


        public BuylistViewHolder(@NonNull View itemView) {
            super(itemView);
            buyTitle = itemView.findViewById(R.id.appCompatTextViewBuyTitle);


        }
    }


}


