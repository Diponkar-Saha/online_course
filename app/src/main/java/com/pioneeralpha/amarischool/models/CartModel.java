package com.pioneeralpha.amarischool.models;

public class CartModel {
    private String courseTitle,courseBill,rating,studentsEnrolled,skillsCovered,prerequisites,courseImg;

    public CartModel(String courseTitle, String courseImg, String courseBill, String rating, String studentsEnrolled, String skillsCovered, String prerequisites) {
        this.courseTitle = courseTitle;
        this.courseBill = courseBill;
        this.rating = rating;
        this.studentsEnrolled = studentsEnrolled;
        this.skillsCovered = skillsCovered;
        this.prerequisites = prerequisites;
        this.courseImg = courseImg;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(String studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public String getSkillsCovered() {
        return skillsCovered;
    }

    public void setSkillsCovered(String skillsCovered) {
        this.skillsCovered = skillsCovered;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public CartModel() {
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
}
