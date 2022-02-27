package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class SortedArray {
	public static void main(String[] args) {
		//66, 96, 43, 28, 14, 1, 41, 76, 
		//70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12
		ArrayList<Integer> list=new ArrayList<>();
		list.add(66);
		list.add(96);
		list.add(43);
		list.add(28);
		list.add(14);
		list.add(1);
		list.add(41);
		list.add(76);
		list.add(70);
		list.add(81);
		list.add(22);
		list.add(11);
		list.add(42);
		list.add(78);
		list.add(4);
		list.add(88);
		list.add(70);
		list.add(43);
		list.add(90);
		list.add(6);
		list.add(12);
		ArrayList<Integer> solve = solve(list);
		System.out.println(solve);
		
	}
	
	 public static ArrayList<Integer> solve(ArrayList<Integer> A) {
	        ArrayList<Integer> list=new ArrayList<>();
	        Stack<Integer> stack=new Stack<>();
	        Stack<Integer> stack1=new Stack<>();
	        for(int i=0;i<A.size();i++)
	        {
	            if(stack.isEmpty()==true)
	            {
	                stack.push(A.get(i));
	            }
	            else
	            {
	                if(A.get(i)>stack.peek())
	                {
	                    while((stack.isEmpty()==false)&&(A.get(i)>stack.peek()))
	                    {
	                        stack1.push(stack.peek());
	                        stack.pop();
	                    }
	                    stack.push(A.get(i));
	                    while(stack1.isEmpty()==false)
	                    {
	                        stack.push(stack1.peek());
	                        stack1.pop();
	                    }
	                }
	                else
	                {
	                    stack.push(A.get(i));
	                }
	            }
	        }
	        while(stack.isEmpty()==false)
	        {
	            list.add(stack.peek());
	            stack.pop();
	        }
	        return list;
	    }

}
