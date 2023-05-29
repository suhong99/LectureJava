
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Sorting
		Scanner sc = new Scanner(System.in);
		
		//input
		System.out.print("입력값의 갯수를 입력하세요 : ");
		int sortCount = sc.nextInt();
		System.out.println("입력하신 갯수는 "+sortCount);
				
		//그 갯수에 맞춰서 숫자들을 입력
		int count = 0;
		int numbers[] = new int[sortCount];
		while(count<sortCount) {
			System.out.print((count+1)+"번째 입력값 : ");
			numbers[count]= sc.nextInt();
			count++;
		}
		// 오름 차순인지 내림 차순인지
		System.out.print("오름차순이면y 내림차순이면 n을 입력해주세요 : ");
		String upOrDown= sc.next();
		
		int temp;
		while(true) {
			if(upOrDown.equals("y")) {
				
				for(int i=0;i<numbers.length-1;i++) {
					for(int j = i+1;j<numbers.length;j++) {
						if(numbers[i]>numbers[j]) {
							temp= numbers[i];
							numbers[i]=numbers[j];
							numbers[j]=temp;
						}
					}
				}
				System.out.println(Arrays.toString(numbers));	
	
				break;
			} else if(upOrDown.equals("n")) {
				for(int i=0;i<numbers.length;i++) {
					for(int j = i+1;j<numbers.length;j++) {
						if(numbers[i]<numbers[j]) {
							temp= numbers[i];
							numbers[i]=numbers[j];
							numbers[j]=temp;
						}
					}
				}
				System.out.println(Arrays.toString(numbers));	

				break;
			}
		}
		//sorting process
		
		//result print

	}

}
