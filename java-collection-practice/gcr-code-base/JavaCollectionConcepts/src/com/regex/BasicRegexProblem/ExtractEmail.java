package com.regex.BasicRegexProblem;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractEmail {
	public static final String EMAIL_REGEX ="[A-Za-z0-9._%+-]+"
			+ "@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
	
	public static void main(String[] args) {
		String text = "Contact us at support@example.com and info@company.org";
		
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}