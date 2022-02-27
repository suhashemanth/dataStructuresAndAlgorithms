package sorting;

public class Student {
	
	int roll;	
	String name;
	String sex;
	
	public Student(int roll, String name, String sex) {
		super();
		this.roll = roll;
		this.name = name;
		this.sex = sex;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
