package sample15;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		  continue : skip(생략)
		  
		  loop문과 같이 사용
		  
		  w=0;
		  while(조건){
		  	처리1
		  	
		  	if(조건){
		  	
		  	}
		  	
		  	처리2
		  	
		  	w++;
		  }
		 */
		
		for(int i = 0; i <5 ;i++) {
			System.out.println("i = " + i);
			System.out.println("for 1처리");
			
			if(i>2) {
				continue;
			}
			
			System.out.println("for 2처리");
				
			int array[]= {2,1,-5,8,-4};
			//-를 제외한 ㄴ나머지 출력
			
			for(int num :  array) {
				if(num<=0)
					continue;
				
				System.out.println((num));
			}
			
			
			
			
		}
		Scanner sc = new Scanner(System.in);
		//숫자 입력 = > 양수 -> 5개 배열저장 =-> 배열 출력
        int numbers[]  = new int[5];
        int count= 0;
       
		while(count<numbers.length) {
			System.out.print((count+1)+ "번째 숫자를 입력해주세요 : ");
			int input = sc.nextInt();
			if(input <0) {
				System.out.println("양수를 입력해주세요");
				continue;
			}
			numbers[count]= input;
			count++;
			if(count==5) {
				System.out.println("count : " +count + " 배열 : " +Arrays.toString(numbers));
				
			}
		}
	}

}
