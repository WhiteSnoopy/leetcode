package com.org.Min_Stack;
import java.util.Arrays;
import java.util.Stack;
public class Soluction1 {
	public static void main(String[] args) 
	{
		MinStack stack =new MinStack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		System.out.println(stack.top());
	}
}
class MinStack {
	public Stack<Integer> stack=new Stack<Integer>();
	public int minvalue=0;
	public void push(int x) 
	{
		if(stack.isEmpty())
		{
			minvalue=x;
			stack.push(x);
		}
		else
		{
			minvalue=Math.min(minvalue, x);
			stack.push(x);
		}
	}

	public void pop() 
	{
		if(stack.isEmpty())
			return;
		if(stack.size()==1)
		{
			stack.pop();
			return;
		}
		int x=stack.peek();
		if(x==minvalue)
		{
			Object[] A=stack.toArray();
			Arrays.sort(A);
			minvalue=Integer.parseInt(String.valueOf(A[1]));
		}
		stack.pop();
	}

	public int top() 
	{
		return stack.peek();
	}

	public int getMin() 
	{
		return minvalue;
	}
}
