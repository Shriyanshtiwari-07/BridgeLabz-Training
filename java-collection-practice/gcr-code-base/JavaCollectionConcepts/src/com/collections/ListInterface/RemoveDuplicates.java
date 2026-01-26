package com.collections.ListInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public static <T> List<T>  removeDupli(List<T> list) {
		
		List<T> ans = new ArrayList<>();
		for(T s: list) {
			if(!ans.contains(s))
				ans.add(s);
		}
		return ans;
	}
	public static void main(String[] args) {
		Integer arr[] = {3, 1, 2, 2, 3, 4};
		
		List<Integer> list =  Arrays.asList(arr);
		
		System.out.println("List with duplicates: "+list.
				toString());
		List<Integer>  ans = removeDupli(list);
		
		System.out.println("List without duplicates: "+ans.toString());
	}
}