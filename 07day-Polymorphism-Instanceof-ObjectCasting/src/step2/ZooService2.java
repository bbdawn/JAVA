package step2;

import step1.Animal;
import step1.Dog;
import step1.Person;

public class ZooService2 {
	// �θ�Ÿ���� ������ �پ��� �ڽ� ��ü�� ���޹޴´� 
	public void pass(Animal a) {
		if(a instanceof Dog) {// instanceof ������ -> ��ü�� Ÿ���� �� 
			System.out.println("���� ����");
		}else if(a instanceof Person) {
			System.out.println("���� ����̴�");
		}
		a.eat();
		System.out.println(a instanceof Animal);//instanceof �� is a ���� ������ true 
	}
}









