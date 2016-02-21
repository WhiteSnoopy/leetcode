package com.org.Min_Stack;
import java.util.*;
public class Soluction {
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push(-2);
		stack.push(0);
		stack.push(-1);
		System.out.println(stack.getMin());
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.getMin());
	}
}
class MyStack{
	private Stack<Integer> mStack = new Stack<Integer>();
	private Stack<Integer> mMinStack = new Stack<Integer>();
	public void push(int x) {
		mStack.push(x);
		if (mMinStack.size() != 0) 
		{
			int min = mMinStack.peek();
			if (x <= min) {
				mMinStack.push(x);
			}
		} 
		else 
		{
			mMinStack.push(x);
		}
	}

	public void pop() {
		int x = mStack.pop();
		if (mMinStack.size() != 0) 
		{
			if (x == mMinStack.peek()) 
			{
				mMinStack.pop();
			}
		}
	}

	public int top() {
		return mStack.peek();
	}

	public int getMin() {
		return mMinStack.peek();
	}
}