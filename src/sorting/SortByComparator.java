package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByComparator {
	
	public static void main(String[] args) {
		Student s1=new Student(3, "sham", "male");
		Student s2=new Student(1, "suhas", "male");
		Student s3=new Student(4, "Ganu", "female");
		Student s4=new Student(2, "vivek", "male");
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list,(a,b)->
		{
			return a.getRoll()-b.getRoll();
		});
		for(Student i:list)
		{
			System.out.println(i.getRoll());
		}	
	}
}
