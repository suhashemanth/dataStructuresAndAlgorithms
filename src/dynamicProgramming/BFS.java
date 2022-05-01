package dynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public static void main(String[] args) {
        int[] res=new int[10];
        Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		Queue<Integer> q1=new LinkedList<>();
		while(q1.size()+q.size()<=9)
		{
			int x=q.peek();
			q1.add(q.poll());
			q.add(x*10+1);
			q.add(x*10+2);
			q.add(x*10+3);
		}
        int i=0;
        while(!q1.isEmpty())
        {
            res[i]=q1.poll();
            i++;
        }
        while(!q.isEmpty())
        {
            res[i]=q.poll();
            i++;
        }
        for(int j=0;j<res.length;j++)
        {
        	System.out.println(res[j]);
        }
		System.out.println(q1);
		System.out.print(q);
		
	}
	

}
