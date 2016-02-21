package com.org.Word_Pattern;

import java.util.LinkedHashMap;
import java.util.Map;

public class Soluction {
	public static boolean wordPattern(String pattern, String str) {
		String[] split_str=str.split(" ");
		char[] split_char=pattern.toCharArray();
		if(split_str.length!=split_char.length)
			return false;
		/*
		 * 尝试采用map来解决此问题
		 */
		LinkedHashMap<Character,String> map=new LinkedHashMap<Character,String>();
		for(int i=0;i<split_str.length;i++)
		{
			if(!map.containsKey(split_char[i]))
			{
				//如果不存在，查看新增模式的value是否重复
				for (Map.Entry<Character, String> entry : map.entrySet()) 
				{
					if(entry.getValue().equals(split_str[i]))
						return false;
				}
				
				map.put(split_char[i], split_str[i]);
			}
			else
			{
				//如果存在
				for (Map.Entry<Character, String> entry : map.entrySet()) 
				{
					if(entry.getKey()==split_char[i])
						if(!entry.getValue().equals(split_str[i]))
							return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog dog dog dog"));
	}
}
