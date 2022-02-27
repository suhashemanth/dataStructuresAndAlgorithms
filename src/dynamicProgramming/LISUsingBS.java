package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LISUsingBS {
	
	public static void main(String[] args) {
		int[] A= {1,9,5,10,2,3,1,7,6};
		List<Integer> list=new ArrayList<>();
        list.add(A[0]);
        for(int i=1;i<A.length;i++)
        {
            if(A[i]<=list.get(list.size()-1))
            {
                int st=0;
                int end=list.size()-1;
                int store=0;
                while(st<=end)
                {
                    int mid=(st+end)/2;
                    if(A[i]==list.get(mid))
                    {
                    	store=mid;
                    	break;
                    }
                    if(A[i]<list.get(mid))
                    {
                        end=mid-1;
                    }
                    else
                    {
                        st=mid+1;
                    }
                    store=mid;
                    
                }
                if(A[i]!=list.get(store))
                {
                	list.add(store+1,A[i]);
                	list.remove(list.size()-1);
                }
                else
                {
                	list.set(store, A[i]);
                }
            }
            else
            {
                list.add(A[i]);
            }
        }
        System.out.println(list);
	}

}
