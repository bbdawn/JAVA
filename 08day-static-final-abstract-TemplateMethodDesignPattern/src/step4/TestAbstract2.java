package step4;
//abstract method Ư¡ ����

abstract class Parent{
	public void eat() {
		System.out.println("��");
	}
	//���δ� ��� ���� �� ���� ������ �ؾ��ϹǷ� abstract method�� �����Ѵ�
	//abstract method�� �����ϸ� �ش� Ŭ������ abstract class�� ����Ǿ���Ѵ�
	//abstract method�� �����ΰ� ����
	//�ڽ�Ŭ������ �ݵ�� abstract method�� �����ϰų� �ڽŵ� abstract class�� ����Ǿ���Ѵ�. 
	//�ڽ�Ŭ�������� ��ɱ����� �����ϴ� ȿ���� ����!!!!!
	public abstract void study();

}

//���1. �����ϱ�
class Child extends Parent{
	public void study() {//�θ��� abstract method�� ����
		System.out.println("�����ϴ�");
	}
}

//���2. ���� ���ϰ� ��üȭ ����
abstract class Child2 extends Parent{//abstract class�̹Ƿ� new�� ���� �Ұ�. ���� ��üȭ�� �� ����. 
}
public class TestAbstract2 {
	public static void main(String[] args) {
		Parent p=new Child();
		p.eat();
		p.study();
		//Parent p2=new Child(); // abstract class�̹Ƿ� ��ü�����Ұ�
	}

}
