package com.org.Valid_Anagram;
import java.util.*;
public class Soluction {
	public static boolean isAnagram(String s, String t) {
		int counts=0;
		int countt=0;
		if(s.length()!=t.length())
			return false;
		int N=s.length();
		String[] str=new String[s.length()];
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!s.contains(String.valueOf(t.charAt(i))))
					return false;
			if(!t.contains(String.valueOf(s.charAt(i))))
					return false;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					counts++;											
			}
			for(int k=0;k<t.length();k++)
			{
				if(t.charAt(i)==t.charAt(k))
					countt++;
			}
			map.put(s.charAt(i), counts);
			map1.put(t.charAt(i),countt);
			counts=0;																			
			countt=0;
		}
		if(map1.size()!=map.size())
			return false;
		Iterator<Map.Entry<Character, Integer>> entries = map.entrySet().iterator();  
		while (entries.hasNext()) 
		{  
		    Map.Entry<Character, Integer> entry = entries.next();
			Iterator<Map.Entry<Character, Integer>> entries1 = map1.entrySet().iterator();
			while (entries1.hasNext()) 
			{ 
				 Map.Entry<Character, Integer> entry1 = entries1.next();
				 if(entry.getKey()==entry1.getKey())
					 if(entry.getValue()!=entry1.getValue())
						 return false;
			}
		}  
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("abcaaa","abcaaa"));
	}

}
