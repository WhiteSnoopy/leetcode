package com.org.Happy_Number;
public class Soluction {
/*
 * ตÝน้
 */
	public static boolean isHappy(int n) {
		int result=0;
		while(n>0)
		{
			int tail=n%10;
			result=(int) (result+Math.pow(tail,2));
			n=n/10;
		}
		System.out.println(result);
		if(result<10)
		{
			if(result==1|| result==7) return true;
			return false;
		}
		return isHappy(result);
	}
	public static void main(String[] args) {
		System.out.println(isHappy(2));
	}

}
