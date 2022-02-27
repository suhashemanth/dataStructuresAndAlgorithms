package basicAlgorithms;

import java.util.HashMap;

public class InsertionSort {
	
	public static void main(String[] args) {
		int A[]= {-97, -79, -88, -43, -61, -106, -52, -151, -115, -34, -142, -16, -124, -133, -25, -70};
		int a=A[0];
        int min2=A[1];
        HashMap<Integer, Integer> hm=new HashMap<>();
        if(a>min2)
        {
            a=min2;
            min2=A[0];
        }
        int sum=0;
        for(int i=1;i<A.length;i++)
        {
            if(a>A[i])
            {
                int temp=a;
                a=A[i];
                min2=temp;
            }
        }
        for(int i=0;i<A.length;i++)
        {
           sum=sum+A[i];
        		hm.put(A[i],1);
        }
        int diff=min2-a;
        int recSum=min2+diff;//3
        for(int i=0;i<A.length;i++)
        {
        	if(A[i]!=a && A[i]!=min2)
        	{
        		if(hm.containsKey(recSum))
        		{
        			recSum=recSum+diff;
        		}
        		else
        		{
        			System.out.println("0");
        		}
        	}
        }
	}
	
	public static int solve(int[] A) {
        
		int a=A[0];
        int min2=A[1];
        HashMap<Integer, Integer> hm=new HashMap<>();
        if(a>min2)
        {
            a=min2;
            min2=A[0];
        }
        int sum=0;
        for(int i=1;i<A.length;i++)
        {
            if(a>A[i])
            {
                int temp=a;
                a=A[i];
                min2=temp;
            }
        }
        for(int i=0;i<A.length;i++)
        {
        		sum=sum+A[i];
        }
         float n= (float)A.length/2;
        int apSum= (int)((n)*(2*a+(A.length-1)*(min2-a)));
        if(sum==apSum)
        {
            return 1;
        }
        return 0;
    }

}
