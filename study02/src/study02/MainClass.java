package study02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if
		String str = "안녕하세요";
		String msg = "안녕";
		msg = msg + "하세요";
		if(str.equals(msg)==true) {
			System.out.println("같은 문자열입니다.");
		}
		
		if(str.length()>5) {
			System.out.println("문자열의 길이는 5보다 큽니다");
		}else if(str.length()>3) {
			System.out.println("문자열의 길이는 5보다 작거나 4보다 큽니다.");
		}else {
			System.out.println("문자열의 길이가 3보다 작거나 같습ㅂㅂ니다.");
		}
		
		switch(str.length()) {
		case 3 : 
			System.out.println("문자열의 길이는 3입니다");
		break;
		case 4 :
			System.out.println("문자열의 길이는 4입니다.");
			break;
		case 5 :
			System.out.println("문자열의 길이는 5입니다.");
			break;
		default :
			System.out.println("문자열의 길이는 3보다 작거나 5보다 큽니다.");
		}
		
		//for문
		for(int i=0;i<10; i ++) {
			System.out.println("i: "+1);
		}
		
		int array[] = {1,2,3,3,4};
		
		for ( int num : array) {
			System.out.println();
		}
		
		int na = 0;
		for(int num : array) {
			System.out.println(na + " : " + num);
			na++;
		}
		
		String array2[][] = {
				{"AAA","BBB", "CCC"		},{
					"DDD","EEE","FFF"
					}
		};
		
		for (int i = 0 ; i < 2 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println();
		}
		
		int w = 0;
		while(w<10) {
			System.out.println("w : " + w);
			w++;			
		}
	}

}
