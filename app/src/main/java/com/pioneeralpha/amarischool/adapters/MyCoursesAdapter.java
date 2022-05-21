package com.pioneeralpha.amarischool.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.pioneeralpha.amarischool.models.StudentMyCourseModel;
import com.pioneeralpha.amarischool.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyCoursesAdapter extends RecyclerView.Adapter<MyCoursesAdapter.MyCoursesViewHolder> {
    private Context context;
    private Activity activity;
    List<StudentMyCourseModel> studentMyCourseModels;
    ViewGroup parent;
    private MyCoursesAdapter.OnCardListener mOnCardListener;

    public MyCoursesAdapter(Context context, Activity activity, List<StudentMyCourseModel> studentMyCourseModels, OnCardListener mOnCardListener) {
        this.context = context;
        this.activity = activity;
        this.studentMyCourseModels = studentMyCourseModels;
        this.mOnCardListener = mOnCardListener;
    }

    @NonNull
    @Override
    public MyCoursesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_my_courses_layout, parent, false);
        this.parent = parent;
        return new MyCoursesAdapter.MyCoursesViewHolder(view, mOnCardListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCoursesViewHolder holder, int position) {
        StudentMyCourseModel studentMyCourseModel = studentMyCourseModels.get(position);
        int progress = Integer.parseInt(studentMyCourseModel.getProgress());
        holder.courseTitle.setText(studentMyCourseModel.getCourseTitle());
        holder.instructorNameTextView.setText(studentMyCourseModel.getInstructorName());
        holder.instructorOccupationTextView.setText(studentMyCourseModel.getInstructorOccupation());
        holder.progressPercentTextView.setText(progress + "%");
        holder.courseProgressBar.setProgress(progress);
        if (progress < 100) {
            holder.progressTextView.setText("In Progress...");
            holder.progressTextView.setTextColor(activity.getResources().getColor(R.color.progress_text_color));
        } else {
            holder.progressTextView.setText("Completed!");
            holder.progressTextView.setTextColor(activity.getResources().getColor(R.color.green));
            holder.courseProgressBar.getProgressDrawable().setColorFilter(ContextCompat.getColor(context, R.color.green), PorterDuff.Mode.SRC_ATOP);
        }
        holder.weeksLeftTextView.setText(studentMyCourseModel.getWeekLeft());
        holder.ratingTextView.setText(studentMyCourseModel.getCourseRating());

        holder.courseRatingBar.setRating(Float.parseFloat(studentMyCourseModel.getCourseRating()));
        Picasso.get().load(studentMyCourseModel.getCourseImg()).placeholder(R.drawable.cart_demo_img).into(holder.courseImg);
    }

    @Override
    public int getItemCount() {
        return studentMyCourseModels.size();
    }

    public class MyCoursesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView courseTitle, instructorNameTextView, progressTextView, progressPercentTextView, instructorOccupationTextView, weeksLeftTextView, ratingTextView;
        AppCompatImageView exploreMyCourseBtn;
        ShapeableImageView courseImg;
        RatingBar courseRatingBar;
        ProgressBar courseProgressBar;
        CardView cardView;
        MyCoursesAdapter.OnCardListener onCardListener;

        public MyCoursesViewHolder(@NonNull View itemView, MyCoursesAdapter.OnCardListener onCardListener) {
            super(itemView);
            this.onCardListener = onCardListener;
            courseTitle = itemView.findViewById(R.id.courseTitle);
            instructorNameTextView = itemView.findViewById(R.id.instructorNameTextView);
            progressTextView = itemView.findViewById(R.id.progressTextView);
            progressPercentTextView = itemView.findViewById(R.id.progressPercentTextView);
            instructorOccupationTextView = itemView.findViewById(R.id.instructorOccupationTextView);
            weeksLeftTextView = itemView.findViewById(R.id.weeksLeftTextView);
            exploreMyCourseBtn = itemView.findViewById(R.id.exploreMyCourseBtn);
            ratingTextView = itemView.findViewById(R.id.ratingTextView);
            courseImg = itemView.findViewById(R.id.courseImg);
            courseRatingBar = itemView.findViewById(R.id.courseRatingBar);
            courseProgressBar = itemView.findViewById(R.id.courseProgressBar);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCardListener.onCardClick(getAdapterPosition());
                }
            });
            exploreMyCourseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCardListener.onExploreMyCourseBtnClick(getAdapterPosition());
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
