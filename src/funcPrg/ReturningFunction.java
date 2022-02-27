package com.funcPrg;
//x=3*y
//
import java.util.function.Function;
// This will show how function returning a function
public class ReturningFunction {
	
	public static Function<Integer,Integer> multipler(Integer x)
	{
		return (Integer y)->x*y;
	}
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> multiply=ReturningFunction.multipler(10);
		System.out.println(multiply.apply(20));
	}
}
