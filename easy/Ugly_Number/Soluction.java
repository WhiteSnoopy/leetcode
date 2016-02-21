package com.org.Ugly_Number;
public class Soluction {
	public static boolean isUgly(int num) {
		if(num<=0)
			return false;
		if(num==1)
			return true;
		if(num==2 || num==3 || num==5)
			return true;
		if(num%2!=0 && num%3!=0 && num%5!=0)
			return false;
		if(num%2==0)
			return isUgly(num/2);
		if(num%3==0)
			 return isUgly(num/3);
		if(num%5==0)
			return isUgly(num/5);
		return true;
	}
	 public boolean isUgly1(int num) {  
	        if(num<=0) return false;  
	        if(num==1) return true;  
	          
	        while(num>=2 && num%2==0) num/=2;  
	        while(num>=3 && num%3==0) num/=3;  
	        while(num>=5 && num%5==0) num/=5;  
	          
	        return num==1;  
	    }  
	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}

}
