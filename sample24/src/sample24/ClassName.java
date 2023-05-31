package sample24;

public class ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			MyClass cls = new MyClass();
			System.out.println(cls);
			cls.method();
		}
	}

}

class MyClass {
	//변수들
	int number;
	String name;
	
	//메소드들
	void method (){
		System.out.println("Myclass Method()");
	}
}