package recurssion;

public class PrintOneToN {
	
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		print(A.length-1,A);
	}
	
	public static void print(int i,int[] A)
	{
		if(i<0)
		{
			return;
		}
		System.out.println(A[i]);
		print(i-1, A);
	}

}
