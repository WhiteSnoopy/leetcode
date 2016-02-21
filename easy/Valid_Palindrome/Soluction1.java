package com.org.Valid_Palindrome;
public class Soluction1 {
	public static boolean isPalindrome(String s) {
		if(s.isEmpty())
			return true;
		s = s.trim().toLowerCase(); 
		StringBuilder sb = new StringBuilder(); 
		String string = ""; 
		String reversedString = ""; 
		for(int i=0; i<s.length(); i++)
		{
			if( (s.charAt(i)>= 'a' && s.charAt(i)  <= 'z') || s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sb.append(s.charAt(i));
			}
		}
		string = sb.toString();
/*		for(int i=string.length()-1; i>=0; i--)
		{
			rsb.append(string.charAt(i));
		}
		reversedString = rsb.toString();
*/
		//·´×ª
		StringBuilder rsb = new StringBuilder(string);
		reversedString=rsb.reverse().toString();
		if(reversedString.equals(string))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}
}
