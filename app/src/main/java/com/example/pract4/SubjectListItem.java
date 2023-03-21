package com.example.pract4;

public class SubjectListItem {
    private final int imageRes;
    private final String textTitle;
    private final String textDesc;

    public SubjectListItem(int imageRes, String textTitle, String textDesc) {
        this.imageRes = imageRes;
        this.textTitle = textTitle;
        this.textDesc = textDesc;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public String getTextDesc() {
        return textDesc;
    }
}
