package step1;

public class TestItemService {
	public static void main(String[] args) {
		ItemVO []items= {
				new ItemVO("�����","���ѱ�",1200),
				new ItemVO("¥�İ�Ƽ","���",1500),
				new ItemVO("�Ҵߺ�����","���",1700),
		};
		ItemService service=new ItemService();
		//service.printItemNames(items);
		
		int price=1600;
		//price �� 1600 �̸� ������ ���� ��ǰ���� name�� price�� ���
		service.printItemNameAndPriceLessThanPrice(items,price);
		
		
	}//main
}//class
