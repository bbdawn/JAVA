package step1;

class Person{
	int money1; //instance variable, heap�� ����
	static int money2;// static variable, meta space�� ����
	public void test1() {
		System.out.println("Object�� method test1"); //��ü ���� �� ȣ�� ����
	}
	public static void test2() {//��ü ���� ���� Ŭ���������� ȣ�Ⱑ��
		System.out.println("Class�� method test2");
	}
}


public class TestStatic1 {
	public static void main(String[] args) {
		//�ٸ� Ŭ�������� �Ϲ� instance variable�� ������ ��쿡�� ��ü ������ �ʿ�!!
		Person p=new Person();
		System.out.println(p.money1);
		//�ٸ� Ŭ�������� static member(variable)�� ������ ��쿡�� ������ ��ü �������� Ŭ���������� ���� ����!!
		System.out.println(Person.money2); //Ŭ������.static���
		//System.out.println(Person.money1); //static�� �ƴϹǷ� error
		//method�� ����
		p.test1();// ��ü ���� �� ȣ�� ����
		Person.test2();// ��ü ���� ���� Ŭ���������� ȣ�� ����
	}
}

