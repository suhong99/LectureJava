package sample23;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 TV-> name,channel
		*/
		//절차지향
		String name = "삼성";
		int channel = 23;
		boolean power = true;
		
		String name1 = "LG";
		int channel1= 24;
		boolean power1 = true;
		
		
		//객체 생성(class 변수선언)
		TV tv= new TV();
		// 소문자 tv 를 instance(주체), object(객체)라고 많이 부름
		tv.name= "LG";
		tv.channel = 11;
		tv.power = true;
	}

}


//class설계

class TV{
	
	//(멤버)변수
	String name;
	int channel;
	boolean power;
	
	//함수(메서드)
	void info() {
		System.out.println(name+" " + channel +" " + power + " ");
	}
	
}


// 형식 : class 클랠스명 {
//	(멤버)변수들 - 처리에 필요한 변수 <- 접근(외부 or 내부)
//	(멤버)메소드(함수) -처리
//
//	}	
//
//	실제로 사용시
//	클래스명 변수(instance, 객체) = new 클래스명();
//	intance.(멤버)변수들
//	instance.(멤버)메서드
//	
//	Scanner sc= new Scanner(System.in);
//	int number = sc.nextInt();

