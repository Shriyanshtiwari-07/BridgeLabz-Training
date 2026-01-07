package com.oops.petpal;

public class PetPalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet p1 = new Dog("Jack", 11);
		Pet p2 = new Cat("Jully", 9);
		
		User swaraj = new User("Swaraj", 23);
		User ritesh = new User("Ritesh", 21);
		
		swaraj.adoptPet(p1);
		swaraj.interactWithPet();
		
		ritesh.adoptPet(p2);
		ritesh.interactWithPet();
	}

}