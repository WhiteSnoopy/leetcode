package com.org.Valid_Palindrome;
public class Soluction2 {
	public static boolean isPalindrome(String s){
		s=s.toLowerCase();
		//正则表达式
	    s=s.replaceAll("[^0-9a-zA-Z]", "");
	    char c[]=s.toCharArray();
	    int counthead=0,counttail=s.length()-1;
	    while(counthead<=s.length()-1&&counttail>=0)
	    {
	        if(c[counthead]!=c[counttail]) return false;
	        counthead++;
	        counttail--;
	    }
	    return true;
	}
	public static void main(String args[]){
		System.out.println(isPalindrome("asd"));
	}
}
