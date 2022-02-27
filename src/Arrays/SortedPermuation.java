package basicAlgorithms;

public class SortedPermuation {
	
	public static void main(String[] args) {
		
		String A="acb";
		int max=256;
		 char[] s=A.toCharArray();
	        int[] count=new int[max+1];
	        for(int i=0;i<s.length;i++)
	        {
	            System.out.print(A.charAt(i)+" ");
	            count[s[i]]++;
	            //System.out.print(count[i]+" ");
	        }
	        for(int i=1;i<257;i++)
	        {
	            count[i]+=count[i-1];
	          // System.out.print(count[i]+" ");
	        }
			int[] fact=new int[A.length()+1];
			fact[0]=1;
			for(int i=1;i<=A.length();i++)
			{
				fact[i]=(i*fact[i-1])%1000003;
			}
			long sum=0;
			for(int i=0;i<s.length;i++)
			{
	                sum=(sum+((1l*count[s[i]-1]*fact[s.length-1-i]))%1000003)%1000003;   
	                //System.out.print(sum+" ");         
	                for(int j=s[i];j<257;j++)
	                {
	                    count[j]--;
	                }
			}
			System.out.println(sum);
	}

}
