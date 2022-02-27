package trees;

import java.util.Stack;

public class PreOrderTraversal {
	
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val=val;
		}
	}
	
	public static void traversePO(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.val);
		traversePO(root.left);
		traversePO(root.right);
	}
	
	public static void preOrderIterative(TreeNode node)
	{
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode curr=node;
		while(!stack.isEmpty()||curr!=null)
		{
			if(curr!=null)
			{
				stack.push(curr);//3//4
				System.out.println(curr.val);//3//4
				curr=curr.left;
			}
			else
			{
				curr=stack.peek();
				stack.pop();
				curr=curr.right;//2
			}
		}
	}
	
	public static void inOrderTraversal(TreeNode node)
	{
		TreeNode curr=node;
		Stack<TreeNode> stack=new Stack<>();
		while(!stack.isEmpty()||curr!=null)
		{
			if(curr!=null)
			{
				stack.push(curr);
				curr=curr.left;
			}
			else
			{
				curr=stack.pop();
				System.out.println(curr.val);
				curr=curr.right;
			}
		}
	}
	
	public static void postOrderTraversal(TreeNode node)
	{
		TreeNode curr=node;
		Stack<TreeNode> stack=new Stack<>();
		
		while(!stack.isEmpty())
		{
			if(curr!=null)
			{
				stack.push(curr);
				curr=curr.left;
			}
			else
			{
				curr=stack.peek();
				curr=curr.right;
				if(curr==null)
				{
					curr=stack.pop();
					System.out.println(curr.val);
					//curr=curr.left;
				}
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode left1=new TreeNode(3);
		TreeNode right1=new TreeNode(6);
		TreeNode left2=new TreeNode(2);
		TreeNode right3=new TreeNode(4);
		TreeNode left4=new TreeNode(5);
		TreeNode right5=new TreeNode(7);
		
		root.left=left1;
		root.right=right1;
		left1.right=left2;
		left2.left=right3;
		left2.right=left4;
		right1.right=right5;
		
		postOrderTraversal(root);
		
		
		
		
	}
	
	

}
