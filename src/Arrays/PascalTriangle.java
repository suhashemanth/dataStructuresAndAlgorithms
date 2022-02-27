package basicAlgorithms;

public class PascalTriangle {
	
	public static void main(String[] args) {
		int[][] a=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if((i!=j)&&(j!=0))
				{
					a[i][j]=a[i-1][j]+a[i-1][j-1];
				}
				else
				{
					a[i][j]=1;
				}
			}
				
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
