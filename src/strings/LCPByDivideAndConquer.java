package strings;

public class LCPByDivideAndConquer {
	public static void main(String[] args) {
		String[] s= {"abcdefgh", "aefghijk", "abcefgh"};
		String divide = divide(s, 0, s.length-1);
		System.out.println(divide);
	}
	
	public static String divide(String[] s,int st,int end)
	{
		if(st==end)
		{
			return s[st];
		}
		if(end>st)
		{
		int mid=st+end/2;
		String str1=divide(s, st, mid);
		String str2=divide(s, mid+1, end);
		return findLCP(str1, str2);
		}
		return null;
	}

	public static String findLCP(String A,String B)
	{
		String pre="";
		int i=0;
		while(i<A.length() && i<B.length() && A.charAt(i)==B.charAt(i))
		{
			pre=pre+A.charAt(i);
			i++;
		}
		return pre;
	}

}
