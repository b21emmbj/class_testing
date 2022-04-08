package com.example.class_testing;

public class Berg {

    private String name;
    private  String location;
    private int height_n;

    public Berg(String name, String location, int height_n) {
        this.name = name;
        this.location = location;
        this.height_n = height_n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeight_n() {
        return height_n;
    }

    public void setHeight_n(int height_n) {
        this.height_n = height_n;
    }
}
