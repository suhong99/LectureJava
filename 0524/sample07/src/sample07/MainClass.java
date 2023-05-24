package sample07;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 
		 
		Array : 배열. 변수들
			같은 자료형 변수의 묶음
		
		목적 : 데이터 관리 
		
		일반 변수 int number ; 1개
		배열 변수 int number[?] ; n개
		동적 (dynamic ) , 정적 (static)
		
		자바스크립트에서
		var array = new Array(5);
		var array = [1,2,3];
		
		int number 1 , number 2 ...;
		배엵 ㅘㄴ리 접근 번호 -> index number 0 ~ 배열의 길이 ~1
		
		자료형 배열변수명 [] =new 자료형 [배열갯수];
		int array [] = new int[10];
		array[0] =1;
		array[1] =2
		
		   .
		   .
		array[9] = 10;
		
		*/
		
		int array[] = new int[5];
//		int []array = new int[10];  // 3개 다
//		int[] array = new int[10]; // 같음
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
//		int number1, number2, number3, number4, number5;
		System.out.println(array.length);
		System.out.println(array[0]);
		
		array[4] = array[1] + array[3];
		System.out.println(array[4]);
		
		array[0] =array[0] +1;
		System.out.println(array[0]);
		
		//배열 초기화
		int array2[]= {11,22,33,44,55};
		System.out.println(array2[2]);
		
		String names[]= {"홍길동","성춘향","홍두께"};
		System.out.println(names[1]);
		
		String alias[]= names;
		System.out.println(alias[1]);
		
		alias[1] = "장목정";
		System.out.println(names[1]);// 참조에 의한 데이터 변경
		
		int number_position_datas[] = {1,2,3,4,5};
		number_position_datas[2] = number_position_datas[0]+ number_position_datas[1];
		int numPD[] = number_position_datas;
		numPD[2]=33;
		System.out.println(number_position_datas[2	]);
		
		// 초기화
		int arr[] = null;
		arr = new int [5];
		//arr = {1,2,3} ; //문법 오류
		System.out.println(array2);
	}

}
