package com.pioneeralpha.amarischool.models;

public class ForumModel {
    String title,subdesc,dateTime,numberofThread;

    public ForumModel(String title, String subdesc, String dateTime, String numberofThread) {
        this.title = title;
        this.subdesc = subdesc;
        this.dateTime = dateTime;
        this.numberofThread = numberofThread;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubdesc() {
        return subdesc;
    }

    public void setSubdesc(String subdesc) {
        this.subdesc = subdesc;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getNumberofThread() {
        return numberofThread;
    }

    public void setNumberofThread(String numberofThread) {
        this.numberofThread = numberofThread;
    }
}
