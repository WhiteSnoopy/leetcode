package com.org.Length_of_Last_Word;
/*
 * 先把唯尾部的space字符去除掉
 */
public class Solction {
	public static int lengthOfLastWord(String s) {
		s=s.trim();
		int count=0;
		if(s==null)
			return 0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
				count++;
			else
				break;
		}
		return count;
	}
	public static void main(String[] args) {
		//System.out.println(lengthOfLastWord("abc     efg"));
		System.out.println(lengthOfLastWord(" a"));
	}
}
