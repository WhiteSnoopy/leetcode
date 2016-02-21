package com.org.Valid_Parentheses;
import java.util.Stack;
public class Soluction {
	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			//如果是{入栈
			if(s.charAt(i)=='{')
			{
				stack.push(s.charAt(i));
			}
			
			if(s.charAt(i)=='}')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(!stack.contains('{'))
				{
					return false;
				}
				stack.pop();
			}
			if(s.charAt(i)=='[')
			{
				stack.push(s.charAt(i));
			}
			if(s.charAt(i)==']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(!stack.contains('['))
				{
					return false;
				}
				stack.pop();
			}	
			if(s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}

			if(s.charAt(i)==')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(!stack.contains('('))
				{
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty()?true:false;
	}
	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
		//)()(
	}
}
