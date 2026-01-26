package com.collections.MapInterface;

import java.util.*;

public class KeyWithMaxValue {
	public static String maxKey(Map<String, Integer> map){
		String ans=null;
		int val =Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> mp : map.entrySet()) {
			if(mp.getValue()>val) {
				val =mp.getValue();
				ans = mp.getKey();
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);
		
		String ans = maxKey(map);
		System.out.println("Key with max value: "+ans);
	}
}