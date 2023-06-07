package main;

public class MainCLass {

	public static void main(String[] args) {
		/*
		 		Generic == Template((자료)형태)
		 				: 자료형 변수
		 				: 같은 클래스에서 다양한 자료형을 사용하는 경우에 사용하는 요소
		 */
		Box<Integer> box = new Box<Integer>(1000);
		System.out.println(box.getTemp());
		box.setTemp(2000);
		
		Box<String> box1 = new Box<String>("Hello");
		System.out.println(box1.getTemp());
		box1.setTemp("World");
		
		BoxMap<Integer,String> bm = new BoxMap<Integer,String>(1111, "홍길동");
		System.out.println(bm.toString());
		
		BoxMap<String,Integer> mb = new BoxMap<String,Integer>("first",2222);
		System.out.println(mb.toString());
		
		Parent arr[] = new Parent[2];
		arr[0] = new ChildOne();
		arr[1] = new ChildTwo();
	}
}


class Box<T>{ //<T> : generic
	T temp;
	
	public Box(T temp) {
		this.temp = temp;
	}
	
	public T getTemp() {
		return temp;
	}
	public void setTemp(T temp) {
		System.out.println("temp : " + temp);
	}
}

class BoxMap<Key,Value>{
	Key key;
	Value value;
	public BoxMap(Key key, Value value) {
		super();
		this.key= key;
		this.value =value;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BoxMap [key=" + key + ", value=" + value + "]";
	}
	
	
}

class Parent{
	
}

class ChildOne extends Parent{
	
}

class ChildTwo extends Parent{
	
}