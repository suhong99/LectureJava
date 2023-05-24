package homework3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("name : ");
        name= sc.next();
        
        int age;
        System.out.print("age : ");
        age =sc.nextInt();
        
        Boolean man;
        System.out.print("man : ");
        man = sc.nextBoolean();
        
       String phone;
        System.out.print("전화번호 입력 :  - -");
        phone = sc.next();
        
        float height;
        System.out.print(" height : ");
        height=sc.nextFloat();
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String address;
        System.out.print("address = ");
        address = br.readLine();
        
        System.out.println("name : " + name + " age :" +age + " man : " + man + " phone : "+ phone + " height : "+height + " address : " + address);
        System.out.printf("%s %d %b %s %.2f %s", name,age,man,phone,height,address);
        
	}

}
