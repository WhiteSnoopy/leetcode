package com.org.Best_Time_to_Buy_and_Sell_StockII;

import java.util.Arrays;

/*
 * 找到该数组中连续递增的值。
 */
public class Soluction {
	public static int maxProfit(int[] prices) {
		int N=prices.length;
		if(N==0||N==1)
			return 0;
		int profit=0;
		int start=0;
		int end=0;
		for(int i=0;i<N;i++)
		{
			//递增  才会产生利润
			if(i<N-1 && prices[i+1]>prices[i])
			{
				end=i+1;
			}
			else
			{
				profit=profit+prices[end]-prices[start];
				start=i+1;
				end=i+1;
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int[] A={2,1,2,0,1};
		System.out.println(maxProfit(A));
	}
}
