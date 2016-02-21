package com.org.Excel_Sheet_Column_Number;
public class Soluction {
	public static int titleToNumber(String s){
		int result=0;
		if(s.length()==1)
		{
			return s.charAt(0)-64;
		}
		result=(int) ((s.charAt(0)-64)*(Math.pow(26,s.length()-1)));
		return result+titleToNumber(s.substring(1));
	}
	public static void main(String[] args) {
/*		char A='Z';
		System.out.println(A-64);*/
		System.out.println(titleToNumber("YYYYXZ"));
	}

}
