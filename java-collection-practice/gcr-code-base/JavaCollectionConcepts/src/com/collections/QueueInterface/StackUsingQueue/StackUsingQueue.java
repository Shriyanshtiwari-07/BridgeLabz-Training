package com.collections.QueueInterface.StackUsingQueue;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {
	public Queue<Integer> queue;  
	
	public StackUsingQueue(){
		this.queue = new LinkedList<>();
	}
	
	public void push(int num) {
		queue.add(num);
	}
	
	public int pop() {
		Queue<Integer> dummy = new LinkedList<>();
		if(queue.isEmpty()) {
			return -1;
		}
		while(queue.size()!=1) {
			dummy.add(queue.poll());
		}
		while(!dummy.isEmpty()) {
			queue.add(dummy.poll());
		}
		return queue.poll();
	}
	public int peek() {
		Queue<Integer> dummy = new LinkedList<>();
		if(queue.isEmpty()) {
			return -1;
		}
		while(queue.size()!=1) {
			dummy.add(queue.poll());
		}
		while(!dummy.isEmpty()) {
			queue.add(dummy.poll());
		}
		int top = (int)queue.poll();
		queue.add(top);
		return top;
	}
}