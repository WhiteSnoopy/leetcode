package com.org.Count_Primes;
/*
 * 小于非负数N的素数的个数
 * 素数：只能被本身和1整除
 * 大于1的自然数
 */
public class Soluction {
	public static int countPrimes(int n) {
		int count=0;
		boolean chc=true;
		n=n-1;
		if(n<=2)
			return 0;
		while(n>=2)
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				//可以被整除
				if(n%i==0)
				{
					chc=false;
					break;
				}
			}
			if(chc)
			{
				count++;
			}
			chc=true;
			n=n-(n%2==0?1:2);
		}
		return count+1;
	}

	/*
	 * 创建一张素数表
	 */
	static boolean[] table=new boolean[1000000];
	public static void primeTable(){
		//奇数标记为true 偶数标记为false
		table[0]=false;//不是素数
		table[1]=false;
		table[2]=true;
		for(int i=3;i<1000000;i++)
		{
			if(i%2==0)
				table[i]=false;
			else
				table[i]=true;
		}
		//只需要判断奇数是否有素数即可
		//i=3;  由于prime[3]=true, 把prime[6], [9], [12], [15], [18], [21], [24], [27], [30]标为false.
		for(int i=3;i<=Math.sqrt(Integer.MAX_VALUE);i+=2)
			for(int j=2*i;j<1000000;j+=i)
				table[j]=false;
	}
	public static int countPrimes1(int n){
		primeTable();
		int count=0;
		for(int i=0;i<n;i++)
			if(table[i])
				count++;
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countPrimes(2323251));
	}
}
