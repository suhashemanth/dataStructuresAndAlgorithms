package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestMapMethods {
	
	public static void main(String[] args) {
		String s="ban nab test sett rest stiff ffits";
		String[] split = s.split(" ");
		Map<String,ArrayList<String>> map=new HashMap<>();
		for(int i=0;i<split.length;i++)
		{
			char[] ch=split[i].toCharArray();
			Arrays.sort(ch);
			String s1=new String(ch);
			map.computeIfAbsent(s1, x->new ArrayList<>()).add(split[i]);
		}
		System.out.println(map);
	}

}
