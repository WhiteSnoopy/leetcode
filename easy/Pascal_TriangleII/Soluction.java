package com.org.Pascal_TriangleII;
import java.util.ArrayList;
import java.util.List;
public class Soluction {
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list=new ArrayList<Integer>();
		int[] B = null;
		for(int i=0;i<=rowIndex;i++)
		{
			int[] A=new int[i+1];
			A[0]=A[A.length-1]=1;
			if(i>=2)
			{
				for(int index=1;index<A.length-1;index++)
				{
					A[index]=B[index-1]+B[index];
				}
			}
			if(i==rowIndex)
			{
				for(int index=0;index<A.length;index++)
					list.add(A[index]);
			}
			B=A;
		}
		return list;
	}
	public static void main(String[] args) {
		List<Integer> list=getRow(0);
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i));
	}

}
