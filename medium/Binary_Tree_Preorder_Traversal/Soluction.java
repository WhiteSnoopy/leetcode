package com.org.Binary_Tree_Preorder_Traversal;
/*
 * �������
 * root left right
 */
import java.util.*;
public class Soluction {
	public List<Integer> list=new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
		if(root!=null)
		{
			//���ڵ�
			list.add(root.val);
			//������
			preorderTraversal(root.left);
			//������
			preorderTraversal(root.right);
		}
		return list;
	}
	public static void main(String[] args) {
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}