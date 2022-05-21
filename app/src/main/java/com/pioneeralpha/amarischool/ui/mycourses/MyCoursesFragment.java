package com.pioneeralpha.amarischool.ui.mycourses;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.adapters.MyCoursesAdapter;
import com.pioneeralpha.amarischool.models.StudentMyCourseModel;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentMyCoursesBinding;
import com.pioneeralpha.amarischool.ui.dashboard.DashboardActivity;

import java.util.ArrayList;
import java.util.List;

public class MyCoursesFragment extends Fragment implements MyCoursesAdapter.OnCardListener {
    FragmentMyCoursesBinding mBinding;
    MyCoursesAdapter myCoursesAdapter;
    List<StudentMyCourseModel> studentMyCourseModels = new ArrayList<>();
    RecyclerView myCoursesRecyclerview;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentMyCoursesBinding.inflate(inflater, container, false);
        view = mBinding.getRoot();
        myCoursesRecyclerview = view.findViewById(R.id.myCoursesRecyclerview);
        studentMyCourseModels.add(new StudentMyCourseModel("Software Quality Assurance ( SQA ) Placement Preparation Freshers", "https://miro.medium.com/max/2400/1*c_fiB-YgbnMl6nntYGBMHQ.jpeg", "5", "Jhone Smith", "SQA Engineer at Cefalo", "41", "Two weeks left"));
        studentMyCourseModels.add(new StudentMyCourseModel("Software Quality Assurance ( SQA ) Placement Preparation Freshers", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg", "4", "Jhone Smith", "SQA Engineer at Cefalo", "100", "Zero weeks left"));
        studentMyCourseModels.add(new StudentMyCourseModel("Software Quality Assurance ( SQA ) Placement Preparation Freshers", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg", "4.5", "Jhone Smith", "SQA Engineer at Cefalo", "70", "Two weeks left"));
        studentMyCourseModels.add(new StudentMyCourseModel("Software Quality Assurance ( SQA ) Placement Preparation Freshers", "https://blog.bismart.com/hubfs/20190903-MachineLearning.jpg", "4", "Jhone Smith", "SQA Engineer at Cefalo", "100", "Zero weeks left"));
        myCoursesAdapter = new MyCoursesAdapter(view.getContext(), getActivity(), studentMyCourseModels, this);
        myCoursesRecyclerview.setHasFixedSize(true);
        myCoursesRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        myCoursesRecyclerview.setAdapter(myCoursesAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    @Override
    public void onCardClick(int position) {
        startActivity(new Intent(getContext(), DashboardActivity.class));

    }

    @Override
    public void onExploreMyCourseBtnClick(int position) {

    }
}
