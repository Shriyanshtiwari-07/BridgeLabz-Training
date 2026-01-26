package com.collections.QueueInterface.HospitalTriageSystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Queue<Patient> queue = new PriorityQueue<>((p1,p2) -> Integer.compare(p2.severity, p1.severity));
		
		queue.add(new Patient("John", 3));
		queue.add(new Patient("Alice", 5));
		queue.add(new Patient("Bob", 2));
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll().name);
		}
		
	}
}