package com.collections.MapInterface;
import java.util.*;

public class WordFrequencyCounter {
	public static Map<String,Integer> freqCounter(String s){
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		int size =sb.length();
		for(int i=0;i<size;i++) {
			int n= sb.charAt(i);
			if(n<97 || n>122) {
				sb.setCharAt(i,' ');
			}
		}
		String st = sb.toString();
		String arr[] = st.split("\\s+");
		Map<String, Integer> freq = new HashMap<>();
		for(String str: arr) {
			freq.put(str, freq.getOrDefault(str, 0)+1);
		}
		return freq;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter s String: ");
		String s =sc.nextLine();
		
		Map<String, Integer> ans = freqCounter(s);
		
		for(Map.Entry<String, Integer>mp : ans.entrySet()) {
			System.out.println("[ "+mp.getKey()+", "+mp.getValue()+"]");
		}
		System.out.println(ans);
	}
}