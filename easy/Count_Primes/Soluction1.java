package com.org.Count_Primes;
public class Soluction1 {
	public static int countPrimes(int n) {
        int count=0;
        if(n==0 || n==1 ||n==2)
            return 0;
        boolean[] table=new boolean[n];
       //奇数标记为true 偶数标记为false
		table[0]=false;//不是素数
		table[1]=false;
		table[2]=true;
		for(int i=3;i<n;i++)
		{
			if(i%2==0)
				table[i]=false;
			else
				table[i]=true;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
			for(int j=2*i;j<n;j+=i)
				table[j]=false;
		for(int i=0;i<n;i++)
		{    
		    if(table[i])
		    { 
		        count++;
		    }
		}
		return count;
    }
	public static void main(String[] args) {
		System.out.println(countPrimes(1));
	}
}
