package com.pioneeralpha.amarischool;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.adapters.CoursesRecyclerAdapter;
import com.pioneeralpha.amarischool.databinding.FragmentMoreCourseBinding;
import com.pioneeralpha.amarischool.models.Course;
import com.pioneeralpha.amarischool.ui.aboutCourse.AboutCourseFragment;

import java.util.ArrayList;


public class MoreCourseFragment extends Fragment implements CoursesRecyclerAdapter.OnItemClickListener, AdapterView.OnItemSelectedListener {
    private FragmentMoreCourseBinding mBinding;
    CoursesRecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    String[] skill = { "Skills"};
    String[] level = { "Levels"};

    String[] type = { "Type"};
    String[] job = { "Jobs"};

    String[] rattings = { "Rattings"};
    String[] instructor= { "Category"};

    String[] duration = { "Duration"};


    String[] free = { "Free or Paid"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentMoreCourseBinding.inflate(inflater, container, false);

        mBinding.spinnerSkills.setOnItemSelectedListener(this);
        mBinding.spinnerType.setOnItemSelectedListener(this);
        mBinding.spinnerRatings.setOnItemSelectedListener(this);
        mBinding.spinnerLevels.setOnItemSelectedListener(this);
        mBinding.spinnerDuration.setOnItemSelectedListener(this);
        mBinding.spinnerFreeOrPaid.setOnItemSelectedListener(this);
        mBinding.spinnerInstructor.setOnItemSelectedListener(this);
        mBinding.spinnerJobs.setOnItemSelectedListener(this);


        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,skill);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerSkills.setAdapter(aa);

        ArrayAdapter aa1 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,type);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerType.setAdapter(aa1);

        ArrayAdapter aa2 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,duration);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerDuration.setAdapter(aa2);

        ArrayAdapter aa3 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,instructor);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerInstructor.setAdapter(aa3);

        ArrayAdapter aa5 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,job);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerJobs.setAdapter(aa5);

        ArrayAdapter aa6 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,level);
        aa6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerLevels.setAdapter(aa6);

        ArrayAdapter aa7 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,free);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerFreeOrPaid.setAdapter(aa7);

        ArrayAdapter aa8 = new ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,rattings);
        aa8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBinding.spinnerRatings.setAdapter(aa8);



        recyclerView = mBinding.mainRecyclerView;
        layoutManager = new GridLayoutManager(getContext(), 2);
        adapter = new CoursesRecyclerAdapter(getCourseList(), 1,this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
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
        changeFragment(new AboutCourseFragment());

    }

    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}