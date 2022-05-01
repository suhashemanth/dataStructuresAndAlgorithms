package dynamicProgramming;

public class FindAllThePalin {
	
	public static void main(String[] args) {
		String s="ababbc";
		int[][] dp=new int[6][6];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				if(i==j)
				{
					dp[i][j]=1;
				}
				if(j>i)
				{
					dp[i][j]=isP(s, j, i);
				}
			}
		}
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int isP(String s,int i,int j)
	{
		String s1="";
		for(int k=i;k>=j;k--)
		{
			s1=s1+s.charAt(k);
		}
		if(s.substring(j,i+1).equals(s1))
		{
			return 1;
		}
		return 0;
	}
	

}
