package com.funcPrg;

//Using function as data.To use methods as data
public class MethodImpl {
	
	static class Person
	{
		String name;
		int age;
		
		public Person(String name,int age) {
			this.name=name;
			this.age=age;
		}
		
	}
	
	static class DataLoader
	{
		public final NoArgsFunction<Person> environment;
		
		public DataLoader(Boolean isDevelopment) {
			this.environment=isDevelopment?DataLoader::loadPersonReal:DataLoader::loadPersonFake;
			
			
		}
		private static Person loadPersonReal()
		{
			System.out.println("Loading real person...");
			return new Person("Suhas", 27);
		}
		private static Person loadPersonFake()
		{
			System.out.println("Loading fake person...");
			return new Person("Sham", 30);
		}
	}
	
	public static void main(String[] args) {
		
		final Boolean isDevelopment=false;
		DataLoader dataLoader=new DataLoader(isDevelopment);
		System.out.println(dataLoader.environment.apply());
	}

}
