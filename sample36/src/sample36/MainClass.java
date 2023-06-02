package sample36;

public class MainClass {

	public static void main(String[] args) {
		/*
		 final : 	제약
		  			변수, 메소드, 클래스
		  			
		  			
		 */
		//변수의 경우 (대문자) -> 대입룡
//		final int max1 = 100;//상수
////		max1 = 200;//
//		int number = max1;
//		
//		final int MAX = 100;
//		int number1 = MAX;

	}

}

final class Parent1 extends Object { // Parent의 경우 기본이니깐 extends Object 생략가능.
	int number;
}

class Parent {
	int number;
	
	public final void method() { //이 경우 final은 오버라이딩 금지
		
	}
}

class Child extends Parent{
//	public void method() { //override
		
//	}
}

//class Child extends Parent1{ // Parent1가 final이면 상속이 안됨.
//	
//}