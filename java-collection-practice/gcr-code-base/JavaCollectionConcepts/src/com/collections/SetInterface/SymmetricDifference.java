package com.collections.SetInterface;
import java.util.*;

public class SymmetricDifference {
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		
		Set<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		
		Set<Integer> inter = new HashSet<>(s1);
		inter.retainAll(s2);
		
		union.removeAll(inter);
		
		System.out.println("Symmetric difference of set1 and set2 is: "+union.toString());
	}
}