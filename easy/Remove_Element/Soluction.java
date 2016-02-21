package com.org.Remove_Element;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Soluction {
	public static int removeElement1(int[] nums, int val) {
		int len = nums.length;
		for (int i = 0 ; i< len; ++i)
		{
			while (nums[i]==val && i< len) 
			{
				nums[i]=nums[--len];
			}
		}
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
		System.out.println("len:"+len);
		return len;
	}
	public static int removeElement2(int[] nums, int val){
		int N=nums.length;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==val && i<N)
			{
				for(int j=i;j<nums.length-1;j++)
					nums[j]=nums[j+1];
				nums[--N]=val;
				i--;
			}
		}
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
		System.out.println("len:"+N);
		return N;
		
	}
	public static void main(String[] args) {
		int[] A={1,2,3};
		removeElement2(A,2);
	}

}
