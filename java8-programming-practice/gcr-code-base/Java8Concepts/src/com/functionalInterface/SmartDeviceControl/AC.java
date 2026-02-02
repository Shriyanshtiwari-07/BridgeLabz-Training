package com.functionalInterface.SmartDeviceControl;

public class AC implements Device{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("AC is starting");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("AC is off");
	}

}
