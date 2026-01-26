package com.collections.SetInterface;

import java.util.*;

public class UnionIntersection {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(4);
		s2.add(5);
		s2.add(3);
		
		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		
		System.out.println("Set 1: "+s1.toString());
		System.out.println("Set 2: "+s2.toString());
		
		System.out.println("Union of Set 1 and Set 2: "+ union.toString());
		
		HashSet<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		
		System.out.println("Intersection of Set 1 and Set 2: "+intersection.toString());
	}
}