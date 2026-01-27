package com.regex.BasicRegexProblem;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractDate {
	public static final String DATE_PATTERN = "[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}";
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(DATE_PATTERN);
		
		String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
		
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
	}
}