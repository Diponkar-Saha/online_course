package com.pioneeralpha.amarischool.ui.menu.subscription.details;

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
import com.pioneeralpha.amarischool.ui.menu.subscription.SubscriptionAdapter;

import java.util.List;

public class SubscriptionDetailsAdapter extends RecyclerView.Adapter<SubscriptionDetailsAdapter.SubscriptionDetailsViewHolder>  {
    ViewGroup parent;
    private Context context;

    private Activity activity;
    List<SubscriptionModel> mySubscriptionModel;
    OnItemClickListener onItemClickListener;


    public SubscriptionDetailsAdapter(FragmentActivity activity, Context context, List<SubscriptionModel> mySubscriptionModel,  OnItemClickListener onItemClickListener) {
        this.activity = activity;
        this.context = context;
        this.mySubscriptionModel = mySubscriptionModel;
        this.onItemClickListener=onItemClickListener;



    }

    @NonNull
    @Override
    public SubscriptionDetailsAdapter.SubscriptionDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_subscription_all_course, parent, false);
        this.parent = parent;
        return new SubscriptionDetailsAdapter.SubscriptionDetailsViewHolder(view,onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SubscriptionDetailsAdapter.SubscriptionDetailsViewHolder holder, int position) {
        SubscriptionModel mySubscriptionModels = mySubscriptionModel.get(position);
        holder.subsTitle.setText(mySubscriptionModels.getTitle());
    }




    @Override
    public int getItemCount() {
        return mySubscriptionModel.size();
    }


    class SubscriptionDetailsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView subsTitle, totalPoint;
        SubscriptionDetailsAdapter.OnItemClickListener onItemClickListener;


        public SubscriptionDetailsViewHolder(@NonNull View itemView,OnItemClickListener onItemClickListener) {
            super(itemView);
            this.onItemClickListener=onItemClickListener;
            itemView.setOnClickListener(this);
            subsTitle = itemView.findViewById(R.id.allcoursetitle);
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
