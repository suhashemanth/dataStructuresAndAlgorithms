package com.funcPrg;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsComplexAppl {
	
	public static void main(String[] args) {
		
		Function<BiFunction<Integer, Integer,Integer>, BiFunction<Integer, Integer, Integer>> divVal=(func)->(x,y)->{
			if(y==0) 
			{
				System.out.println("Second Argument is zero");
				return 0;
			}
			else
			return func.apply(x, y);
		};
		
		BiFunction<Integer,Integer,Integer> divide=(x,y)->x/y;
		
		BiFunction<Integer, Integer, Integer> divSafe=divVal.apply(divide);
		System.out.println(divSafe.apply(10, 5));
//		BiFunction<Integer, Integer,Integer> funcVal=(x,y)->{
//			
//			if(y==0)
//				return 0;
//			else
//				return x/y;
//		};
//		System.out.println(funcVal.apply(10,2));
//	}
	}
}
