package sample06;

public class MainClass {

	public static void main(String[] args) {
		/*
		 논리(true/false) 연산자 
		  And
		  0 0 -> 0
		  1 0 -> 0
		  0	1 -> 0
		  1 1 -> 1
		 
		 */
		
		
		int number = 5;
		System.out.println(number >0); //true
		System.out.println(number >0 && number<=10); //true
		/*
			OR    ||
			0 0 -> 0
			0 1 -> 1
			1 0 -> 1
			1 1 -> 1
			*/
		
		number = 10;
		System.out.println(number < 5 || number > 9); //true
		
		/*
		 NOT
		 0 -> 1
		 1 -> 0
		 
		 */
		System.out.println(number != 10); //false
		System.out.println(number != 5); //true
		
		//삼항 연산자
		/*
		  형식 : 
		  		변수 = (조건 ) ? 값1 : 값2;
		 
		 * 
		 */
		
		int n;
		n = (number> 0)? 100 : 2;
		System.out.println(n);
		
		char c ;
		c = (number > 5)? 'Y' :'N';
		System.out.println("c = " +c);
		
		String s;
		s= (number > 0) ? "양수입니다": "음수입니다";
		System.out.println("s = " + s);
		String s2;
		s2= (false ) ? "양수입니다": "음수입니다";
		System.out.println("s2 = " + s2);


	}

}
