package step6;

import step3.Employee;

//Car�� �θ�� Object �̴�
class Car{//extends Object --> ������ ��Ӱ��谡 �����Ƿ� �ڵ�����
	//Car(){super();} --> �����ڸ� ������� �ʾ����Ƿ� �ڵ� ����
}
public class testObject1 {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.getClass()); //Object class�κ��� ��ӹ��� �޼���, �� ��ü�� � Ŭ������ ������������� ������ ��ȯ
		Employee e=new Employee("1","���缮",300);
		System.out.println(e.getClass()); //Object class�κ��� ��ӹ��� �޼��带 ����
		//Object class�� toString()�� ȣ���ؼ� �ش� ��ü�� �ּҰ��� ��ȯ�޾� ���
		System.out.println(c.toString());
		System.out.println(c);//println �޼��� ���ο��� toString() ȣ���� ������ ���� ����ϹǷ� ������ ���.
		System.out.println(e.toString());
		System.out.println(e);
	}

}
