package com.optional;

import java.util.Optional;

public class TryOptional {
	
	public static void main(String[] args) {
		
		int val=0;
		Optional<Integer> option=Optional.empty();
		
		
		
		int value=option.isPresent()?option.get():0;
		System.out.println(value);
		
		//orElse
		Integer v = option.orElse(7);
		System.out.println(v);
		
		//orElseGet
		
		Integer integer = option.orElseGet(()->0);
		System.out.println(integer);
		
		//OrElseThrow
		
		//option.orElseThrow(()->new IllegalArgumentException());
		
		//orElseThrow
		option.orElseThrow();
	}

}
