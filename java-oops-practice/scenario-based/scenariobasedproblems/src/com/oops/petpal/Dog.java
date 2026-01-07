package com.oops.petpal;

public class Dog extends Pet{

	public Dog(String name, int age) {
		super(name, age);
		this.type = "Dog";
	}
	
	@Override
	public void makeSound() {
		System.out.println(super.getName() + ", Bark Bark.....");
	}
}