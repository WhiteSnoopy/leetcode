package com.org.Nim_Game;
/*
 *当剩余四个石头的时候必败,同理可得当石头的个数是4的倍数的时候必输
 */
public class Soluction {
	public boolean canWinNim(int n) {
		return n%4!=0?true:false;
	}
	public static void main(String[] args) {
	}

}
