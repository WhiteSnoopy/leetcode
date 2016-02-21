package com.org.Implement_Queue_using_Stacks;

import java.util.Stack;

public class Soluction1 {
	Stack<Integer> pushStack = new Stack<Integer>();
	Stack<Integer> popStack = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		pushStack.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() 
	{
		if(popStack.isEmpty()) 
		{
			while(!pushStack.isEmpty()) 
			{
				popStack.push(pushStack.pop());
			}
		}
		popStack.pop();
	}
	// Get the front element.
	public int peek() {
		if(popStack.isEmpty()) 
		{
			while(!pushStack.isEmpty()) 
			{
				popStack.push(pushStack.pop());
			}
		}
		return popStack.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return pushStack.isEmpty() && popStack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
