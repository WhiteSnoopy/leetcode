package com.org.Missing_Number;
/*
 * ���ģ�����һ��������n����ͬ���ֵ����飬��0��ʼһֱ��n���ҳ�ȱʧ�����֡�����������������򷵻�n+1��
 * ���磺����������Ϊ [0, 1, 3] �򷵻�2
 */
import java.util.Arrays;

public class Soluction {
	public static int missingNumber(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
		}
		int temp=(nums.length+0)*(nums.length+1)/2;
		if(temp>sum)
			return temp-sum;
		return 0;
	}
	public static void main(String[] args) {
		int[] A={1};
		System.out.println(missingNumber(A));
	}
}
