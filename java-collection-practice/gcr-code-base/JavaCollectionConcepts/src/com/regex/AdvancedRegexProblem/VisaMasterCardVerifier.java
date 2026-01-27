package com.regex.AdvancedRegexProblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class VisaMasterCardVerifier {
	public static final String VISA_REGEX = "^4[0-9]{15}$";
	public static final String MASTER_REGEX = "^5[1-5][0-9]{14}$";
	
	public static void main(String[] args) {
		String arr[] = {"1234567890111213", "4123456018123456","5123456789012345"};
		
		Pattern visa = Pattern.compile(VISA_REGEX);
		Pattern master = Pattern.compile(MASTER_REGEX);
		
		for(String s: arr) {
			Matcher vis = visa.matcher(s);
			
			Matcher mas = master.matcher(s);
			
			if(vis.matches())
				System.out.println("Card number "+s+" is a: "+"Visa card");
			else if(mas.matches())
				System.out.println("Card number "+s+" is a: "+"Master card");
			else
				System.out.println("Invalid card number");
		}
	}
}