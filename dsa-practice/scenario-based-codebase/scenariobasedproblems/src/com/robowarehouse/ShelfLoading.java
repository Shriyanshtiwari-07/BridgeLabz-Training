package com.robowarehouse;

public class ShelfLoading {

	public static void insertionSort(double[] shelves) {
		
		int n = shelves.length;
		for(int i=0; i<n; i++) {
			double curr = shelves[i];
			int j = i-1;
			
			while(j >= 0 && shelves[j] > curr) {
				shelves[j + 1] = shelves[j];
				j--;
			}
			shelves[j + 1] = curr;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] shelves = {230, 340, 330.9, 292, 102, 129.5};
		insertionSort(shelves);
		
		System.out.print("Sorted Packages.....: ");
		for(double shelve: shelves) {
			System.out.print(shelve + " ");
		}
		
	}

}