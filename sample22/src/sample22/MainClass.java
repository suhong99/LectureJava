package sample22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) throws IOException {
		/*
		 	source code(logic) -> file ,database(기능)
		 	
		 	저장매체 : file , database
		 			 	
		 	목적 : 데이터를 저장, 불러오기
		 	
		 	jpg png gif tiff tga bmp
		 
		 	
		*/
		
		//파일 목록
//		File fileDir = new File("C:\\");
////		String fileList[]=fileDir.list();
////		for(int i=0; i <fileList.length;i++) {
////			System.out.println(fileList[i]);
////		}
//		
////		//파일 , 폴더, 그외의 것
////		File fileList [] = fileDir.listFiles();
////		for(int i=0; i< fileList.length; i++) {
////			if(fileList[i].is)
////		}
//		
//		//파일 생성
//		String filename = "c:\\testtmp\\newfile.txt";
//		File newfile = new File(filename);
//		try {
//			if(			newfile.createNewFile()) {
//				System.out.println("파일생성 성공!");
//			}else {
//				System.out.println("파일생성 실패");
//			}
//;
//
//		}catch(IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//		//파일의 존재여부
//		File file = new File("c:\\testtmp\\newfile.txt");
//		if(file.exists()) {
//			System.out.println("파일이 존재합니다.");
//		}else {
//			System.out.println("파일이 존재하지 않습니다.");
//		}
//		//읽기 가능?
//		 if(file.canRead()) {
//			 System.out.println("파일을 읽을 수 있습니다.");
//		 }
//		//읽기 전용?
//		 file.setReadOnly();
//		
//		//쓰기 가능?
//		 if(file.canWrite()) {
//			 System.out.println("파일 쓰기를 할 수 있습니다");
//		 }else {
//			 System.out.println("파일 읽기전용입니다.");
//		 }
		
		//file write
		// 덮어쓰기됨
//		File file = new File("c:\\testtmp\\test.txt");
		
		//한문자씩 쓰기
//		FileWriter fw = new FileWriter(file);
//		fw.write("안녕하세요 Hello" + "\n");
//		fw.close();
		
//		//추가쓰기
//		FileWriter appendFw = new FileWriter(file,true);
//		appendFw.write("건강하세요" + "\n" );
//		appendFw.close();
//		
		//문장으로 기입
//		
//		FileWriter fw = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(fw);
//		PrintWriter pw = new PrintWriter(bw);
//		
//		pw.print("안녕" + "\n");
//		pw.println("하이하이");
//		pw.println("건강하세요");
//		
//		pw.close();
		
		//file read
		File file = new File("c:/testtmp/test.txt");
		FileReader fr = new FileReader(file);
		
		//한문자씩 읽어 들인다.
//		String str = "";
//		int c = fr.read();
//		
//		while(c!= -1) { //-1 == 파일의 끝
//			System.out.println((char)c);
//			str = str+(char)c;
//			c= fr.read();
//		}
//		System.out.println(str);
		//문장씩 읽어 들인다.
		
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		
		br.close(); // write에선 close안하면 안 돌아가지만, read에선 안 적어도 돌아가긴 함.
	}

}
