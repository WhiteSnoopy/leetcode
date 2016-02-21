package com.org.add_two_number;

public class Soluction {

	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1==null||l2==null) return null;
			long val1=0;
			long val2=0;
			long sum=0;
			int index1=-1;
			int index2=-1;
			for(ListNode x=l1;x!=null;x=x.next)
			{
				val1+=x.val*Math.pow(10, ++index1);
			}
			for(ListNode x=l2;x!=null;x=x.next)
			{
				val2+=x.val*Math.pow(10, ++index2);
			}
			sum=val1+val2;
			int[] ary = new int[(sum+"").length()];
			for(int i = ary.length-1;i>=0;i--)
			{
				ary[i] = (int)(sum%10);
				sum /= 10;
			}
			ListNode first=null;
			for(int i=0;i<ary.length;i++)
			{
				ListNode temp=new ListNode(ary[i]);
				temp.next=first;
				first=temp;
			}
			return first;
	    }
	public static void main(String[] args) {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		first.next=second;
		second.next=third;
		
		ListNode first_1=new ListNode(4);
		ListNode second_1=new ListNode(5);
		ListNode third_1=new ListNode(6);
		first_1.next=second_1;
		second_1.next=third_1;
		ListNode temp=addTwoNumbers(first,first_1);
		while(temp!=null)
		{
			System.out.print(temp.val);
			temp=temp.next;
		}
	}

}
