package com.exception.multiplecatchblocks;
import java.util.*;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		try {
			int n = 5;
			int[] arr = {1, 2, 5, 6, 8};
			
			int idx;
			System.out.println("Enter Index you want to access: ");
			idx = input.nextInt();
			
			System.out.println(arr[idx]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is Out of Bound....");
		}
		catch(NullPointerException e) {
			System.out.println("Array is Empty");
		}
	}

}
