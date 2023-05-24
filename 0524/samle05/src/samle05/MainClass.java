package samle05;

public class MainClass {

	public static void main(String[] args) {
		//operator (연산자 ) : + - * / %
		
		int num1 , num2 ; 
		int result;
		num1 = 7; //처음 대입하는걸 초기화라고 함
		num2 = 2; 
		
		result = num1+num2;
		System.out.println(num1 + " + " + num2+ " = " +result);
		System.out.println(num1 + " - " + num2+ " = " +(num1 - num2));
		result = num1*num2;
		System.out.println(num1 + " * " + num2+ " = " + result);
		result = num1/num2;
		System.out.println(num1 + " / " + num2+ " = " + result);
		
		// % 나머지
		result = num1%num2;
		System.out.println(num1 + " % " + num2+ " = " + result);
		
		//  increment (++) , decrement (--)
		
		int num3 = 0;
		num3 = num3 + 1; // 자기 자신(num3)을 갱신
		System.out.println("num3 = " + num3);
 
		num3 += 1;
		System.out.println("num3 = " + num3);

		num3++;
		System.out.println("num3 = " + num3);

		++num3;
		System.out.println("num3 = " + num3);
		
		num3 --;
		--num3;
		System.out.println("num3 = " + num3);
		
		int num4;
		int num5;
		num4 =0;
		num5 = num4++;
		int num6 = 0;
		int num7;
		num7 = ++num6;
		System.out.println("num4++ 인 경우 : " + num5 + " ++num6인 경우 : " + num7);
		
	}

}
