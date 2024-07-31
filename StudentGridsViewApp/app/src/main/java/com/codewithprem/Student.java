package com.codewithprem;

public class Student {
    private int imageResId;
    private String name;
    private String address;


    public Student(int imageResId, String name, String address) {
        this.imageResId = imageResId;
        this.name = name;
        this.address = address;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


}
