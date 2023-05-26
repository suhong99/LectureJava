package work3;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변환 프로그램 10진수, 2진수 ,16진수
		Scanner sc = new Scanner(System.in);
		System.out.println("변환 프로그램 ----------------");
		System.out.println("1. 10진수를 2진수로 변환");
		System.out.println("2. 10진수를 16진수로 변환");
		System.out.println("3. 2진수를 10진수로 변환");
		System.out.println("4. 16진수를 10진수로 변환");
		System.out.println("5. 종료");
		//메뉴 번호 입력
		System.out.println("메뉴를 선택해주세요 : ");
		int menuNum=sc.nextInt();
		
		if(menuNum!=5)
		//변환할 숫자
		System.out.println("변환할 숫자 >> ");
		String strNum =sc.next();
		int num10 = 0;
		String result = "";
		boolean end = false;
		switch(menuNum) {
		case 1:  //10진수를 2진수
			 num10 = Integer.parseInt(strNum);
			 result = Integer.toBinaryString(num10);
			System.out.println("결과 : " +result);
			System.out.println();
			break;
		case 2: 
			num10 = Integer.parseInt(strNum);
			 result = Integer.toHexString(num10);
			System.out.println("결과 : " +result);
			System.out.println();
			break;
			
		case 3: //2진수 -> 10진수
			num10 = Integer.parseInt(strNum,2);
			System.out.println("결과 : " +result);
			System.out.println();
			break;
		case 4: 
			//16진수 -> 10진수
			num10 = Integer.parseInt(strNum,16);
			System.out.println("결과 : " +result);
			System.out.println();
			break;
		case 5: 
			end= true;
			break;
		}
		if(end== true) {
			System.out.println("Godd Bye");
		}
		
	}

}
