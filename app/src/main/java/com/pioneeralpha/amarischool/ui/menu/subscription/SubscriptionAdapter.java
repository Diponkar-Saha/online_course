package com.pioneeralpha.amarischool.ui.menu.subscription;

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
import com.pioneeralpha.amarischool.adapters.CoursesRecyclerAdapter;
import com.pioneeralpha.amarischool.models.SubscriptionModel;
import com.pioneeralpha.amarischool.ui.menu.subscription.details.SubscriptionDetailsAdapter;

import java.util.List;

public class SubscriptionAdapter extends RecyclerView.Adapter<SubscriptionAdapter.SubscriptionViewHolder> {
    ViewGroup parent;
    private Context context;
    private Activity activity;
    List<SubscriptionModel> mySubscriptionModel;
    SubscriptionAdapter.OnItemClickListener onItemClickListener;


    public SubscriptionAdapter(FragmentActivity activity, Context context, List<SubscriptionModel> mySubscriptionModel, SubscriptionAdapter.OnItemClickListener onItemClickListener) {
        this.activity = activity;
        this.context = context;
        this.mySubscriptionModel = mySubscriptionModel;
        this.onItemClickListener=onItemClickListener;


    }

    @NonNull
    @Override
    public SubscriptionAdapter.SubscriptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_subdcription, parent, false);
        this.parent = parent;
        return new SubscriptionAdapter.SubscriptionViewHolder(view,onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SubscriptionAdapter.SubscriptionViewHolder holder, int position) {
        SubscriptionModel mySubscriptionModels = mySubscriptionModel.get(position);
        holder.subsTitle.setText(mySubscriptionModels.getTitle());
    }




    @Override
    public int getItemCount() {
        return mySubscriptionModel.size();
    }

    class SubscriptionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView subsTitle, totalPoint;
        OnItemClickListener onItemClickListener;


        public SubscriptionViewHolder(@NonNull View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            subsTitle = itemView.findViewById(R.id.appCompatTextViewTitle);
            this.onItemClickListener=onItemClickListener;
            itemView.setOnClickListener(this);
            //totalPoint = itemView.findViewById(R.id.appCompatTextViewTotalPoint);

        }

        @Override
        public void onClick(View v) {
            onItemClickListener.onItemClick(getAdapterPosition());

        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);

    }




}