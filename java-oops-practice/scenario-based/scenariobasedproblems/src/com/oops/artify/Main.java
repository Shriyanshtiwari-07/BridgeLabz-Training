package com.oops.artify;

class Main {
    public static void main(String[] args) {

        User user = new User("Shriyansh", 5000);

        Artwork art1 = new DigitalArt(
                "Cyber City",
                "Shriyansh",
                1500,
                "Basic Digital",
                "preview1.png"
        );

        Artwork art2 = new PrintArt(
                "Nature Sketch",
                "Mahek Chaurasia",
                2000,
                "Basic Print"
        );

        art1.purchase(user);
        art2.purchase(user);

        System.out.println("Remaining Balance: " + user.walletBalance);
    }
}
