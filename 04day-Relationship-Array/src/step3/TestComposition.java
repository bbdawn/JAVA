package step3;
//Car�� Engine�� ������ ����. 
//TestComposition + Car + Engine
public class TestComposition {
	public static void main(String[] args) {
		//composition, consist of
		Car c=new Car("K5");//Car ��ü �����ϸ� Engine ��ü�� �Բ� �����ȴ�. 
		System.out.println(c.getModel());
		
		//c�� �����ϴ� Car ��ü�� ���� type�� ��ȯ�޾� ���
		System.out.println(c.getEngine().getType());
		
		//c�� �����ϴ� Car ��ü�� ���� ��ⷮ�� 3000���� ����
		c.getEngine().setDisplacement(3000);
		
		//����� ���� ��ⷮ�� ���
		System.out.println(c.getEngine().getDisplacement());
		
		
		
	}
}
