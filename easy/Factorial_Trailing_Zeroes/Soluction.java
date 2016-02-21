package com.org.Factorial_Trailing_Zeroes;
/*
 * ��N���������ֽ�
 * n = 5: 5!���������� (2 * 2 * 2 * 3 * 5)����һ��5������2�������׺0�ĸ�����1��

n = 11: 11!����������(2^8 * 3^4 * 5^2 * 7)��������5������2�����Ǻ�׺0�ĸ�������2��

���Ǻ����׹۲쵽��������2�ĸ������Ǵ��ڵ���5�ĸ��������ֻҪ����5�ĸ����Ϳ����ˡ���ô��������n!��������������5�ĸ����أ�һ���򵥵ķ����Ǽ���floor(n/5)�����磬7!��һ��5��10!������5������֮�⣬����һ������Ҫ���ǡ�����25��125֮��������в�ֹһ��5�����磬������ǿ���28!�����ǵõ�һ�������5������0�����������6�������������Ҳ�ܼ򵥣����ȶ�n��5���Ƴ����еĵ���5��Ȼ���25���Ƴ������5���Դ����ơ������ǹ��ɳ��ļ����׺0�Ĺ�ʽ��

n!��׺0�ĸ��� = n!��������5�ĸ���
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
