package com.regex.BasicRegexProblem;

public class ReplaceSpaces {
	public static final String SPACE_REGEX = "\\s{2,}";
	
	public static void main(String[] args) {
		
		String text ="   This  is   an example with   multiple spaces.  ";
		System.out.println("before: "+text);
		
		text = text.replaceAll(SPACE_REGEX, " ");
		text = text.replaceAll("^\\s+|\\s+$", "");
		System.out.println("After removing space: "+text);
	}
}