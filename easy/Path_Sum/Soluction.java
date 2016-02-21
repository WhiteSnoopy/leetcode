package com.org.Path_Sum;
import java.util.Stack;
public class Soluction {
	public boolean hasPathSum_1(TreeNode root, int sum) {
		int length=0;
		if(root==null)
			return false;
		while(root.left==null && root.right==null)
		{
			length=length+root.val;
		}
		return false;
	}
	/*
	 * ��ʱ���� �Ӹ��ڵ㵽Ҷ�ӽڵ��·������
	 */
	public void findPath(TreeNode root,int k){
		if(root == null)
			return;
		Stack<Integer> stack = new Stack<Integer>();
		findPath(root,k,stack);
	}
	public void findPath(TreeNode root,int k,Stack<Integer> path){
		if(root == null)
			return;
		//������Ҷ�ӽڵ�
		if(root.left == null && root.right == null)
		{
			if(root.val == k)
			{
				System.out.println("·����ʼ");
				for(int i :path)
					System.out.print(i+",");
						System.out.print(root.val);
			}
		}
		else
		{
			path.push(root.val);
			findPath(root.left,k-root.val,path);
			findPath(root.right,k-root.val,path);
			path.pop();
		}
	}
	/*
	 * 
	 */
	public static Stack<Integer> mystack=new Stack<Integer>();
	public static void printPath(TreeNode root){
		if(root==null)
			return;
		if(root.left==null && root.right==null)
		{
			//��ʱ�Ѿ���������Ҷ�ڵ㣬���Դ�ӡ����Ӹ��ڵ㵽Ҷ�ڵ��·����
			for(int i:mystack)
				System.out.print(i+"-->");
			System.out.print(root.val);
			System.out.println();
		}
		else
		{
			//�ȷ��ʸ��ڵ�
			mystack.push(root.val);
			//�����η������ҽڵ�
			printPath(root.left);
			printPath(root.right);
			mystack.pop();
		}
	}
	public static void printPath(TreeNode root , int sum){
		if(root==null)
			return;
		if(root.left==null && root.right==null)
		{
			if(sum==root.val)
			{
				//��ʱ�Ѿ���������Ҷ�ڵ㣬���Դ�ӡ����Ӹ��ڵ㵽Ҷ�ڵ��·����
				for(int i:mystack)
					System.out.print(i+"-->");
				System.out.print(root.val);
			}
		}
		else
		{
			//�ȷ��ʸ��ڵ�
			mystack.push(root.val);
			//�����η������ҽڵ�
			printPath(root.left,sum-root.val);
			printPath(root.right,sum-root.val);
			mystack.pop();
		}
	}
	 public static boolean hasPathSum(TreeNode root, int sum) {
		 printPath(root , sum);
		 return !mystack.isEmpty();
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
		System.out.println(hasPathSum(first,10));
	}

}
