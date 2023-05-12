package com.example.gallery_shop;

public class Shopping {
    String heading;
    int titleImage;

    public Shopping(String heading, int titleImage) {
        this.heading = heading;
        this.titleImage = titleImage;
    }

    public int getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(int titleImage) {
        this.titleImage = titleImage;
    }
}
