package searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AMagicalNumber {
	
	public static void main(String[] args) {
		int solve = solve(4, 2, 3);
		System.out.println(solve);
	}
	
	 public static int solve(int A, int B, int C) {
	        int x=1;
	        int y=1;
	        List<Long> list=new ArrayList<>();
	        HashMap<Long,Integer> map=new HashMap<>();
	        while(list.size()<A)
	        {
	            if((x*B*1l)<(y*C*1l))
	            {
	                if(map.containsKey(x*B*1l))
	                {
	                    x++;
	                }
	                else
	                {
	                    map.put((x*B*1l),1);
	                    list.add(x*B*1l);
	                    x++;
	                }
	            }
	            else
	            {
	                if(map.containsKey(y*C*1l))
	                {
	                    y++;
	                }
	                else
	                {
	                    map.put((y*C*1l),1);
	                    list.add(y*C*1l);
	                    y++;
	                }
	            }
	        }
	        long AMagic=list.get(list.size()-1);
	        return (int)(AMagic);
	    }

}
