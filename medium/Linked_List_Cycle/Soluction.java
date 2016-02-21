package com.org.Linked_List_Cycle;
public class Soluction {
	/*
	 * 单链表有环问题
	 * 问题概述：尾节点指向之前的节点
	 * 设立两个指针 如果有环则相遇  否则速度慢的遇到null
	 */
	public boolean hasCycle(ListNode head) {
		if(head==null)
		{
			return false;
		}
		if(head.next==null)
		{	
			return false;
		}
		if(head.next==head)
		{	
			return true;
		}
		//速度为1
		ListNode first=head;
		//速度为2
		ListNode second=head;
		while(true)
		{
			first=first.next;
			second=second.next.next;
			if(second==null ||second.next==null)
				return false;
			//相遇
			if(first==second)
				return true;
		}
	}
	public static void main(String[] args) {
	}
}


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}