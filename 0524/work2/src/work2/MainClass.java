package work2;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		/*
		������ ���α׷�
		���ұݾ�  : 3,210��
		���αݾ� : 10,000��
		
		�Ž����� -> ?
		5000�� -> ?��
		1000�� -> ?��
		500��  -> ?��
		100��  -> ?��
		50��   -> ?��
		10��   -> ?�� 
		
		*/
		
		int payMoney;
		
		int myMoney;
		System.out.print("����ݾ� : ");
		myMoney= sc.nextInt();
		
		System.out.print("���ұݾ� : ");
		payMoney= sc.nextInt();
		
		// �Ž�����
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
		
		System.out.println("5000�� : "+fiveTh+ " 1000�� : "+ oneTh + " 500�� : " + fiveHun + " 100�� : "+ oneHun + " 50�� : "+ fifty + " 10�� : " + ten);

		
		
	}

}
