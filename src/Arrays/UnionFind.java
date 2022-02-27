package basicAlgorithms;

public class UnionFind {
	
	static int[] a=new int[10];
	public static void main(String[] args) {
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=i;
		 }
		union(4,3);
		union(3,8);
		union(6,5);
		union(9,4);
		union(2,1);
		System.out.println(isConnected(8, 9));
	}
	
	public static boolean isConnected(int p,int q)
	{
		if(a[p]==a[q])
		{
			return true;
		}
		return false;
	}
	
	//4,3
	//3,8
	//6,5
	//9,4
	//2,1
	public static void union(int p,int q)
	{
		int x=a[p];//4,3
		//int y=a[q];//3,8
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)//
			{
				a[i]=a[q];//a[4]=3,
				//a[3]=8,a[4]=8
			}
		}
	}

}
