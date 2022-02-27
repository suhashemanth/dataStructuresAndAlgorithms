package basicAlgorithms;

public class FindNpr {
	public static void main(String[] args) {
		System.out.println(solve(778,578,10007));
	}
	
	public static int solve(int A, int B, int C) {
        int[] n=new int[A+1];
        n[0]=1;
        int fact=1;
        for(int i=1;i<=A;i++)
        {
            fact=(fact*i)%C;
            n[i]=fact;
        }
        
        System.out.println(findPow(n[A-B],C-2,C));
        System.out.println(findPow(n[B],C-2,C));
        return (n[A]%C*(int)findPow(n[A-B],C-2,C)*(int)findPow(n[B],C-2,C))%C;
    }
	public static long findPow(long A,long r,long B)
    {
        if(r==0)
        {
            return 1;
        }
        if((r%2)==0)
        {
            return (findPow((A*A)%B,r/2,B))%B*1l;
        }
          
         return (A*(findPow((A*A)%B,r/2,B)))%B*1l;
        
    }
}
