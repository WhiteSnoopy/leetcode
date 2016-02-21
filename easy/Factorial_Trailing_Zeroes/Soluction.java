package com.org.Factorial_Trailing_Zeroes;
/*
 * 对N进行素数分解
 * n = 5: 5!的质因子中 (2 * 2 * 2 * 3 * 5)包含一个5和三个2。因而后缀0的个数是1。

n = 11: 11!的质因子中(2^8 * 3^4 * 5^2 * 7)包含两个5和三个2。于是后缀0的个数就是2。

我们很容易观察到质因子中2的个数总是大于等于5的个数。因此只要计数5的个数就可以了。那么怎样计算n!的质因子中所有5的个数呢？一个简单的方法是计算floor(n/5)。例如，7!有一个5，10!有两个5。除此之外，还有一件事情要考虑。诸如25，125之类的数字有不止一个5。例如，如果我们考虑28!，我们得到一个额外的5，并且0的总数变成了6。处理这个问题也很简单，首先对n÷5，移除所有的单个5，然后÷25，移除额外的5，以此类推。下面是归纳出的计算后缀0的公式。

n!后缀0的个数 = n!质因子中5的个数
              = floor(n/5) + floor(n/25) + floor(n/125) + ....
 */

public class Soluction {
	public static int trailingZeroes(int n) {
		int num=0;
/*		int count=0;
		for(int i = 1; ;i++)
		{
			count=(int) Math.floor(n/Math.pow(5, i));
			if(count<=1)
				count=i;
				break;
		}
		System.out.println(count);*/
		for(int j=1;j<=Integer.MAX_VALUE;j++)
		{
			num=num+(int) Math.floor(n/Math.pow(5, j));
		}
		return num;
	}
	public static int trailingZeroes1(int n) {
		int num=0;
		if(n==0)
			return 0;
		num=num+n/5+trailingZeroes1(n/5);
		return num;
	}
	public static long JC(int n){
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		return n*JC(n-1);
	}
	public static void main(String[] args) {
/*		int A=10;
		for(int i=1;i<30;i++){
			System.out.println(i+"---> "+JC(i));
		}*/
		System.out.println(trailingZeroes1(10));
	}
}
