package step1;

class Customer{
	static String name; //meta space ����, �ϳ��� ������ �����Ͱ� ���� //������->�ں���
	Customer(String name){
		Customer.name=name;
	}
}

public class TestStatic5 {
	public static void main(String[] args) {
		//Customer c1=new Customer("������");
		System.out.println(Customer.name);//metaspace: ������
		//Customer c2=new Customer("�ں���");
		System.out.println(Customer.name);//metaspace: �ں���(������ ������ �����ؼ�;���ְ� ����)
		System.out.println(Customer
				.name);//metaspace: �ں���
		//System.out.println(c1.name);//metaspace: �ں���
		
	}
}
