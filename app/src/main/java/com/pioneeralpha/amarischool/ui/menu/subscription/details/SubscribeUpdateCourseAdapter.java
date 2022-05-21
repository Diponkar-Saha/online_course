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
import com.pioneeralpha.amarischool.models.SubscriptionModel;

import java.util.List;

public class SubscribeUpdateCourseAdapter extends RecyclerView.Adapter<SubscribeUpdateCourseAdapter.SubscriptionUpdatCourseeViewHolder>  {
    ViewGroup parent;
    private Context context;

    private Activity activity;
    List<SubscriptionModel> mySubscriptionModel;
    SubscriptionDetailsAdapter.OnItemClickListener onItemClickListener;


    public SubscribeUpdateCourseAdapter(FragmentActivity activity, Context context, List<SubscriptionModel> mySubscriptionModel, SubscriptionDetailsAdapter.OnItemClickListener onItemClickListener) {
        this.activity = activity;
        this.context = context;
        this.mySubscriptionModel = mySubscriptionModel;
        this.onItemClickListener=onItemClickListener;



    }

    @NonNull
    @Override
    public SubscribeUpdateCourseAdapter.SubscriptionUpdatCourseeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_subscribe_update_course, parent, false);
        this.parent = parent;
        return new SubscribeUpdateCourseAdapter.SubscriptionUpdatCourseeViewHolder(view,onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SubscribeUpdateCourseAdapter.SubscriptionUpdatCourseeViewHolder holder, int position) {
        SubscriptionModel mySubscriptionModels = mySubscriptionModel.get(position);
        holder.subsTitle.setText(mySubscriptionModels.getTitle());
    }




    @Override
    public int getItemCount() {
        return mySubscriptionModel.size();
    }


    class SubscriptionUpdatCourseeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView subsTitle, totalPoint;
        SubscriptionDetailsAdapter.OnItemClickListener onItemClickListener;


        public SubscriptionUpdatCourseeViewHolder(@NonNull View itemView, SubscriptionDetailsAdapter.OnItemClickListener onItemClickListener) {
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

