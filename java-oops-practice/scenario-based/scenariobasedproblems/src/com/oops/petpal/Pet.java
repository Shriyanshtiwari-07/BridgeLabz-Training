package com.oops.petpal;

import java.util.Random;

public class Pet implements IInteractable{
	private String name;
    protected String type;
    private int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = full energy
    private String mood;

    // Constructor for random
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(40);     
        this.energy = 60 + r.nextInt(40);
        updateMood();
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Pet makes a sound...");
    }

    
    @Override
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
        System.out.println(name + " is feed");
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 15;
        normalize();
        updateMood();
        System.out.println(name + " is playing");
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        normalize();
        updateMood();
        System.out.println(name + " is sleeping");
    }

    private void normalize() {
        if (energy > 100) energy = 100;
        if (hunger > 100) hunger = 100;
    }

    private void updateMood() {
        if (hunger > 70)
            mood = "Hungry";
        else if (energy < 30)
            mood = "Tired";
        else
            mood = "Happy";
    }

    public void showStatus() {
        System.out.println("Pet: " + name + " (" + type + ")");
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
        System.out.println("--------------------");
    }
}
