package com.pioneeralpha.amarischool.models;

public class WishListModel {
    private String courseTitle,courseBill,courseImg;

    public WishListModel(String courseTitle, String courseBill, String courseImg) {
        this.courseTitle = courseTitle;
        this.courseBill = courseBill;
        this.courseImg = courseImg;
    }

    public WishListModel() {
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseBill() {
        return courseBill;
    }

    public void setCourseBill(String courseBill) {
        this.courseBill = courseBill;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }
}
