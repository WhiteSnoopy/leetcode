package com.org.Valid_Anagram;

public class Soluction1 {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		int N=s.length();
		int[] ASC=new int[26];
		for(int i=0;i<N;i++)
			ASC[s.charAt(i)-'a']++;
		for(int i=0;i<N;i++)
			ASC[t.charAt(i)-'a']--;
		for(int i=0;i<ASC.length;i++)
		{
			if(ASC[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	}

}
