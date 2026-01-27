package com.regex.BasicRegexProblem;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractCaptialize {
	
	public static final String CAPITALIZE_REGEX = "\\b[A-Z][a-z]+\\b";
	public static void main(String[] args) {
		String text="The Eiffel Tower is in Paris and "
				+ "the Statue of Liberty is in New York.";
		
		Pattern pattern = Pattern.compile(CAPITALIZE_REGEX);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
	}
}