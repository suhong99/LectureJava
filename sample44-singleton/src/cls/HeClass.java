package cls;

import singleton.SingletonClass;

public class HeClass {
	private String name;
	public void func() {
		//이름 출력
	SingletonClass sc= SingletonClass.getInstance();
	name = sc.name;
	System.out.println("HeClass String name = " +name);
	}
}
