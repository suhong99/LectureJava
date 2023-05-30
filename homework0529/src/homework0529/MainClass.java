package homework0529;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		//1번 문제 제곱
		System.out.println(getDistance(1,1,2,2));
		//2번 문제 셔플
		int array[]= {1,2,3,4,10,15};
		System.out.println( Arrays.toString(shuffle(array)));
		//3번 문제 최대값
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+maxNum(data));
		
		//4번 문제
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		//5번 문제 값 2배하기
		int num1[] = {1, 2, 3, 4, 5};
		getDouble(num1);
		System.out.println(Arrays.toString(num1));
		
		//6번 문제 두 수를 나눗셈 연산으로 몫과 나머지를 구하는 메소드를 작성하시오.
		int num1Q6=20; 
		int num2Q6=3;
		int answer[]=getDevided(num1Q6,num2Q6);
		System.out.println("몫 : "+ answer[0] + " 나머지 : "+ answer[1]);
	}
	static double getDistance(int x, int y, int x1, int y1) {
        int xDis = x1 - x;
        int yDis = y1 - y;
        double distance = Math.sqrt(xDis * xDis + yDis * yDis);		
		return distance;
		}
	static int[] shuffle(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int)(Math.random()*i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
	static int maxNum(int arr[]) {
		int answer;
		if(arr.length==0) {
			answer=-999999;
		}else {
			answer=arr[0];
			for(int i=0; i<arr.length;i++) {
				if(answer<arr[i]) {
					answer = arr[i];
				}
			}
		}
		return answer;
	}
	static boolean isNumber(String str) {
		boolean answer;
		
		try {
		   int num = Integer.valueOf(str);
		   answer=true;
		} catch (NumberFormatException e){
			answer =false;
		}
		return answer;
	}
	//4강사님
	static boolean isNumber2(String str) {
		if(str == null || str.length() == 0) {
			return false;
		}
		
		boolean b = true;
		for (int i=0;i<str.length(); i++) {
			char c= str.charAt(i);
//			System.out.println(c);
			int ascii = (int)c;//아스키 코드로 변경
			if(ascii < 48 || ascii > 57) {
				b=false;
				return false;
			}
		}
		
		
		return true;
	}
	
	//5번
	static void getDouble(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*2;
		}
	}
	
	static int[] getDevided(int num1, int num2) {
		int devided[]= new int[2];
		devided[0]=num1/num2;
		devided[1]=num1%num2;
		
		return  devided;
	}

}

