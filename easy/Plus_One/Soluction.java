package com.org.Plus_One;
/*
 * 99 A[0]=9 A[1]=9
 * plus one 
 * A[0]=1
 * A[1]=A[2]=0;
 */
public class Soluction {
    public static int[] plusOne(int[] digits) {
    	int N=digits.length;
    	int[] A=new int[digits.length+1];
    	boolean chc=false;
    	digits[N-1]++;
    	for(int i=N-1 ; i>=0 ; i--)
    	{
    		if(digits[i]>=10 && i!=0)
    		{
    			digits[i]=digits[i]-10;
    			digits[i-1]++;
    		}
    		if(i==0)
    		{
    			if(digits[i]>=10)
    			{
    				chc=true;
    				A[0]=1;
    				digits[i]=digits[i]-10;
    				for(int index=1;index<A.length;index++)
    					A[index]=digits[index-1];
    			}
    		}
    	}
    	return chc?A:digits;
    }
    public static void main(String args[]){
    	int[] A={9,9};
    	int[] B=plusOne(A);
    	for(int i=0;i<B.length;i++)
    		System.out.println(B[i]);
    }

}
