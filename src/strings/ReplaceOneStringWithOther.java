package strings;

import java.util.Iterator;

public class ReplaceOneStringWithOther {
	
	public static void main(String[] args) {
		
		String formString = formString("hello", 0);
		System.out.println(formString);
	}
	
	public static String formString(String s1,int i)
	{
		if(i>s1.length()-1)
		{
			return "";
		}
		return s1.charAt(i)+formString(s1, i+1);
	}

}
