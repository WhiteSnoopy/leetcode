package com.org.add_digits;

public class Soluction {
	 public static int addDigits(int num) {
		 //������string����� 
		 int result=num;
		 while(result>=10)
		 {
			 int tail=result%10;
			 result=tail+addDigits(result/10);
		 }
		 return result;
	    }
	public static void main(String args[]){
		System.out.println(addDigits(46));
	}

}
