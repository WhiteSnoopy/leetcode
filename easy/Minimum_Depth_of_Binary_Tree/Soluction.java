package com.org.Minimum_Depth_of_Binary_Tree;
/*
 * 递归遍历二叉树的深度的最小值
 */
public class Soluction {
	public static int minDepth(TreeNode root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		if(root.left==null)
			return minDepth(root.right)+1;
		if(root.right==null)
			return minDepth(root.left)+1;
		return minDepth(root);
	}
	public static int getDepth(TreeNode root){
		
		int depth=1;
		int leftdp=1;
		int rightdp=1;
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 1;
		//左子树的深度
		if(root.left!=null) 
		{
			leftdp= depth+minDepth(root.left);
		}
		//右子树的深度
		if(root.right!=null)
		{
			rightdp=depth+minDepth(root.right);
		}
		return Math.min(leftdp, rightdp);
	}
	public static void main(String[] args) {
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		first.left=second;
		System.out.println(minDepth(first));
	}

}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}