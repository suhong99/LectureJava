package sample28;

import mycls.MyClass;
public class MainClass {
	
	
	public static void main(String[] args) {
		MyClass cls = new MyClass();
//		cls.number=10; //다른 패키지에 있는 값을 접근할 수 없음
//		System.out.println("cls꺼"+ cls.number); //이것도 접근안됨
		
		cls.name="하이"; //public이라 접근 가능
		cls.method();
		cls.setNumber(202);
		int n= cls.getNumber();
		System.out.println(n);
		System.out.println(cls.getThis());
	}

}
