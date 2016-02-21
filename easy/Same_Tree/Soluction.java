package com.org.Same_Tree;
public class Soluction {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean left=true;
		boolean right=true;
		if(p==null && q!=null)
		{
			return false;
		}
		if(p==null && q==null)
		{
			return true;
		}
		if(p!=null && q==null)
		{
			return false;
		}
		if(p.val!=q.val) 
		{
			return false;
		}
		left=isSameTree(p.left,q.left);
		right=isSameTree(p.right,q.right);
		return left&&right;
	}
	public static void main(String[] args) {
	}
}
