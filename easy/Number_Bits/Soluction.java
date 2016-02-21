package com.org.Number_Bits;
public class Soluction {
	public int hammingWeight(int n) {
		int count=0;
		String str=Integer.toBinaryString(n);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1')
				++count;
		}
		return count;

	}
	public static void main(String[] args) {
		int N=111;
		System.out.println(Integer.toBinaryString(N));
		
	}

}
