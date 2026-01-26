package com.collections.SetInterface;

import java.util.*;

public class SetEquality {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(3);
		s2.add(2);
		s2.add(1);
		System.out.println("set 1: "+s1.toString());
		System.out.println("set 2: "+s2.toString());
		
		System.out.println("Two sets are equal: "+s1.equals(s2));
	}
}