package com.org.House_Robber;
import java.util.Arrays;
/*
 * 对于第n个房间我们所能有的选择是偷和不偷，
 *  那么如果是做决定是偷 则上一步必须是不偷 那么 这一步的就是 dp[N] = num[i -1 ] + dpNonTake[N -1] , 
 *  假设dp[N] 表示的是有N个元素时候的最大值状态。 如果是不偷， 那么上一步就无所谓是不是已经偷过，
 *  所以就copy为 dp[N] = dp[N -1 ]即可， 所以总而言之为 dp[N] = Math.max(dpNontake[N-1 ] + num【i】, dp[N-1] );
 *   因为每一轮迭代只需要触碰到dp 的相邻两个选项 所以可以空间压缩为 两个元素即可。一个 为take 一个为 nontake 和 到当前的最大值。
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
