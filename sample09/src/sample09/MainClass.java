package sample09;

public class MainClass {

	public static void main(String[] args) {
		/*
		Wrappler class
		일반 자료형(int, char, long)을 class로 만들어 놓은것
		일반 자료형			wrapper class
		boolean		1	Boolean
		byte		1	Byte
		short		2	Short
		int			4	Integer		----
		long		8	Long
		float		4	Float
		double		8	Double		-----
		char		2	Character
		char []		?	String		----- 자주쓰는 3개
		
					동적할당
		클래스명 변수 = new 클래스명();
		자료형 변수[] = new 자료형[5];
		
		String str = "안녕하세요";
		String str = new String("안녕하세요")
		 
		int num =123;
		Integer num = 123;
		Integer num = new Integer(123)
		 * 
		 * 
		 */
		
		char c = 'a';
		char carr[]= {'h','e','l','l','o'};
		System.out.println(carr);
		
		String s = "hello";
		System.out.println(s);
		
		int i =123;
		Integer in = 123;
		System.out.println(in);
		
		Integer obj = new Integer(123);
		System.out.println(obj);
		
		String strNumber="12345";
		//문자(숫자) => 숫자
		int number = Integer.parseInt(strNumber);
		System.out.println(number);
		
		//숫자 -> 문자열
		Integer isNum = 12345;
		System.out.println( isNum.toString()+999);
		
		//문자열 -> 숫자
		strNumber = "1010";
		int rnum=Integer.parseInt(strNumber, 2);
		System.out.println(rnum);
		
		
		String strNum="123.4567";
		//문자열 -> 소수값
		double dnum = Double.parseDouble(strNum);
		System.out.println(dnum);
		
		//String : 문자열 저장, 편집, 정보취득
		String str = "hello"; //
		System.out.println(str);
		
		String str1 = new String("hello");
		System.out.println(str1);
		
		//연산(+)
		String str2 = "world";
		String str3 = str1+str2;
		System.out.println(str3);
		String str4 = str1.concat(str2);
		System.out.println(str4);

		// 문자열 비교
		String str5="world";
		String str6 = "world";
		
		boolean b = str5.equals(str6);
		System.out.println("b = " + b);
		
		//문자의 위치
		String str7= "abcabcabc";
		int n = str7.indexOf("c");
		System.out.println("n : " + n);
		
		n= str7.lastIndexOf("c");
		System.out.println("n : " + n);

		//문자의 길이
		int len = str7.length(); //array와 다르게 함수여야 함
		System.out.println("len =" + len);
		
		//문자의 수정
		String str8 ="A*B*C*D";
		String replaceString = str8.replace("*", "-");
		System.out.println(replaceString);
		
		str8= "한은, 올해 경제성장률 1.4%로 하향... 물가는 3.5% 유지 상보";
		replaceString  = str8.replace("...","" );
		System.out.println(replaceString);
		
		//문자열 자르기
		String str9 = "홍길동-24-2001/05/17-부산시";
		System.out.println("str0의 맨 끝번지 = " + (str9.length()-1));
		
		// 범위
		String substr = str9.substring(4);
		System.out.println(substr);
		
		String birth = str9.substring(7,17);
		System.out.println(birth);
		//기호 (token)
		
		
		
		// 기호 (token)
		String split[] = str9.split("-");
				System.out.println(split[0]);
				System.out.println(split[1]);
				System.out.println(split[2]);
				System.out.println(split[3]);
				
				
		// 공백을 제거하는 함수
		String str10= " java java   java";
		String trimStr = str10.trim();
		System.out.println(trimStr);
		
		//  ? 번째의 숫자를 넣으면 그 위치에 해당하는 문자를 돌려주는 함수
		String str11 = "가나다라마";
		char ch= str11.charAt(2);
		System.out.println(ch);
		
		///문자열 (포함) 비교
		String str12 = "서울시 강남구 역삼동";
		boolean b1 =str12.contains("역삼");
		System.out.println(b1);
		
		int tenOrderNum=123;
		//10진수  -> 2진수
		String num2Str = Integer.toString(tenOrderNum, 2); //2진수
		String num2Str2= Integer.toBinaryString(tenOrderNum);
		//10진수 -> 16진수
		String num16Str = Integer.toString(tenOrderNum, 16); //16진수
		
		//2진수	-> 10진수
		String num2String = "1111101111";
		int num2 = Integer.parseInt(num2String,2);
		//16진수 -> 10진수
		String num16String = "7b32";
		int num16 = Integer.parseInt(num16String,16);
		System.out.println("10진수  -> 2진수 :  "+tenOrderNum + " -> "+ num2Str);
		System.out.println("10진수  -> 2진수 :  "+tenOrderNum + " -> "+ num2Str2);

		System.out.println("10진수  -> 16진수 :  "+tenOrderNum + " -> "+ num16Str);
		System.out.println("2진수  -> 10진수 :  "+num2String + " -> "+ num2);
		System.out.println("16진수  -> 10진수 :  "+num16String + " -> "+ num16);

																				



		
		
	}

}
