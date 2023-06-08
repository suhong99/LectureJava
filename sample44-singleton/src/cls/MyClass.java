package cls;

import singleton.SingletonClass;

public class MyClass {
	private int number;
	public MyClass() {
		number = 111;
		//싱글 톤 클래스의 인스턴스를얻는다

		SingletonClass sc= SingletonClass.getInstance();
		sc.number= number;
	}
	
//	public int getNumber() {
//		return number;
//	}
//	
	
}
