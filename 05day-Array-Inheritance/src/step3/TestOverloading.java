package step3;

public class TestOverloading {
	public static void main(String[] args) {
		//Method Overloading Test : ������ �޼���(������)������ �پ��� �Ű������� �����ؼ����
		Person p=new Person();
		p.eat(); //eat() �Դ� ��µ�
		p.eat("�ܹ���"); //�ܹ��� �Դ�
		p.eat(3); //3�κ� �Դ�
		p.eat("���", 3); //��� 3�κ� �Դ�
	}
}
