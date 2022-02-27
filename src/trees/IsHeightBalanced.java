package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class IsHeightBalanced {
	
	static class Node
	{
		int val;
		Node left;
		Node right;
		
		Node(int val) {
			this.val=val;
		}
	}
	
	static class Info
	{
		int height;
		boolean isHB;
		
		public Info(int height,boolean isHB) {
			this.height=height;
			this.isHB=isHB;
		}
	}
	
	public static Info IHB(Node node)
	{
		if(node==null)
		{
			return new Info(0,true);
		}
		Info L=IHB(node.left);
		Info R=IHB(node.right);
		int height1=1+Math.max(L.height,R.height);
		boolean isHB1=(Math.abs(L.height-R.height)>1) &&(L.isHB)&&(R.isHB);
				
		return new Info(height1, isHB1);
	}
	
	public static ArrayList<ArrayList<Integer>> levelOrder(Node node)
	{
		Queue<Node> q=new LinkedList<>();
		Queue<Node> p=new LinkedList<IsHeightBalanced.Node>();
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		q.add(node);
		while(!q.isEmpty())
		{
			ArrayList<Integer> temp=new ArrayList<>();
			while(!q.isEmpty())
			{
				temp.add(q.peek().val);
				p.add(q.peek());
				q.poll();
			}
			list.add(temp);
			while(!p.isEmpty())
			{
				if(p.peek().left!=null)
				{
					q.add(p.peek().left);
				}
				if(p.peek().right!=null)
				{
					q.add(p.peek().right);
				}
				p.poll();
			}
		}
		return list;
	}
	
	public static void preOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public static void main(String[] args)
	{
		Node root=new Node(1);
		Node left1=new Node(2);
		Node right1=new Node(3);
		Node left2=new Node(4);
		Node right2=new Node(5);
		Node left3=new Node(6);
		Node left4=new Node(7);
		Node right3=new Node(8);
		
		root.left=left1;
		root.right=right1;
		left1.left=left2;
		left1.right=right2;
		left2.left=left3;
		right1.right=right3;
		right1.left=left4;
		
		ArrayList<ArrayList<Integer>> levelOrder = levelOrder(root);
		System.out.println(levelOrder);
	}

}
