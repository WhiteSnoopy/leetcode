package com.org.Binary_Tree_Preorder_Traversal;
/*
 * 先序遍历
 * root left right
 */
import java.util.*;
public class Soluction {
	public List<Integer> list=new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
		if(root!=null)
		{
			//根节点
			list.add(root.val);
			//左子树
			preorderTraversal(root.left);
			//右子树
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