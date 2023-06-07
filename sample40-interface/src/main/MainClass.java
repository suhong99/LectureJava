package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		  abstracft class : method 와 abstract method+ varibale
		  
		  interface : abstract methjod
		  				다중 상속이 가능하다
		  				(class)설계의 사양을 빠르게 파악할 수 있다.
		  				확장성
		 */
		
		MyClass mycls = new MyClass();
		mycls.func();
		YouClass youcls = new YouClass();
		youcls.method();
		
		YouInterface yi = new YouClass();
		yi.method();
		
		HeClass he = new HeClass();
		he.func();
		he.method();
		
		MyInterface myInterface = new HeClass();
		myInterface.func();
//		myInterface.method(); 안됨
	}

}
