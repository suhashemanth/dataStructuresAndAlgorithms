package dynamicProgramming;

import java.util.Arrays;

public class Fibbonacci {
	static int[] dp=null;
	public static void main(String[] args) {
		int n=10;
		dp=new int[n+1];
		Arrays.fill(dp,-1);
		int fib = fib(n);
		System.out.println(Math.floor(Math.sqrt(33)));
	}
	
	public static int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		dp[n]=fib(n-1)+fib(n-2);
		return dp[n];
	}
}
