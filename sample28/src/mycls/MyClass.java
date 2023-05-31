package mycls;

public class MyClass {
	/*
	 
	 3대요소 : 은닉성, 
 	접근 지정자
 	private : 개인적인
 	public : 대중적인
 	protected : 특별한 경우
 	
 	default값은 접근을 차단하는 private랑은 약간 다름.
 	 * 
 */
	//멤버 변수(90이상이 private )
	private int number;
	public String name;
	
	//멤버 메소드 (99퍼 이상이 public)
	public void method() {
		System.out.println("MyClass method()");
		int number;
		
		this.number =123;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//0번째 매개변수로 자기 자신을 가리키는 포인터(주소) - heap영역의 주소
	
//	public void setNumber(int num) {
//		number = num; //setter
//		
//	}
//	
//	public int getNumber() {
//		return number; //getter
//	}
	
	public MyClass getThis() {
		return this;
	}
}
