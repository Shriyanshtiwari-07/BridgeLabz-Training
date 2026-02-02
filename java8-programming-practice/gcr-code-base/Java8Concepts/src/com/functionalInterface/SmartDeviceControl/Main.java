package com.functionalInterface.SmartDeviceControl;

public class Main {
	public static void main(String[] args) {
		
		AC ac = new AC();
		ac.turnOn();
		ac.turnOff();
		
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		
		Lights light = new Lights();
		light.turnOn();
		light.turnOff();
	}
}
