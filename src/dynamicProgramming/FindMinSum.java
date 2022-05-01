package dynamicProgramming;

public class FindMinSum {
	
	public static void main(String[] args) {
		int[][] A= { {2},
		        {3, 4},
		        {6, 5, 7},
		       {4, 1, 8, 3}};
		System.out.println(rec(0, A));
	}
	
	public static int rec(int i,int[][] A)
	{
		if(i>A.length-1)
		{
			return 0;
		}
		int min=Integer.MAX_VALUE;
		for(int j=0;j<=i;j++)
		{
			min=Math.min(min, A[i][j]+rec(i+1, A));
		}
		return min;
	}

}
