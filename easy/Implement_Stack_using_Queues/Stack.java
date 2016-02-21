package com.org.Implement_Stack_using_Queues;
/*
 * 由于栈是先进后出 ，而队列则是先进先出，只需要把队列中的顺序反转即可，而队列的实现则可以通过list来实现，或者可以通过循环数组来实现
 */
import java.util.*;
public class Stack {
	public Queue<Integer> queue;
	public Stack(){
		this.queue=(Queue<Integer>) new LinkedList<Integer>();
	}
	public void push(int x) {
		queue.add(x);
		for(int i=0;i<queue.size()-1;i++)
			queue.add(queue.poll());
	}
	// Removes the element on top of the stack.
	public void pop() {
		queue.poll();
	}

	// Get the top element.
	public int top() {
		return queue.peek();
	}
	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}
