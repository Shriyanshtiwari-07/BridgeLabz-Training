package com.regex.BasicRegexProblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CensorBadWords {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid", "ugly"};

        for (String bad : badWords) {
            text = text.replaceAll("\\b" + bad + "\\b", "****");
        }

        System.out.println(text);
    }
}