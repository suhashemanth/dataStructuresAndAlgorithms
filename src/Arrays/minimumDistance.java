package basicAlgorithms;

public class minimumDistance {

	public static void main(String[] args) {
		int[] a= {3, 30, 34, 5, 9};
		solve(a);
	}

	public static String solve(int[] A) {

		for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
            	if(j<A.length)
            	{
            		 if(A[i]%10<A[j]%10)
                     {
                         int temp=A[i];
                         A[i]=A[j];
                         A[j]=temp;
                     }
            	}
            }
        }
        String s="";
        for(int i=0;i<A.length;i++)
        {
           System.out.print(A[i]+" ");
            s=s+A[i];
        }
      return ""+s;  
	}

}
