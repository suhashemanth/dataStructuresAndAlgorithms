package stacks;

import java.util.Stack;

public class MinMax {
	
	public static void main(String[] args) {
		int[] A= {4,7,3,8};
		int[] prevSmaller = prevSmaller(A);
		for(int i=0;i<prevSmaller.length;i++)
		{
			System.out.print(prevSmaller[i]+" ");
		}
	}
	 public static int[] prevSmaller(int[] A) {
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
	                while((stack.isEmpty()==false)&&(A[stack.peek()]<=A[i]))
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
