package dynamicProgramming;

public class NonAdjacentMax {
	static int[] A={80,20,180,100,15,60};
	public static void main(String[] args) {
		int nonAdj = nonAdj(A.length-1);
		System.out.println(nonAdj);
	}
	
	public static int nonAdj(int i)
	{
		if(i<0)
		{
			return 0;
		}
		return Math.max(A[i]+nonAdj(i-2),nonAdj(i-1));
	}

}
