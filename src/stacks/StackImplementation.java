package stacks;

import java.util.Stack;

public class StackImplementation {
	static Stack<Integer> stack=new Stack<>();
	static Stack<Integer> minStack=new Stack<>();
	public static void main(String[] args) {
		push(19);
		push(10);
		push(9);
		System.out.println(getMin());
		push(8);
		System.out.println(getMin());
		push(7);
		System.out.println(getMin());
		push(6);
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
	}
	public static void push(int x) {
		if(stack.isEmpty())
		{
			 stack.push(x);
		}
		else
		{
			stack.push(x);
			  if(minStack.isEmpty())
		       {
		    	   minStack.push(x);
		       }
		       else
		       {
		    	  if(minStack.lastElement()>=stack.lastElement())
		    	  {
		    		  minStack.push(x);
		    	  }
		       }
		}
     
    }

    public static void pop() {
        if(stack.isEmpty())
        	return;
        int ele=stack.lastElement();
        stack.removeElement(ele);
        if(minStack.isEmpty())
        	return;
        else
        {
        	if(minStack.lastElement().equals(ele))
            	minStack.remove(minStack.lastIndexOf(ele));
        }
    }

    public static int top() {
        if(stack.isEmpty())
        	return -1;
        return stack.lastElement();
    }

    public static int getMin() {
        if(minStack.isEmpty())
        	return -1;
        
        return minStack.lastElement();
        }
    }

