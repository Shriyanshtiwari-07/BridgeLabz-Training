package com.linearbinarysearch.compare;


public class CompareBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1_000_000; // Number of strings to concatenate
        String text = "hello";

        // -----------------------------
        // Using StringBuffer
        // -----------------------------
        long startTimeBuffer = System.nanoTime();

        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append(text);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");

        // -----------------------------
        // Using StringBuilder
        // -----------------------------
        long startTimeBuilder = System.nanoTime();

        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append(text);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");
	}

}