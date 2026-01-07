package com.oops.petpal;


public class Cat extends Pet{
	
	public Cat(String name, int age) {
		super(name, age);
		this.type = "Cat";
	}
	
	@Override
	public void makeSound() {
		System.out.println(super.getName() +", Meow Meow.....");
	}	
	
}