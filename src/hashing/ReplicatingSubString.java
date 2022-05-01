package hashing;

import java.util.HashMap;

public class ReplicatingSubString {
	
	public static void main(String[] args) {
		System.out.println(solve(2, "abab"));
	}
	public static int solve(int A, String B) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<B.length();i++)
        {
            if(map.containsKey(B.charAt(i)))
            {
                map.put(B.charAt(i),map.get(B.charAt(i))+1);
            }
            else
            {
                map.put(B.charAt(i),1);
            }
        }
        for(Character i:map.keySet())
        {
            if(map.get(i)%A==0)
            {
                continue;
            }
            else
            {
                return -1;
            }
        }
        return 1;
    }

}
