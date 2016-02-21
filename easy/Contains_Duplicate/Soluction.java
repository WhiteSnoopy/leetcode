package com.org.Contains_Duplicate;

import java.util.LinkedHashMap;

/*
 * 笨办法
 */
public class Soluction {
	public boolean containsDuplicate(int[] nums) {
		for(int i=0 ; i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static boolean containsDuplicate1(int[] nums) {
		//采用linkedhashmap消除重复
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], i);
		}
		if(map.size()==nums.length)
			return false;
		return true;
	}
	public static void main(String[] args) {
		int[] A={1,2,3,1};
		System.out.println(containsDuplicate1(A));
	}

}
