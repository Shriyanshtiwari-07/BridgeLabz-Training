package com.regex.AdvancedRegexProblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractCurrency {

    public static final String CURRENCY_REGEX = "\\$?\\d+(\\.\\d+)?";

    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        Pattern pattern = Pattern.compile(CURRENCY_REGEX);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            if (result.length() > 0) result.append(", ");
            result.append(matcher.group());
        }

        System.out.println(result.toString());
    }
}
