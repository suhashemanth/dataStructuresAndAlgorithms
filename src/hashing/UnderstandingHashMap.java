package hashing;

import java.util.HashSet;

public class UnderstandingHashMap {
	static class Pair
	{
		int x;
		int y;
		public Pair(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
		HashSet<Pair> set=new HashSet<>();
		set.add(new Pair(1, 2));
		set.add(new Pair(2, 3));
		set.add(new Pair(3, 4));
		set.add(new Pair(4, 4));
		set.add(new Pair(5, 6));
		set.forEach(a->System.out.println(a.x+" "+a.y));
	}

}
