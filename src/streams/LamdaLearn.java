
package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LamdaLearn {

	public static void main(String[] args) {
		List<String> list = List.of("suhas","sham","bharath","monika","ganu");
		//Return only if value length of string is above 5
		
		Predicate<String> isAbovefive=(s)->s.length()>4;
		List<String> aboveFiveList = filter(list, isAbovefive);
		System.out.println(aboveFiveList);
		
	}
	
	public static <T>List<T> filter(List<T> list,Predicate<T> isAbovefive)
	{
		List<T> ls = new ArrayList<>();
		for(T l:list)
		{
			if(isAbovefive.test(l))
			ls.add(l);
		}
		return ls;
	}
}
