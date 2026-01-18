package com.oops.birdsanctuary;

public class Main {
    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();

        sanctuary.addBird(new Eagle("B1", "Aquila"));
        sanctuary.addBird(new Duck("B2", "Donald"));
        sanctuary.addBird(new Penguin("B3", "Pingu"));
        sanctuary.addBird(new Kiwi("B4", "Kiko"));

        sanctuary.displayAllBirds();
        sanctuary.displayFlyingBirds();
        sanctuary.displaySwimmingBirds();
        sanctuary.sanctuaryReport();
    }
}