package sample20;

public class MainClass {

	public static void main(String[] args) {
		/*
		 Exception : 예외 != 에러
		 input -> 1,2,~100 -->"a"->97
		number -> 에외
		array -> index number "3" 0~2 -> array[3]
		class -> Scanner 못찾을 경우
		file -> 없는 경우
		try {
			예외가 발생할 수 있는 코드1
			예외가 발생할 수 있는 코드2
		}catch( 예외클래스1e ) {
			메시지 출력
		}catch(예외클래스2 e {
			메시지 출력
		}finally{ //생략가능
		//무조건 실행됨
		
		} 
	
		 *
		 */ 
		
		 
		int array[]= {1,2,3};
		System.out.println("프로그램 시작");
		try {
			for(int i=0; i<4;i++) {
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 범위 초과");
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			return;
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}finally {
			System.out.println("프로그램끝");
		}
		System.out.println("프로그램끝은 실행 안됨");
		func();

	
		
	}
	static void func() throws ArrayIndexOutOfBoundsException {
		int array[] = {2,3,4};
		for(int i = 0; i <4; i++) {
			System.out.println(array[i]);
		}
	}
}
