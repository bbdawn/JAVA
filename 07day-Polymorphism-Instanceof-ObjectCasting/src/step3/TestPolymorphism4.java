package step3;
// Polymorphism ����� Ư¡ , Object Casting ��� 
class Animal{
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
	//�ڽ��� �������� �޼��� ���� 
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}
public class TestPolymorphism4 {
	public static void main(String[] args) {
		Animal a=new Person(); // �θ� Ÿ���� ������ �ڽ� ��ü�� �����غ��� 
		a.sleep();//��ӹ޾����Ƿ� ���డ�� 
		a.eat();//�������̵� �� �ڽ��� �޼��尡 ���� 
		((Person) a).study();//�ڽ��� ������ ���(�޼���,����)�� �����ϱ� ���ؼ���
		// Object Casting�� �ʿ� 
	}
}







