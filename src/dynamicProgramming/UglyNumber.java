package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber {
	
	public static void main(String[] args) {
		long z=System.nanoTime();
		ArrayList<Integer> findUgly = findUgly(500);
		long z1=System.nanoTime();
		System.out.println(findUgly);
		System.out.println(z1-z);
		z=System.nanoTime();
		ArrayList<Integer> findUglyDP = findUglyDP(500);
		z1=System.nanoTime();
		System.out.println(findUglyDP);
		System.out.println(z1-z);
	}
	
	public static ArrayList<Integer> findUgly(int x)
	{
		ArrayList<Integer> list=new ArrayList<>();
		int y=1;
		list.add(1);
		y=y+1;
		while(list.size()!=x)
		{
			int z=y;
			while(z!=1)
			{
				if(z%2==0||z%3==0||z%5==0)
				{
					if(z%2==0)
					{
						z=z/2;
					}
					else if(z%3==0)
					{
						z=z/3;
					}
					else if(z%5==0)
					{
						z=z/5;
					}
				}
				else
				{
					break;
				}
			}
			if(z!=1)
			{
				
			}
			else
			{
				list.add(y);
			}
			y=y+1;
		}
		return list;
	}
	
	public static ArrayList<Integer> findUglyDP(int x)
	{
		ArrayList<Integer> list=new ArrayList<>();
		int i1=0;
		int i2=0;
		int i3=0;
		list.add(1);
		while(list.size()<x)
		{
			int u1=list.get(i1)*2;
			int u2=list.get(i2)*3;
			int u3=list.get(i3)*5;
			if((u1<=u2) && (u1<=u3))
			{
				list.add(u1);
				if(u1==u2)
				{
					i2++;
				}
				if(u1==u3)
				{
					i3++;
				}
				i1++;
			}
			else if((u2<=u3) && (u2<=u1))
			{
				list.add(u2);
				if(u2==u3)
				{
					i3++;
				}
				i2++;
			}
			else
			{
				list.add(u3);
				i3++;
			}
		}
		return list;
		
	}
	
	
}
