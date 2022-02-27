package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Find {
	 public static int solve(String A, String B) {
	        HashMap<Character,Integer> set=new HashMap<>();
	        char[] ch=A.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        {
	            set.put(ch[i],0);
	        }
	        int count=0;
	        for(int i=0;i<(B.length()-A.length())+1;i++)
	        {
	            boolean flag=true;
	            String x=B.substring(i,i+A.length());
	            for(int j=0;j<x.length();j++)
	            {
	            	char c=x.charAt(j);
	                if(set.containsKey(c))
	                {
	                    
	                }
	                else
	                {
	                    flag=false;
	                    break;
	                }
	            }
	            if(flag==true)
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	 public static void main(String[] args) {
		String A="abc";
		String B="abcbacabc";
		int solve = solve(A, B);
		System.out.println(solve);
	}

}
