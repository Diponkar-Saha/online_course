package com.pioneeralpha.amarischool.models;

public class Product {
    private String previewImageUrl;
    private String title;
    private String description;

    public Product(String previewImageUrl, String title, String description) {
        this.previewImageUrl = previewImageUrl;
        this.title = title;
        this.description = description;
    }

    public String getPreviewImageUrl() {
        return previewImageUrl;
    }

    public void setPreviewImageUrl(String previewImageUrl) {
        this.previewImageUrl = previewImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
