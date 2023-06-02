package sample37;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		   		static :	정적 != 동적
		   					memory 공간을 기준으로
		   					
		   		int arr[] = new int[5]; 00000// 정적
		   		
		   		stack			heap						static			system
		   		지역변수, 매겨변수	동적으로 할당된 영역(배열 클라스)		전역 변수
		 */
//		MyClass mycls = new MyClass(); // 지역 변수
//		mycls.method(100);
		MyClass cls1 = new MyClass();
//		MyClass.gLNumber=1;
		cls1.method(1);
		cls1.method(1);
		
		MyClass cls2 = new MyClass();
		cls2.method(2);
		
		MyClass.gLNumber++;
		System.out.println("gLNumber = "+ MyClass.gLNumber);
		
		MyClass.staticMethod();
	}

}

//class MyClass{
//	private int number; //멤버 변수
//	
//	static int gLNumber;
//	public void method(int num) { // num>> 매개변수(지역변수)
//		int count; //지역변수
//		MyClass.gLNumber=2;
//		gLNumber=4;
//		
//	}
//}

class MyClass{
	public int number;
	static int gLNumber;
	
	public void method(int num) {
		int count;
		gLNumber++;
		number++;
		System.out.println("number = "+ number);

		System.out.println("glNumber = "+ gLNumber);
	}
	
	public static void staticMethod() {
		System.out.println("MyClass static");
		//this // 스테틱에서는 this가 없다.
		//number =5// this가 안되므로 멤버 변수에도 접근이 안됨
		
//		YouClass ycls = new YouClass();
//		ycls.process();
		
		YouClass ylcs = YouClass.getInstance();
	}
}


class YouClass{
	public YouClass() {
		System.out.println("YouClass YouClass()");
	}
	
	public static YouClass getInstance() {
		System.out.println("YouClass getInstance()");
		YouClass yc = new YouClass();
		yc.process();
		return yc;
	}
	
	public void process() {
		System.out.println("YouClass process()");
	}
}