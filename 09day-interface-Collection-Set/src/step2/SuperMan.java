package step2;

import step1.Flyer;

//�ϳ��� Ŭ�������� �پ��� �������̽��� ������ �� �ִ�
public class SuperMan implements Flyer,Fighter{

	@Override
	public void fight() {
		System.out.println("���۸��� �Ǵ�� �ο��");
		
	}

	@Override
	public void fly() {
		System.out.println("���۸��� ����");
		
	}

}
