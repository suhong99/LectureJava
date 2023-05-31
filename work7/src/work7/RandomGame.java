package work7;
import java.util.Scanner;

public class RandomGame {
	int userInput=15;
	int randomNum=(int)(Math.random()*70+30);
	
	//입력 함수
	void inputFunc() {
		System.out.println("실행되나?");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력해주세요. :");
			userInput= sc.nextInt();
			if(userInput>15 || userInput<1) {
				System.out.println("1~15사이의 정수를 다시 입력해주세요. : ");
			} else {
				break;
			}
		}
	}
	
	// 계산
	void processFunc() {
		int count = 1;
		while(randomNum>=0) {
			System.out.println(count+"번째 차례입니다.");
			inputFunc();
			randomNum-= userInput;
			System.out.println("남은 값은 "+ randomNum);
			count++;
			if(randomNum<=0) {
				System.out.println(count+"번째 유저가 패배");
			}
		}
	}
}
