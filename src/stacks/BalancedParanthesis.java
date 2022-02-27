package stacks;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static void main(String[] args) {
		String s=")))))";
		int solve = solve(s);
		System.out.println(solve);
	}
	 public static int solve(String A) {
	        Stack<Character> stack=new Stack<>();
	        for(int i=0;i<A.length();i++)
	        {
	            System.out.print(stack+" ");
	            if((A.charAt(i)==']')&&(A.charAt(i)==')')&&(A.charAt(i)=='}'))
	            {
	                if(stack.isEmpty()==true)
	                {
	                    return 0;
	                }
	                
	            }
	            else if((A.charAt(i)!=']')&&(A.charAt(i)!=')')&&(A.charAt(i)!='}'))
	            {
	                stack.push(A.charAt(i));
	            }
	            else if((A.charAt(i)==']')&&(stack.peek()=='['))
	            {
	                stack.pop();
	            }
	            else if((A.charAt(i)==']')&&(stack.peek()!='['))
	            {
	                return 0;
	            }
	            else if((A.charAt(i)=='}')&&(stack.peek()=='{'))
	            {
	                stack.pop();
	            }
	            else if((A.charAt(i)=='}')&&(stack.peek()!='{'))
	            {
	                return 0;
	            }
	            else if((A.charAt(i)==')')&&(stack.peek()=='('))
	            {
	                stack.pop();
	            }
	            else if((A.charAt(i)==')')&&(stack.peek()!='('))
	            {
	                return 0;
	            }
	            else
	            {
	                return 0;
	            }
	        }
	        if(stack.isEmpty()==false)
	        {
	        	 return 0;
	        }	       
	        return 1;
	    }

}
