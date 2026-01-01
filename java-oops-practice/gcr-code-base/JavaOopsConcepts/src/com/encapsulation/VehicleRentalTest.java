package com.encapsulation;

//Interface for insurance-related behavior
interface Insurable{
 double calculateInsurance();
 String getInsuranceDetails();
}

//Abstract Vehicle class
abstract class Vehicle{

 // Encapsulated fields
 private String vehicleNumber;
 private String type;
 private double rentalRate;
 private String insurancePolicyNumber;

 // Constructor
 Vehicle(String vehicleNumber,String type,double rentalRate,String policy){
     this.vehicleNumber=vehicleNumber;
     this.type=type;
     this.rentalRate=rentalRate;
     this.insurancePolicyNumber=policy;
 }

 // Getters and setters
 public String getVehicleNumber(){
     return vehicleNumber;
 }

 public String getType(){
     return type;
 }

 public double getRentalRate(){
     return rentalRate;
 }

 public void setRentalRate(double rentalRate){
     this.rentalRate=rentalRate;
 }

 protected String getInsurancePolicyNumber(){
     return insurancePolicyNumber;
 }

 // Abstract method
 abstract double calculateRentalCost(int days);
}

//Car class
class Car extends Vehicle implements Insurable{

 Car(String number,double rate,String policy){
     super(number,"Car",rate,policy);
 }

 double calculateRentalCost(int days){
     return getRentalRate()*days;
 }

 public double calculateInsurance(){
     return getRentalRate()*0.10;
 }

 public String getInsuranceDetails(){
     return "Car Insurance";
 }
}

//Bike class
class Bike extends Vehicle implements Insurable{

 Bike(String number,double rate,String policy){
     super(number,"Bike",rate,policy);
 }

 double calculateRentalCost(int days){
     return getRentalRate()*days*0.8;
 }

 public double calculateInsurance(){
     return getRentalRate()*0.05;
 }

 public String getInsuranceDetails(){
     return "Bike Insurance";
 }
}

//Truck class
class Truck extends Vehicle implements Insurable{

 Truck(String number,double rate,String policy){
     super(number,"Truck",rate,policy);
 }

 double calculateRentalCost(int days){
     return getRentalRate()*days*1.5;
 }

 public double calculateInsurance(){
     return getRentalRate()*0.20;
 }

 public String getInsuranceDetails(){
     return "Truck Insurance";
 }
}

//Test class
public class VehicleRentalTest{

 static void processVehicle(Vehicle v,int days){
     double insurance=0;
     if(v instanceof Insurable){
         insurance=((Insurable)v).calculateInsurance();
     }
     double rental=v.calculateRentalCost(days);
     System.out.println(v.getType());
     System.out.println(rental);
     System.out.println(insurance);
 }

 public static void main(String[] args){

     Vehicle v1=new Car("MH12A1",2000,"P101");
     Vehicle v2=new Bike("MH12B2",800,"P102");
     Vehicle v3=new Truck("MH12T3",5000,"P103");

     Vehicle[] vehicles={v1,v2,v3};

     for(Vehicle v:vehicles){
         processVehicle(v,3);
     }
 }
}
