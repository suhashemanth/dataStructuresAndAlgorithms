package com.optional;

import java.util.Optional;

public class UsefulOptional {
	
	public static void main(String[] args) {
		
		Optional<String> op = Optional.of("value");
		
		//map() modifies a value or collection
		
		Optional<String> map = op.map((s)-> s+" "+"suhas");
		System.out.println(map.get());
		
		//filter() takes predicate and filters
		
		//flatmap() returns optional
		
	}

}
