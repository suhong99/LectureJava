package sample03;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws Exception {
		//input
		// TODO Auto-generated method stub
		//input (�Է�) -console
        Scanner sc = new Scanner(System.in);
			
		//boolean
//		boolean b;
//		b= sc.nextBoolean();
//		System.out.println("b : " +b);
//		//integer
//		int number;
//		System.out.print("number = ");
//		number = sc.nextInt();
//		System.out.println("number :" +number);
		//double
//        double dnumber;
//        System.out.println("number =");
//        dnumber = sc.nextDouble();
//        System.out.println("number : " +dnumber);
		//string
        String name;
        System.out.print("name = "); //������ �Է��� �ȵ� �λ�� ������ ��� �λ�ø� ��µ�
        name= sc.next();
        System.out.println("name : " +name);
        
        //Buffer(�������)
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String address;
        System.out.print("name = ");
        address = br.readLine();
        System.out.println("address : "+address);
	}

}
