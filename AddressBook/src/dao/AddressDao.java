package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import dto.AddressDto;
//DAO(Data Access Object);
public class AddressDao {
		//데이터를 편집하는 클래스
	
	//composition
	private Scanner sc = new Scanner(System.in);
	
	final int COUNT = 100;
	private int counter;
	//주소를 저장할 100개의 instance
	private AddressDto addressBook[]= new AddressDto[COUNT];
	
	public AddressDao() {
		counter =0;
	}
	
	public void insert() {
		System.err.println("데이터를 추가합니다");
		System.out.print("이름 = ");
		String name=sc.next();
		System.out.print("나이 = ");
		int age=sc.nextInt();
		System.out.print("전화번호 = ");
		String phone = sc.next();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주소");
		String address = "";
		
		try {
			address = br.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("메모 = ");
		String memo = "";
		try {
			memo = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		addressBook[counter] =new AddressDto(name,age,phone,address,memo);
		counter++;


	}
	public void delete() {
		System.out.print("삭제하실 이름을 입력해주세요 : ");
		String searchName = sc.next();
		for (int i = 0; i < addressBook.length; i++) {
	        if (addressBook[i] != null && addressBook[i].getName().equals(searchName)) {
	        	addressBook[i].setName("");
	        	addressBook[i].setAge(0);
	        	addressBook[i].setPhone("");
	        	
	        	addressBook[i].setAddress("");
	        	
	        	addressBook[i].setMemo("");
	        	
	        	
	        	System.out.println("삭제하였습니다");
	            return; 
	        }
	    }

	    System.out.println("삭제 할 대상을 찾을 수 없습니다.");
		// 24->0 "홍길동" ->""
	}
	public void select() {
		
		//이름으로 검색
		System.out.print("검색하실 이름을 입력해주세요 : ");
		String searchName = sc.next();
		for (int i = 0; i < addressBook.length; i++) {
	        if (addressBook[i] != null && addressBook[i].getName().equals(searchName)) {
	            System.out.println(addressBook[i].toString());
	            return; 
	        }
	    }

	    System.out.println("검색 결과를 찾을 수 없습니다.");
	}
	public void update() {
		//이름으로 검색
				System.out.print("업데이트하실 이름을 입력해주세요 : ");
				String searchName = sc.next();
				for (int i = 0; i < addressBook.length; i++) {
			        if (addressBook[i] != null && addressBook[i].getName().equals(searchName)) {
			        	System.out.println("나이를 입력해주세요 : ");
			        	addressBook[i].setAge(sc.nextInt());
			        	System.out.println("전화번호를 입력해주세요 : ");
			        	addressBook[i].setPhone(sc.next());
			        	
			        	System.out.println("주소를 입력해주세요 : ");
			        	addressBook[i].setAddress(sc.next());
			        	
			        	System.out.println("메모를 입력해주세요 : ");
			        	addressBook[i].setMemo(sc.next());
			        	
			        	
			        	System.out.println("업데이트 되었습니다.");
			            System.out.println(addressBook[i].toString());
			            return; 
			        }
			    }

			    System.out.println("업데이트 할 대상을 찾을 수 없습니다.");
	}
	
	//확인
	public void allDataPrint() {
		for (int i = 0; i < addressBook.length; i++) {
			if(addressBook[i] != null &&addressBook[i].getName().equals("")==false) {
				System.out.println(addressBook[i].toString());
			}
		}
	}
}
