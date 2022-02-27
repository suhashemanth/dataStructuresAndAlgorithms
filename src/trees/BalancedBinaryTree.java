package trees;

import trees.DifferentTraversals.TreeNode;

public class BalancedBinaryTree {
	
	 public static TreeNode sortedArrayToBST(final int[] A) {
	        int st=0;
	        int end=A.length-1;
	     
	        TreeNode curr=solve(A,st,end);
	        return curr;
	        
	    }

	    public static TreeNode solve(int[] A,int st,int end)
	    {
	        if(st>end)
	        {
	            return null;
	        }
	        int mid=(st+end)/2;
	        TreeNode node= new TreeNode(A[mid]);
	        node.left=solve(A,st,mid-1);
	        node.right=solve(A,mid+1,end);
	        return node;
	    }
	    
	    public static void preOrder(TreeNode node)
	    {
	    	if(node==null)
	    	{
	    		return;
	    	}
	    	System.out.print(node.val+" ");
	    	preOrder(node.left);
	    	preOrder(node.right);
	    }
	    
	    public static void inOrder(TreeNode node)
	    {
	    	if(node==null)
	    	{
	    		return;
	    	}
	    	inOrder(node.left);
	    	System.out.print(node.val+" ");
	    	inOrder(node.right);
	    }
	    
	    public static void main(String[] args) {
			int[] A= {1, 2, 3, 5, 10};
			TreeNode sortedArrayToBST = sortedArrayToBST(A);
			preOrder(sortedArrayToBST);
			System.out.println();
			inOrder(sortedArrayToBST);
		}

}
