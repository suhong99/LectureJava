package sample19;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	value로 할당
		 	void func(int num)
		 	
		 	address로 할당
		 	void func(int arr[])
		 
		 */
		
		int array[] = {11,22,33};
		int arrayNum[] = array;
		arrayNum[1]=20;
		System.out.println(array[1] );//참조에 의한 변환
		
//		int test1 = 4;
//		int test2=test1;
//		test2=10;
//		System.out.println("test1 : " + test1);
		
		int number = 123;
		valueFunc(number);
		System.out.println("number =" + number); //number를 넘긴게 아니라 값을 넘김
		int numArr[] = {11,22,33};

		addressFunc(numArr);
		for(int i = 0 ; i<numArr.length; i++) {
			System.out.println("numArr["+i +"] = "+ numArr[i]);
		}
	}
	
	static void valueFunc(int num) {
		num = 234;
		System.out.println("num =" + num);
	}
	
	static void addressFunc(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] +10;
		}
	}
}
