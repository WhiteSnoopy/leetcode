package com.org.Implement_Queue_using_Stacks;
import java.util.Stack;
public class Soluction {
	Stack stack =new Stack();
	public void push(int x) 
	{
		stack.push(x);
	}
	public void pop() 
	{
		stack.removeElementAt(0);
	}
	// Get the front element.
	public int peek() {
		int result=0;
		result=(Integer) stack.get(0);
		return result;
	}
	// Return whether the queue is empty.
	public boolean empty() {
		return stack.size()==0;
	}
	public static void main(String[] args) {
		Soluction queue=new Soluction();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.pop();
		queue.pop();
		System.out.println(queue.peek());

		
	}
}
