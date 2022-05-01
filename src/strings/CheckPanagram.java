package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckPanagram {
	
	public static void main(String[] args) {
		
		String s="the quick brown fox jumped over the lazy dog";
		int[] st=new int[26];
		Arrays.fill(st,-1);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				//int count=s.charAt(i)-'a';
				st[s.charAt(i)-'a']++;
			}
		}
		ArrayList<Character> ch=new ArrayList<Character>();
		for(int i=0;i<st.length;i++)
		{
			if(st[i]==-1)
			{
				ch.add((char)(i+97));
			}
		}
		System.out.println(ch);
	}

}
