package step3;

public class TestMap3 {
	public static void main(String[] args) {
		ShoppingCartService service=new ShoppingCartService();
		service.addProduct(new Product("1","�����","���ѱ�",1000));
		service.addProduct(new Product("2","�����","���ѱ�",1200));
		service.addProduct(new Product("3","�ʱ���","���",1300));
		System.out.println("��ٱ��Ͽ� ��ǰ�� �߰�");
		service.printAll(); //��ٱ��Ͽ� �ִ� ������ ��� ��� 
		System.out.println("**���̵�� ��ǰ�˻�**");
		String id="1";
		System.out.println(service.findProductById(id));
		//�� �ڵ��� ����� �Ʒ��� ���� ������ �ȴ� 
		// Product [id=1, name=�����, maker=���ѱ�, price=1000] 
		id="4";
		System.out.println(service.findProductById(id));
		//�� �ڵ��� ����� �Ʒ��� ���� ������ �ȴ� 
		//null
	}
}










