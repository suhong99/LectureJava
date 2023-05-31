package sample26;

import java.util.Scanner;

public class Sorting {
	//변수
	int number[];
	int updown;
	//메소드
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정렬하고 싶은 숫자의 갯수 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		for(int i=0; i<number.length; i ++) {
			System.out.println((i+1)+ "번째 = ");
			number[i]= sc.nextInt();
		}
		
		System.out.println("오름(1)/내림(2) =");
		updown = sc.nextInt();
		sc.close();
	}
	
	void sorting() {
		
		for(int i=0; i<number.length-1;i++) {
			for(int j= i+1; j<number.length; j++) {
				if(updown==1) {
					if(number[i]>number[j]) {
//						temp=number[i];
//						number[i]=number[j];
//						number[j]=temp;
						swap(i,j);
					}else {
						if(number[i]<number[j]) {
							swap(i,j);

					}
				}
			}
		}
	}
	
	}
	void swap(int i,int j) {
		int temp;
		
		temp=number[i];
		number[i]=number[j];
		number[j]=temp;
	}
	
	void print() {
		String message = "내림차순";
		if(updown==1)message = "오름차순";
		
		System.out.println(message + "입니다.");
		for(int i = 0; i < number.length;i++) {
			System.out.println("number[" + i + "] =" + number[i]);
		}
	}
	
	void procedure() {
		input();
		sorting();
		print();
	}
}
