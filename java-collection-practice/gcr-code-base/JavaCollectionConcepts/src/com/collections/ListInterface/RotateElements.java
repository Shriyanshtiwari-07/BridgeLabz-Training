package com.collections.ListInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateElements {
	
	private static void reverse(List<Integer> list, int i, int j) {
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
	
	public static void rotateBySpecific(List<Integer> list, int k) {
		
		int n = list.size();
        k = k % n; 
        
        reverse(list, 0, k - 1);

        reverse(list, k, n - 1);

        reverse(list, 0, n - 1);;
		}
	
	public static void main(String[] args) {
		Integer arr[] = {10, 20, 30, 40, 50};
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println("List before rotation: "+list.toString());
		rotateBySpecific(list,2);
		
		System.out.println("\nList after rotation: "+list.toString());
	}
}