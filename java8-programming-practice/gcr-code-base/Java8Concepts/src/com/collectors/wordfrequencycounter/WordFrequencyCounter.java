package com.collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph =
                "Java Stream API makes Java powerful and Java Stream is modern";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                      .collect(Collectors.toMap(
                              word -> word,        
                              word -> 1,           
                              Integer::sum         
                      ));

        wordCount.forEach((word, count) ->
                System.out.println(word + " -> " + count));
    }
}
