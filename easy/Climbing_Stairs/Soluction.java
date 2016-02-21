package com.org.Climbing_Stairs;
/*
 * 斐波那契数列的完美应用
 */
public class Soluction {
	public static int climbStairs(int n) {
		if(n<=0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		int one_step_before=1;
		int two_step_before=2;
		int all_step=0;
		for(int i=2;i<n;i++)
		{
			all_step=one_step_before+two_step_before;
			one_step_before=two_step_before;
			two_step_before=all_step;
		}
		return all_step;
	}
	public static int climbStairs1(int n) {
		if(n==0 || n==1 || n==2)
			return n;
		int[] A=new int[n];
		A[0]=1;
		A[1]=2;
		for(int i=2;i<n;i++)
		{
			A[i]=A[i-1]+A[i-2];
		}
		return A[n-1];
		
	}
	public static void main(String[] args) {
		System.out.println(climbStairs1(4));
	}
}
