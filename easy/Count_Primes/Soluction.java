package com.org.Count_Primes;
/*
 * С�ڷǸ���N�������ĸ���
 * ������ֻ�ܱ������1����
 * ����1����Ȼ��
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
				//���Ա�����
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
	 * ����һ��������
	 */
	static boolean[] table=new boolean[1000000];
	public static void primeTable(){
		//�������Ϊtrue ż�����Ϊfalse
		table[0]=false;//��������
		table[1]=false;
		table[2]=true;
		for(int i=3;i<1000000;i++)
		{
			if(i%2==0)
				table[i]=false;
			else
				table[i]=true;
		}
		//ֻ��Ҫ�ж������Ƿ�����������
		//i=3;  ����prime[3]=true, ��prime[6], [9], [12], [15], [18], [21], [24], [27], [30]��Ϊfalse.
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
