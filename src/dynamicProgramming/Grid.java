package dynamicProgramming;

import java.util.Arrays;

public class Grid {
	static int[][] dp=new int[1001][1001];
	public static void main(String[] args) {
		Arrays.stream(dp).forEach(a->Arrays.fill(a, -1));
		int grid = grid(0, 0);
		System.out.println(grid);
	}
	
	public static int grid(int i, int j)
	{
		if(i>1000)
		{
			return 0;
		}
		if(j>1000)
		{
			return 0;
		}
		if(i==1000 && j==1000)
		{
			return 1;
		}
		if(dp[i][j]!=-1)
		{
			return dp[i][j]; 
		}
		
		dp[i][j]= grid(i+1, j)+grid(i, j+1);
		return dp[i][j];
	}

}
