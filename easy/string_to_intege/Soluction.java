package com.org.string_to_intege;
public class Soluction {
	public static int myAtoi(String str) {
		if(str==null||str=="") return 0;
		str=str.trim();
		if(str.length()==0) return 0;
		int index=0;
		long result=0;
		boolean check=true;
		if(str.charAt(0)=='+'||str.charAt(0)=='-')
		{
			index++;
			if(str.charAt(0)=='-')
				check=false;
		}
		while(index<str.length())
		{
			if(str.charAt(index)<'0'||str.charAt(index)>'9')
				break;
			int temp=Integer.parseInt(String.valueOf(str.charAt(index)));
			result=result*10+temp;
			if(check && result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if(!check && result*(-1)<(Integer.MIN_VALUE)) return Integer.MIN_VALUE;
			index++;
		}
		return check?(int)result:(int)-result;
	}
	public static void main(String[] args) {
		System.out.println(myAtoi("-1"));
	}
}
