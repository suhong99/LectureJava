package work2;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		/*
		편의점 프로그램
		지불금액  : 3,210원
		본인금액 : 10,000원
		
		거스름돈 -> ?
		5000원 -> ?장
		1000원 -> ?장
		500원  -> ?개
		100원  -> ?개
		50원   -> ?개
		10원   -> ?개 
		
		*/
		
		int payMoney;
		
		int myMoney;
		System.out.print("현재금액 : ");
		myMoney= sc.nextInt();
		
		System.out.print("지불금액 : ");
		payMoney= sc.nextInt();
		
		// 거스름돈
		int returnMoney= myMoney -payMoney;
		
		int fiveTh = returnMoney/5000;
		returnMoney= returnMoney- 5000*fiveTh;
		int oneTh = returnMoney/1000;
		returnMoney= returnMoney- 1000*oneTh;

		int fiveHun = returnMoney/500;
		returnMoney= returnMoney- 500*fiveHun;

		int oneHun = returnMoney/100;
		returnMoney= returnMoney- 100*oneHun;

		int fifty = returnMoney/50;
		int ten = returnMoney%50;
		
		System.out.println("5000원 : "+fiveTh+ " 1000원 : "+ oneTh + " 500원 : " + fiveHun + " 100원 : "+ oneHun + " 50원 : "+ fifty + " 10원 : " + ten);

		
		
	}

}
