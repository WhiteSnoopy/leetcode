package com.org.Contains_DuplicateII;

import java.util.*;

/*
 * ����һ����������nums��һ������k�����ҽ�������������ͬ���±�i��j����nums[i] = nums[j]����| i - j | <= kʱ����true�����򷵻�false��
 */
public class Soluction {
	/*
	 * ���취
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
	 * ������ʹ��stack �����޷�ȥ����ͬԪ�� 
	 * ���Բ���map�����������
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
						//ֱ��ͨ��������е�Ĩ��ԭ�е�ֵ
						map.put(nums[i], i);
					}
				}
			}

		}
		return false;
	}
	/*
	 *���ֻ�������K 
	 */
	public static boolean asd(int[] nums,int k){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length && i<=k;i++)
		{
			//��set���������ظ�Ԫ�س��ֵ�ʱ�� ��ʱ�����ڻ�������K��
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
