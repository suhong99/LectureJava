package sample04;

public class MainClass {

	public static void main(String[] args) {
		//cast
		// TODO Auto-generated method stub
		
		//�ڷ��� ��ȯ
		short sh; //2 byte
		sh = 128; 
		
		int i ; //4 byte
		
		i= sh;  // 4 <= 2
		System.out.println("i = " + i);
		
		// (����) �ڷ��� ��ȯ -> cast ��ȯ
		i=1234;
		sh= (short)i;
		
		double d; 	//8 byte
		int n ;   	// 4 byte
		n= 1024;
		d= n;
		System.out.println("d = " + d);
		
		d = 123.456;
		n= (int)d; //������ ���������� ��ȯ
		
		System.out.println("n = " + n);
		
		int num1 , num2;
		num1 =3;
		num2 =2;	
		double result = num1/num2;
		System.out.println("result = " + result); //1.5�� �ƴ� 1.0�� ����
		double result2 = (double)num1/num2;
		System.out.println("result = " + result2); //1.5
		
		char c = 'A';
		System.out.println("c = " + c);
		System.out.println("c = " +(int)c); //65 : ASCII �ڵ尪�� ���
	}

}
