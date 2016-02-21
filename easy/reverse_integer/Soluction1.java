package com.org.reverse_integer;

public class Soluction1 {
	public int reverse(int x){
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
		try {
			x=Integer.parseInt(result.toString());
		} catch (NumberFormatException e) {
			return 0;
		}
		return x;
	}
}
