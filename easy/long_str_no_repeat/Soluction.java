package com.org.long_str_no_repeat;

public class Soluction {
	  public static int lengthOfLongestSubstring(String s) {
	      	int maxlen=0;
			int ptr=0;
			if(s.length()<=1) return s.length();
			for(int i=1;i<s.length();i++)
			{
				int index=s.indexOf(s.charAt(i), ptr);
				if(index<i)
				{
					ptr=index+1;
				}
				maxlen= Math.max(maxlen, i - ptr + 1);
			}
			return maxlen;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("bbbbb"));
	}

}
