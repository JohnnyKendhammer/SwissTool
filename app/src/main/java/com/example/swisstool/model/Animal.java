package com.example.swisstool.model;

import android.widget.ImageView;

public class Animal {

    private String name;
    private int imageID;
    private String type;
    private String fact;

    public Animal(int imageID, String name, String type, String fact) {
        this.name = name;
        this.imageID = imageID;
        this.type = type;
        this.fact = fact;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
