package work6;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		String student[]= new String[3];
		
		// 유저로부터 입력받은 파일명으로 파일 생성하는 함수
		fileCreater();
		//생성된 파일에 3명의 학생 정보 (이름, 국어, 영어)를 쓰기가 되도록 하는 함수
		
		String name[]= {"홍길동","성춘향","신준"};
		int lang[] = {90,100,85};
		int eng[] = {85,90,100};
		
		String str[] = new String[3];
//		str[0] = name[0] + lang[0]+eng[0];
		
		
		//void studentWrite(File file, String student[])
		
		//작성한 파일의 학생 정보를 읽어와서 출력하는 함수.

	}
	
	
	// 유저로부터 입력받은 파일명으로 파일 생성하는 함수

	static File fileCreater() {
		Scanner sc= new Scanner(System.in);
		File file=null;
		try {
			System.out.print("파일 이름을 입력해주세요 : ");
			String nameInput = sc.next();
			String filename = "c:\\testtmp\\"+nameInput+ ".txt";
			file = new File(filename);
			if(			file.createNewFile()) {
				System.out.println("파일생성 성공! 파일이름은 : "+filename);
			}else {
				System.out.println("파일생성 실패");
			}

		}catch(IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	
	static void studentWrite(File file, String student[]) throws Exception {
		FileWriter fw= new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(file);
	}
	
	static void studentRead(File file) {
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str= "";
			while((str=br.readLine())!=null) {
				System.out.println(str);
				String split[] =str.split("-");
				System.out.println("이름 : " + split[0]+ " 국어 : " +split[1]+ "영어 : " + split[2]);
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
