package com.funcPrg;

import java.util.function.Function;

public class Test {
	
	static class MyMath
	{
		public static Integer triple(Integer z)
		{
			return z;
		}
	}
	
	public static void main(String[] args) {
		Function<Integer,Integer> triple1= MyMath::triple;
		Integer apply = triple1.apply(20);
		System.out.println(apply);
		
	}

}
