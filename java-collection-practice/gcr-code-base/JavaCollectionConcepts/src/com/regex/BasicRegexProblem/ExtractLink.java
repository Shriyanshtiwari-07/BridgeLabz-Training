package com.regex.BasicRegexProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractLink {
	public static final String LINK_REGEX = "https?://[^\\s]+";
	
	public static void main(String[] args) {
		String text = "Visit https://www.google.com and http://example.org for more info.";
		
		Pattern pattern = Pattern.compile(LINK_REGEX);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
	}
}