package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaxFrequencyStack {
	
	public static void main(String[] args) {
		int[][] arr= { {1, 46},
				  {2, 0},
						  {1, 11},
						  {1, 38},
						  {2, 0},
						  {1, 71},
						  {2, 0},
						  {2, 0},
						  {1, 45},
						  {2, 0},
						  {1, 27},
						  {1, 23},
						  {2, 0},
						  {1, 69},
						  {2, 0},
						  {2, 0},
						  {1, 76},
						  {1, 64},
						  {2, 0},
						  {2, 0},
						  {1, 13},
						  {1, 13},
						  {1, 93},
						  {1, 90},
						  {2, 0},
						  {2, 0},
						  {2, 0},
						  {1, 4},
						  {1, 63},
						  {2, 0},
						  {1, 9},
						  {2, 0},
						  {1, 26},
						  {1, 29},
						  {2, 0},
						  {2, 0},
						  {1, 26},
						  {2, 0},
						  {1, 91},
						  {1, 52},
						  {1, 89},
						  {1, 8},
						  {1, 95},
						  {2, 0},
						  {2, 0},
						  {2, 0},
						  {2, 0},
						  {2, 0},
						  {2, 0},
						  {1, 38},
						  {2, 0},
						  {2, 0},
						  {1, 65}};
		int[] solve = solve(arr);
		for(int i=0;i<solve.length;i++)
		{
			System.out.print(solve[i]+" ");
		}
	}
	public static int[] solve(int[][] A) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> minStack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i][0]==1)
            {
                stack.push(A[i][1]);
                if(map.containsKey(A[i][1]))
                {
                    map.put(A[i][1],map.get(A[i][1])+1);
                }
                else
                {
                    map.put(A[i][1],1);
                }
                arr[i]=-1;
                if(minStack.isEmpty()==true)
                {
                    minStack.push(A[i][1]);
                }
                else
                {
                    if(map.get(minStack.peek())<map.get(A[i][1]))
                    {
                        minStack.push(A[i][1]);
                    }
                }
            }            
            else
            {
                arr[i]=minStack.peek();
                minStack.pop();
                if((map.get(arr[i])-1)==0)
                {
                	map.remove(arr[i]);
                }
                else
                {
                	map.put(arr[i],map.get(arr[i])-1);
                }                
            }
        }
        return arr;
    }
	
	 public static int[] solve1(int[][] A) {
	        Stack<Integer> stack=new Stack<>();
	        Map<Integer,Integer> map=new HashMap<>();
	        Map<Integer,Stack<Integer>> maxFreqMap=new HashMap<>();
	        Stack<Integer> maxFreqStack=new Stack<>();
	        int[] arr=new int[A.length];
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i][0]==1)
	            {
	                stack.push(A[i][1]);
	                if(map.containsKey(A[i][1]))
	                {
	                    map.put(A[i][1],map.get(A[i][1])+1);
	                }
	                else
	                {
	                    map.put(A[i][1],1);
	                }
	                arr[i]=-1;
	                if(maxFreqMap.containsKey(map.get(A[i][1])))
	                {
	                	Stack<Integer> stack2 = maxFreqMap.get(map.get(A[i][1]));
	                	stack2.push(A[i][1]);
	                    maxFreqMap.put(map.get(A[i][1]),stack2);
	                }
	                else
	                {
	                    Stack<Integer> st=new Stack<>();
	                    st.push(A[i][1]);
	                    maxFreqMap.put(map.get(A[i][1]),st);
	                }
	                if(maxFreqStack.isEmpty()==true)
	                {
	                    maxFreqStack.push(A[i][1]);
	                }
	                else
	                {
	                    if(map.get(maxFreqStack.peek())<=map.get(A[i][1]))
	                    {
	                        maxFreqStack.push(A[i][1]);
	                    }
	                }
	            }
	            else
	            {
	            	Integer pop = maxFreqMap.get(map.get(maxFreqStack.peek())).pop();
	                if(stack.peek()==maxFreqStack.peek())
	                {
	                    maxFreqStack.pop();
	                }
	                stack.pop();
	            }
	        }
	        return arr;
	    }

}
