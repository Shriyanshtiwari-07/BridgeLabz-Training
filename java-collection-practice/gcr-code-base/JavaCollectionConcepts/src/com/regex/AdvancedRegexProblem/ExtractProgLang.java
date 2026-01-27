package com.regex.AdvancedRegexProblem;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractProgLang {
	public static final String LANG_REGEX= "\\b(Python|Java|JavaScript|Go|C\\+\\+|Ruby|Rust)\\b";
	
	public static void main(String[] args) {
		String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
		
		Pattern pattern = Pattern.compile(LANG_REGEX);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
	}
}
