package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class DifferentTraversals {
	
	public static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val=val;
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
	 
	 static List<Integer> list=new ArrayList<>();
	 
	 public static void preOrder(TreeNode A)
	 {
		 if(A==null)
		 {
			 return;
		 }
		 list.add(A.val);
		 preOrder(A.left);
		 preOrder(A.right);
	 }
	 
	 static List<Integer> list1=new ArrayList<>();
	 
	 public static void inOrder(TreeNode A)
	 {
		 if(A==null)
		 {
			 return;
		 }
		 if(A.left==null && A.right==null)
		 {
			 list1.add(A.val);
			 return;
		 }
		 inOrder(A.left);
		 list1.add(A.val);
		 inOrder(A.right);
	 }
	 
 static List<Integer> list2=new ArrayList<>();
	 
	 public static void postOrder(TreeNode A)
	 {
		 if(A==null)
		 {
			 return;
		 }
		 if(A.left==null && A.right==null)
		 {
			 list2.add(A.val);
			 return;
		 }
		 postOrder(A.left);
		 postOrder(A.right);
		 list2.add(A.val);

	 }
	 
	 //static HashMap<Integer,List<Integer>> map=new HashMap<>();
	 static HashMap<Integer,Integer> map1=new HashMap<>();
	 public static void vot(TreeNode node,int i)
	 {
		 if(node==null)
			 return;
		 map.get(i).add(node.val);
		 vot(node.left, i-1);
		 vot(node.right, i+1);
	 }
	 
	 public static void level(TreeNode node,int i)
	 {
		 if(node==null)
		 {
			 i=i-1;
			 return;
		 }
		 map1.put(node.val, i);
		 level(node.left,i+1);
		 level(node.right,i+1);
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
		
//		findDepth(root,0);
//		for(int i=minDepth;i<maxDepth+1;i++)
//		{
//			map.put(i, new ArrayList<>());
//		}
//		vot(root, 0);
//		System.out.println(map);
		
//		level(root, 0);
//		System.out.println(map1);
//		postOrder(root);
//		Collections.sort(list2,((a,b)->
//		{
//			return -1;
//		}));
//		System.out.println(list2);
		
		ArrayList<ArrayList<Integer>> levelOrder = levelOrder(root);
		
		System.out.println(levelOrder);
		
		
	}


}
