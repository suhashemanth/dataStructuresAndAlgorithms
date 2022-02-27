package basicAlgorithms;

public class MajorityElement {
	
	public static void main(String[] args) {
		int[] a= {1,3,2,3,3,3,3,6,3,8};
		int me=a[0];
		int count=1;
		for(int i=1;i<a.length;i++)
		{
			if(count==0)
			{
				me=a[i];
			}
			if(me==a[i])
			{
				count++;
			}
			else
			{
				count--;
			}
		}
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==me)
			{
				count2++;
			}
		}
		if(count2>a.length/2)
		{
			System.out.println(me);
		}
		else
		{
			System.out.println(-1);
		}
		
	}

}
