package sample31;

import student.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentArr [] =new Student[4];
		
		//
		studentArr[0] = new Student(1,"홍길동",24);
		studentArr[1] = new Student(2,"성춘향",16);
		studentArr[2] = new Student(3,"홍두께",22);
		studentArr[3] = new Student(4,"dd",24);
		
		for(int i = 0 ; i<studentArr.length;i++) {
			if(studentArr[i].getAge() >20) {

				System.out.println(studentArr[i].toString());			
			}
		}
		
		
	}	

}
