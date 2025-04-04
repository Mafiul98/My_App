package com.example.practice1.model;

import java.util.List;

public class NewModel {

    private String title;
    private String content;
    private int imageResId; //

    public NewModel( String title, String content, int imageResId) {
        this.title = title;
        this.content = content;
        this.imageResId = imageResId;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;

    }



    public int getImageResId() {
        return imageResId;
    }
}
