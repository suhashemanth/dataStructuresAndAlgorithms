package strings;

public class FindCyclicPermutation {
	
	public static void main(String[] args) {
		String a="1001";
		String b="0011";
		a=a+a;
		a=a.substring(0,a.length()-1);
		String c=b+a;
		System.out.println(a);
		int[] findZ = findZ("abababab");
		for(int i=0;i<findZ.length;i++)
		{
			System.out.print(findZ[i]+" ");
		}
	}
	
	public static int[] findZ(String s)
    {
        int[] res=new int[s.length()];
        res[0]=s.length();
        int L=0;
        int R=0;
        for(int i=1;i<s.length();i++)
        {
            //outside the boundary
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
            else
            {   
                //Strictly inside the yellow box
                if(res[i-L]<R-i+1)
                {
                    res[i]=res[i-L];
                }
                else
                {
                    L=i;
                    while(R<s.length() && s.charAt(R)==s.charAt(R-L))
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
