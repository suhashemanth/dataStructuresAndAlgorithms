package dynamicProgramming;

public class FindingNthCatalan {
	
	static int[] dp=null;
	public static void main(String[] args) {
		int n=7;
		dp=new int[n];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<n;i++)
		{
			dp[i]=nthCatalan(0, i-1);
		}
		System.out.println(dp[n-1]);
	}
	
	public static int nthCatalan(int i,int n)
	{
		if(i==n)
		{
			return dp[i]*dp[n];
		}
		if(i>n)
		{
			return 0;
		}
		return 2*(dp[i]*dp[n])+nthCatalan(i+1, n-1);
	}
}
