package homework4;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		int x;
		int y;
		System.out.print(" x => ");
		x = sc.nextInt();
		System.out.print(" y => ");
		y = sc.nextInt();
		
		//swap ( 교환)
		int temp =x; // 임시 저장공간
		x=y;
		y=temp;	
		
				
		System.out.println("x =  " +x +" y = "+ y);
		
		sc.close();
	}
}
