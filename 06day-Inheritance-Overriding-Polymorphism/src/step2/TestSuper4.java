package step2;
// super() ������ ���� ����ؾ� �ϴ� ��쿡 ���� ���� 
//�θ� Ŭ���� 
class Animal{
	int age;
	//�θ� Ŭ�������� �Ű������� �ִ� �����ڸ� ����غ��� 
	Animal(int age){
		this.age=age;
	}
	//Animal(){}// �ذ��� 1) �θ� Ŭ������ ������ �����ε��� �ϸ� �ڽ��� �⺻ �����ڿ����� ��ü ������ �� �� �ִ� 
}
class Person extends Animal{
	//�����ڸ� ������� ������ �Ʒ��� ���� �⺻ �����ڰ� �����Ͻÿ� ���Եȴ� 
	//�Ʒ��� super()�� �Ű������� ���� �θ��� �⺻ �����ڸ� ȣ���ϴ� �� �θ�� �Ű������� �ִ� �����ڸ� 
	//�����Ƿ� compile error 
	//Person(){super(); } 
	// �ذ��� 2) �ڽ� Ŭ�������� �����ڸ� �����ϰ� �θ� �������� �Ű������� �˸´� ���ڸ� �����ϴ� super(age)�� ���
	//				 �� ����� ��������� 
	Person(int age){
		super(age);// �θ��� ������ �Ű��������� �ʿ�� �ϴ� ���ڸ� ���� 
	}
}
public class TestSuper4 {
	public static void main(String[] args) {
		Person p=new Person(22);
		System.out.println(p.age);
	}
}















