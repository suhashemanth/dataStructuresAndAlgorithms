package dynamicProgramming;

import java.util.Arrays;

public class MinCostsquare {
	 static int[] dp=null;
	    public static int countMinSquares(int A) {
	        dp=new int[A+1];
	        Arrays.fill(dp,-1);
	        return cost(A);
	    }

	    public static int cost(int A)
	    {
	        if(A==0)
	        return 0;
	        if(dp[A]!=-1)
	        {
	            return dp[A];
	        }
	        int sum=Integer.MAX_VALUE;
	        for(int i=1;i<(int)Math.floor(Math.sqrt(A));i++)
	        {
	            sum=Math.min(sum,cost(A-i*i)+1);
	            dp[A]=sum;
	        }
	        return dp[A];
	    }
	
	public static void main(String[] args) {
		int countMinSquares = countMinSquares(6);
		System.out.println(countMinSquares);
		
	}
	

}
