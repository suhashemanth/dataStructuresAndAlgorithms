package com.funcPrg;

import java.util.function.BiFunction;

public class FunctionAsParameter {
	
	public static class PerformMath
	{
		public static Integer add(Integer x,Integer y)
		{
			return x+y;
		}
		public static Integer substract(Integer x,Integer y)
		{
			return x-y;
		}
		
		public static Integer combine(BiFunction<Integer,Integer,Integer> combineFun) {
			return combineFun.apply(20,10);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(PerformMath.combine(PerformMath::substract));
	}

}
