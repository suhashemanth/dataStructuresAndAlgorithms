package basicAlgorithms;

public class Test2 {
	
	public static void main(String[] args) {
		String A= "scaler";
		char[] ch=A.toCharArray();
		int B=7;
        char[] ch1=new char[ch.length];
        char[] ch2=new char[ch.length];
        int k=0;
        if(B>ch.length)
        {
                B=B-ch.length;
        }
        for(int i=0;i<ch.length-B;i++)
        {
            ch1[k]=ch[i];
            k++;
        }
        int r=0;
        for(int i=ch.length-B;i<ch.length;i++)
        {
            ch2[r]=ch[i];
            r++;
        }
        for(int i=0;i<ch1.length;i++)
        {
        	if(ch1[i]!=0)
        	{
        		ch2[r]=ch1[i];
                r++;	
        	}
        	else
        	{
        		continue;
        	}
        }
        System.out.println(String.valueOf(ch2));;
	}

}
