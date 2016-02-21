package com.org.palindromic;

public class Soluction {

	private static  int maxindex=0;
	private static  int maxlen=1;
	public static String longestPalindrome(String s) {
		int length=s.length();
		for(int i=0;i<s.length();i++)
		{
			//回文数为奇数时aba
			oddPalindrome(s,length,i);
			//回文数为偶数时abba
			evenPalindrome(s,length,i);
		}
		System.out.println("index"+maxindex+"maxlen"+maxlen);
		return s.substring(maxindex,maxindex+maxlen);
	}
	private static void oddPalindrome(String s,int length,int index){
		int i=1;//前后移动的指针
		while((index-i)>=0 && length>(index+i)&&s.charAt(index-i)==s.charAt(index+i))
		{
			if((2*i+1)>maxlen)
			{
				maxlen=2*i+1;
				maxindex=index-i;
			}
			i++;
		}
	}
	private static void evenPalindrome(String s,int length,int index){
		int i=0;
		while((index-i)>=0 && length>(index+i+1) && s.charAt(index-i)==s.charAt(index+i+1) )
		{
			if((2*i+2)>maxlen)
			{
				maxlen=2*i+2;
				maxindex=index-i;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println(longestPalindrome("abaasdsdfasaadw"));
	}

}
