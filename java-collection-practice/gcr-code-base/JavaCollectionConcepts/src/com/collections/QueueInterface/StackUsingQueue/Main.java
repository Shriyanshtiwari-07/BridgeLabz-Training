package com.collections.QueueInterface.StackUsingQueue;

public class Main {
	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue();
		
		stack.push(0);
		stack.push(1);
		System.out.println(stack.peek());
		stack.push(2);
		System.out.println(stack.peek());
		System.out.println("Delete from stack: "+stack.pop());
		System.out.println(stack.peek());
	}
}