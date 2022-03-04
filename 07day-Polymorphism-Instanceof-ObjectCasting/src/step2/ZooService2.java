package step2;

import step1.Animal;
import step1.Dog;
import step1.Person;

public class ZooService2 {
	// 부모타입의 변수로 다양한 자식 객체를 전달받는다 
	public void pass(Animal a) {
		if(a instanceof Dog) {// instanceof 연산자 -> 객체의 타입을 비교 
			System.out.println("나는 개다");
		}else if(a instanceof Person) {
			System.out.println("나는 사람이다");
		}
		a.eat();
		System.out.println(a instanceof Animal);//instanceof 는 is a 관계 성립시 true 
	}
}









