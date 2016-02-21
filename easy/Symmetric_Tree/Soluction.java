package com.org.Symmetric_Tree;
/*
 * ��ڵ����ڵ���ҽڵ���ҽڵ�Ƚ�
 * ��ڵ���ҽڵ���ҽڵ����ڵ�Ƚ�
 */
public class Soluction {
	public boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;	
		return dfs(root.left,root.right);
	}
	public boolean dfs(TreeNode left,TreeNode right){
		if(left==null && right==null)
			return true;
		if(left==null || right==null || left.val!=right.val)
			return false;
		return dfs(left.left,right.right) && dfs(left.right,right.left);
	}
	public static void main(String[] args) {
	}
}
