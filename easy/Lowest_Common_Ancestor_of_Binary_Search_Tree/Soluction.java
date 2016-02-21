package com.org.Lowest_Common_Ancestor_of_Binary_Search_Tree;
/*
 * 最近公共祖先
 */
public class Soluction {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if((root.left==p && root.right==q) || (root.left==q && root.right==p))
		{
			return root;
		}
		if(root.left!=null)
		{
			lowestCommonAncestor(root.left,p,q);
		}
		if(root.right!=null)
		{
			lowestCommonAncestor(root.right,p,q);
		}
		return root;
	}
	public static void main(String[] args) {
	}

}
