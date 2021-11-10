package com.example.portfoliolucasalmi;

import android.net.Uri;

public class ListData {
    private String title;
    private String shortDescription;
    private int imgId;
    private Class activity;
    private int[] photoArray;
    private String fullDescription;
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int[] getPhotoArray() {
        return photoArray;
    }

    public void setPhotoArray(int[] photoArray) {
        this.photoArray = photoArray;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public ListData(String title, String shortDescription, int imgId, Class activity, int[] photoArray, String fullDescription, String link) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.imgId = imgId;
        this.activity = activity;
        this.photoArray = photoArray;
        this.fullDescription = fullDescription;
        this.link = link;

    }
}
