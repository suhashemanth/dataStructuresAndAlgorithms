package basicAlgorithms;

public class SmallestSequence {
	public static void main(String[] args) {
		int A=3;
		int B=11;
		int C=7;
		int D=50;
		 int count=0;
	        int i=1;
	        int j=1;
	        int k=1;
	        int p1=A;
	        int p2=B;
	        int p3=C;
	        int[] a=new int[D];
	        int z=0;
	        while(count<D)
	        {
	            p1=p1*i;
	            p2=p2*j;
	            p3=p3*k;
	            a[z++]=Math.min(Math.min(p1,p2),p3);
	            if((p1<p2)&&(p1<p3))
	            {
	                i++;
	            }
	            else if((p2<p1)&&(p2<p3))
	            {
	                j++;
	            }
	            else{
	                k++;
	            }
	            count++;
	        }
	        for(int r=0;r<a.length;r++)
	        {
	        	System.out.print(a[r]+" ");
	        }
	        
	}

}
