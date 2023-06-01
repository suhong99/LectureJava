package sample32;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	캡슐화 : 접근지정자를 통해서 오뷔로부터 접근을 차단
		 			private(개인적) 클래스 내부에서만 허용한 variable
		 			public() 어디서나 접근 method
		 	
		 	상속성 attribute와 property
		 	
		 	다형성
		 
		 	OverRide
		 */
		Child ch = new Child();
		Parent ph = new Child();
		ch.pMethod();
	
		ph.process();
	}
}

class  Parent{
	int number;
	String name;
	
	public void pMethod() {
		System.out.println("Parent pMethod()");
	}
	public void process() {
		System.out.println("부모프로세스");
	}
}

class Child extends Parent{
	int age;
	double height;
	public void func() {
		number = 12;
		name="홍길동";
		age=24;
		height= 172.1;
	}
	
	public void process() {
		System.out.println("자식프로세스");
	}
}
