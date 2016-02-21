package com.org.House_Robber;
import java.util.Arrays;
/*
 * ���ڵ�n���������������е�ѡ����͵�Ͳ�͵��
 *  ��ô�������������͵ ����һ�������ǲ�͵ ��ô ��һ���ľ��� dp[N] = num[i -1 ] + dpNonTake[N -1] , 
 *  ����dp[N] ��ʾ������N��Ԫ��ʱ������ֵ״̬�� ����ǲ�͵�� ��ô��һ��������ν�ǲ����Ѿ�͵����
 *  ���Ծ�copyΪ dp[N] = dp[N -1 ]���ɣ� �����ܶ���֮Ϊ dp[N] = Math.max(dpNontake[N-1 ] + num��i��, dp[N-1] );
 *   ��Ϊÿһ�ֵ���ֻ��Ҫ������dp ����������ѡ�� ���Կ��Կռ�ѹ��Ϊ ����Ԫ�ؼ��ɡ�һ�� Ϊtake һ��Ϊ nontake �� ����ǰ�����ֵ��
 */
public class Soluction {
	public static int rob(int[] nums) 
	{
		int take = 0;
		int maxProfit = 0;
		int nonTake = 0; 
		for(int i = 0 ; i < nums.length; ++i)
		{
			take = nonTake + nums[i]; 
			nonTake = maxProfit; 
			maxProfit = Math.max(take,nonTake);
			System.out.println("maxProfilt:"+maxProfit);
		}
		return maxProfit;
	}
	public static int rob1(int[] nums){
		int N=nums.length;
		if(N==0)
			return 0;
		if(N==1)
			return nums[0];
		if(N==2)
			return Math.max(nums[0], nums[1]);
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }        
        return dp[nums.length-1];
	}
	public static int rob2(int[] nums ,int length){
		int Max=0;
		if(length==0)
			return 0;
		if(length==1)
			return nums[0];
		if(length==2)
			return Math.max(nums[0], nums[1]);
		Max=Math.max(rob2(nums,length-2)+nums[length-1],rob2(nums,length-1));
		return Max;
	}
	public static void main(String[] args) 
	{
		int[] A={2,1,2,2,4,6};
	//	System.out.println(rob(A));
		System.out.println(rob2(A,A.length));
	}
}
