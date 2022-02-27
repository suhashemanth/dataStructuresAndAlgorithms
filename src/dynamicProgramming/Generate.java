package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Generate {
	static int count=0;
	static ArrayList<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
	static List<String> list=new ArrayList<>();
	public static void main(String[] args) {
//		String s="aaxc";
//		//System.out.println(s.substring(1));
//		form("abcd","");
//		System.out.println(count);
		int[] A= {1,2,3,4};
		ArrayList<Integer> p=new ArrayList<>();
		gen(A,p,0);
		System.out.println(li);
	}
	
	public static void form(String s,String a)
	{
		
		if(s.length()==0)
		{
			 String x="";
	            for(int i=a.length()-1;i>=0;i--)
	            {
	                x=x+a.charAt(i);
	            }
	            if(x.equals(a))
	            {
	                if(a.length()>=count)
	                {
	                	count=a.length();
	                }
	            }
	            return;
		}
		form( s.substring(1), a+s.charAt(0));
		form( s.substring(1), a);
	}
	
	public static void gen(int[] A,ArrayList<Integer> B,int i)
	{
		if(i>=A.length)
		{
			li.add(B);
	            System.out.println(B);
			return;
		}
		B.add(A[i]);
		gen(A, B, i+1);
		B.remove(B.size()-1);
		gen(A, B, i+1);
		
	}
	



}
