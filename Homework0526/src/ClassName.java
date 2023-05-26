import java.util.Scanner;

public class ClassName {

	public static void main(String[] args) {
		//1. 1~1000의 합 
		
		int sumq1 = 0;
		for(int i=1;i<=1000;i++) {
			sumq1+=i;
			if(i==1000) {
				System.out.println("1부터 1000사이 수의 합은 " + sumq1 + "입니다.");
			}
		}
		
		//2. 하나의 수를 입력 받고 입력 받은 수는 어느 범위에 있는지 출력해라 입력값 0~100사이 수
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문제 2번 0~100사이의 수를 입력해주세요:");
//		int question2num = sc.nextInt();
//		
//		if(question2num<10) {
//			System.out.println("입력한 수는 0이상 10이하입니다.");
//		}else {
//			System.out.println("입력한 수는 " + (question2num/10) +"0이상 "+((question2num/10)+1)+ "0이하입니다." );
//		}
//		
//		
//		//3. 다음 모양이 되도록 출력하세요 별
//		for (int i=0; i<9;i++) {
//			for(int j=0; j<5;j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		
//		
//		//4. 다음 모양이 되도록 별 출력
//		for (int i=0; i<9;i++) {
//			if(i<5) {
//				
//				for(int j=0; j<i+1;j++) {
//					System.out.print('*');
//				}
//			}else {
//				for(int j=9; j>i;j--) {
//					System.out.print('*');
//				}
//			}
//			System.out.println();
//		}
//		
//		//5. 구구단 1단에서 9단까지
//		for(int i =1; i<10;i++) {
//			for(int j =1; j<10;j++) {
//				System.out.print(i +"*"+j+"=" + i*j + " ");
//				
//			}
//			System.out.println();
//		}
//		//6. 임의의 수의 구구단.
//		System.out.print("궁금한 구구단 숫자를 입력해주세요: ");
//		int targetNum= sc.nextInt();
//		for(int j =1; j<10;j++) {
//			System.out.print(targetNum +"*"+j+"=" + targetNum*j + " ");
//			
//		}
//		System.out.println();
//		
//		//7. 1 ~ 100 사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라.
//		int oddNum7 = 0;
//		int evenNum7 = 0;
//		
//		for(int i = 1 ; i <=100 ; i++) {
//			if(i%2==0) {
//				evenNum7+=i;
//			}else {
//				oddNum7 +=i;
//			}
//		}
//		System.out.println("1부터 100 사이 짝수의 합은: "+evenNum7);
//		System.out.println("1부터 100 사이 홀수의 합은: "+oddNum7);

		//7. 2진수 <-> 10진수 변환 프로그램
		System.out.print("2진법을 입력할 경우 2 , 10진법을 입력할 경우 10 입력해주세요 : ");
		int typeOfPrg = sc.nextInt();
	    while (typeOfPrg != 2 && typeOfPrg != 10) {
            System.out.print("잘못된 입력입니다. 2와 10 중 하나를 입력해주세요. :");
            typeOfPrg = sc.nextInt();
        }
	    
		System.out.println();
			if(typeOfPrg==2) {
				System.out.print("변환하고 싶은 2진법 숫자를 입력해주세요 : ");
				String inputNum7 = sc.next();
				System.out.println();
				  try {
		                int changedNum = Integer.parseInt(inputNum7, 2);
		                System.out.println("변환된 값은: " + changedNum);
		            } catch (NumberFormatException e) {
		                System.out.println("잘못된 2진법 숫자입니다. ");
		            }				
			}else if(typeOfPrg==10) {
				System.out.print("변환하고 싶은 10진법 숫자를 입력해주세요 : ");
				int inputNum7 = sc.nextInt();

				System.out.println();
				
				String chagedNum7= Integer.toBinaryString(inputNum7);
				System.out.println("변환된 값은 : "   + chagedNum7);
			}
			else {
				System.out.println("2와 10만 입력가능합니다.");
			}
			
		
	}

}
