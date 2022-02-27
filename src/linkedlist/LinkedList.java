package linkedlist;

import java.util.Stack;

import linkedlist.LinkedList.Node;

public class LinkedList {
	static class Node
	{
		int value;		
		Node next;
		
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	
	public static void printList(Node A)
	{
		while(A.next!=null)
		{
			System.out.println(A.value);
			A=A.next;
		}
		System.out.println(A.value);
	}
	
	public static Node insertAtEnd(Node A)
	{
		Node B=null;
		B=A.next;
		A.next=null;
		
		return B;
	}
	
	public static void print(Node A)
	{
		if(A==null)
			return;
		System.out.println(A.value);
		A=A.next;
		print(A);
	}
	
	 public static Node removeNthFromEnd(Node A, int B) {
	        int length=0;
	        Node temp=A;
	        while(temp.next!=null)
	        {
	            length++;
	            temp=temp.next;
	        }
	        length=length+1;
	        int remLen=length-B;
	        temp=A;
	        if(remLen<=0)
	        {
	        	A=temp.next;
	        }
	        else
	        {
	         int k=0;
	         temp=A;
	         while(k<remLen-1 && temp.next!=null)
	         {
	        	 temp=temp.next;
	        	 k++;
	         }   
	         Node x=temp;
	         temp.next=x.next.next;
	        }
	        return A;
	    }
	 public static Node reverseList(Node A, int B) {
	        Node curr=A;
	        Node nextPtr=null;
	        Node prev=null;
	        boolean flag=false;
	        Node p=A;
	        Node initial=null;
	        while(curr!=null)
	        {            
	            int k=0;
	           Node n=curr;
	            while((k<B)&&(curr!=null))
	            {
	                nextPtr=curr.next;    
	                curr.next=prev;
	                prev=curr;
	                curr=nextPtr;
	                k++;
	            }
	            if(initial==null)
	            {
	            	p=prev;
	                while(prev.next!=null)
	                {
	                    prev=prev.next;
	                }
	                initial=prev;
	            }
	            else
	            {
	                initial.next=prev;
	                while(prev.next!=n)
	                {
	                    prev=prev.next;
	                }
	                initial=prev;
	            }
	        }
	        return p;
	    }
	 
	 public static Node findMiddle(Node A)
	 {
		 Node slwPtr=A;
		 Node fastPtr=A;
		 while((fastPtr!=null)&&(fastPtr.next!=null))
		 {
			 slwPtr=slwPtr.next;
			 fastPtr=fastPtr.next.next;
		 }
		 return slwPtr;
	 }
	 
	 public static Node reverseBetween(Node A, int B, int C) {
	        Node temp=A;
	        Node prev=null;
	        Node res=null;
	        int count=1;
	        if(temp.next==null)
	            {
	                return A;
	            }
	        while(temp!=null)
	        {
	            if(count==B)
	            {
	                res=reverse(temp,prev,C,count);
	                break;
	            }
	            prev=temp;
	            count++;
	            temp=temp.next;
	        }
	        return res;
	    }
	        public static Node reverse(Node temp,Node pre,int C,int count)
	        {
	        	System.out.println(pre.value);
	            Node prev=null;
	            Node curr=temp;
	            Node nextPtr=null;
	            while((curr!=null)&&(count<=C))
	            {
	                nextPtr=curr.next;
	                curr.next=prev;
	                prev=curr;
	                curr=nextPtr;
	                count++;
	            }
	            pre.next=prev;
	            temp.next=curr;
	            return pre;
	        }
	        
	        static Node segregate(Node head)
	        {
	            int[] a=new int[3];
	            Node curr=head;
	            while(curr!=null)
	            {
	                a[curr.value]++;
	                curr=curr.next;
	            }
	            Node dummy=new Node(-1);
	            Node A=dummy;
	            for(int i=0;i<3;i++)
	            {
	                int n=a[i];
	                int k=0;
	                while(k<n)
	                {
	                    A.next= new Node(i);
	                    A=A.next;
	                }
	            }
	           return dummy.next; 
	        }
	public static void main(String[] args) {
		Node A=new Node(1);
		Node B=new Node(2);
		Node C=new Node(2);
		Node D=new Node(1);
		Node E=new Node(0);
		Node F=new Node(1);
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=F;
		F.next=null;
		
		Node segregate = segregate(A);
		printList(segregate);
	}

}
