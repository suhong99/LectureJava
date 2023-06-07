package main;

public class HeClass implements MyInterface, YouInterface{
	@Override
	public void func() {
		// MyInterface에서 상속
		System.out.println("HeClass func()");

	}
	@Override
	public void method() {
		// YouInterface에서 상속
		System.out.println("HeClass method()");

	}
}
