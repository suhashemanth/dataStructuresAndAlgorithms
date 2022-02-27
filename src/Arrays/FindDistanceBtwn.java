package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindDistanceBtwn {
	
	public static void main(String[] args) {
		int[] a= {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 3};
		String z="abcdedfj";
		//System.out.println(z.substring(0, 3));
		int x=1<<1|1;
		System.out.println(1<<4);
	}
	
	static int minDist(int a[], int n, int x, int y) {
        // code here
        int p=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==x||a[i]==y)
        	{
        		if((p!=-1)&&(a[i]!=a[p]))
        		{
        			min=Math.min(min, i-p);
        		}
        		p=i;
        	}
        }
        return min;
       
    }

}
