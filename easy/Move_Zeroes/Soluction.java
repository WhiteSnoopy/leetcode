package com.org.Move_Zeroes;
public class Soluction {
	public static void moveZeroes(int[] nums) {
		int count=0;
		for(int i=0 ; i< nums.length ;i++)
		{
			if((i+count)==nums.length)
				break;
			if(nums[i]==0)
			{
				if((i+count)==nums.length)
					break;
				for(int j=i ;j<nums.length-1;j++)
				{
					nums[j]=nums[j+1];
				}
				nums[nums.length-1]=0;
				i--;
				count++;
			}
		}	
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		int[] nums = {0, 1,0,3,12};
		moveZeroes(nums);
	}
}
