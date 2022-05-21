package com.pioneeralpha.amarischool.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.models.ForumModel;
import com.pioneeralpha.amarischool.models.ThreaModel;

import java.util.List;

public class ThreadAdapter extends RecyclerView.Adapter<ThreadAdapter.MyForumViewHolder> {
    private Context context;
    List<ThreaModel> forumModels;
    ViewGroup parent;
    private ThreadAdapter.OnCardListener mOnCardListener;

    public ThreadAdapter(Context context, List<ThreaModel> forumModels, OnCardListener mOnCardListener) {
        this.context = context;
        this.forumModels = forumModels;
        this.mOnCardListener = mOnCardListener;
    }

    @NonNull
    @Override
    public MyForumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_new_thread, parent, false);
        this.parent = parent;
        return new ThreadAdapter.MyForumViewHolder(view, mOnCardListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyForumViewHolder holder, int position) {
        ThreaModel threaModel = forumModels.get(position);

    }

    @Override
    public int getItemCount() {
        return forumModels.size();
    }

    public class MyForumViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView threadTitle, forumSubDesc, DateTime, numberOfThread,createdBy,noOfReply;
        ThreadAdapter.OnCardListener onCardListener;

        public MyForumViewHolder(@NonNull View itemView, ThreadAdapter.OnCardListener onCardListener) {
            super(itemView);
            this.onCardListener = onCardListener;
            threadTitle = itemView.findViewById(R.id.threadTitle);
//            forumSubDesc = itemView.findViewById(R.id.subDesc);
//            DateTime = itemView.findViewById(R.id.date);
//            numberOfThread = itemView.findViewById(R.id.numberofThread);
//            createdBy = itemView.findViewById(R.id.name);
//            noOfReply = itemView.findViewById(R.id.numberreply);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCardListener.onCardClick(getAdapterPosition());
                }
            });

        }

        @Override
        public void onClick(View v) {

        }
    }

    public interface OnCardListener {
        void onCardClick(int position);

        void onExploreMyCourseBtnClick(int position);
    }
}
