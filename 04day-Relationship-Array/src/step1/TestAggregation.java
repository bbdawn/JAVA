package step1;
// has a relationship : ���� ����Ʈ���� �����Ͽ� ����ϴ� ���踦 ǥ�� 
public class TestAggregation {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone("������",100);
		Customer c=new Customer();
		c.setName("������");
		c.setSmartPhone(s);
		System.out.println(c.getName());
		System.out.println(c.getSmartPhone());//����Ʈ�� ��ü �ּҰ��� ��� 
		//������ ���� ������ ����Ʈ���� �𵨸��� ��ȯ�޾� ��� 
		System.out.println(c.getSmartPhone().getModel());
		// c �� ������ ���� ����Ʈ���� ������ 200���� �����غ���
		c.getSmartPhone().setPrice(200);
		System.out.println(c.getSmartPhone().getPrice());//200
	}
}












