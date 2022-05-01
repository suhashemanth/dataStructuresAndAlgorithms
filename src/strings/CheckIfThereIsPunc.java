package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CheckIfThereIsPunc {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Character> map=new LinkedHashSet<>();
		String s="!\"#$%&'()*+,-./:;?@[\\]^_`{|}~<";
		for(int i=0;i<s.length();i++)
		{
			map.add(s.charAt(i));
		}
		StringBuilder s1=new StringBuilder("Hello!!!, he said ---and went.");
		for(int i=0;i<s1.length();i++)
		{
			if(map.contains(s1.charAt(i)))
			{
				s1.deleteCharAt(i);
			}
		}
		System.out.println(s1);
	}

}
