package sample13;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 초기화
		 while(조건){
		ㅊ
		 */
		
		int w;
		w=0 ; //초기화 initialize
		while(w<10) {
			System.out.println("w= " +w);
			w++;
		}
		//endless loop
//		while(true) {
//			System.out.println("무한반복");
//		}
		
		for(int i = 0 ; i<5; i++) {
			System.out.println("i = " + i);
			for(int j=0; j <3; j++) {
				System.out.println();
			}
		}
		//이중 와일문
//		int w1, w2;
//		w1 = 0;
//		w2 = 0;
//		
//		while(w1<5) {
//			System.out.println("w1= "+ w1);
//			w2=0;
//			while(w2<3) {
//				System.out.println("\t w2 = " + w2);
//				w2++;
//			}
//			w1++;
//		}
		
		/*
		 
		 do while
		 
		 형식 :
		 do {
			 처리 
			 연산식
			 }while(조건);
		 */
		
//		int w3=0;
//		do {
//			System.out.println("w3 = " +w3);
//			w3++;
//		}while(w3<10);
//	}
		
		Scanner sc= new Scanner(System.in);
        int numbers[]  = new int[10];
        int count=0;
		//10개의 숫자를 입력을 받아 배열을 넣고 최대 값을 구하시오
        while (count < 10) {
            System.out.print( (count+1) +"번째 입력값 : ");
            numbers[count] = sc.nextInt();
            count++;
        }

        // 최대 값 찾기
        int max = numbers[0];
        int i = 1;
        while (i < 10) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }

        System.out.println("최대 값 : " + max  );

	}

}
