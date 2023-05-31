package sample29;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Overload : 
		 함수명은 같고 매개변수(parameter)의 갯수나 자료형은 다른 함수를 의미합니다
		 method()
		 method(char c)
		 */
		MyClass cls = new MyClass();
		cls.method();
		cls.method('A'	);
		cls.method(3);
		cls.method('A',3);
		cls.method(3,'A');

	}

}

class MyClass{
	public void method() {
		System.out.println("MyClass method()");
	}
	public void method(char c) {
		System.out.println("MyClass method(char c)");
	}
	public void method(int n) {
		System.out.println("MyClass method(int n)");
	}
	public void method(char c,int n) {
		System.out.println("MyClass method(char c,int n)");
	}
	public void method(int n,char c) {
		System.out.println("MyClass method(int n,char c)");
	}
	//Overload가 적용이 안되는 경우
//	1. return이 다를 경우
//	public int method() {
//		System.out.println();
//		return 1;
//	}
//	2.인수의 이름이 다르다고 적용할 수 없다.
//	public void method(char ccc) {
//		System.out.println("MyClas method");
//	}
}