package com.org.Remove_Nth_Node_From_End_of_List;
public class Soluction {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp=head;
		ListNode temp1=head;
		if(head==null)
			return null;
		if(n==0)
			return head;
		//��ת����
		//����ת����
		int count=0;
		//��ȡ����ĳ���
		while(temp1!=null)
		{
			count++;
			temp1=temp1.next;
		}
		if(count<n)
			return null;
		if(count==n)
			return head.next;
		else
		{
			//���ҵ�Ҫɾ���ڵ����һ���ڵ�
			for(int i=0;i<count-n-1;i++)
			{
				temp=temp.next;
			}
		}
		temp.next=temp.next.next;
		return head;
	}
	public static void main(String[] args) {
		ListNode first=new ListNode(1);
		ListNode first1=new ListNode(2);
		ListNode first2=new ListNode(3);
		ListNode first3=new ListNode(4);
		ListNode first4=new ListNode(5);
		ListNode first5=new ListNode(6);
		first.next=first1;
		first1.next=first2;
		first2.next=first3;
		first3.next=first4;
		first4.next=first5;
		System.out.println(first.next.next.next.val);
		System.out.println(removeNthFromEnd(first,3).next.next.next.val);

	}
}




class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}