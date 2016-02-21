package com.org.Palindrome_Linked_List;
import java.util.*;
public class Soluction {
	public static boolean isPalindrome(ListNode head) {
		if(head==null)
			return true;
		List<Integer> list=new ArrayList<Integer>();
		while(head!=null)
		{
			list.add(head.val);
			head=head.next;
		}
		for(int i=0;i<list.size()/2;i++)
		{
			/*if(list.get(i)-list.get(list.size()-1-i)!=0)
			{
				return false;
			}*/
			if(list.get(i)!=list.get(list.size()-1-i))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		ListNode first=new ListNode(-16557);
		ListNode first_1=new ListNode(-8725);
		ListNode first_2=new ListNode(-29125);
		ListNode first_3=new ListNode(-8725);
		ListNode first_4=new ListNode(-16557);
		first.next=first_1;
		first_1.next=first_2;
		first_2.next=first_3;
		first_3.next=first_4;
		System.out.println(isPalindrome(first));
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}