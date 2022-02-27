package basicAlgorithms;

public class Test3 {
	public static void main(String[] args) {
		//long pow = (solve(2,7)%1000000007);
		int a=15;
		int r=(a>>0)&1;
		System.out.println(solve2(a));
		
	}
	public static int solve(int A, int B) {
        long p=1000000007;
        long fact=1;
        for(int i=1;i<=B;i++)
        {
            fact=(fact*i)%(p-1);
        }
        return (int)(pow(A,fact)%p);
    }
    public static long pow(long a,long b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b%2==0)
        {
            return pow((a*a)%1000000007,b/2);
        }
        return (a%1000000007)*pow((a*a)%1000000007,b/2);
    }
    
    public static int solve2(int a)
    {
    	double[] bin=new double[32];
    	double sum=0;
    	for(int i=0;i<32;i++)
    	{
    		bin[i]=a>>i&1;
    	System.out.print((int)bin[i]+" ");
    	}
    	for(int i=0;i<32;i++)
    	{
    		sum=sum+(bin[i]*Math.pow(5,i+1));
    	}
    	return (int)sum;
    }
    
}
