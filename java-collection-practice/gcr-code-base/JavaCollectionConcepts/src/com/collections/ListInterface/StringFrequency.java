package com.collections.ListInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StringFrequency {
	public static Map<String, Integer> stringFreq(List<String> list){
		
		Map<String, Integer> freq = new HashMap<>();
		
		for(String s: list) {
			freq.put(s, freq.getOrDefault(s, 0)+1);
		}
		
		return freq;
	}
	public static void main(String[] args) {
		String arr[] = {"apple", "banana", "apple", "orange"};
		List<String> list = Arrays.asList(arr);
		
		Map<String, Integer> ans = stringFreq(list);
		
		System.out.println("List elements with their frequencies: ");
		for(Map.Entry<String, Integer> s: ans.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
	}
}