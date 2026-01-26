package com.collections.ListInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("List: "+list.toString());
		System.out.println("\nReversed List: "+list.reversed().toString());		
	}
}