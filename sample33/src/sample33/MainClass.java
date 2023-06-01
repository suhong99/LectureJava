package sample33;

public class MainClass {

	public static void main(String[] args) {
		Dog dog[] = new Dog[10];
		Cat cat[] = new Cat[10];
		Snake snake[]= new Snake[10];
		for (int i = 0 ; i < 10; i++) {
			dog[i]=new Dog();
			cat[i]= new Cat();
			snake[i]=new Snake();
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
		
		for(int i = 0 ; i< animal.length;i++){
			animal[i].proc(); //OverRide된 메소드
//			animal[i].catMethod();//호출안됨
			if(animal[i] instanceof Dog) {
				Dog d = (Dog)animal[0];
				d.dogMethod();
			} else if(animal[0] instanceof Cat) {
				Cat c= (Cat)animal[0];
				c.catMethod();
			} else if(animal[0] instanceof Snake) {
				Snake s= (Snake)animal[0];
				s.snakeMethod();
			}
		}
//		Dog d= (Dog)animal[0];
//		d.dogMethod(); // 캐스트 변환 후 사용가능
//		
		//instanceOf
		
		
	}

}


class Animal{
	int age;
	String name;
	
	public void method() {
		System.out.println(name +  " " + age + "살");
	}
	public void proc() {
		System.out.println("동물동물");
	}
}

class Dog extends Animal{
	public void proc() {
		System.out.println("멍멍멍");
	}
	public void dogMethod() {
		System.out.println("DogMethod()");
	}
}

class Cat extends Animal{
	public void proc() {
		System.out.println("멍멍멍");
	}
	public void catMethod() {
		System.out.println("catMethod()");
	}
}

class Snake extends Animal{
	public void proc() {
		System.out.println("슉슉슉");
	}
	public void snakeMethod() {
		System.out.println("snakeMethod()");
	}
}