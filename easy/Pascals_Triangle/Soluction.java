package com.org.Pascals_Triangle;
import java.util.ArrayList;
import java.util.List;
public class Soluction {
	//ÔÝÊ±ÏÈ²»¿¼ÂÇlist
	public static void triangle(int N){
		int[] B = null;
		for(int i=1;i<=N;i++)
		{
			int[] A=new int[i];
			A[0]=A[i-1]=1;
			if(i>=3)
			{
				for(int index=1;index<i-1;index++)
				{
					A[index]=B[index-1]+B[index];
				}
			}
			for(int index=i;index<N;index++)
				System.out.print(" ");
			for(int j=0;j<A.length;j++)
			{
				System.out.print(A[j]);
				System.out.print(" ");
			}
			B=A;
			System.out.println();
		}
	}
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int[] B = null;
		for(int i=1;i<=numRows;i++)
		{
			int[] A=new int[i];
			A[0]=A[i-1]=1;
			if(i>=3)
			{
				for(int index=1;index<i-1;index++)
				{
					A[index]=B[index-1]+B[index];
				}
			}
			List<Integer> temp=new ArrayList<Integer>();
			for(int index=0;index<A.length;index++)
				temp.add(A[index]);
			B=A;
			list.add(temp);
		}
		return list;
	}
	public static void main(String[] args) {
		triangle(10);
	}
}
