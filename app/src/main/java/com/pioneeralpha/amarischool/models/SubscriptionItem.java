package com.pioneeralpha.amarischool.models;

import com.pioneeralpha.amarischool.adapters.CoursesRecyclerAdapter;
import com.pioneeralpha.amarischool.ui.home.model.HomeItems;

import java.util.ArrayList;

public class SubscriptionItem extends HomeItems {
    private ArrayList<Category> categories;

    public SubscriptionItem(int itemType, ArrayList<Category> categories) {
        super(itemType);
        this.categories =categories;

    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}

