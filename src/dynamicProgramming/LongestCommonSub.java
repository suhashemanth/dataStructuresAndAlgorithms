package dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonSub {
	
	static String s1="bebdeeedaddecebbbbbabebedc";
	static String s2="abaaddaabbedeedeacbcdcaaed";
	static HashMap<Character,Integer> map=new HashMap<>();
	static int[] dp=new int[s1.length()+1];
	public static void main(String[] args) {
		Arrays.fill(dp, -1);
		lcs(s1.length()-1, s2.length()-1);
		System.out.println(lcs1(s1.length()-1, s2.length()-1));
	}
	
	public static void lcs(int i,int j)
	{
		if(i<0||j<0)
		{
			return;
		}
		if(s1.charAt(i)==s2.charAt(j))
		{
			map.put(s1.charAt(i),1);
			return;
		}
		lcs(i-1, j);
		lcs(i,j-1);
	}
	
	public static int lcs1(int i,int j)
	{
		if(i<0 || j<0)
		{
			return 0;
		}
		if(s1.charAt(i)==s2.charAt(j))
		{
			return 1+lcs1(i-1, j-1);
		}
		return Math.max(lcs1(i-1, j),lcs1(i,j-1));
	}


}
