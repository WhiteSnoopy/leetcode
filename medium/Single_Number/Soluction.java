package com.org.Single_Number;
import java.util.*;
/*
 * every element appears twice except for one. Find that single one
 */
public class Soluction {
	/*
	 *采用map来解决此问题 
	 */
	public static int singleNumber(int[] nums) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(map.containsKey(nums[i]))
				map.put(nums[i], 2);
			else
				map.put(nums[i], 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
		return 0;
	}
	/*
	 * 另解
	 */
	public int singleNumber1(int[] nums) {
		return 0;
	}
	public static void main(String[] args) {
		int[] A={1,2,1};
		System.out.println(singleNumber(A));
	}
}
