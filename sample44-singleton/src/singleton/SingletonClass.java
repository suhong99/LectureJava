package singleton;

public class SingletonClass {
	
	private static SingletonClass sc = null;
	public int number;
	public String name;
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		if(sc == null) {  //1번 생성되고 같은 인스턴스 계속 넘겨줌.
			sc=new SingletonClass();
		}
		return sc;
	}
}
