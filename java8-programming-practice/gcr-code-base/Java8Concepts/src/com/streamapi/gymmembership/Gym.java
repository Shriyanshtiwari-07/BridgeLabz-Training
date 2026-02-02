package com.streamapi.gymmembership;
import java.time.LocalDate;

public class Gym {
	private String memberName;
	private LocalDate expiryDate;
	
	public Gym(String name, LocalDate date) {
		this.memberName = name;
		this.expiryDate = date;
	}
	
	public String getName() {
		return memberName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	
	@Override
	public String toString() {
		return memberName + " | Expiry: " + expiryDate;
	}
}
