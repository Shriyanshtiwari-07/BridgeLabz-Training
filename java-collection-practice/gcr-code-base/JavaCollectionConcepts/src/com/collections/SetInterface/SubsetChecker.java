package com.collections.SetInterface;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class SubsetChecker {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(2);
		s1.add(3);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		s2.add(2);
		
		System.out.println("set1 is subset of set2: "+s2.containsAll(s1));
	}
}