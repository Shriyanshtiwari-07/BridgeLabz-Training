package com.cinemahouse;

import java.util.Scanner;

public class CinemaHouse {

	public static void bubbleSort(int[] shows) {
		int n = shows.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(shows[j] > shows[j+1]) {
					int temp = shows[j];
					shows[j] = shows[j + 1];
					shows[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		int noOfShows;
		System.out.println("Enter Number of Shows: ");
		noOfShows = input.nextInt();
		
		int[] shows = new int[noOfShows];
		
		System.out.println("Enter shows duration (in minute): ");
		for(int i=0; i<noOfShows; i++) {
			shows[i] = input.nextInt();
		}
		
		bubbleSort(shows);
		
		System.out.print("Show Duration in Sorted.....: ");
		for(int duration: shows) {
			System.out.print(duration + " ");
		}
	}

}
