package com.oops.campusconnect;

public class Main {
	public static void main(String[] args) {

        Person s1 = new Student("Lucky", "lucky@uni.edu", "S101");
        Person f1 = new Faculty("Himesh", "himesh@uni.edu", "F201");

        s1.printDetails(); 
        System.out.println();
        f1.printDetails(); 
    }
}