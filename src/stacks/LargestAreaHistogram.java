package stacks;

import java.util.Stack;

public class LargestAreaHistogram {
	
	public static void main(String[] args) {
		int[] A= {6, 2, 5, 4, 5, 1, 6};
		System.out.println(largestRectangleArea(A));
	}
	 public static int largestRectangleArea(int[] A) {
	        int[] NSL=smallETL(A);
	        int[] NSR=smallETR(A);
	        long max=0;
	        if(A.length==1)
	        return A[0];

	        for(int i=0;i<A.length;i++)
	        {
	        	int y=NSL[i];
	            int z=NSR[i];
	            long res=(z-y-1)*A[i];
	            max=Math.max(res,max);
	        }
	        return (int)max;
	    }
	    public static int[] smallETL(int[] A) {
	         int[] arr=new int[A.length];
		        Stack<Integer> stack=new Stack<>();
		        for(int i=0;i<A.length;i++)
		        {
		            if(stack.isEmpty()==true)
		            {
		                stack.push(i);
		                arr[i]=-1;
		            }
		            else
		            {
		                while((stack.isEmpty()==false)&&(A[stack.peek()]>=A[i]))
		                {
		                    stack.pop();
		                }
		                if(stack.isEmpty()==true)
		                {
		                    arr[i]=-1;
		                    stack.push(i);
		                }
		                else
		                {
		                    arr[i]=stack.peek();
		                    stack.push(i);
		                }
		            }
		        }
		        return arr;
	    }

	    public static int[] smallETR(int[] A) {
	         int[] arr=new int[A.length];
		        Stack<Integer> stack=new Stack<>();
		        for(int i=A.length-1;i>=0;i--)
		        {
		            if(stack.isEmpty()==true)
		            {
		                stack.push(i);
		                arr[i]=-1;
		            }
		            else
		            {
		                while((stack.isEmpty()==false)&&(A[stack.peek()]>=A[i]))
		                {
		                    stack.pop();
		                }
		                if(stack.isEmpty()==true)
		                {
		                    arr[i]=-1;
		                    stack.push(i);
		                }
		                else
		                {
		                    arr[i]=stack.peek();
		                    stack.push(i);
		                }
		            }
		        }
		        return arr;
	    }

}
