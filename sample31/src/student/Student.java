package student;

public class Student {
	private int number;
	private String name;
	private int age;
	
	public Student() {
		
	}
	


	public int getAge() {
		return age;
	}


	public Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
	}
	

}
