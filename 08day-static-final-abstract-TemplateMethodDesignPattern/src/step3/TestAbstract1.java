package step3;
//abstract class�� Ư¡�� Ȯ���ϴ� ����
//abstract class�� new�� ��ü������ �� ����
//abstract class�� ��ӹ��� �ڽ� class�� ��ü������ �� �θ�μ� ��ü������ �����ϴ�
//�� abstract class�� �θ�Ŭ�����μ��� ���ҿ� �����Ѵ�

abstract class Person{
	int age=1;
	Person(){
		System.out.println("Person ��ü ����");
	}
	public void eat() {
		System.out.println("�Դ�");
	}

}

class Student extends Person{
	Student(){ super(); //Person ������ �����ؼ� Person ��ü�� ����
		System.out.println("Student ��ü ����");
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Person p=new Person(); //error: abstract class�� ������üȭ�� �� ���� (new�� �����Ұ�)
		Student s=new Student();
		s.eat();
		System.out.println(s.age);
		//�翬�� �θ�Ÿ������ �ڽİ�ü�� ������ �� �ֵ�
	}

}
