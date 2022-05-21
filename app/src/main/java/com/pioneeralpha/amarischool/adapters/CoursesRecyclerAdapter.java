package com.pioneeralpha.amarischool.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.ItemHomeContentCoursesGridBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeContentCoursesListBinding;
import com.pioneeralpha.amarischool.models.Course;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CoursesRecyclerAdapter extends RecyclerView.Adapter<CoursesRecyclerAdapter.CoursesViewHolder> {

    private final ArrayList<Course> mCourseList;
    private final int mViewStyle;
    private final static int VIEW_STYLE_LIST = 1;
    private final static int VIEW_STYLE_GRID = 0;
    private Context mContext;
    private OnItemClickListener listener;

    public static class CoursesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final ViewBinding mBinding;
        OnItemClickListener onItemClickListener;



        public CoursesViewHolder(ViewBinding binding,OnItemClickListener onItemClickListener) {
            super(binding.getRoot());
            mBinding = binding;
            this.onItemClickListener=onItemClickListener;
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            onItemClickListener.onItemClick(getAdapterPosition());

        }
    }



    public CoursesRecyclerAdapter(ArrayList<Course> courseList, int viewStyle,OnItemClickListener listener) {
        mCourseList = courseList;
        mViewStyle = viewStyle;
        this.listener = listener;

    }

    @NonNull
    @Override
    public CoursesRecyclerAdapter.CoursesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        if (mViewStyle == VIEW_STYLE_LIST) {
            return new CoursesRecyclerAdapter.CoursesViewHolder(ItemHomeContentCoursesListBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false),listener);
        } else {
            return new CoursesRecyclerAdapter.CoursesViewHolder(ItemHomeContentCoursesGridBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false),listener);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull CoursesRecyclerAdapter.CoursesViewHolder holder, int position) {
        if (mViewStyle == VIEW_STYLE_LIST) {
            ItemHomeContentCoursesListBinding binding = (ItemHomeContentCoursesListBinding) holder.mBinding;
            binding.courseTitle.setText(mCourseList.get(position).getCourseName());
           // binding.ratingText.setText(String.valueOf(mCourseList.get(position).getRating()));
            binding.studentsEnrolled.setText(mContext.getString(R.string.course_students_enrolled, mCourseList.get(position).getStudentEnrolled()));
            binding.duration.setText(mContext.getString(R.string.course_duration, mCourseList.get(position).getDuration()));
            binding.price.setText(mCourseList.get(position).getPrice());
            Picasso.get().load(mCourseList.get(position).getPreviewUrl())
                    .placeholder(R.drawable.placeholder_loading)
                    .error(R.drawable.placeholder_error)
                    .into(binding.coursePreview);


            binding.heartButton.setOnClickListener((View.OnClickListener) v -> binding.heartButton.setImageDrawable((Drawable)
                    ResourcesCompat.getDrawable(mContext.getResources(), R.drawable.ic_heart_filled, null)));


        } else {
            ItemHomeContentCoursesGridBinding binding = (ItemHomeContentCoursesGridBinding) holder.mBinding;
            binding.courseTitle.setText(mCourseList.get(position).getCourseName());
            binding.ratingText.setText(String.valueOf(mCourseList.get(position).getRating()));
            binding.studentsEnrolled.setText(mContext.getString(R.string.course_students_enrolled, mCourseList.get(position).getStudentEnrolled()));
            binding.duration.setText(mContext.getString(R.string.course_duration, mCourseList.get(position).getDuration()));
            binding.price.setText(mCourseList.get(position).getPrice());
            Picasso.get().load(mCourseList.get(position).getPreviewUrl())
                    .placeholder(R.drawable.placeholder_loading)
                    .error(R.drawable.placeholder_error)
                    .into(binding.coursePreview);

            binding.heartButton.setOnClickListener((View.OnClickListener) v -> binding.heartButton.setImageDrawable((Drawable)
                    ResourcesCompat.getDrawable(mContext.getResources(), R.drawable.ic_heart_filled, null)));
        }
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                listener.onItemClick();
//            }
//
//        });

    }


    public interface OnItemClickListener {
        void onItemClick(int position);

    }

    @Override
    public int getItemCount() {
        return mCourseList.size();
    }
}
