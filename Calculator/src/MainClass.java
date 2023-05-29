import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		String oper;
		int result = 0;
		while(true) {
			
			//계산기
			//첫번쨰 숫자
//			System.out.print("첫번째 수 = ");
			
//			num1 = sc.nextInt();
			num1 = numberInput("첫번째");
			
			//연산자(+, - , *, / )
			System.out.print("연산자(+,-,*,/) = ");
			oper = sc.next();
			// 두번째 숫자
//			System.out.println("두번째 수 = ");
//			num2 = sc.nextInt();
			num2 = numberInput("두번째");

			//연산처리
			result = numberProcess(num1,num2,oper);
			
			//결과출력
			System.out.println(num1 + " " + oper + " " + num2 + " = "+ result);
			
			
			//계속할지 묻기
			System.out.println("계속하시겠습니까? (y/n) = ");
			String replay= sc.next();
			if(replay.equals("n")) {
				System.out.println("바바");
				break;
			}
		}
	}
	
	static int numberInput(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message + " 수 = ");
		int num = sc.nextInt();
		return num;
				
	}
	static int numberProcess(int num1,int num2,String oper) {
		int result = 0;
		if(oper.equals("+")) {
			result = num1 + num2;
		}else if(oper.equals("-")) {
			result = num1 - num2;
		}else if(oper.equals("*")) {
			result = num1 * num2;
		}else if(oper.equals("/")) {
			result = num1 / num2;
		}
		
		return result;
	}

}
