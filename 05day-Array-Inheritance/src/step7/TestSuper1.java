package step7;
//���ǻ� �ϳ��� ���Ͽ��� ���� Ŭ������ ���� (���� ���߽ÿ��� ���Ϻ��� Ŭ������ ����� ���� ����)
//super.���(����or�޼���)�� �θ� Ŭ������ ����� �����غ��� ����

class Parent{
	String name="�θ� �̸�";
}

class Child extends Parent{
	String name="�ڽ� �̸�";
	public void printInfo() {
		System.out.println(name); //�ڽ��̸� //���� �ڽ� ��ü�� name
		System.out.println(super.name);//�θ��̸� //super�� �̿��� �θ��� name�� ������ ���
	}
}

public class TestSuper1 {
	public static void main(String[] args) {
		//�ڽ� ��ü ���� �� �׽�Ʈ
		Child c=new Child();
		c.printInfo();
	}

}
