package dynamicProgramming;

public class Decode {
	
	public static void main(String[] args) {
		String s="1226";
		int noOfWays = noOfWays(s, s.length()-1);
		System.out.println(noOfWays);
	}
	
	public static int noOfWays(String s,int k)
	{
		if(k<=0)
		{
			return 1;
		}
		int rem=s.length()-k;
		if(s.charAt(rem)=='0')
		{
			return 0;
		}
		if(Integer.parseInt(s.substring(k-1,k+1))>0 && Integer.parseInt(s.substring(k-1,k+1))<27)
		{
			return noOfWays(s, k-1)+noOfWays(s, k-2);
		}
		return noOfWays(s, k-1);
		
	}

}
