package com.pioneeralpha.amarischool.ui.home.model;

public class MoreButtonItem extends HomeItems{
    String name;
    public MoreButtonItem(String name,int itemType) {
        super(itemType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
