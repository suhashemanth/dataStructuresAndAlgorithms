package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SubSetGeneration {
	static ArrayList<Stack<Integer>> list=new ArrayList<Stack<Integer>>();
	public static void main(String[] args) {
		int[] A= {1,2,3};
		Arrays.sort(A);
		subset(A, 0, A.length, new Stack<>());
		System.out.println(list);
	}
	
	public static void subset(int[] A,int i,int n,Stack<Integer> stack)
	{
		if(i==n)
		{
			System.out.println(stack);
			list.add(stack);
			return;
		}
		stack.push(A[i]);
		subset(A, i+1,n, stack);
		stack.pop();
		subset(A, i+1, n, stack);
	}

}
