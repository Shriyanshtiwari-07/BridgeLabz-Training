package com.regex.BasicRegexProblem;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateUserName {
	
	public static final String USERNAME_REGEX = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
	
	public static boolean isValidUsername(String username) {
		Pattern pattern = Pattern.compile(USERNAME_REGEX);
		
		Matcher matcher= pattern.matcher(username);
		 return matcher.matches();
	}
	public static void main(String[] args) {
		String[] testUsernames = {
	            "user_123",
	            "123user",
	            "us",
	            "Valid_Name1"
	        };

	        for (String username : testUsernames) {
	            System.out.println(username + " → " + 
	                (isValidUsername(username) ? "Valid" : "Invalid"));
	        }
		
	}
}