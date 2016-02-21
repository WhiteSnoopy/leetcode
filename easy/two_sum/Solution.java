package com.org.two_sum;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
    	int[] a={1,2,3,4,5};
    	int temp[]=twoSum(a,6);
    	for(int i=0;i<temp.length;i++)
    	{
    		System.out.println(temp[i]);
    	}
    }
}
