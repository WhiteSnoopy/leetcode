package com.org.reverse_integer;
public class Soluction {
	public static int reverse(int x) 
	{
		String str=Integer.toString(x);
		int N=str.length();
		StringBuffer result = new StringBuffer();
		if(x>=0)
		{
			for(int i=N-1;i>=0;i--)
			{
				result.append(str.charAt(i));
			}
		}
		else
		{
			result.append(str.substring(0,1));
			for(int i=N-1;i>0;i--)
			{
				result.append(str.charAt(i));
			}
		}
		//如果此时采用int会造成溢出
		long temp=Long.parseLong(result.toString());
		if(temp>Integer.MAX_VALUE) 
		{
			return 0;
		}
		else
		{
			return (int)temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));
		Soluction1 test=new Soluction1();
		System.out.println(test.reverse(Integer.MAX_VALUE));
		Soluction2 test1=new Soluction2();
		System.out.println(test1.reverse(1534236469));
	}
}
