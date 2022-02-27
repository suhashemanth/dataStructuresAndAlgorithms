package dynamicProgramming;

import java.util.Arrays;

public class LIS {
	
	public static void main(String[] args) {
		int[] A= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int s=lis(A);
		System.out.println(s);
	}
	
	//static int[] dp=null;
    public static int lis(int[] A) {
        if(A.length==1)
        {
            return 1;
        }
        int[] dp=new int[A.length+1];
        Arrays.fill(dp, 0);
        dp[0]=1;
        for(int i=1;i<A.length;i++)
        {
            dp[i]=1+findMax(A,i,dp);
        }
        int maximum=0;
        for(int i=0;i<dp.length;i++)
        {
            Math.max(dp[i],maximum);
        }
		return maximum;
    }
    public static int findMax(int[] A,int i,int[] dp)
    {
        int max=0;
        for(int j=i-1;j>=0;j--)
        {
            if(A[j]<A[i])
            {
                max=Math.max(dp[j],max);
            }
        }
        return max;
    }

}
