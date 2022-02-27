package queue;

import java.util.Stack;

public class ImplQueue {
	public static void main(String[] args) {
		int[] A= {4,7,3,8};
		System.out.println(solve(A));
	}
	
	 public static int solve(int[] A) {
	        int[] MSEL=smallETL(A);
	        int[] MSER=smallETR(A);
	        int[] LEL=largeETL(A);
	        int[] LER=largeETR(A);
	        long sum=0;
	        for(int i=0;i<A.length;i++)
	        {
	            long x=((Math.max(MSEL[i],i)-Math.min(MSEL[i],i))*(Math.max(MSER[i],i)-Math.min(MSER[i],i))*1l);
	            long y=((Math.max(LEL[i],i)-Math.min(LEL[i],i))*(Math.max(LER[i],i)-Math.min(LER[i],i))*1l);
	            sum=(sum+((y-x)*1l*A[i]))%1000000007;
	        }
	        return (int)(sum%1000000007);
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

	    public static int[] largeETL(int[] A) {
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

	    public static int[] largeETR(int[] A) {
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
