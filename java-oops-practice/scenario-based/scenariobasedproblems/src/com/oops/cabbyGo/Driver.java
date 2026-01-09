package com.oops.cabbyGo;

public class Driver {
    private String name;
    private String licenseNo;
    private float rating;

    public Driver(String name, String licenseNo, float rating) {
        this.name = name;
        this.licenseNo = licenseNo;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public float getRating() {
        return rating;
    }
}
