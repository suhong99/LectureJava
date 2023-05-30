package sample21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		// NullPointerException
		
		String str = null;
//		String str2 = "";
		
		try {
			System.out.println(str.length());
			
		}catch(NullPointerException e) {
			System.out.println("str이 할당되지 않았습니다.");
		}
		
		//ArrayIndexOutOfBoundsException
		int array[] = {2,4,8};
		
		try {
			System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 밖입니다.");
		}
		
		//FileNotFoundException
		File file = new File("c:\\xxxxxxx213123fxx.txt");
		FileInputStream is;
		try {
			is =new FileInputStream(file);
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		//NumberFormatException
		int num;
		
		try {
			num = Integer.parseInt("123.456");
		}catch(NumberFormatException e) {
			System.out.println("형식이 다름");
		}
	}	

}
