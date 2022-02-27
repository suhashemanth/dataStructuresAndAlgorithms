package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RussianDoll {
	
	static class SortByDesc implements Comparator<Pair>
	{
	
		public int compare(Pair a, Pair b) {
			if(a.B==b.B)
			return 0;
			if(a.B<b.B)
			{
				return 1;
			}
			return -1;
		}
	}
	public static class Pair
	{
		int A;
		int B;
		public Pair(int A,int B) {
			this.A=A;
			this.B=B;
		}
	}
	public static void main(String[] args) {
		
	
		Pair x=new Pair(2, 2);
		Pair y=new Pair(5,3);
		Pair z=new Pair(6,9);
		Pair z2=new Pair(6,7);
		Pair z1=new Pair(6,8);
		Pair z3=new Pair(6,6);
		ArrayList<Pair> list=new ArrayList<Pair>();
		
		list.add(z2);
		list.add(z3);
		list.add(x);
		list.add(y);
		list.add(z);
		list.add(z1);
		Collections.sort(list, (a,b)->
		{
			if(a.A==b.A)
			{
				if(a.B<b.B)
				{
					return 1;
				}
			}
			if(a.A>b.B)
			{
				return 1;
			}
			return -1;
		});
		
		list.forEach(a->System.out.println(a.A+" "+a.B));
	}

}
