package com.example.portfoliolucasalmi;

public class ListData {
    private String title;
    private String description;
    private int imgId;
    private Class activity;

    public Class getActivity() {
        return activity;
    }

    public void setActivity(Class activity) {
        this.activity = activity;
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

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public ListData(String title, String description, int imgId, Class activity) {
        this.title = title;
        this.description = description;
        this.imgId = imgId;
        this.activity = activity;
    }
}
