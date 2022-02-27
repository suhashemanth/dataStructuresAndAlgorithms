package heap;

public class MinAndMaxHeap {
	
	public static void main(String[] args) {
		int[] a= {15,8,70,80,10,5};
		System.out.println(checkIfMaxHeap(a));
		buildHeap(a, a.length-1);
		System.out.println(checkIfMaxHeap(a));
		sort(a, a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void buildHeap(int[] a,int n)
	{
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a, n,i);
		}
	}
	
	public static void heapify(int[] a,int n,int i)
	{
		int l=2*i+1;
		int r=2*i+2;
		int lar=i;
		if((l<n)&&(a[l]>a[lar]))
		{
			lar=l;
		}
		if((r<n)&&(a[r]>a[lar]))
		{
			lar=r;
		}
		if(lar!=i)
		{
			int temp=a[lar];
			a[lar]=a[i];
			a[i]=temp;
		}
		
	}
	
	
	public static void sort(int[] a,int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a, i, 0);
		}
	}
	
	
	public static boolean checkIfMaxHeap(int[] A)
	{
		for(int i=(A.length/2-1);i>=0;i--)
		{
			int curr=A[i];
			int left=A[2*i+1];
			int right=0;
			if(2*i+2<A.length)
			{
				right=A[2*i+2];
			}
			
			if(curr>left && curr>right)
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

}
