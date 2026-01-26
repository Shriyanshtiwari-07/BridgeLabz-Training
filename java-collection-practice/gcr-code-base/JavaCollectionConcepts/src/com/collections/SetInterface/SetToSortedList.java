package com.collections.SetInterface;

import java.util.*;

public class SetToSortedList {
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(5);
		s1.add(3);
		s1.add(9);
		s1.add(1);
		
		List<Integer> ans = new ArrayList<>(s1);

		Collections.sort(ans);
		System.out.println("Sorted list"+ ans);
	}
}