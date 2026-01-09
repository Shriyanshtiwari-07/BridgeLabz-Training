package com.oops.artify;

abstract class Artwork implements IPurchasable {
    String title;
    String artist;
    double price;
    protected String licenseType;
    String preview;

    Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    Artwork(String title, String artist, double price, String licenseType, String preview) {
        this(title, artist, price, licenseType);
        this.preview = preview;
    }

    public void purchase(User user) {
        if (user.walletBalance >= price) {
            user.deduct(price);
            license();
        }
    }
}
