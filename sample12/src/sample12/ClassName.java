package sample12;

public class ClassName {

	public static void main(String[] args) {
		/*
		 
		 for : 루프문 , 순환문
		 목적 : 원하는 횟수만큼 반복 처리하기 위해서
		 
		 형식  :
		 	for(초기화; 조건식; 연산식 ){
		 		처리
		 	}
		 	
		 	for((1) ; (2)(5)(8)(11); (4)(7)(10)){
		 		(3)(6)(9)
		 	}
		 	(12)
		 	
		 	for(int i= 0; i<10; i++) {
		 		처리
		 	}
		 */
//		int i;
//		for(i=0; i<10; i++) {
//			System.out.println("i: "+ i);
//		}
//		System.out.println(i); //10
		
		for(int j=0; j<10; j++) {
			System.out.println("j: "+ j);
		}
//		System.out.println(j); //내부에ㅓㅅ 선언된 변수라 에러가 뜸
		
		//굳이 인크리먼특 ㅏ 아니라도 가능한ㅁ
		for(int j=0; j<10; j=j+2) {
			System.out.println("j+2: "+ j);
		}
		
		//for안에 for
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("i = " +i);
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println("\t j = " +j);
			}
		}
		
		//for +array
		int array [] = {1,2,3,4,5};
		//for
		for(int i = 0; i <array.length;i++) {
			System.out.println(array[i]);
		}
		
		//foreach
		for(int num : array) {
			System.out.println("foreach : "+num);
		}
		
		//for + array + if
			for(int i= 0 ;i<array.length;i++) {
			if(array[i]==3) {
				System.out.println("3을 찾았습니다.");
			}
		}
		for(int num:array) {
				if(num==3) {
					System.out.println("3을 찾았습니다.");
			}
		}
		
		int arrNum[] = {34,12,25,43,12,65,88};
		
		int maxNum=arrNum[0];
//		int maxNum;
		for(int num:arrNum) {
			if(maxNum<num) {
				maxNum= num;
			}
		}
		
		System.out.println("최대값은 "+maxNum);
	}

}
