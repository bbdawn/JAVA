package step8;
class Animal{//extends Object
	public void sleep() {
		System.out.println("�ڴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}


class Person extends Animal{
	//�޼��� �������̵�
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
}




public class TestPolymorphism1 {

	public static void main(String[] args) {
	Animal a=new Animal(); //�Ϲ������� Animal Ÿ���� a������ Animal ��ü�� ������Ų��
	a.eat();
	a.sleep();
	
	//�������� �����ǹǷ� �Ʒ��� ���� �ڵ尡 �����ϴ�!
	Animal a2=new Person(); //������ ���� �� -> �θ�Ÿ�� ������ �ڽ� ��ü�� ������ų �� �ִ� ����
	a2.eat();//�θ�κ��� ��ӹ��� �޼���
	a2.sleep();//�������̵� �� �ڽ��� �޼��尡 ����
	//���� �θ�Ÿ���� ������ �ڽ� ��ü�� ������ �� �ִٴ� ��(���� �� �ִ� ��)�� � ������ ������?
	//-> [step9]
	}

}
