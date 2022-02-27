package com.funcPrg;

public class SwitchToEnv {
	
	static class Environment
	{
		NoArgsFunction<String> value;
		public Environment(Boolean isDevelopment) {
			this.value=isDevelopment?Environment::development:Environment::testing;
		}
		public static String development()
		{
			System.out.println("You are in development environment");
			return "development";
		}
		public static String testing()
		{
			System.out.println("You are in testing environment");
			return "testing";
		}
	}
	
	public static void main(String[] args) {
		
		Boolean isDevelopment=false;
		Environment env=new Environment(isDevelopment);
		System.out.println(env.value.apply());
	}

}
