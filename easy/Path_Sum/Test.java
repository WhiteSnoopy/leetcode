package com.org.Path_Sum;

import java.util.Stack;

public class Test {
    public Stack<Integer> mystack=new Stack<Integer>();
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean result1;
		boolean result2;
		if(root==null)
			return false;
		if(root.left==null && root.right==null)
		{
			if(sum==root.val)
			{
				return true;
			}
		}
		else
		{
			//�ȷ��ʸ��ڵ�
			mystack.push(root.val);
			//�����η������ҽڵ�
			result1=hasPathSum(root.left,sum-root.val);
			result2=hasPathSum(root.right,sum-root.val);
			mystack.pop();
			if((result1 || result2)==true)
				return true;
		}
		return false;
    }
}