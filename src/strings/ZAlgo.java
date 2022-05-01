package strings;

public class ZAlgo {
	
	public static void main(String[] args) {
		//String s="xxyzxxyzwxxyzxxyzx";
		String s="xxyxxyxxaxxyxxz";
		int[] findZArray = findZArray(s);
		for(int i=0;i<findZArray.length;i++)
		{
			System.out.print(findZArray[i]+" ");
		}
		System.out.println();
		int[] zalgo = Zalgo(s);
		for(int i=0;i<zalgo.length;i++)
		{
			System.out.print(zalgo[i]+" ");
		}
	}
	
	public static int[] lpm(String s,int max)
	{
		int[] res=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int max1=checkIfMatch(s.substring(0,i),s.substring(i,s.length()));
			res[i]=max1;
		}
		return res;
	}
	
	public static int checkIfMatch(String s1,String s2)
	{
		int i=0;
		while(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				i++;
			}
			else
			{
				return i;
			}
			
		}
		return i;
	}
	
	// The time complexity of this approach is O(n^2)
	public static int[] findZArray(String s)
	{
		int[] res=new int[s.length()];
		res[0]=s.length();
		for(int i=1;i<s.length();i++)
		{
			int j=0;
			int k=i;
				while(k<s.length()&& s.charAt(k)==s.charAt(j))
				{
					k++;
					j++;
				}
					
			res[i]=j;
		}
		return res;
	}
	
	// Time complexity O(n)
	public static int[] Zalgo(String s)
	{
		int[] res=new int[s.length()];
		res[0]=s.length();
		int L=0;
		int R=0;
		for(int i=1;i<s.length();i++)
		{
			//outside the yellow box
			if(i>R)
			{
				L=i;
				R=i;
				while(R<s.length() && s.charAt(R)==s.charAt(R-L))
				{
					R++;
				}
				res[i]=R-L;
				R--;
			}
			//Inside the yellow box
			else
			{
				//Either it is strictly inside
				if(res[i-L]<R-i+1)
				{
					res[i]=res[i-L];
				}
				//Touching the boundary or crossing the boundary
				else
				{
					L=i;
					while(R<s.length()&&s.charAt(R)==s.charAt(R-L))
					{
						R++;
					}
					res[i]=R-L;
					R--;
				}
			}
		}
		return res;
	}

}
