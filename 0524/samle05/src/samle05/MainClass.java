package samle05;

public class MainClass {

	public static void main(String[] args) {
		//operator (������ ) : + - * / %
		
		int num1 , num2 ; 
		int result;
		num1 = 7; //ó�� �����ϴ°� �ʱ�ȭ��� ��
		num2 = 2; 
		
		result = num1+num2;
		System.out.println(num1 + " + " + num2+ " = " +result);
		System.out.println(num1 + " - " + num2+ " = " +(num1 - num2));
		result = num1*num2;
		System.out.println(num1 + " * " + num2+ " = " + result);
		result = num1/num2;
		System.out.println(num1 + " / " + num2+ " = " + result);
		
		// % ������
		result = num1%num2;
		System.out.println(num1 + " % " + num2+ " = " + result);
		
		//  increment (++) , decrement (--)
		
		int num3 = 0;
		num3 = num3 + 1; // �ڱ� �ڽ�(num3)�� ����
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
		System.out.println("num4++ �� ��� : " + num5 + " ++num6�� ��� : " + num7);
		
	}

}
