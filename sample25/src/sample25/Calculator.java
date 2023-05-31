package sample25;
import java.util.Scanner;

public class Calculator {

	int num1 , num2;
	String operator;
	int result;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 = ");
		num1 = sc.nextInt();
		System.out.print("(+,-, *, /) = ");
		operator = sc.next();
		
		System.out.println("num2 = ");
		num2 = sc.nextInt();
	}
	
	//연산처리]
	void process () {
		
	}
	
	//결과출력
	void print() {
			System.out.println(num1+" " + operator + " "+ num2+ " = " +result);
	}
}

