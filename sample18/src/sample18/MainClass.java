package sample18;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		  function : 함수. 독립적인 처리자 - c언어의 대부분
		  method : 함수 , class에 소속되어 있는 함수 - java 대부분
		 형식 : 
		 	return값 함수명 ( parameters,  , ....){
		 	//매개변수는 갯수 제한이 없다
		 	  처리
		 	  
		 	  return 값; // return 은 하나 아니면 없다
		 	}
		 	return 값이 없는 경우는 voild
		 */
		functionName();
		functionOne(123); //123-> argument-> 실인수
		String s = functionTwo();
		System.out.println("s = " + s);
		
		int array[] = functionThree();
		System.out.println("array[] = " + Arrays.toString(array));
		
		double dobule = functionFour(4);
		System.out.println("dobule = " + dobule);
		
		//아스키 코드활용해 바꾸는법
		char c = charLowerCase('B');
		System.out.println("c = " +c );
		
	}
	
	static void functionName() {
		System.out.println("functionName() 호출");
	}
	static void functionOne(int n) { //n-> 파라미터
		System.out.println("functionOne(int n) n= " +n);
	}
	static String functionTwo() {
		String str= "하이";
		return str;
	}
	static int[] functionThree() {
		int number[] = {10,20,30};
		return number;
	}
	
	static double functionFour(int n) {
		double r;
		r = (double)n/2;
		return r;
	}
	
	static String functionToLowerCase(String upper) {
		 StringBuilder lower = new StringBuilder();
		    for (int i = 0; i < upper.length(); i++) {
		        char c = upper.charAt(i);
		        if (c >= 'A' && c <= 'Z') {
		            c = (char) (c + 32); // 대문자를 소문자로 변환
		        }
		        lower.append(c);
		    }
		    return lower.toString();
	}
	
	static char charLowerCase(char c) {
		//A ->a
		//65 97 --> 모든 아스키 코드 대소문자차이자 32임
		int n = (int)c;
		int r = n+32;
		
		return (char)r;
	}
	
	
}
