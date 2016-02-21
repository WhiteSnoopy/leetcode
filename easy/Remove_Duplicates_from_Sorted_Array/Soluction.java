package com.org.Remove_Duplicates_from_Sorted_Array;
import java.util.*;
public class Soluction {
	public static int removeDuplicates(int[] nums) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], 1);
		}
		int i=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			nums[i]=entry.getKey();
			i++;
		}
		return map.size();
	}
	public static int removeDuplicates1(int[] nums) {
		int N=nums.length;
		for(int i=0;i<nums.length-1;i++)
		{
			while(nums[i]==nums[i+1] && i < N-1)
			{
				int temp=0;
				temp=nums[i];
				nums[i]=nums[--N];
				nums[N]=temp;
			}
				
		}
		return N;
	}
	public static void main(String[] args) {
		int[] A={1,1,2};
		System.out.println(removeDuplicates1(A));
	}
}
