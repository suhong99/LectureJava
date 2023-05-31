package sample30;

public class MyClass {

	public static void main(String[] args) {
		/*
		 	constructor :	생성자
		 					클래스명과 같은 함수(메소드)
		 					return  value가 없다
		 					객체(new) 생성시에 호출된다.
		 					별도의 호출이불가능하다.
		 					생략이 가능하다
		 					overload가 가능하다.
		 					
		 	MyClass cls = new MyClass();
		 	delete cls;
		 	destructor : 	소멸자
		 	 				class 소멸시에 호출된다.
		 
		 
		 */
//		MyClass cls = new MyClass();
//		MyClass cls = {123,"홍길동"}; //클래스에선 초기화가 안됨.
//		cls();//별도의 호출 불가능
//		int Array[] = new int[10];
//		int ArrayOne[] = {1,2,3,4,5}; // 배열(같은 자료형의 집합)<ㅡ>structure(다른자료형의 집합)
		 
		MyClass cls = new MyClass(123);
		MyClass cls2 = new MyClass(123,"홍길동");

	}
	
	public int number;
	public String name;
	
	public MyClass() {
		 System.out.println("MyClass MyClass()");
	 }
	
	public MyClass(int number) {
		this.number= number;
	}
	
	public MyClass(int number,String name) {
		this.number= number;
		this.name=name;
	}
}
