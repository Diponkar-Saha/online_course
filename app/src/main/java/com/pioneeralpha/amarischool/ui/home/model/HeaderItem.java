package com.pioneeralpha.amarischool.ui.home.model;

public class HeaderItem extends HomeItems {
    String name;

    public HeaderItem(String name, int itemType) {
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


