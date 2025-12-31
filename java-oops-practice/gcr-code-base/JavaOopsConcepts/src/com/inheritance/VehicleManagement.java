package com.inheritance;

class Vehicle{
	int maxSpeed;
	String fuelType;
	Vehicle(int maxSpeed,String fuelType){
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	public void displayInfo(){
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
	}
}

class Car extends Vehicle{
	int seatCapacity;
	Car(int maxSpeed,String fuelType,int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity=seatCapacity;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Seat Capacity: "+seatCapacity);
	}
}

class Truck extends Vehicle{
	double loadCapacity;
	Truck(int maxSpeed,String fuelType,double loadCapacity){
		super(maxSpeed,fuelType);
		this.loadCapacity=loadCapacity;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Load Capacity: "+loadCapacity+" tons");
	}
}

class Motorcycle extends Vehicle{
	boolean hasSideCar;
	Motorcycle(int maxSpeed,String fuelType,boolean hasSideCar){
		super(maxSpeed,fuelType);
		this.hasSideCar=hasSideCar;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Has Side Car: "+hasSideCar);
	}
}

public class VehicleManagement{
	public static void main(String[] args){
		Vehicle[] vehicles=new Vehicle[3];
		vehicles[0]=new Car(180,"Petrol",5);
		vehicles[1]=new Truck(120,"Diesel",10.5);
		vehicles[2]=new Motorcycle(150,"Petrol",false);
		for(Vehicle v:vehicles){
			v.displayInfo();
			System.out.println();
		}
	}
}
