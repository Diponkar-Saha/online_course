package com.pioneeralpha.amarischool.models;

public class BuyModel {
    private String bTitle,bTaka,bImg;

    public BuyModel(String bTitle, String bTaka, String bImg) {
        this.bTitle = bTitle;
        this.bTaka = bTaka;
        this.bImg = bImg;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbTaka() {
        return bTaka;
    }

    public void setbTaka(String bTaka) {
        this.bTaka = bTaka;
    }

    public String getbImg() {
        return bImg;
    }

    public void setbImg(String bImg) {
        this.bImg = bImg;
    }
}
