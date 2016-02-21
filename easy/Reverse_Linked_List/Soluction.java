package com.org.Reverse_Linked_List;

/*
 * 链表的反转
 */
public class Soluction {
	private ListNode first;
	public ListNode insert(int value){
		ListNode temp = new ListNode(value);
		if(first==null)
		{
			first=temp;
		}
		else
		{
			temp.next=first;
			first=temp;
		}
		return first;
	}
	public ListNode reverseList(ListNode head) {
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		ListNode current=null;
		while(head!=null)
		{
			ListNode newNode=new ListNode(head.val);
			newNode.next=current;
			current=newNode;
			head=head.next;
		}
		return current;
	}
	public void display(ListNode root){
		ListNode temp=root;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Soluction s=new Soluction();
		s.insert(4);
		s.insert(3);
		s.insert(2);
		ListNode root=s.insert(1);
		s.display(s.reverseList(root));
	
	}

}
