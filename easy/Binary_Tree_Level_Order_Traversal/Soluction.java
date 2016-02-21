package com.org.Binary_Tree_Level_Order_Traversal;
import java.util.List;
/*
 * 二叉树的层次遍历
 */
public class Soluction {
	//打印指定的层次
	public static boolean print_by_level(TreeNode root,int level){
		boolean left;
		boolean right;
		if(root==null || level<0)
		{
			return false;
		}
		if(level==0)
		{
			System.out.print(" ");
			System.out.print(root.val);
			return true;
		}
		left=print_by_level(root.left,level-1);
		right=print_by_level(root.right,level-1);
		return left|| right;
	}
	public static void printAll(TreeNode root){
		 for(int i = 0; ;i++)
		 {
			 if(!print_by_level(root,i))
			 {
				 break;
			 }
			 System.out.println();
		 }
	}
	public static void main(String[] args) {
		/*
		 * 测试用例
		 */
		TreeNode first=new TreeNode(5);
		TreeNode first_1=new TreeNode(3);
		TreeNode first_2=new TreeNode(7);
		TreeNode first_3=new TreeNode(2);
		TreeNode first_4=new TreeNode(4);
		TreeNode first_5=new TreeNode(6);
		TreeNode first_6=new TreeNode(8);
		first.left=first_1;
		first.right=first_2;
		first_1.left=first_3;
		first_1.right=first_4;
		first_2.left=first_5;
		first_2.right=first_6;
		printAll(first);
	}
}



class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}