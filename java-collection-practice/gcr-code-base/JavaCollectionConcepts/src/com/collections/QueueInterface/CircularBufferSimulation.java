package com.collections.QueueInterface;

import java.util.*;

public class CircularBufferSimulation {
	public static void addElement(Queue<Integer> queue, int ele,int buffSize) {
		queue.add(ele);
		if(queue.size()>buffSize)
			queue.poll();
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		addElement(queue, 1,3);
		addElement(queue, 2,3);
		addElement(queue, 3,3);
		System.out.println(queue);
		addElement(queue, 4,3);
		System.out.println(queue);
	}
}