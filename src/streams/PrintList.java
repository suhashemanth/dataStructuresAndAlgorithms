package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrintList {
	
	public static void main(String[] args) {
		
		String[] s= {"suhas","sham","vivek","ganu","monika"};
		List<String> storeWords=new ArrayList<String>(Arrays.asList(s));
		Function<Integer, Predicate<String>> greaterThan=(minLength)->
		{
			return (str)->str.length()>minLength;
		};
		Predicate<String> isGreaterThan3 = greaterThan.apply(5);
		List<String> greater = storeWords.stream().filter(isGreaterThan3).collect(Collectors.toList());
		System.out.println(greater);
		
		Address add = ()->{System.out.println("I am in the right address");};
		add.apply();
	}

}
