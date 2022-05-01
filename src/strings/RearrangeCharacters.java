package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RearrangeCharacters {
	
	public static void main(String[] args) {
		String s="bbbaacccc";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		boolean isEven=true;
		int i=0;
		String s1="";
		for(Character c:map.keySet())
		{
			Integer k = map.get(c);
			int j=0;
			if(isEven==true)
			{
				while(i<s.length()&&j<k)
				{
					s1=s1+c;
					j++;
					i=i+2;
				}
				if(i>s.length()-1)
				{
					isEven=false;
					i=1;
				}
			}
			else
			{
				while(i<s.length()&&j<k)
				{
					s1=s1.substring(0,i)+c+s1.substring(i,s1.length());
					j++;
					i=i+2;
				}
			}
			map.put(c, k-1);
		}
		System.out.println(s1);
	}

}
