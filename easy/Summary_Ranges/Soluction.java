package com.org.Summary_Ranges;
import java.util.*;
public class Soluction {
	public static List<String> summaryRanges(int[] nums) {
		boolean chc=false;
		List<String> list=new ArrayList<String>();
		int N=nums.length;
		if(N==0)
		{
			return list;
		}
		if(N==1)
		{
			list.add(String.valueOf(nums[0]));
			return list;
		}
		for(int i=0;i<N;i++)
		{
			String str="";
			str+=nums[i];
			//如果当前元素与下一个元素是连续的
			while(i<N-1 && Math.abs(nums[i]-nums[i+1])==1)
			{
				i++;
				chc=true;
			}
			if(chc)
			{	
				str=str+"->"+nums[i];
			}
			list.add(str);
			chc=false;
		}
		return list;
	}
	public static void main(String[] args) {
		int[] A={};
		List<String> list=summaryRanges(A);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
