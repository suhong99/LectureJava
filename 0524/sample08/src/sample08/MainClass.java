package sample08;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		 2차원  Array 
		 
		 선형구조 0-0-0-0-0-0 1차원 배열
		 

		 0-0-0-0-0-0
		 0-0-0-0-0-0
		 0-0-0-0-0-0
		 0-0-0-0-0-0
		 0-0-0-0-0-0

		 형식 : 
		  		자료형 배열명[][]=NEW 자료형[][];
		 
		 
		 */
		int array2[][] = new int [4][3];
//		int []array2[] = new int [4][6];
//		int [][]array2 = new int [4][6];
		
		array2[0][0]=1;
		array2[0][1]=2;
		array2[0][2]=3;
		
		array2[1][0]=1;
		array2[1][1]=2;
		array2[1][2]=3;
		
		array2[2][0]=1;
		array2[2][1]=2;
		array2[2][2]=3;
		
		array2[3][0]=1;
		array2[3][1]=2;
		array2[3][2]=3;

		int array22[][] = {
				{1,2,3},{4,5,6},{6,7,8},{1,2,3}
		};
		System.out.println(array22[2][2]);//8 3번쨰 3번째
		
		int array222[][]=new int[3][];
		int arr1[] = {1,2,3};
		array222[0]= arr1;
		int arr2[]= {4,5,6,7};
		array222[1]=arr2;
		
		int arr3[]= {8,9,10,11,12};
		array222[2]=arr3;
		System.out.println(array222[0][2]);//3
		System.out.println(array222[1][3]); //7 길이가 다른것도 대입가능
		System.out.println(Arrays.toString(array222[0]));
	}	

}
