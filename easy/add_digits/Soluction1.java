package com.org.add_digits;

public class Soluction1 {

	public int addDigits(int num) {
        return num==0?0:(num%9==0?9:(num%9));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
