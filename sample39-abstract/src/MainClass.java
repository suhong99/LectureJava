
public class MainClass {

	public static void main(String[] args) {
		/*
		 abstract class : 일반메소드 + 추상메소드 + (멤버)변수
		 	추상
		 
		 */
//		AbstractClass ac =new AbstractClass() {
//			
//			@Override
//			public void abstractMethod() {
//				// TODO Auto-generated method stub
//				
//			}
//		};	
		
//		MyClass mycls = new MyClass();
//		mycls.method();
//		mycls.abstractMethod();
		
		/*
		  부모 클래스명 인스턴스 = new 자식클래스명();
		 */
		
		//2. 부모인스턴스로 생성하는 방법
		AbstractClass ac = new MyClass();
		ac.method();
		ac.abstractMethod();
		
		//3. 생성과 함께 추상메소드를 정의하는 방법
		AbstractClass ac1 = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				// TODO Auto-generated method stub
				System.out.println("ac1");
			}
		};
	}

}
