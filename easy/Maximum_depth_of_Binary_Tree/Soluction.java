package com.org.Maximum_depth_of_Binary_Tree;
public class Soluction {
	public TreeNode root;//根节点
	
	public void insert(int keyDate){
		TreeNode newNode =new TreeNode(keyDate);
		//如果没有节点
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			TreeNode current=root;
			TreeNode parent;
			while(true)
			{
				//存放在左子树
				parent=current;
				if(keyDate<current.val)
				{
					current=current.left;
					if(current==null)
					{
						parent.left=newNode;
						return;
					}
				}
				//存放在右子树
				if(keyDate>current.val)
				{
					current=current.right;
					if(current==null)
					{
						parent.right=newNode; 
						return;
					}
				}
			}
		}
	}
	public TreeNode find(int keyDate){
		TreeNode current=root;
		while(current.val!=keyDate)
		{
			if(keyDate<current.val)
			{
				current=current.left;
				if(current==null)
					return null;
			}
			if(keyDate>current.val)
			{
				current=current.right;
				if(current==null)
					return null;
			}
		}
		return current;
	}
	public TreeNode getRoot(){
		return root;
	}
    public int maxDepth(TreeNode root) {
    	int depth=0;
    	int left = 0;
    	int right = 0;
    	if(root==null)
    	{
    		return 0;
    	}
    	if(root!=null && root.left==null && root.right==null)
    	{
    		return 1;
    	}
    	if(root.left!=null)
    	{
    		left= depth+1+maxDepth(root.left);
    	}
    	if(root.right!=null)
    	{
    		right= depth+1+maxDepth(root.right);
    	}
    	System.out.println("left:"+left+" right:"+right);
    	return Math.max(left, right);
    }
    public int maxDepth1(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
	public static void main(String[] args) {
		Soluction test = new Soluction();
		test.insert(2);
		test.insert(1);
		test.insert(3);
		test.insert(4);
		test.insert(5);
		System.out.println(test.maxDepth(test.getRoot()));
	}

}
