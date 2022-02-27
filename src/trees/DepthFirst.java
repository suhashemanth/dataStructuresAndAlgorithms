package trees;

import java.util.ArrayList;
import java.util.HashMap;

import trees.DifferentTraversals.TreeNode;

public class DepthFirst {
	
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val=val;
		}
	}
	static int maxDepth=0;
	    static HashMap<Integer,Integer> map=new HashMap<>();
	    public static ArrayList<Integer> solve(TreeNode A) {
	            rightView(A,0);
	            ArrayList<Integer> list=new ArrayList<>();
	            for(int i=0;i<maxDepth;i++)
	            {
	                list.add(map.get(i));
	            }
	           // map=new HashMap<>();
	        return list;
	    }
	    public static void rightView(TreeNode A,int i)
	    {
	        if(A==null)
	        {
	            if(i>maxDepth)
	            {
	                maxDepth=i;
	            }
	            i=i-1;
	            return;
	        }
	        map.put(i,A.val);
	        rightView(A.left,i+1);
	        rightView(A.right,i+1);
	    }
	    
	    public static int findHeight(TreeNode node)
	    {
	    	if(node==null)
	    	{
	    		return -1;
	    	}
	    	return 1+Math.max(findHeight(node.left), findHeight(node.right));
	    }
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		TreeNode left1=new TreeNode(9);
		TreeNode right1=new TreeNode(20);
		TreeNode right3=new TreeNode(15);
		TreeNode right4=new TreeNode(7);
		
		
		root.left=left1;
		root.right=right1;
		right1.left=right3;
		right1.right=right4;
		
		int findHeight = findHeight(root);
		System.out.println(findHeight);

	}

}
