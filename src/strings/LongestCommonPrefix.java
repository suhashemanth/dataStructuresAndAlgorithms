package strings;

public class LongestCommonPrefix {
	
	// Inorder to find Longest common prefix I will use 
	// word by word comparison technique
	
	public static void main(String[] args) {
		
		String[] a= {"sham","bro","shambulinga","shallow"};
		String pre=a[0];
		for(int i=1;i<a.length;i++)
		{
			pre=findLCP(a[i],pre);
		}
		System.out.println(pre);
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
