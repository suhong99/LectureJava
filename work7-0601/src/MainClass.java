import java.util.Iterator;
import java.util.Scanner;

import cls.Batter;
import cls.Human;
import cls.Pitcher;

public class MainClass {

	public static void main(String[] args) {
		/*
		  야구팀 구성
		  총인원수는 5명
		  
		   부모 클래스 : 번호(number) , 이름(name), 키(height)
		   자식 클래스
		   		투수 : 승 패 방어율
		   		타자 : 타수 히트수 타율
		   		
		   	입력 -. 투수를 등록하시겠습니까?  -1 타자를 등록하시겠습니까? -2
		   	
		   	>>1
		   	>>번호 ( number)
		   	>> 이름 (name)
		   	>> 키 (height)
		   	>> 승
		   	>> 패
		   	>> 방어율
		   	
		   	출력 
		   	투수 -> 정보
		   	투수 -> 정보
		   	타자 -> 정보
		 */
		Scanner sc= new Scanner(System.in);
		Human baseballTeam[] = new Human[5];
		for(int i=0; i<5; i++) {
			System.out.println("등록할 포지션 투수(1)/타자(2) >> ");
			int pos= sc.nextInt();
			
			if(pos ==1) {
				System.out.println("투수 입력합니다.");
				System.out.print("번호 >>");
				int number = sc.nextInt();
				System.out.print("이름 >> ");
				String name= sc.next();
				
				System.out.print("키 >> ");
				double height = sc.nextDouble();
				
				System.out.print("승 >>");
				int win = sc.nextInt();
				
				System.out.print("패 >>");
				
				int lose = sc.nextInt();
				
				System.out.print("방어율 >> ");
				double defence = sc.nextDouble();
				baseballTeam[i]= new Pitcher(number, name, height, win, lose, defence);
			}else {
				System.out.println("타자 입력합니다.");
				System.out.print("번호 >>");
				int number = sc.nextInt();
				System.out.print("이름 >> ");
				String name= sc.next();
				System.out.print("키 >> ");
				double height = sc.nextDouble();
				
				System.out.print("타수");
				int batcount = sc.nextInt();
				
				System.out.print("안타수");
				
				int hit = sc.nextInt();
				
				System.out.print("타울 >> ");
				double hitavg = sc.nextDouble();
				
				baseballTeam[i]= new Batter(number, name, height, batcount, hit, hitavg);

			}
	
		}
		
		for (int i = 0; i < baseballTeam.length; i++) {
			System.out.println(baseballTeam[i].toString());
		}
	

	}


}




