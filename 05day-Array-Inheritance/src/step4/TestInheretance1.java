package step4;
//���ǻ� �ڵ带 �� ���� ���� ���� �ϳ��� ���Ͽ� ���� Ŭ������ �ۼ�
class Animal{//�θ�Ŭ����
	int age;
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{//Animal�� ��ӹ޴´�. Animal�� Ȯ���ؼ� Person�� �����
	public void study() {
		System.out.println("�����ϴ�");
	}
}


public class TestInheretance1 {
	public static void main(String[] args) {
		//�ڽ� ��ü�� ����. Person�� Animal�� ��ӹ޾����Ƿ� �Ʒ��Ͱ��� Animal �θ��� eat(), age�� ����� �� �ִ�
		Person p=new Person();
		p.study();
		p.eat(); //��ӹ޾����Ƿ� ��밡��
		System.out.println(p.age);//��ӹ޾����Ƿ� ���� ���� 
		
	}
}
