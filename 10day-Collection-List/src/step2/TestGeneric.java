package step2;
//Generic 특성을 확인

import java.util.ArrayList;

class Animal{}

class Person extends Animal{}

class Dog extends Animal{}

class Car{}

public class TestGeneric {
	public static void main(String[] args) {
		/*
		ArrayList list=new ArrayList(); //적고 ctrl+shift+o 누르기 -> 윗부분 import~~ 만들어짐
		list.add(new Animal());
		list.add(new Person());
		list.add(new Dog());
		list.add(new Car());
		*/
		//위의 generic이 적용되지 않는 list는 Object 타입으로 처리되므로 모든 타입의 객체를 담을 수 있다. 
		//아래의 generic이 적용된 gList와 비교해보기
		
		//Generic을 Animal로 지정해서 Animal 계층구조에 있는 객체만 리스트로 담도록 처리한다 
		ArrayList<Animal> gList=new ArrayList<Animal>();
		gList.add(new Animal());
		gList.add(new Person());
		gList.add(new Dog());
		//gList.add(new Car()); //error: Animal 계층구조에 있지 않은 Car 객체는 요소로 추가될 수 없다
		
	}
}
