package com.org.reverse_integer;

public class Soluction2 {
	public int reverse(int x){
		long result=0;
		while(x!=0)
		{
			int tail=x%10;
			result=result*10+tail;
			x=x/10;
			if(Math.abs(result)>Integer.MAX_VALUE) return 0;
		}
		return (int) result;
	}
}
