package sample07;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 
		 
		Array : �迭. ������
			���� �ڷ��� ������ ����
		
		���� : ������ ���� 
		
		�Ϲ� ���� int number ; 1��
		�迭 ���� int number[?] ; n��
		���� (dynamic ) , ���� (static)
		
		�ڹٽ�ũ��Ʈ����
		var array = new Array(5);
		var array = [1,2,3];
		
		int number 1 , number 2 ...;
		�螉 �Ȥ��� ���� ��ȣ -> index number 0 ~ �迭�� ���� ~1
		
		�ڷ��� �迭������ [] =new �ڷ��� [�迭����];
		int array [] = new int[10];
		array[0] =1;
		array[1] =2
		
		   .
		   .
		array[9] = 10;
		
		*/
		
		int array[] = new int[5];
//		int []array = new int[10];  // 3�� ��
//		int[] array = new int[10]; // ����
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
//		int number1, number2, number3, number4, number5;
		System.out.println(array.length);
		System.out.println(array[0]);
		
		array[4] = array[1] + array[3];
		System.out.println(array[4]);
		
		array[0] =array[0] +1;
		System.out.println(array[0]);
		
		//�迭 �ʱ�ȭ
		int array2[]= {11,22,33,44,55};
		System.out.println(array2[2]);
		
		String names[]= {"ȫ�浿","������","ȫ�β�"};
		System.out.println(names[1]);
		
		String alias[]= names;
		System.out.println(alias[1]);
		
		alias[1] = "�����";
		System.out.println(names[1]);// ������ ���� ������ ����
		
		int number_position_datas[] = {1,2,3,4,5};
		number_position_datas[2] = number_position_datas[0]+ number_position_datas[1];
		int numPD[] = number_position_datas;
		numPD[2]=33;
		System.out.println(number_position_datas[2	]);
		
		// �ʱ�ȭ
		int arr[] = null;
		arr = new int [5];
		//arr = {1,2,3} ; //���� ����
		System.out.println(array2);
	}

}
