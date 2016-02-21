package com.org.Power_of_Two;
public class Soluction {
	public boolean isPowerOfTwo(int n) {
		if(n==0)
			return false;
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(Integer.bitCount(32));
	}
}
/// 1000
/// 0111
