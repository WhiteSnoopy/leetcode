package com.org.Linked_List_Cycle;
public class Soluction {
	/*
	 * �������л�����
	 * ���������β�ڵ�ָ��֮ǰ�Ľڵ�
	 * ��������ָ�� ����л�������  �����ٶ���������null
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
		//�ٶ�Ϊ1
		ListNode first=head;
		//�ٶ�Ϊ2
		ListNode second=head;
		while(true)
		{
			first=first.next;
			second=second.next.next;
			if(second==null ||second.next==null)
				return false;
			//����
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