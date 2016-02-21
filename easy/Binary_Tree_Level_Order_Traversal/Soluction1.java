package com.org.Binary_Tree_Level_Order_Traversal;
import java.util.ArrayList;
import java.util.List;
public class Soluction1 {
	public static boolean print_by_level(TreeNode root,int level,List<Integer> list){
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
			list.add(root.val);
			return true;
		}
		left=print_by_level(root.left,level-1,list);
		right=print_by_level(root.right,level-1,list);
		return left|| right;
	}
	 public static List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> list=new ArrayList<List<Integer>>();
		 for(int i=0;;i++)
		 {
			 List<Integer> temp =new ArrayList<Integer>();
			 if(!print_by_level(root,i,temp))
			 {
				break; 
			 }
			 list.add(temp);
		 }
		return list;
	        
	    }
	public static void main(String[] args) {
		/*
		 * ≤‚ ‘”√¿˝
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
		levelOrder(first);
	}

}
