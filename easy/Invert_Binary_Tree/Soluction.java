package com.org.Invert_Binary_Tree;
/*
 * ����������ת
 */
public class Soluction {
	public TreeNode invertTree(TreeNode root) {
		if(root==null)
			return null;
		if(!(root.left==null && root.right==null))
		{
			//���ҽڵ㻥�ཻ��
			TreeNode temp=root.right;
			root.right=root.left;
			root.left=temp;
			if(root.left!=null) invertTree(root.left);
			if(root.right!=null) invertTree(root.right);
		}
		return root;
	}
	public static void main(String[] args) {
	}

}
