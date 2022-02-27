package basicAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoPair {
	public static void main(String[] args) {
		int count=0;
		int[] A= {1, 2, 6, 6, 7, 9, 9};
		int B=13;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
        	if(map.containsKey(B-A[i]))
        	{
        		count=count+map.get(B-A[i]);
        	}
        	else if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
        }
        System.out.println(count);
	}

}
