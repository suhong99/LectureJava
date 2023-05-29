package work4;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// game
		/*
		 Random number 찾기
		 
		  범위 : 1~100 => 75
		  입력 >>50
		  너무 작음
		  입력 >> 80
		  너무 큽니다.
		  입력 >> 65
		  너무 작음
		  
		  --- game clear
		  ---- game over
		  		 
		 */
		// 0~9
//		int r_num = (int)Math.random()*10;
//		
//		int r_num2 = (((int)Math.random()*5)+1)*10;
//
//		System.out.println("random number = "+r_num);
//
////		int r_num = (int)Math.random()*75;
//		//불규칙 숫자 5개 뽑기
//		int array [] = {24,30,37,38,41};
//		int r_num3=(int)(Math.random()*5);
//		System.out.println("random number = " + array[r_num3]);
//		
//		r_num = (int)Math.random()*3 -1;
		Scanner sc = new Scanner(System.in);
		//유저 입력
		while(true) {
		int r_num = (int)(Math.random()*100)+1;
		int count = 0;
		while(count<10) {
			System.out.print("1~100사이의 숫자를 입력하세요 : ");
			int inputNumber= sc.nextInt();
			if(inputNumber==r_num) {
				System.out.println("정답입니다.");
				break;
			} else if(inputNumber<r_num) {
				System.out.println("숫자가 너무 작습니다.");
			} else if(inputNumber>r_num) {
				System.out.println("숫자가 너무 큽니다.");
			} else {
				System.out.println("다시 입력해주세요");
			}
			
			count++;
			System.out.println("기회는 " + (10-count)+ "번 남았습니다.");
		}
		System.out.print("더 하시겠습니까?(y,n) : ");
		String tryAgain = sc.next();
		if(tryAgain.equals("n")) {
			System.out.println("종료하겠습니다.");
			break;	
			}
		}

		
		

	}

}
