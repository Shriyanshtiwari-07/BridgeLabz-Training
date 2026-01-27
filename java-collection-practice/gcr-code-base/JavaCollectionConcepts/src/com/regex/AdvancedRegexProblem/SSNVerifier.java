package com.regex.AdvancedRegexProblem;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SSNVerifier {
	public static final String SSN_REGEX ="\\b[1-9]\\d{2}-\\d{2}-\\d{4}\\b";
	
	public static void main(String[] args) {
		String text ="My SSN is 123-45-6789.";
		
		Pattern pattern = Pattern.compile(SSN_REGEX);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}