package com.pioneeralpha.amarischool.models;

public class StudentMyCourseModel {
    private String courseTitle,courseImg,courseRating,instructorName,instructorOccupation,progress,weekLeft;

    public StudentMyCourseModel(String courseTitle, String courseImg, String courseRating, String instructorName, String instructorOccupation, String progress, String weekLeft) {
        this.courseTitle = courseTitle;
        this.courseImg = courseImg;
        this.courseRating = courseRating;
        this.instructorName = instructorName;
        this.instructorOccupation = instructorOccupation;
        this.progress = progress;
        this.weekLeft = weekLeft;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public String getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(String courseRating) {
        this.courseRating = courseRating;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorOccupation() {
        return instructorOccupation;
    }

    public void setInstructorOccupation(String instructorOccupation) {
        this.instructorOccupation = instructorOccupation;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getWeekLeft() {
        return weekLeft;
    }

    public void setWeekLeft(String weekLeft) {
        this.weekLeft = weekLeft;
    }
}
