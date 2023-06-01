package sample33;

public class MainClass {

	public static void main(String[] args) {
		Dog dog[] = new Dog[10];
		Cat cat[] = new Cat[10];
		
		for (int i = 0 ; i < 10; i++) {
			dog[i]=new Dog();
			cat[i]= new Cat();
		}
		//부모 클래스의 인스턴스로 자식을 담을 수 있음
		Animal ani1 = new Dog();
		Animal ani2 = new Cat();
		
		Animal animal[] = new Animal[10];
		
		animal[0] = new Dog();
		animal[1] = new Dog();
		animal[2] = new Dog();
		animal[3] = new Dog();
		animal[4] = new Cat();
		animal[5] = new Cat();
		animal[6] = new Cat();
		animal[7] = new Cat();
		animal[8] = new Cat();
		animal[9] = new Dog();

		

	}

}


class Animal{
	int age;
	String name;
	
	public void method() {
		System.out.println(name +  " " + age + "살");
	}
}

class Dog extends Animal{
	public void proc() {
		System.out.println("멍멍멍");
	}
}

class Cat extends Animal{
	public void proc() {
		System.out.println("멍멍멍");
	}
}