package com.inheritance;

class Device{
	String deviceId;
	String status;
	Device(String deviceId,String status){
		this.deviceId=deviceId;
		this.status=status;
	}
	public void displayStatus(){
		System.out.println("Device ID: "+deviceId);
		System.out.println("Status: "+status);
	}
}

class Thermostat extends Device{
	double temperatureSetting;
	Thermostat(String deviceId,String status,double temperatureSetting){
		super(deviceId,status);
		this.temperatureSetting=temperatureSetting;
	}
	public void displayStatus(){
		super.displayStatus();
		System.out.println("Temperature Setting: "+temperatureSetting+"°C");
	}
}

public class SmartHomeSystem{
	public static void main(String[] args){
		Thermostat thermostat=new Thermostat("TH-101","ON",24.5);
		thermostat.displayStatus();
	}
}
