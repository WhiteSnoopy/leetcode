package com.org.Implement_strStr;
/*
 * strstr(str1,str2) 函数用于判断字符串str2是否是str1的子串。
 * 如果是，则该函数返回str2在str1中首次出现的地址；否则，返回NULL。
 */
public class Soluction {
	public static int strStr(String haystack, String needle) {
		if(!haystack.contains(needle))
			return -1;
		int cur=0;
		for(int i=0;i<=haystack.length()-needle.length();i++)
		{
			cur=i;
			for(int j=0;j<needle.length();j++)
			{
				if(haystack.charAt(cur)!=needle.charAt(j))
					break;
				cur++;
				if(j==needle.length()-1)
					return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(strStr("abcdefg","cd"));
	}
}
