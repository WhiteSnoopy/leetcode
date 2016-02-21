package com.org.Add_Binary;
/*
 * 不能通过转换为整数来解决
 */
public class Soluction {
	public static String addBinary(String a, String b) {
		if(a.equals("")&&b.equals(""))
			return "";
		if(a.equals(""))
			return b;
		if(b.equals(""))
			return a;
		if(Long.toBinaryString(Long.MAX_VALUE).length()<a.length()||Long.toBinaryString(Long.MAX_VALUE).length()<b.length())
			return "";
		Long str=Long.parseLong(a, 2)+Long.parseLong(b, 2);
		return Long.toBinaryString(str);
	}
	/*
	 * ^异或 相同为0
	 */
	public static String addBinary1(String a,String b){
		if(a == null || a.isEmpty()) 
		{
			return b;
		}
		if(b == null || b.isEmpty()) 
		{
			return a;
		}
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		StringBuilder stb = new StringBuilder();
		int i = aArray.length - 1;
		int j = bArray.length - 1;
		int aByte;
		int bByte;
		int carry = 0;//进位
		int result;
		while(i > -1 || j > -1 || carry == 1) 
		{
			aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
			bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
			result = aByte ^ bByte ^ carry;
			carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
			stb.append(result);
		}
		return stb.reverse().toString();
	}
	public static void main(String[] args) {
		int A=1;
		int B=1;
		//System.out.println(Long.toBinaryString(Long.MAX_VALUE));
		//111111111111111111111111111111111111111111111111111111111111111
		//10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101
		System.out.println(addBinary("11","11"));
	}
}
