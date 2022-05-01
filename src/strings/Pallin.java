package strings;

public class Pallin {
	
	public static void main(String[] args) {
		String solve = solve("abba");
		System.out.println(solve);
	}
	
	 public static String solve(String A) {
	        int count=0;
	        int i=0;
	        int j=A.length()-1;
	        if(j-i%2==0)
	        {
	            int mid=(i+j)/2;
	            i=mid-1;
	            j=mid+1;
	            while(i>-1 && j<A.length())
	            {
	                if(A.charAt(i)==A.charAt(j))
	                {
	                    
	                }
	                else
	                {
	                    count++;
	                }
	                i--;
	                j++;
	            }
	        }
	        else
	        {
	            int mid=(i+j)/2;
	            i=mid;
	            j=mid+1;
	            while(i>-1 && j<A.length())
	            {
	                if(A.charAt(i)==A.charAt(j))
	                {
	                    
	                }
	                else
	                {
	                    count++;
	                }
	                i--;
	                j++;
	            }

	        }
	        if(count>1)
	        {
	            return "NO";
	        }
	        return "YES";

	    }

}
