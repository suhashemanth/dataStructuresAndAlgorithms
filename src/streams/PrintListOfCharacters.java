package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrintListOfCharacters {
	
	public static void main(String[] args) {
		
		String[] s= {"suhas","sham","vivek","ganu","monika"};
		List<String> storeWords=new ArrayList<String>(Arrays.asList(s));
		Predicate<String> isGreaterThanFour=(str)->str.length()>4;
		List<String> list = storeWords.stream().filter(isGreaterThanFour).collect(Collectors.toList());
		System.out.println(list);
	}

}
