package com.regex.BasicRegexProblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HexaColorCodeVerify {
	public static final String HEX_COLOR_REGEX = "^[#][0-9A-Za-z]{6}";
	
	public static boolean isValidCode(String hexaCode) {
		Pattern pattern = Pattern.compile(HEX_COLOR_REGEX);
		
		Matcher matcher = pattern.matcher(hexaCode);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		String[] arr=  {"#FFA500",	"#ff4500", "#123","FFA500"};
		
		for(String i: arr) {
			System.out.println("hexa code: "+i+" is: "+
					(isValidCode(i)? "Valid" : "Invlaid"));
		}
	}
}