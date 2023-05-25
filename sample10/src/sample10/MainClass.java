package sample10;

public class MainClass {

	public static void main(String[] args) {
		/*
		 if
		 
		 
		 > <  >=  <= == != 대소비교
		 && || 
		 !(NOT)
		 형식 : 
		 	if(조건) {
		 		처리
		 	}
		 
		 * 
		 * 
		 */
		
		int number = 7;
		if(number > 0) {
			System.out.println("number는 양수입니다.");
		}
		
		if ( number ==7) {
			System.out.println("number는 7입니다");
		}
		
		if (number <5) {
			System.out.println("number는 5보다 작습니다");
		}
		
		if ( number > 0 && number<10){
			System.out.println("number는 0과 10사이입니다.");
		}
		if ( number > 0 || number<5){
			System.out.println("number는 0보다 크거나 5보다 작습니다.");
		}
		
		boolean boo =false;
		if(boo==false) {
			System.out.println("boo는 false입니다.");
		}
		
		if(!boo) {
			System.out.println("boo는 false입니다.");
		}
		
		/*
		 * 
		 
		 if else
		 
		 형식 : 
		 if(조건 ) {
		 처리1
		 }else {
		 	처리2
		 }
		 
		 */
		int count =85;
		if(count>=80) {
			System.out.println("B이상입니다.");
		} else {
			System.out.println("B이하입니다.");
		}
		
		if(count > 80)System.out.println("B이상입니다."); //문이 하나인 경우 {} 생략가능
		char c = 'A';
		if (c=='a') {
			System.out.println("c는 a입니다.");
		}else {
			System.out.println("c는 a가 아닙닏.ㅏ");
		}
		String str = "Hello";
		
		if(str =="Hello") {
			System.out.println("str은 Hello입니다.");
		}else {
			System.out.println("str은 Hello가 아닙니다.");
		}
		
String str2 = str+"o";
		System.out.println(str2);
		if(str2 =="Helloo") {
			System.out.println("str2은 Helloo입니다.");
		}else {
			System.out.println("str2은 Helloo가 아닙니다.");
		}
		
		
		if(str2.equals("Helloo")) {
			System.out.println("str2은 equals로 확인하면 Helloo입니다.");
		}else {
			System.out.println("str2은 Helloo가 아닙니다.");
		}
		
		//숫자 (짝수 / 홀수)
		int num=23;
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
		/*
		 * 
		 
		 else if
		 
		 형식 : 
		 if(조건1) {
		 	처리1
		 	}
		 	else if (조건2){
		 		처리2
		 		}
		 		else {
		 			처리3
		 		}
		 		
		
		 */
		
		count = 85;
		if(count>=90) {
			System.out.println("A+학점입니다");
		}else if (count >=80) {
			System.out.println("A학점입니다");

		}else if (count>= 70) {
			System.out.println("B학점입니다");

		}else {
			
		}
	}

}
