package com.pioneeralpha.amarischool.models;

public class MyPointsModel {
    private String courseTitle,coursepoint,courseImg;

    public MyPointsModel(String courseTitle, String coursepoint, String courseImg) {
        this.courseTitle = courseTitle;
        this.coursepoint = coursepoint;
        this.courseImg = courseImg;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCoursepoint() {
        return coursepoint;
    }

    public void setCoursepoint(String coursepoint) {
        this.coursepoint = coursepoint;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }
}
