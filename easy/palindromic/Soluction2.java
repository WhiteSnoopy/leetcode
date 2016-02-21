package com.org.palindromic;

public class Soluction2 {
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		long res=0;
		int back=x;
		while(x>0)
		{
			int tail=x%10;
			res=res*10+tail;
			x=x/10;
		}
		System.out.println(res);
		return back==res;
	}
	public static void main(String args[]){
		
		System.out.println(isPalindrome(1));
	}
}
