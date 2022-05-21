package com.pioneeralpha.amarischool.ui.dashboard.fragments.mypoints;

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
import com.pioneeralpha.amarischool.models.MyPointsModel;

import java.util.List;

public class MyPointsListAdapter extends RecyclerView.Adapter<MyPointsListAdapter.MyPointslistViewHolder> {
    ViewGroup parent;
    private Context context;
    private Activity activity;
    List<MyPointsModel> myPointsModels;


    public MyPointsListAdapter(FragmentActivity activity, Context context, List<MyPointsModel> myPointsModels) {
        this.activity = activity;
        this.context = context;
        this.myPointsModels = myPointsModels;


    }

    @NonNull
    @Override
    public MyPointslistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_points_use, parent, false);
        this.parent = parent;
        return new MyPointsListAdapter.MyPointslistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyPointslistViewHolder holder, int position) {
        MyPointsModel myPointsModel = myPointsModels.get(position);
        holder.pointTitle.setText(myPointsModel.getCourseTitle());
    }




    @Override
    public int getItemCount() {
        return myPointsModels.size();
    }

    class MyPointslistViewHolder extends RecyclerView.ViewHolder {
        TextView pointTitle, totalPoint;


        public MyPointslistViewHolder(@NonNull View itemView) {
            super(itemView);
            pointTitle = itemView.findViewById(R.id.appCompatTextViewPointTitle);
            totalPoint = itemView.findViewById(R.id.appCompatTextViewTotalPoint);

        }
    }




}

