package com.example.recyclerview;

public class ExampleItem {

    private int mImageResources;
    private String mText1;
    private String mText2;

    public ExampleItem(int mImageResources, String mText1, String mText2) {
        this.mImageResources = mImageResources;
        this.mText1 = mText1;
        this.mText2 = mText2;
    }

    public int getmImageResources() {
        return mImageResources;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }
}
