package com.pioneeralpha.amarischool.ui.explore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.adapters.CoursesRecyclerAdapter;
import com.pioneeralpha.amarischool.databinding.FragmentExploreCatagoriesBinding;
import com.pioneeralpha.amarischool.models.Course;
import com.pioneeralpha.amarischool.ui.aboutCourse.AboutCourseFragment;

import java.util.ArrayList;


public class ExploreCatagoriesFragment extends Fragment implements CoursesRecyclerAdapter.OnItemClickListener {

    private FragmentExploreCatagoriesBinding mBinding;
    CoursesRecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager,layoutManager1;
    RecyclerView recyclerView,recyclerView1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentExploreCatagoriesBinding.inflate(inflater, container, false);

        recyclerView = mBinding.explore;
        recyclerView1 = mBinding.explore1;
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        adapter = new CoursesRecyclerAdapter(getCourseList(), 1,this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(adapter);
        return mBinding.getRoot();
    }

    private ArrayList<Course> getCourseList() {
        ArrayList<Course> courseItems = new ArrayList<>();
        courseItems.add(new Course("Complete Graphic Design Course", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=1"));
        courseItems.add(new Course("Competitive Programming", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=2"));
        courseItems.add(new Course("Introduction to data structure ", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=3"));
        courseItems.add(new Course("Complete Graphic Design Course", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=5"));
        courseItems.add(new Course("Competitive Programming", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=6"));
        courseItems.add(new Course("Introduction to data structure ", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=7"));
        return courseItems;
    }

    @Override
    public void onItemClick(int position) {

        //Toast.makeText(requireActivity(), "ttttttt", Toast.LENGTH_SHORT).show();
        changeFragment(new AboutCourseFragment());
    }

    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}