package com.regex.BasicRegexProblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LicensePlateVerifier {
	public static final String LICENSE_PLATE = "[A-Z]{2}[0-9]{4}";
	
	public static boolean isValidLicense(String license) {
		Pattern pattern = Pattern.compile(LICENSE_PLATE);
		
		Matcher matcher = pattern.matcher(license);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		String [] arr = {"AB1234", "A12345", "AAA12345"};
		
		for(String s: arr) {
			System.out.println("License number: "+s+ " is "+(isValidLicense(s) ? "Valid": "Invalid"));
		}
	}
}