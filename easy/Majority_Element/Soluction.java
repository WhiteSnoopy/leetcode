package com.org.Majority_Element;
import java.util.*;
public class Soluction {
	public static int majorityElement(int[] nums) {
		int N=nums.length;
		int count=1;
		int result=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j] && i!=j)
				{
					count++;
				}
			}
			if(count>N/2)
				result=nums[i];
		}
		return result;
	}
	public static int majorityElement1(int[] num) {
		int major=num[0];
		int count = 1;
		for(int i=1; i<num.length;i++){
			if(count==0)
			{
				count++;
				major=num[i];
			}
			else if(major==num[i])
			{
				count++;
			}
			else count--;
		}
		return major;
	}
	public static int majorityElement2(int[] num) {
		Arrays.sort(num);
		return num[num.length/2];
		
	}
	public static void main(String[] args) {
		int[] A={1,2,3};
		System.out.println(majorityElement1(A));
	}
}
