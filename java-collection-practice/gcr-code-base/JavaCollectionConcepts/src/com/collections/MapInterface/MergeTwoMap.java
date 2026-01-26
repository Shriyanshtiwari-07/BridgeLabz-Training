package com.collections.MapInterface;

import java.util.*;

public class MergeTwoMap {
	public static Map<String, Integer> mergeMap(Map<String,Integer> m1, Map<String, Integer> m2){
		Map<String, Integer> ans  = new HashMap<>();
		
		for(Map.Entry<String, Integer> mp: m1.entrySet()) {
			ans.put(mp.getKey(), mp.getValue());
		}
		
		for(Map.Entry<String, Integer> mp: m2.entrySet()) {
			ans.put(mp.getKey(), ans.getOrDefault(mp.getKey(), 0)+mp.getValue());
		}
		return ans;
	}
	public static void main(String[] args) {
		Map<String, Integer> m1  = new HashMap<>();
		m1.put("A",10);
		m1.put("B", 20);
		
		Map<String, Integer> m2  = new HashMap<>();
		m2.put("B", 30);
		m2.put("C", 40);
		
		Map<String, Integer> ans = mergeMap(m1, m2);
		System.out.println("\n"+ans);
		
	}
}