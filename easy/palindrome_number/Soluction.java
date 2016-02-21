package com.org.palindrome_number;

public class Soluction {
	public static boolean isPalindrome(int x) {
		String str=String.valueOf(x);
		int N=str.length();
		if(N==1) return true;
		for(int i=0;i<N/2;i++)
		{
			if(str.charAt(i)!=str.charAt(N-1-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(-123));
	}
}
