package step2;

public class TestPerson {
	//JVM�� ���� ���۽����� �������� main
	public static void main(String[] args) {
		System.out.println("main ����");
		//Person class�� �̿��� Person ��ü�� ����
		Person p=new Person();
		//��ü�� ����� name ������ ���� �޾ƿ� ��� 
		System.out.println(p.name);
		//��ü�� �޼��带 ȣ��
		p.eat();
		System.out.println("main ����");
	}
}



