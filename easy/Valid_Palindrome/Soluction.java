package com.org.Valid_Palindrome;
/*
 * 忽略 其他字符
 * 统一转换为大写或者是小写
 */
public class Soluction {
	public static boolean isPalindrome(String s) {
		//转换为字符数组
		char[] array=s.toCharArray();
		array=convert(array).toCharArray();
		return check(array)?true:false;
	}
	public static String convert(char[] array){
		String str="";
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>='a' && array[i]<='z')
				str+=array[i];
			if(array[i]>='A' && array[i]<='Z')
				str+=String.valueOf(array[i]).toLowerCase();
		}
		return str;
	}
	public static boolean check(char[] array){
		if(array.length==0||array.length==1)
			return true;
		for(int i=0;i<array.length/2;i++)
		{
			if(array[i]!=array[array.length-1-i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("A mapn, a plan, a canal: Panama"));
	}
}
