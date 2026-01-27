package com.regex.AdvancedRegexProblem;

import java.util.regex.*;

public class ValidateIPAddress {
	public static final String IP_PATTERN = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
	        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
	        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
	        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
	
	public static void main(String[] args) {
		String[] arr = {"127.0.0.1" , "155.112.123.0", "256.0.0.1"};
		
		 Pattern pattern = Pattern.compile(IP_PATTERN);
		 
		 for(String ip: arr) {
			 Matcher matcher = pattern.matcher(ip);
			 System.out.println("IPAdress: "+ip+" is: "+(matcher.matches()? "valid": "invalid"));
		 }
	}
}
