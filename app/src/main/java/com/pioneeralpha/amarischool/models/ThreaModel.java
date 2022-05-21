package com.pioneeralpha.amarischool.models;

import java.net.CacheRequest;

public class ThreaModel {
    String title,subdesc,dateTime,numberofThread,CreatedBy,noOfReply;

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getNoOfReply() {
        return noOfReply;
    }

    public void setNoOfReply(String noOfReply) {
        this.noOfReply = noOfReply;
    }

    public ThreaModel(String title, String subdesc, String dateTime, String CreatedBy, String noOfReply, String numberofThread) {
        this.title = title;
        this.subdesc = subdesc;
        this.dateTime = dateTime;
        this.CreatedBy = CreatedBy;
        this.noOfReply = noOfReply;
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
