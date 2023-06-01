package sample34;

public class MainClass {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		System.out.println(p);
		
		Child c= new Child();
		c.method();
	}

}

class Parent{
	int number;
	String name;
	
	public Parent() {
//		this("XXX");
//		System.out.println(this);
		System.out.println("Parent Parent()");
	}
	public Parent(String name) {
//		this();//기본 생성자
		this.name= name;
		System.out.println("Parent Parent(String name)");
	}
	
	public void method() {
		System.out.println("Parent method()");
	}
}

class Child extends Parent{
	int age;
	double height;
	
	public Child() {
		super("홍길동");
		System.out.println("Child Child()");
	}
	public void method() {
		super.method();//부모의 메소드
		System.out.println("Child method()");
	}
}