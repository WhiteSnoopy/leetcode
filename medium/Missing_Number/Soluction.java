package com.org.Missing_Number;
/*
 * 中文：给出一个包含了n个不同数字的数组，从0开始一直到n，找出缺失的数字。如果数组是连续的则返回n+1。
 * 例如：给出的数组为 [0, 1, 3] 则返回2
 */
import java.util.Arrays;

public class Soluction {
	public static int missingNumber(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
		}
		int temp=(nums.length+0)*(nums.length+1)/2;
		if(temp>sum)
			return temp-sum;
		return 0;
	}
	public static void main(String[] args) {
		int[] A={1};
		System.out.println(missingNumber(A));
	}
}
