package com.org.Single_NumberIII;

import java.util.HashMap;
import java.util.Map;

/*
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 */
public class Soluction {
	public static int[] singleNumber(int[] nums) {
		int[] A=new int[2];
		int N=nums.length;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++)
		{
			if(map.containsKey(nums[i]))
				map.put(nums[i], 2);
			else
				map.put(nums[i], 1);
		}
		int index=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			if(index<2 && entry.getValue()==1)
			{
				A[index]=entry.getKey();
				index++;
			}
		}
		return A;
	}
	public static void main(String[] args) {
		int[] A={1,2,1,3};
		singleNumber(A);
	}
}
