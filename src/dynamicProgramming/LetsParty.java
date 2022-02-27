package dynamicProgramming;

public class LetsParty {
	
	public static void main(String[] args) {
		int[] dp=new int[2];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=4;i++)
		{
			int temp=dp[1];
			dp[1]=dp[1]+(i-1)*dp[0];
			dp[0]=temp;
		}
		System.out.println(dp[1]);
	}

}
