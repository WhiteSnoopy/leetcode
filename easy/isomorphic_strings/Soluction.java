package com.org.isomorphic_strings;
import java.util.*;
public class Soluction {
	public static boolean isIsomorphic(String s, String t) {
		Map<Character,Integer> map1=new LinkedHashMap<Character,Integer>();
		Map<Character,Integer> map2=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			map1.put(s.charAt(i), i);
			map2.put(t.charAt(i), i);
		}
		if(map1.size()==map2.size())
		{
			Iterator iter = map1.entrySet().iterator();
			Iterator iter1 = map2.entrySet().iterator();
			int A[]=new int[map1.size()];
			int B[]=new int[map1.size()];
			int i=0;
			int j=0;
			while (iter.hasNext()) 
			{
				Map.Entry entry = (Map.Entry) iter.next();
				A[i]=(Integer) entry.getValue();	
				i++;
			}
			while (iter1.hasNext()) 
			{
				Map.Entry entry = (Map.Entry) iter1.next();
				B[j]=(Integer)entry.getValue();	
				j++;
			}
			for(int index=0;index<A.length;index++)
			{
				if(A[index]!=B[index])
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("abb","aba"));
	}

}
