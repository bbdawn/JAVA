package step2;

import step1.Airplane;
import step1.Bird;
import step1.Flyer;

public class TestInterface2 {
	public static void main(String[] args) {
		//SuperMan class�κ��� ������ ��ü�� �پ��� ���������� �����Ǿ������Ƿ� �������� �پ��ϰ� ������ �� �ִ� (����Ÿ������ ������ �� �ִ�)
		Flyer f1=new SuperMan();
		f1.fly();
		Fighter f2=new SuperMan();
		f2.fight();
		/////////////////////////////////////////////////////////
		//���� �������̽� Ÿ���� ���� ��ü���� ��ҷ� �߰��� �� �ִ�
		Flyer[] fa= {new Airplane(),new Bird(),new SuperMan()};
		for (int i=0; i<fa.length;i++) {
			//Abstract�� ����
			//����ϴ� ���� � ��ü���� ��ü(����ü)���� ���� �������̽��� �߻�޼���(����)�� �˸� 
			//��� �پ��� ��ü����  ������ ������� �����ϰ� �� �� �ִ�!!!
			fa[i].fly();
		}
	}
}
