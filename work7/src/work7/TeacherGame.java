package work7;
import java.util.Scanner;
public class TeacherGame {
	int randNum, userNum;
	boolean gameOver;
	
	void init() {
		gameOver = false;
	}
	
	void setRandom() {
		//30~100보다 작은숫자
		randNum = (int)(Math.random()*71+30);
		System.out.println("randNum : "+ randNum);
		setRandom();
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("숫자를 입력해주세요(1~15) >>");
			
			userNum = sc.nextInt();
			if(userNum<1|| userNum>15) {
				System.out.println("범위를 벗어났습니다 다시 입력해주세요");
				continue;
			} 
			
			break;
		}
	}
	
	void play() {
		while(true) {
			userInput();
			
			randNum= randNum-userNum;
			if(randNum<=0) {
				break;
			}
			System.out.println("You safe to be continue...");
		}
	}
	
	void result() {
		
	}
}
