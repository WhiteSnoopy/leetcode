package com.org.Intersection_of_Two_Linked_Lists;
/*
 * 一开始以为交叉节点有可能只在中间，可是题目的意思是交叉节点一直到尾端
 */
public class Soluction {
	/*
	 * 笨办法
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode currentA=headA;
		while(currentA!=null && headB!=null)
		{
			ListNode currentB=headB;
			while(currentB!=null)
			{
				if(currentA.val==currentB.val)
				{
					return currentA;
				}
				currentB=currentB.next;
			}
			currentA=currentA.next;
		}
		return null;
	}
	public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		int lenA=getLength(headA);
		int lenB=getLength(headB);
		if(lenA==0 || lenB==0)
			return null;
		//如果A的长度大于B的长度，则将A的长度向后移动
		while(lenA>lenB)
		{
			headA=headA.next;
			lenA--;
		}
		//如果的B的长度A的长度，则将B的长度向后移动
		while(lenA<lenB)
		{
			headB=headB.next;
			lenB--;
		}
		while(headA!=null && headB!=null)
		{
			if(headA.val==headB.val)
				return headA;
			headA=headA.next;
			headB=headB.next;
		}
		return null;
	}
	public static int getLength(ListNode node){
		int len=0;
		if(node==null)
			return 0;
		while(node!=null)
		{
			len++;
			node=node.next;
		}
		return len;
	}
	public static void main(String args[]){
		ListNode first =new ListNode(1);
		ListNode first1 =new ListNode(2);
		ListNode first2 =new ListNode(3);
		ListNode first3 =new ListNode(4);
		ListNode first4 =new ListNode(5);
		first.next=first1;
		first1.next=first2;
		first2.next=first3;
		first3.next=first4;
		
		
		ListNode second =new ListNode(9);
		ListNode second_1 =new ListNode(5);
		ListNode second_2 =new ListNode(8);
		second.next=second_1;
		second_1.next=second_2;
		ListNode test=getIntersectionNode1(first,second);
		if(test==null)
			System.out.println("null");
		else
			System.out.println(test.val);
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x) 
	{
		val = x;
		next = null;
	}
}