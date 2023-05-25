package sample11;

public class MainClass {

	public static void main(String[] args) {
		/*
		 switch 
		 
		 		조건분기
		 		값이 명확해야 한다.
		 		범위를 설정할 수 없다
		 		소수값을 사용할 수 없다
		 		
		 형식 
		 		switch (변수){
		 			case 0 :
		 				처리
		 				break;
		 			case 1 :
		 				처리1
		 				break;
		 			case 2 :
		 				처리 2
		 				break;
		 			default : 					  //else문과 같음
		 		}
		 */
		
		int choice;
		choice=2;
		switch(choice) {
		case 1:
			System.out.println("choice는 1입니다.");
			System.out.println("처리1");
			break;
		case 2 : 
			System.out.println("choice는 2입니다.");
			System.out.println("처리2");
			break;
		default : 
			System.out.println("default처리");
		}
		
		//안됨
//		switch(choice) {
//		case choice>1: //여기서 안됨
//			break;
//		}
		
//		double d =1.2;
//		switch(d) { //여기서 안됨 소수라서
//		case choice>1: 
//			break;
//		}
	}

}
