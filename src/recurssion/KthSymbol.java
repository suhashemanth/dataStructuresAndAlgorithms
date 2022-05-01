package recurssion;

import java.util.LinkedList;
import java.util.Queue;

public class KthSymbol {
	
	public static void main(String[] args) {
		solve(5, 5);
	}
	  public static int solve(int A, int B) {
	        Queue<Integer> q=new LinkedList();
	        q.add(0);
	        Queue<Integer> q1=new LinkedList();
	        for(int i=1;i<A;i++)
	        {
	            while(!q.isEmpty())
	            {
	                if(q.peek()==0)
	                {
	                    q1.add(0);
	                    q1.add(1);
	                }
	                else
	                {
	                    q1.add(1);
	                    q1.add(0);
	                }
	                q.poll();
	            }
	            while(!q1.isEmpty())
	            {
	                q.add(q1.peek());
	                q1.poll();
	            }
	        }
	        int i=1;
	        int temp=0;
	        while(!q.isEmpty() && i<B-1)
	        {
	            //System.out.print(q.peek()+" ");
	            temp=q.peek();
	            q.poll();
	        }
	        return temp;
	    }

}
