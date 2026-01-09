package com.oops.artify;

class PrintArt extends Artwork {
    PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    PrintArt(String title, String artist, double price, String licenseType, String preview) {
        super(title, artist, price, licenseType, preview);
    }

    public void license() {
        licenseType = "Print License: Limited Copies";
    }
}
