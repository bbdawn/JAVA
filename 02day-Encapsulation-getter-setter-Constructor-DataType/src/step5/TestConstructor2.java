package step5;

public class TestConstructor2 {
	public static void main(String[] args) {
		//1.�ƹ� ���Ǿ��� �ſ�ī�� ��ü�� �����Ѵ�
		CreditCard c1=new CreditCard();
		//2.��ü ���� �� ���������� �Ҵ��Ѵ�
		c1.setPersonalInfo("������ ��������");
		System.out.println(c1.getPersonalInfo());
		
		System.out.println("***********");
		
		//�� �ڵ� error : ���������� �������� ������ ��ü ���� �Ұ�
		//CreditCard c2=new CreditCard2();
		
		//�Ʒ��� ���� ���������� �����ؾ߸�
		//�ſ�ī�� ��ü�� ������ �� �ִ�.
		CreditCard2 c2=new CreditCard2("�ں��� ��������");
		System.out.println(c2.getPersonalInfo());
		//���� �������� �����Ǹ� setter�� �̿��ϸ� �ȴ�. 
		c2.setPersonalInfo("����� �ں��� ��������");
		System.out.println(c2.getPersonalInfo());
	}
	
	
}
