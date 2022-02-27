package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStream {
	
	public static void main(String[] args) {
		
		Integer a[]= {1,2,3,4,5,6};
		
		List<Integer> arrayList=new ArrayList<>(Arrays.asList(a));
		
		Function<Integer,Integer> doubled=(x)->2*x;
		
		List<Integer> list = arrayList.stream().map(doubled).collect(Collectors.toList());
		System.out.println(list);
		
		//Filter only even numbers
		Predicate<Integer> isEven=(x)->x%2==0;
		List<Integer> evenNumbers = arrayList.stream().filter(isEven).collect(Collectors.toList());
		System.out.println(evenNumbers);
	}
}
