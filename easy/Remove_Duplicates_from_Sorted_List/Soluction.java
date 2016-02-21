package com.org.Remove_Duplicates_from_Sorted_List;
public class Soluction {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current=head;
		if(head==null)
			return null;
		while(head.next!=null)
		{
			if(head.val==head.next.val)
				head.next=head.next.next;
			else
				head=head.next;
		}
		return current;
	}
	public static void main(String[] args) {
	}

}
