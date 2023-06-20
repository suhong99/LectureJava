package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Singleton pattern
		 				(중심이 되는 데이터관리(list, map)을 중심으로)
		 				어느 클래스에서나 접근이 용의하게 하기 위한 패턴
		 				
		 	Factory pattern
		 				원하는 클래스의 형태를 ( 손십게) 생성하기 위한 패턴
		 */
		Animal animal1 = AnimalFactory.create("강아지");
		Animal animal2 = AnimalFactory.create("야옹이");
		Animal animal3 = AnimalFactory.create("황소");
		
		animal1.printDescript();
		((Dog)animal1).dogMethod();
		
		List<Animal> list = new ArrayList<Animal>();
		
		list.add(animal1);
		String name[] = {"야옹이","야옹이","강아지","강아지","강아지","황소"};
		for(int i=0; i<name.length;i++) {
			list.add(AnimalFactory.create(name[i]));
		}
		for (int i =0;  i<list.size();i++) {
			Animal ani = list.get(i);
			ani.printDescript();
			
			if(ani instanceof Cat) {
				((Cat)ani).catMethod();
			}
			else if(ani instanceof Dog) {
				Dog d= (Dog)ani;
				d.dogMethod();
			}else if(ani instanceof Cow) {
				Cow c= (Cow)ani;
				c.cowMethod();
			}
		}
	}

}
