package basicAlgorithms;

import java.util.Arrays;

public class PairDifference {
	public static void main(String[] args) {
		int[] A= {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 
				2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 
				2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3 };
		int B=3;
		Arrays.sort(A);
        int i=0,j=1;
        int sum=0;
        int count=0;
        while((i<A.length)&&(j<A.length))
        {
            if((A[j]-A[i])<B)
            {
                j++;
            }
            else if((A[j]-A[i])>B)
            {
                i++;              
            }
            else
            {
               count++;
               int x=A[j];
               while(((j<A.length)&&(A[j]==x)))
               {
                   j++;
               }
               int y=A[i];
               while((i<A.length)&&(A[i]==y))
               {
                   i++;
               }
            }
        }
        System.out.println(count);        
	}

}
