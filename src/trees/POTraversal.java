package trees;

import java.util.Stack;


public class POTraversal {
	
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val=val;
		}
	}
	
	public static void POTravers(TreeNode node)
	{
		Stack<TreeNode> stack=new Stack<TreeNode>();
		Stack<TreeNode> POstack=new Stack<POTraversal.TreeNode>();
		stack.push(node);
		while(!stack.isEmpty())
		{
			node=stack.peek();
			stack.pop();
			POstack.push(node);
			if(node.left!=null)
			{
				stack.push(node.left);
			}
			if(node.right!=null)
			{
				stack.push(node.right);
			}
		}
		while(!POstack.isEmpty())
		{
			System.out.println(POstack.peek().val);
			POstack.pop();
		}
	}	
	
	 public static int[] postorderTraversal(TreeNode A) {

	        Stack<TreeNode> stack=new Stack<>();
	        Stack<TreeNode> POstack=new Stack<>();
	        stack.push(A);
	        while(!stack.isEmpty())
	        {
	            A=stack.peek();
	            stack.pop();
	            POstack.push(A);
	            if(A.left!=null)
	            {
	                stack.push(A.left);
	            }
	            if(A.right!=null)
	            {
	                stack.push(A.right);
	            }
	        }
	        int[] a=new int[stack.size()];
	        int i=0;
	        while(!POstack.isEmpty())
	        {
	            a[i++]=POstack.peek().val;
	            POstack.pop();
	        }
	        return a;
	    }
	 
	 public static int height(TreeNode node)
	 {
		 if(node==null)
		 {
			 return 0;
		 }
		 return 1+Math.max(height(node.left),height(node.right));
	 }
	static int minDepth=Integer.MAX_VALUE;
	static int maxDepth=0;
	
	 public static void findDepth(TreeNode node,int i)
	 {
		 if(node==null)
		 {
			 if(i<minDepth)
			 {
				 minDepth=i+1;
			 }
			 if(i>maxDepth)
			 {
				 maxDepth=i-1;
			 }
			 return;
		 }
		 findDepth(node.left, i-1);
		 findDepth(node.right, i+1);
	 }
	 
	 
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode left1=new TreeNode(2);
		TreeNode right1=new TreeNode(3);
		TreeNode left2=new TreeNode(4);
		TreeNode right2=new TreeNode(5);
		TreeNode left3=new TreeNode(7);
		TreeNode right3=new TreeNode(6);
		TreeNode right4=new TreeNode(8);
		
		root.left=left1;
		root.right=right1;
		left1.left=left2;
		left1.right=right2;
		right2.left=left3;
		right1.right=right3;
		right3.right=right4;
		
		findDepth(root, 0);
		System.out.println(minDepth+" "+maxDepth);
	}

}
