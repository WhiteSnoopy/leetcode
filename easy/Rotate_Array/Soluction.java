package com.org.Rotate_Array;
import java.util.Stack;
/*
 * 数组的开头若干个元素搬到末尾
 */
public class Soluction {
	public static int[] rotate(int[] nums, int k) {
		int N=nums.length;
		//旋转一次
		while(k>0)
		{
			int first=nums[0];
			for(int i=0;i<N-1;i++)
			{
				nums[i]=nums[i+1];
			}
			nums[N-1]=first;
			k--;
		}
		return nums;
	}
	/*
	 *将数组的尾端几个元素移动到头部
	 *超时
	 */
	public static int[] rotate1(int[] nums, int k) {

		int N=nums.length;
		//旋转一次
		while(k>0)
		{
			int last=nums[N-1];
			int[] back=new int[N];
			for(int j=0;j<N;j++)
				back[j]=nums[j];
			for(int i=1;i<N;i++)
			{
				nums[i]=back[i-1];
			}
			nums[0]=last;
			k--;
		}
		return nums;
	}
	/*
	 * 利用stack来解决此问题
	 */
	public static void rotate2(int[] nums,int k){
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
	}
	/*
	 * 利用数组下标
	 */
	public static void rotate3(int[] nums,int k){
		int N=nums.length;
		int[] temp=new int[N];
		for(int i=0;i<N;i++)
		{
			temp[i]=nums[i];
		}
		if(N>=k)
		{
			for(int i=0;i<k;i++)
				nums[i]=temp[N-k+i];
			for(int i=k;i<N;i++)
				nums[i]=temp[i-k];
		}
		else
		{
			rotate3(nums,k%N);
		}
	}
	public static void main(String[] args) {
		int[] A={1,2,3,4,5};
		rotate3(A,1);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]);
		}
	}
}
