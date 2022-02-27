package basicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		
       solve("abcabbccd",1);
         
	}
	public static void solve(String A, int B) {
		int[] count=new int[26];
	       List<Integer> list=new ArrayList<>();
		       for(int i=0;i<A.length();i++)
		       {
		           char ch=A.charAt(i);
		           count[ch-'a']++;
		       }
		       Arrays.sort(count);
		        for(int i=0;i<count.length;i++)
		        {
		        	if(count[i]!=0)
		        	{
		        		list.add(count[i]);
		        	}
		        }
		        int j=0;
		        while(B>0)
		        {
		            B=B-list.get(j);
		            if(list.get(j)==0)
		            {
		                list.remove(list.get(j));
		                j++;
		            }
		        }
		        System.out.println(list);
	    }
}
