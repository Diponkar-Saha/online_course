package com.pioneeralpha.amarischool.ui.home.model;

import com.pioneeralpha.amarischool.adapters.CoursesRecyclerAdapter;
import com.pioneeralpha.amarischool.models.Course;

import java.util.ArrayList;

public class CourseItem extends HomeItems {
    private ArrayList<Course> courseList;
    private CoursesRecyclerAdapter.OnItemClickListener listener;

    public CourseItem(int itemType, ArrayList<Course> courseList, CoursesRecyclerAdapter.OnItemClickListener listener) {
        super(itemType);
        this.courseList = courseList;
        this.listener=listener;
    }

    public CoursesRecyclerAdapter.OnItemClickListener getListener() {
        return listener;
    }

    public void setListener(CoursesRecyclerAdapter.OnItemClickListener listener) {
        this.listener = listener;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}
