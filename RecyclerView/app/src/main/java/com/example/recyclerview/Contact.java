package com.example.recyclerview;

public class Contact {
    private int imageResId;
    private String name, phone;

    public Contact(String name, String phone, int imageResId) {
        this.imageResId = imageResId;
        this.name = name;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getNumber() {
        return phone;
    }

    public int getImageResource() {
        return imageResId;
    }
}
