package com.org.Balanced_Binary_Tree;
/*
 * 求解左右子树的深度之差
 * 左子树 右子树也需要判断是否为平衡二叉树
 */
public class Soluction {
	public int depth(TreeNode root){
		int depth=0;
		int left=0;
		int right=0;
		if(root==null)
			return 0;
		if(root!=null && root.left==null && root.right==null)
    		return 1;
		if(root.left!=null)
			left= depth+1+depth(root.left);
		if(root.right!=null)
			right=depth+1+depth(root.right);
		return Math.max(left, right);
	}
	public boolean isBalanced(TreeNode root) {
		int depth_left=0;
		int depth_right=0;
		if(root==null)
			return true;
		depth_left=depth(root.left);
		depth_right=depth(root.right);
		if (Math.abs(depth_left-depth_right)>1)
			return false;
		else
			return isBalanced(root.left) && isBalanced(root.right);
	}
	public static void main(String[] args) {
	}
}
