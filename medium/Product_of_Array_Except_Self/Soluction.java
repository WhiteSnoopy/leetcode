package com.org.Product_of_Array_Except_Self;

import java.util.List;

/*
 * 返回同样一个数组 ，当前位置元素是其他位置的乘积
 * 不可以使用除法
 *   2    3     4       5
 *   1   1*2  1*2*3  1*2*3*4
 */ 
public class Soluction {
	public int[] productExceptSelf(int[] nums) {
		int N=nums.length;
		int[] A=new int[N];
		A[0]=1;
		for(int i=1;i<N;i++)
		{
			A[i]=A[i-1]*nums[i-1];
		}
		int temp=1;
		for(int i=N-1-2;i>=0;i--)
		{
			temp=temp*nums[i+1];
			A[i]=A[i]*temp;
		}
		return nums;
	}
	public static void main(String[] args) {
	}
}
