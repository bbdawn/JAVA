package step5;

public class Person extends Animal{ //Animal(super class)�� ��ӹ޴´�
	public void study() {
		
		//��ӹ޴��� �θ��� private member(����,�޼���)���� ���� ���� �Ұ�
		//compile error
		//System.out.println(age+"�� ����� �����ϴ�");
		//�θ���  getter,setter�� �����ϸ� �ذ� ����!
		System.out.println(getAge()+"�� ����� �����ϴ�");
	}
}
