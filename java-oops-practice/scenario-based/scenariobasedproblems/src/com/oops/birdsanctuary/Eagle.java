package com.oops.birdsanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " soars high in the sky.");
    }

    @Override
    public void displayInfo() {
        System.out.println(getId() + " | " + getName() + " | Eagle | Flyable");
    }
}
