package com.pioneeralpha.amarischool.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.models.ForumModel;
import com.pioneeralpha.amarischool.models.StudentMyCourseModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ForumAdapter extends RecyclerView.Adapter<ForumAdapter.MyForumViewHolder> {
    private Context context;
    List<ForumModel> forumModels;
    ViewGroup parent;
    private ForumAdapter.OnCardListener mOnCardListener;

    public ForumAdapter(Context context,List<ForumModel> forumModels, OnCardListener mOnCardListener) {
        this.context = context;
        this.forumModels = forumModels;
        this.mOnCardListener = mOnCardListener;
    }

    @NonNull
    @Override
    public MyForumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_forum, parent, false);
        this.parent = parent;
        return new ForumAdapter.MyForumViewHolder(view, mOnCardListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyForumViewHolder holder, int position) {
        ForumModel forumModel = forumModels.get(position);

    }

    @Override
    public int getItemCount() {
        return forumModels.size();
    }

    public class MyForumViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView forumTitle, forumSubDesc, DateTime, numberOfThread;
        ImageView rightArrow;
        ForumAdapter.OnCardListener onCardListener;

        public MyForumViewHolder(@NonNull View itemView, ForumAdapter.OnCardListener onCardListener) {
            super(itemView);
            this.onCardListener = onCardListener;
            forumTitle = itemView.findViewById(R.id.forumTitle);
            forumSubDesc = itemView.findViewById(R.id.subDesc);
            DateTime = itemView.findViewById(R.id.date);
            numberOfThread = itemView.findViewById(R.id.numberofThread);
            rightArrow = itemView.findViewById(R.id.rightArrow);

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
