package com.encapsulation;

interface GPS{
String getCurrentLocation();
void updateLocation(String location);
}
abstract class RideVehicle{
private String vehicleId;
private String driverName;
private double ratePerKm;
private String location;
RideVehicle(String vehicleId,String driverName,double ratePerKm){
this.vehicleId=vehicleId;
this.driverName=driverName;
this.ratePerKm=ratePerKm;
}
public String getVehicleId(){
return vehicleId;
}
public String getDriverName(){
return driverName;
}
public double getRatePerKm(){
return ratePerKm;
}
protected void setLocation(String location){
this.location=location;
}
protected String getLocation(){
return location;
}
public void getVehicleDetails(){
System.out.println(vehicleId);
System.out.println(driverName);
}
abstract double calculateFare(double distance);
}
class CarRide extends RideVehicle implements GPS{
CarRide(String id,String driver,double rate){
super(id,driver,rate);
}
double calculateFare(double distance){
return getRatePerKm()*distance;
}
public String getCurrentLocation(){
return getLocation();
}
public void updateLocation(String location){
setLocation(location);
}
}
class BikeRide extends RideVehicle implements GPS{
BikeRide(String id,String driver,double rate){
super(id,driver,rate);
}
double calculateFare(double distance){
return getRatePerKm()*distance*0.8;
}
public String getCurrentLocation(){
return getLocation();
}
public void updateLocation(String location){
setLocation(location);
}
}
class AutoRide extends RideVehicle implements GPS{
AutoRide(String id,String driver,double rate){
super(id,driver,rate);
}
double calculateFare(double distance){
return getRatePerKm()*distance*0.9;
}
public String getCurrentLocation(){
return getLocation();
}
public void updateLocation(String location){
setLocation(location);
}
}
public class RideTest{
static void processRide(RideVehicle v,double distance){
v.getVehicleDetails();
System.out.println(v.calculateFare(distance));
}
public static void main(String[] args){
RideVehicle v1=new CarRide("C101","Amit",15);
RideVehicle v2=new BikeRide("B202","Riya",10);
RideVehicle v3=new AutoRide("A303","Rahul",12);
RideVehicle[] vehicles={v1,v2,v3};
for(RideVehicle v:vehicles){
processRide(v,10);
}
}
}
