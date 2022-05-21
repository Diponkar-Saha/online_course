package com.pioneeralpha.amarischool.models;


public class Course {
    private String courseName;
    private int studentEnrolled;
    private String duration;
    private double rating;
    private String price;
    private String previewUrl;

    public Course(String courseName, int studentEnrolled, String duration, double rating, String price, String previewUrl) {
        this.courseName = courseName;
        this.studentEnrolled = studentEnrolled;
        this.duration = duration;
        this.rating = rating;
        this.price = price;
        this.previewUrl = previewUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStudentEnrolled() {
        return studentEnrolled;
    }

    public void setStudentEnrolled(int studentEnrolled) {
        this.studentEnrolled = studentEnrolled;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
