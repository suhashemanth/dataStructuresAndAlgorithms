package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class UnderstandingReduce {
	
	public static void main(String[] args) {
		
		Integer a[]= {1,2,3,4,5};
		
		List<Integer> arrayList=new ArrayList<>(Arrays.asList(a));
		
		BinaryOperator<Integer> getSum=(acc,x)->
		{
			System.out.println("acc: "+acc+" ,x: "+x);
			Integer sum=acc*x;
			System.out.println("acc: "+acc+" ,x: "+x+", sum:"+sum);
			return sum;
		};
		
		 Integer sum = arrayList.stream().reduce(1,getSum);
		 System.out.println(sum);
	}

}
