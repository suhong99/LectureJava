package cls;

import javax.swing.GroupLayout.SequentialGroup;

import singleton.SingletonClass;

public class YouClass {
	private int number;
	private String name;
	public YouClass() {
		name = "성춘향";
		SingletonClass sc = SingletonClass.getInstance();
		sc.name = name;
	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	
	public void info() {
		//싱글 톤 클래스의 인스턴스를얻는다
		SingletonClass sc= SingletonClass.getInstance();

		
		number = sc.number;
		System.out.println("YouClass number = " +number);
	}
	
}
