package com.org.Remove_Linked_List_Elements;
/*
 * Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class Soluction {
	public static ListNode removeElements(ListNode head, int val) {
		while(head!=null &&head.val==val)
		{
			head=head.next;
		}
		ListNode current=head;
		//current的头结点不会等于val
		while(current!=null)
		{
			//尾端节点
			if(current.next==null)
			{
				if(current.val!=val)
					return head;
			}
			if(current.next.val==val)
			{
				current.next=current.next.next;
			}
			else
			{
				current=current.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode first=new ListNode(1);
		System.out.println(removeElements(first,1));
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}