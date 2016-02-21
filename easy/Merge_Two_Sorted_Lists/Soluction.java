package com.org.Merge_Two_Sorted_Lists;
import java.util.Arrays;
import java.util.LinkedList;
public class Soluction {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		while(l1!=null)
		{
			list.add(l1.val);
			l1=l1.next;
		}
		while(l2!=null)
		{
			list.add(l2.val);
			l2=l2.next;
		}
		int[] A=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			A[i]=list.get(i);
		}
		Arrays.sort(A);
		ListNode newnode=new ListNode(A[0]);
		ListNode newnode1=newnode;
		for(int i=1;i<A.length;i++)
		{
			ListNode temp=new ListNode(A[i]);
			newnode.next=temp;
			newnode=temp;
		}
		return newnode1;
	}
	public static void main(String[] args) {
	}

}
