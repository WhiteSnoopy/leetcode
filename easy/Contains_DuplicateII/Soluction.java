package com.org.Contains_DuplicateII;

import java.util.*;

/*
 * 给定一个整数数组nums与一个整数k，当且仅当存在两个不同的下标i和j满足nums[i] = nums[j]并且| i - j | <= k时返回true，否则返回false。
 */
public class Soluction {
	/*
	 * 笨办法
	 */
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int N=nums.length;
		int index_i=-1;
		int index_j=-1;
		for(int i=0;i<N-1;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(nums[i]==nums[j])
				{
					index_i=i;
					index_j=j;
				}
			}
		}
		if(index_i!=-1 && index_j!=-1)
		{
			if(Math.abs(index_i-index_j)<=k)
				return true;
		}
		return true;
	}
	/*
	 * 另解起初使用stack 发现无法去除相同元素 
	 * 尝试采用map来解决此问题
	 */
	public static boolean containsNearbyDuplicate1(int[] nums, int k) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(!map.containsKey(nums[i]))
			{
				map.put(nums[i], i);
			}
			else
			{
				for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
				{
					if(nums[i]==entry.getKey())
					{
						if(Math.abs(i-entry.getValue())<=k)
						{
							return true;
						}
						//直接通过添加现有的抹除原有的值
						map.put(nums[i], i);
					}
				}
			}

		}
		return false;
	}
	/*
	 *保持滑动窗口K 
	 */
	public static boolean asd(int[] nums,int k){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length && i<=k;i++)
		{
			//当set集合中有重复元素出现的时候 此时保持在滑动窗口K中
			if(!set.add(nums[i]))
			{
				return true;
			}
		}
		for(int i=k+1;i<nums.length;i++)
		{
			set.remove(nums[i-k-1]);
			if(!set.add(nums[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static boolean aasdad(int[] nums,int k){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++)
		{
			if(i > k) set.remove(nums[i-k-1]);
			if(!set.add(nums[i])) 
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] A={1,2,1};
		System.out.println(containsNearbyDuplicate1(A,0));
		System.out.println(aasdad(A,1));
		Stack<Integer> test=new Stack<Integer>();
		test.push(1);
		test.push(2);
		test.push(1);
		test.push(4);
		test.push(1);
		test.push(6);
		test.push(7);
		System.out.println(test.indexOf(1)+" "+test.size());
	}
}
