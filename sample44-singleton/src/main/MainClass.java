package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import singleton.SingletonClass;

public class MainClass {

	public static void main(String[] args) {
		MyClass mycls  = new MyClass();
		YouClass youcls = new YouClass();
		HeClass hecls = new HeClass();
//		int num = mycls.getNumber();
//		youcls.setNumber(num);
//		
//		youcls.info();

		/*
		//한번만 생성되는 거 확인용
		SingletonClass sc = SingletonClass.getInstance();
		System.out.println(sc);
		
		sc= SingletonClass.getInstance();
		System.out.println(sc);
		 * 
		 
		 */
		
		youcls.info();
		hecls.func();
		
	}

}
