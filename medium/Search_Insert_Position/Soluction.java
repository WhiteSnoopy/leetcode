package com.org.Search_Insert_Position;
/*
 * û���ظ��������� ����һ��Ŀ��ֵ���������ֵ����������е��±꣬���target�����ڵĻ���������Ӧ�ô��ڵĵط�
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
