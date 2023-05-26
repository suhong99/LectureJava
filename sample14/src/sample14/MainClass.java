package sample14;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 break : loop문 제어하기 위한 키워드
		  		escape ==탈출 루프문과 같이 사용
		 		for , while, do while, switch
		 */
		
		for (int i=0; i<10 ;i++ ) {
			System.out.println("i = " + i);
			if(i==5 ) {
				break;
			}
		}
		
		int number [] = {13,23,45,-36,67};
		
		for(int i = 0; i < number.length; i ++) {
			System.out.println("number[" + i + "] = " + number);
			if(number[i]<0) {
				break;
			}
		}
		//1. loop에 맞게 break를 설정
		boolean out =false;
		
		for(int i = 0; i < 10; i ++) {
			System.out.println("i = " + i);
			for(int j = 0;j<8;j++) {
				System.out.println("\tj = " +j);
				if(i==5 &&j==3) {
					out=true;
				}
				if(out==true) {
					break;
				}
			}
			if(out==true) {
				break;
			}
		}
		
		//2. break 설정
		forLoopOut:for(int i = 0; i < 10; i ++) {
			System.out.println("i = " + i);
			for(int j = 0;j<8;j++) {
				System.out.println("\tj = " +j);
				if(i==5 &&j==3) {
					break forLoopOut;
				}
				
			}
		
		}
	}

}
