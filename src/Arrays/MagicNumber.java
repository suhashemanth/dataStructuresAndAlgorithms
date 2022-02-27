package arrays;

import java.util.Arrays;

public class MagicNumber {
	
	public static void main(String[] args) {
		int[] A= {-98,54,-52,15,23,-97,12,-64,52,85};
		 Arrays.sort(A);
	        int max=0;
	        int min=0;
	        int i=0;
	        while(i<A.length/2)
	        {
	            max=max+(A[A.length-i]-A[i]);
	            i++;
	        }
	        i=1;
	        while(i<A.length-1)
	        {
	            min=min+(A[i]-A[i-1]);
	            i=i+2;
	        }
	        System.out.println(min+" "+max);
	}
	

}
