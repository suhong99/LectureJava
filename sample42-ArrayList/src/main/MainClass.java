package main;

import java.util.ArrayList;

import java.util.List;

import dto.StudentDto;
public class MainClass {

	public static void main(String[] args) {
		/*
		List
			ArrayList 	:	검색속도가 빠름
							indexnumber로 관리된다
							선형구조
							거색에 접합.
							배열처럼 사용하는
		 	LinkedList 	:	자주 추가삭제할 경우 처리에 적합
		 	
		Map
			HashMap
			TreeMap
		 */
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<>();
		//CRUD
		//추가
		list.add(11);
		list.add(new Integer(222));
		
		Integer in = new Integer(333);
		list.add(in);
		
			//size(=length 배열에서)
		int len = list.size();
		System.out.println("list의 크기 : "+ len);
			//하나의 데이터를 목록에서산출
		Integer value = list.get(0); //index number
		System.out.println(value);
		
		//모든 데이터 산출
		for (int i = 0; i < list.size(); i++) {
			Integer val = list.get(i);
			
		}
		
		for(Integer val:list) {
			System.out.println(val);
		}
		
		//원ㅎ나ㅡㄴ 위치에 추가
		//원하는 위치가 존재하지 않으면 에러뜸
		Integer num = new Integer(300);
		list.add(2,num);
		//삭제
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			Integer val = list.get(i);
			System.out.println(i + ":"+val);
			 
		}
		//검색
		
		int index = -1;
		int findNum=333;
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("n : "+ n);
					if(findNum==n) {
						System.out.println("찾음");
						index= i;
						break;
					}
			
		}
		System.out.println(index);
		if(index!=-1) {
			System.out.println(list.get(index));
		}
		//수정
		Integer updataDate = new  Integer(555);
		list.set(1, updataDate);
		for(int i =0; i <list.size();i++) {
			Integer val= list.get(i);
			System.out.println(i+":"+val);
		}
		
		List<String> strList = new ArrayList<String>();
		//추가
		strList.add("가나다");
		strList.add("마바사");
		strList.add("아자차");
		//원하는 위치에 넣기
		strList.add(2,"인덱스2에넣기");
		System.out.println(strList.size());//4
		for (int i = 0; i < strList.size(); i++) {
			String val = strList.get(i);
			System.out.println(i + ":"+val);
			 
		}
		
		//삭제
		strList.remove(1); //마바사가 지워질듯
		System.out.println("인덱스 1 삭제 마바사가 지워질듯");
		for (int i = 0; i < strList.size(); i++) {
			String val = strList.get(i);
			System.out.println(i + ":"+val);
			 
		}
		
		//검색
		int indexString = -1;
		String fingStr="아자차";
		for (int i = 0; i < strList.size(); i++) {
			String n = strList.get(i);
			System.out.println("n : "+ n);
					if(fingStr==n) {
						indexString= i;
						break;
					}
			
		}
		System.out.println(indexString);
		if(indexString!=-1) {
			System.out.println(strList.get(indexString));
		}
		
		//수정
		String updataString = new  String("555 업데이트로");
		//1번째 인덳으ㅔ 넣기
		strList.set(1, updataString);
		for(int i =0; i <strList.size();i++) {
			String val= strList.get(i);
			System.out.println(i+":"+val);
		}
		
		List<StudentDto> studentBook = new ArrayList<StudentDto>();
		
		//추가
		StudentDto student1 = new StudentDto(1, "홍길동", 160.2);
		StudentDto student2 = new StudentDto(2, "홍길동2", 160.22);
		StudentDto student3 = new StudentDto(3, "홍길3", 163.22);
		StudentDto student4 = new StudentDto(4, "홍길4", 173.22);

		studentBook.add(student1);
		studentBook.add(student2);
		studentBook.add(student3);
		studentBook.add(student4);

		for(int i=0; i<studentBook.size(); i++) {
			StudentDto n = studentBook.get(i);
			System.out.println((i+1)+"번째 = " +n.toString() );
		}
		//삭제
		studentBook.remove(3);
		System.out.println("홍길4 사망");
		for(int i=0; i<studentBook.size(); i++) {
			StudentDto n = studentBook.get(i);
			System.out.println("i번째 = " +n.toString() );
		}
		//검색(이름,키)
		int indexStudent = -1;
		String studentName = "홍길동2";
		for(int i=0; i<studentBook.size(); i++) {
			StudentDto n = studentBook.get(i);
			if(n.getName()==studentName) {
				indexStudent= i;
				System.out.println((i+1)+"번째에서 홍길동2 찾음");
			}
		}
		int indexStudentH = -1;
		double studentHeight=160.2;
		for(int i=0; i<studentBook.size(); i++) {
			StudentDto n = studentBook.get(i);
			if(n.getHeight()==studentHeight) {
				indexStudent= i;
				System.out.println((i+1)+"번째에서 키가 160.2인 애 찾음");
			}
		}		
		//
		//수정
		StudentDto updataStu = new  StudentDto(5,"홍길끝",130.22);
		studentBook.set(2, updataStu);
		for(int i=0; i<studentBook.size(); i++) {
			StudentDto n = studentBook.get(i);
			System.out.println((i+1)+"번째 = " +n.toString() );
		}
	}
	

}
