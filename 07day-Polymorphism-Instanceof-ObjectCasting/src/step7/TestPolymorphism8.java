package step7;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

public class TestPolymorphism8 {
	public static void main(String[] args) {
		ZooService4 service=new ZooService4();
		//�迭 ���� 
		Animal[] ani= {new Monkey(),new Person(),new Tiger()};
		service.playAll(ani);
		/*
		 	�����̰� ����Ÿ�� ��� 
		 	����� Ƽ���� �����ϴ�
		 	����� ����Ʈ�ϸ� ��� 
		 	ȣ���̰� ����ϸ� ��� 
		 */
	}
}







