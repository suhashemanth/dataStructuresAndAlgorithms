package strings;

public class FindPeriod {
	
	
	public static void main(String[] args) {
		System.out.println(solve("abababab"));
	}
	public static int solve(String A) {
        int[] z=findZ(A);
        int period=0;
        for(int i=1;i<z.length;i++)
        {
            System.out.print(z[i]+" ");
            if(z[i]+i==A.length())
            {
                period=i;
                break;
            }
        }
        return period;
    }

    public static int[] findZ(String s)
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
