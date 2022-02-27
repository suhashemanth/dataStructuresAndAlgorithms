package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaxFreqWithDiffImpl {
	
	public static void main(String[] args) {
		int[][] A= {{1,13},{1,13},{1,90},{1,93},{2,0},{2,0},{2,0},{2,0}};
		int[] solve = solve(A);
		for(int i=0;i<solve.length;i++)
		{
			System.out.print(solve[i]+" ");
		}		
	}
	public static int[] solve(int[][] A) {
		        Map<Integer,Integer> map=new HashMap<>();
		        Map<Integer,Stack<Integer>> maxFreqMap=new HashMap<>();
		        int maxFreq=0;
	            int[] arr=new int[A.length];
	            for(int i=0;i<A.length;i++)
	            {
	               if(A[i][0]==1)
	               {
	                    int freq=map.getOrDefault(A[i][1],0)+1;
	                    map.put(A[i][1],freq);
	                    if(freq>maxFreq)
	                    {
	                        maxFreq=freq;
	                    }
	                    (maxFreqMap.computeIfAbsent(freq,x->new Stack<>())).push(A[i][1]);
	                    arr[i]=-1;
	               }
	               else
	               {
	                   arr[i]=maxFreqMap.get(maxFreq).pop();
	                   if(maxFreqMap.get(maxFreq).size()==0)
	                   {
	                       maxFreq--;
	                   }
	                   map.put(arr[i],maxFreq);
	               }
	            }
	            return arr;
	    }

}
