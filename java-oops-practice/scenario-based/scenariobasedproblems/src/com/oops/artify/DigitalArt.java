package com.oops.artify;

class DigitalArt extends Artwork {
    DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    DigitalArt(String title, String artist, double price, String licenseType, String preview) {
        super(title, artist, price, licenseType, preview);
    }

    public void license() {
        licenseType = "Digital License: Personal Use Only";
    }
}

