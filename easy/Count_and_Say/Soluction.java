package com.org.Count_and_Say;
import java.util.*;
/*
 * 1, 11, 21, 1211, 111221, ...
 *1 is read off as "one 1" or 11.
 *11 is read off as "two 1s" or 21.
 *21 is read off as "one 2, then one 1" or 1211.
 *n=0-->1
 *n=1-->11
 *n=2-->21
 *
 */
public class Soluction {
	public static StringBuilder str=new StringBuilder();
	/*
	 * 超时
	 */
	public static String countAndSay(int n) {
//		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
//		Set<Character> set=new HashSet<Character>();
		if(n<=1)
			return "1";
		if(n==2)
			return "11";
		str.append("11");
//		set.add(str.charAt(0));
		for(int i=3;i<=n;i++)
		{
			int index=1;
			StringBuilder newstr=new StringBuilder();
			//首先判断是否有重复的数字
			for(int j=1;j<=str.length();j++)
			{
				if(j==str.length())
				{
					newstr.append(index);
					newstr.append(str.charAt(j-1));
					index=1;
					str=newstr;
					break;
				}
				else if(str.charAt(j)==str.charAt(j-1))
				{
					index++;
				}
				else
				{
					newstr.append(index);
					newstr.append(str.charAt(j-1));
					index=1;
				}
			}
		}
		return str.toString();
	}
	/*
	 * as
	 */
	public static String countAndSay1(int n) {
		String str="";
		if(n==1)
			return "1";
		countAndSay1(n-1);
		return "";
		
	}
	public static void main(String[] args) {
		System.out.println("3113112221232112111312211312113211");
		System.out.println(countAndSay(12));
	}
}
