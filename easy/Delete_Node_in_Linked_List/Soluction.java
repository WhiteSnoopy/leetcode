package com.org.Delete_Node_in_Linked_List;
public class Soluction {
	public ListNode first;//leetcode中并没有给出
	public void deleteNode(ListNode node) {
		node.val=node.next.val;
		node.next=node.next.next;
	}
	public static void main(String[] args) {
		Soluction test =new Soluction();
		//test.deleteNode(node);
	}

}
