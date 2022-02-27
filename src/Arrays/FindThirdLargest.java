package arrays;

public class FindThirdLargest {
	
	public static void main(String[] args) {
		int[] a= {12,16,10,11,20,17,13,8,9};
		int min=Integer.MAX_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min2=min1;
				min1=min;
				min=a[i];
			}
			else if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else
			{
				min2=a[i];
			}
		}
		System.out.println(min2);
	}

}
