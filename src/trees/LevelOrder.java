package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import trees.DifferentTraversals.TreeNode;

public class LevelOrder {
	
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val=val;
		}
	}
	 static HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
	    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
	        levelOrder2(A,0);
	        ArrayList<ArrayList<Integer>> list1=new ArrayList<ArrayList<Integer>>();
	        for(int i=0;i<map.size();i++)
	        {
	            list1.add(map.get(i));
	        }
	        return list1;
	    }

	    public static void levelOrder2(TreeNode root,Integer i)
	    {
	      if(root==null)
	      {
	          i=i-1;
	          return;
	      }
	      if(map.containsKey(i))
	      {
	          map.get(i).add(root.val);
	      }
	      else
	      {
	          ArrayList<Integer> list=new ArrayList<>();
	          list.add(root.val);
	           map.put(i,list);
	      }
	       
	       levelOrder2(root.left,i+1);
	       levelOrder2(root.right,i+1);
	    }
	 
	    static HashMap<Integer,Integer> map3=new HashMap<Integer,Integer>();
	    public static ArrayList<Integer> solve(TreeNode A) {
	        topView(A,0);
	        ArrayList<Integer> list=new ArrayList<>();
	        for(int i=0;i<map3.size();i++)
	        {
	            list.add(map3.get(i));
	        }
	        return list;
	    }
	    public static void topView(TreeNode node,int i)
	    {
	        if(node==null)
	        {
	            return;
	        }
	        if(map3.containsKey(i))
	        {

	        }
	        else
	        {
	            map3.put(i,node.val);
	        }
	        topView(node.left,i-1);
	        topView(node.right,i+1);
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
		
		ArrayList<Integer> solve = solve(root);
		System.out.println(solve);
		

	}

}
