package linkedlist;

import linkedlist.LinkedList.Node;

public class List {
	
	public static void main(String[] args) {
		Node A=new Node(1);
		Node B=new Node(1);
		Node C=new Node(2);
		Node D=new Node(3);
		Node E=new Node(3);
		Node F=new Node(3);
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		E.next=F;
		F.next=null;
		Node deleteDuplicates = deleteDuplicates(A);
		LinkedList.printList(deleteDuplicates);
	}
	
	 public static Node reorderList(Node A) {
	        if(A.next==null)
	        {
	            return A;
	        }
	        Node slwPtr=A;
	        Node fastPtr=A;
	        Node prev=null;
	        while((fastPtr!=null)&&(fastPtr.next!=null))
	        {
	            prev=slwPtr;
	            slwPtr=slwPtr.next;
	            fastPtr=fastPtr.next.next;
	        }
	        prev.next=null;
	        Node rev=reverse(slwPtr);
	        Node m=merge(A,rev);
	        return m;
	    }

	    public static Node reverse(Node A)
	    {
	        Node curr=A;
	        Node prev=null;
	        Node nextPtr=null;
	        while(curr!=null)
	        {
	            nextPtr=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=nextPtr;
	        }
	        return prev;
	    }
	    public static Node merge(Node A,Node rev)
	    {
	        Node temp1=A;
	        while((temp1!=null)&&(rev!=null))
	        {
	            Node nextPtr=temp1.next;//null
	           // System.out.print(temp1.val+" ");
	            temp1.next=rev;//1->6->2->4
	            Node nextRev=rev.next;
	            rev.next=nextPtr;
	            temp1=nextPtr;
	            System.out.println(rev.value+" ");
	            rev=nextRev;
	        }
	        //temp1.next=rev;
	        while(A!=null)
	        {
	        	System.out.println(A.value);
	        	A=A.next;
	        }
	        return A;
	    }
	    
	    public static Node deleteDuplicates(Node A) {
	        Node curr=A;
	        while(curr!=null)
	        {
	            Node temp=curr;
	            while((curr.next!=null)&&(curr.value==curr.next.value))
	            {
	                curr=curr.next;
	            }
	            curr=curr.next;
	            temp.next=curr;
	        }
	        return A;
	    }

}
