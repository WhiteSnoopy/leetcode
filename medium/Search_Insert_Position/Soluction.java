package com.org.Search_Insert_Position;
/*
 * 没有重复的数组中 给定一个目标值，查找这个值在这个数组中的下标，如果target不存在的话，返回他应该存在的地方
 */
public class Soluction {
	public int searchInsert(int[] nums, int target) {
		int N=nums.length;
		if(nums[0]>target)
		{
			return 0;
		}
		else if(nums[N-1]<target)
		{
			return N;
		}
		else
		{
			if(nums[N-1]==target)
				return N-1;
			for(int i=0;i<N-1;i++)
			{
				if(nums[i]==target)
					return i;
				if(nums[i]<target&&target<nums[i+1])
					return i+1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
	}
}
