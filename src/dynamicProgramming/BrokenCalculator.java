package dynamicProgramming;

public class BrokenCalculator {
	
	  public static void main(String[] args) {
	        System.out.println(brokenCalc(5,8));
	    }
	    public static int brokenCalc(int startValue, int target) {
	        return calc(startValue,target);
	    }
	    public static int calc(int i,int b)
	    {
	    	
	        if(i==b)
	        {
	            return 1;
	        }
	        int min=Integer.MAX_VALUE;
	        if(i>b)
	    	{
	        	min=Math.min(min,calc(i-1,b));
	    	}
	        else
	        {
	        	min=Math.min(min,calc(2*i,b));
	        }
	        return min;
	    }

}
