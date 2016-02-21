package com.org.palindromic;

public class Soluction1 {
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		int res=0;
		int pre=x;
		//avoid overflow
		while(pre>=10)
		{
			int tail=x%10;
			res=res*10+tail;
			pre=pre/10;
		}
		return (res==x/10) && (pre==x%10);
	}
}
