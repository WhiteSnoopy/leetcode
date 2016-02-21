package com.org.Excel_Sheet_Column_Title;
/*
 *  1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    
    703 -> AAA
 */
public class Soluction {
	public static StringBuilder strp=new StringBuilder();
	public static String convertToTitle(int n) 
	{
		if(n>=1&&n<=26)
		{
			strp.append((char)(64+n));
		}
		else
		{
			int current=n;
			int count=0;
			while(current>26)
			{
				//
				if(current%26==0)
				{
					current=current/26;
					current--;
				}
				else
					current=current/26;
				count++;
			}
			strp.append((char)(current+64));
			current=(int) (n-current*(Math.pow(26, count)));
			convertToTitle(current);
		}
		return strp.toString();
	}
	/*
	 * ²âÊÔ·½·¨
	 */
	public static StringBuilder str=new StringBuilder();
	public static void test(int n){
		if(n>=1&&n<=26)
		{
			str.append((char)(64+n));
			System.out.println(str.toString());
			return;
		}
		int current=n;
		int count=0;
		while(current>26)
		{
			current=current/27;
			count++;
		}
		char c=(char)(current+64);
		str.append(c);
		current=(int) (n-current*(Math.pow(26, count)));
		test(current);
	}
	public static void main(String[] args) {
		//ZASD
		//System.out.println(convertToTitle(458150));
		test(319989832);
		System.out.println("=================");
		System.out.println(convertToTitle(308915750));
	}
}
