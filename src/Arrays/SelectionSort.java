package basicAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] A= {6, 4, 3, 7, 2, 8};
		List<Integer> list=new ArrayList<>();
		int index=0;
        for(int i=0;i<A.length;i++)
        {
        	int min=A[i];
        	
            for(int j=i+1;j<A.length-1;j++)
            {
            	
                if(min>A[j])
                {
                	min=A[j];
                   index=j;
                }
            }
            if(i!=A.length-1)
            {
            	 list.add(index);
            }
            int temp=A[index];
            A[index]=A[i];
            A[i]=temp;
        }
        System.out.println(list);
        int[] b=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            b[i]=list.get(i);
        }
	}

}
