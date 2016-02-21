package com.org.Reverse_Bits;
/*
 * 左移位运算符（<<）能将运算符左边的运算对象向左移动运算符右侧指定的位数（在低位补0）
 * 右移位运算符（>>）则将运算符左边的运算对象向右移动运算符右侧指定的位数。 “有符号”右移位运算符使用了“符号扩展”：若值为正，则在高位插入0；若值为负，则在高位插入1。
 * 无符号”右移位运算符（>>>），它使用了“零扩展”：无论正负，都在高位插入0。这一运算符是C或C++没有的。 
 */
/*
 * 将数字N转化为二进制，从最低位开始，与数字1进行与运算，来判断是否为1还是0，若为1则将起初创建的变量向左移动1位并加上1，如不为1，则只移动，不管是N否为1，都要右移N移位32次
 */
public class Soluction {
	public static int reverseBits(int n) {
		int result = 0;
		System.out.println(Integer.toBinaryString(n));
		for (int i = 0; i < 32; i++){
			result += n & 1;
			n >>>= 1;   // CATCH: must do unsigned shift
			if (i < 31) // CATCH: for last digit, don't shift!
				result <<= 1;
		}
		System.out.println(Integer.toBinaryString(result));
		return result;
	}
	public static int reverseBits1(int n){
		int res = 0;
		for (int i = 0; i < 32; ++i) 
		{
			if ((n & 1) == 1) 
			{
				//左移
				res = (res << 1) + 1;
				n = n >> 1;
			} 
			else 
			{
				res = res << 1;
				n = (n >> 1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(reverseBits1(1));
	}
}
