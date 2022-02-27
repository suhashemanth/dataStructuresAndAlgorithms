package com.funcPrg;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LearnLamda {
	
	public static void main(String[] args) {
		
		Function<String,Integer> stringLength= (str)->str.length();
		System.out.println(stringLength.apply("sham"));
		Function<Integer,Integer> absValue= (a)->
		{
			Integer x=(a>0)?a:-a;
			return x;
		};
		System.out.println(absValue.apply(-10));    
		
		BiFunction<Integer,Integer,Integer> sum = (a,b)->{return a+b;};
		System.out.println(sum.apply(40,20));
		
		TriFunction<Integer, Integer,Integer,Integer> triSum=(a,b,c)->a+b+c;
		System.out.println(triSum.output(10,20,30));
		
		NoArgsFunction<String> name=()->"suhas";
		System.out.println(name.apply());
	}

}
