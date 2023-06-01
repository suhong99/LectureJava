package study3;

public class MainClass {

	public static void main(String[] args) {
		
		int number[] = {1,2,3,4,5};
		String name[] = {"홍길동","22","33","44","55"};
		int age[] = {24,16,22,26,14};
		int math[] = {90,100,95,70,85};
		int eng[] = {80,90,90,90,100};
		Student stu[]= new Student[5];
		for(int i = 0;i<number.length; i++) {
			System.out.println(number[i]+": 총점");
		}
		stu[0]=new Student(1,"홍길동",24,90,80);
	}
}

class Student {
	int number;
	String name;
	int age;
	int math;
	int eng;
	
	public Student() {
		
	}
public Student(int number,String name,int age,int math,
int eng) {
		
	}
	public void sum() {
		
	}
	public void info() {
		
	}
	public int getNumber() {
		return number;
	}
}