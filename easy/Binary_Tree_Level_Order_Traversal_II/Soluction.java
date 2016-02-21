package com.org.Binary_Tree_Level_Order_Traversal_II;
import java.util.*;
/*
 *递归
 */
public class Soluction {
	//打印指定的层次   成功返回非0的正值   失败返回 0
	public boolean print_at_level(TreeNode T, int level) 
	{  
		if (T==null || level < 0)  
			return false;  
		if (level ==0) 
		{  
			System.out.println(T.val);
			return true;  
		}  
		return print_at_level(T.left, level - 1) || print_at_level(T.right, level - 1);  
	}  
	public void print_by_level_1(TreeNode T) {  
		int i = 0;   
		for (i = 0; ; i++) 
		{  
			if (!print_at_level(T, i))  
				break;  
		}  
	}  
	public static  List<Integer> print_at_level_GAI(TreeNode T,int level,List<Integer> test){
		if (T==null || level < 0)  
			return null;  
		if (level ==0) 
		{  
			test.add(T.val);
			return test;
		}
		List<Integer> left=print_at_level_GAI(T.left, level - 1,test);
		List<Integer> test1=new ArrayList<Integer>();
		List<Integer> right=print_at_level_GAI(T.right, level - 1,test1);
		if(left==null && right==null)
			return null;
		if(left==null)
			return right;
		if(right==null)
			return left;
		left.addAll(right);
		return left;  
	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int i;
		for(i=0; ;i++)
		{
			List<Integer> test=new ArrayList<Integer>();
			List<Integer> temp1=print_at_level_GAI(root,i, test);
			if (temp1==null)  
				break;
			list.add(0,temp1);
		}
		return list;
	}
	public static void main(String[] args) {
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode first_1=new TreeNode(4);
		TreeNode first_2=new TreeNode(5);
		TreeNode first_3=new TreeNode(6);
		TreeNode first_4=new TreeNode(6);
		TreeNode first_5=new TreeNode(7);
		
		first.left=second;
		first.right=third;
		second.left=first_1;
		second.right=first_2;
		third.left=first_3;
		third.right=first_4;
		List<List<Integer>> list=levelOrderBottom(first);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			List<Integer> temp=(List<Integer>) it.next();
			Iterator it1=temp.iterator();
			while(it1.hasNext())
			{
				System.out.print(it1.next());
			}
		}
		
		ArrayList<Integer> ll=new ArrayList<Integer>();
		ll.add(1);
		ll.add(0, 2);
		ll.add(0,3);
		
	}
}
