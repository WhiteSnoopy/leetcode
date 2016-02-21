package com.org.Longest_Common_Prefix;
/*
 * 求所有字符串的最长公共前缀，即数组的所有字符串都包含这个前缀
 */
public class Soluction {
	public static String longestCommonPrefix(String[] strs) {
		String store="";
		int N=strs.length;
		if(N==0)
			return "";
		if(N==1)
			return strs[0];
		for(int i=0; i<strs[0].length()&&i<strs[1].length();i++)
		{
			if(strs[0].charAt(i)!=strs[1].charAt(i))
				break;
			store+=strs[0].charAt(i);
		}
		for(int i=2 ; i<N ; i++)
		{
			if(strs[i].equals(""))
				return "";
			for(int j=0;j<store.length();j++)
			{
				if(j>=strs[i].length() || strs[i].charAt(j)!=store.charAt(j))
					store=store.substring(0,j);
			}
		}
		return store;
	}
	public static void main(String[] args) {
		String str="abc";
		String str1="abd";
		String[] test={"ac","ac","a","a"};
		System.out.println(longestCommonPrefix(test));
	}
}
