package step4;

class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Rabbit extends Animal{
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� �����θ� ������
	//�������̵� ��Ģ : ���������ڴ� �θ� ������ �Ϳ��� ������ �������� �� ��. (�о����� �� �������)
	//					����Ÿ��, �Ű�����, �޼������ ��ġ�ؾ��Ѵ�.
	public void eat() {
		System.out.println("�䳢�� ä���ϴ�");
		//���� �θ��� eat()�� ȣ���ϰ� �ʹٸ� super�� �̿��ϸ� �ȴ�
		//super.eat();
	}
}
public class TestOverriding {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat(); //�Դ�
		Rabbit r=new Rabbit();
		r.eat();//�䳢�� ä���ϴ� //�������̵��� �޼��尡 ȣ��ǰԵ�.
		
	}

}
