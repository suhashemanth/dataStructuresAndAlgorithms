package com.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UnderstandConsumer {
	
	public static void main(String[] args) {
		List<String> names = List.of("suhas","sham","raju","kama");
		
		Consumer<String> printList=s->System.out.println(s);		
		printing(names,printList);
	}
	
	public  static void printing(List<String> list,Consumer<String> printList)
	{
		for(String s:list)
		{
			printList.accept(s);
		}
		Consumer<Double> x=System.out::println;
		x.accept((double) 10);
		Supplier<Double> randomNumber=Math::random;
		System.out.println(randomNumber.get());
	}

}
