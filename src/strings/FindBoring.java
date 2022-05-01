package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindBoring {
	
	public static void main(String[] args) {
		System.out.println(solve("hbbgcbcadjgii"));
			
	}
	 public static int solve(String A) {
	        char[] ch=A.toCharArray();
		        int[] store=new int[ch.length];
		        for(int i=0;i<ch.length;i++)
		        {
		            store[i]=ch[i]-97;
		        }
		        int evenNum=0;
		        int oddNum=0;
		        for(int i=0;i<ch.length;i++)
		        {
		        	if(store[i]%2==0)
		        	{
		        		evenNum++;
		        	}
		        	else
		        	{
		        		oddNum++;
		        	}
		        }
		        int[] odd=new int[oddNum];
		        int[] even=new int[evenNum];
		        int od=0;
		        int ev=0;
		        for(int i=0;i<ch.length;i++)
		        {
		            if(store[i]%2==0)
		            {
		                even[ev++]=store[i];
		            }
		            else
		            {
		                odd[od++]=store[i];
		            }
		        }
		        Arrays.sort(even);
		        Arrays.sort(odd);
	            odd=reverse(odd);
		        int[] concat=new int[ch.length];
		        ev=0;
		        od=0;
		       while(ev<even.length)
		       {
		           concat[ev]=even[ev];
		           ev++;
		       }
		       while(od<odd.length)
		       {
		           concat[ev++]=odd[od++];
		       }
		       for(int i=1;i<concat.length;i++)
		       {
		           if(concat[i]-concat[i-1]==0||concat[i]-concat[i-1]>=2||concat[i]-concat[i-1]<=-2)
		           {
		               continue;
		           }
		           else
		           {
		               return 0;
		           }
		       }
		       return 1;
	    }

	    public static int[] reverse(int[] a)
	    {
	        int[] res=new int[a.length];
	        for(int i=a.length-1;i>-1;i--)
	        {
	            res[a.length-1-i]=a[i];
	        }
	        return res;
	    }

}
