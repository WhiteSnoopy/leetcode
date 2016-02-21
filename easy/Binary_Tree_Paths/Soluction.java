package com.org.Binary_Tree_Paths;
/*
 * Given a binary tree, return all root-to-leaf paths.
 */
import java.util.*;
public class Soluction {
	/*	public List<String> binaryTreePaths(TreeNode root) 
	{
		List<String> lsist=new ArrayList<String>();
		if(root==null)
			return null;
		if(root.left==null&&root.right==null)
		return null;
	}*/
	public static Stack<Integer> mystack=new Stack<Integer>();
	public static List<String> binaryTreePaths(TreeNode root){
		List<String> list=new ArrayList<String>();
		binary(root,list);
		return list;
	}
	public static void binary(TreeNode root ,List<String> list){
		if(root==null)
			return;
		if(root.left==null && root.right==null)
		{
			String str="";
			for(int i:mystack)
			{
				str+=i+"->";
				System.out.print(i+"-->");
			}
			str+=root.val;
			list.add(str);
			System.out.print(root.val);
			System.out.println();
		}
		else
		{
			mystack.push(root.val);
			binary(root.left, list);
			binary(root.right, list);
			mystack.pop();
		}
	}
	public static void main(String[] args) {
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
		binaryTreePaths(first);
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}