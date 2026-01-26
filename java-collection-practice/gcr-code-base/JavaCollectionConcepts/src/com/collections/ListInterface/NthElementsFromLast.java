package com.collections.ListInterface;

import java.util.*;

public class NthElementsFromLast {
	public static void main(String[] args) {
		Character arr[] = {'A', 'B', 'C', 'D', 'E'};
		int n = 2;
		List<Character> lst =  Arrays.asList(arr);
		
		int size = lst.size();
		n = size-n;
		
		char ch =(char) lst.get(n);
		System.out.println("character at "+n+"th position from last is: "+ch);
	}
}
