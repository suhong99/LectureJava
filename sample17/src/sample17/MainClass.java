package sample17;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		  Sorting : 정렬
		  			버블, 합병, 퀵
			선택정렬로 일단 구현
		 */
		int number[] = {1,10,2,9,3,8,4,7,5,6};
		int temp;
		for(int i=0;i<number.length;i++) {
			for(int j = i+1;j<number.length;j++) {
				
				if(number[i]>number[j]) {
					temp= number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(number));	}

}
