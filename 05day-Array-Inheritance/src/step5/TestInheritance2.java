package step5;
/*
 * ��� �� Animal �θ��� ���(����,�޼���)�� �����޴���
 * �ڽ� Person������ �θ��� private member�� ���� ������ �� ����
 * �ʿ�� getter setter�� ���ؼ� �����ϸ� �ȴ�. 
 */
public class TestInheritance2 {
	public static void main(String[] args) {
		Person p=new Person();
		p.study();
		p.eat(); //��ӹ޾����Ƿ� ��� ����
		
		
	
		//��ӹ޾Ҵ��� Ŭ������ �ٸ���
		//private member(����,�޼���)���� ���� �Ұ�
		//compile error
		//System.out.println(p.age);
		//�θ��� setter getter�� �����ϸ� ��
		p.setAge(11);
		System.out.println(p.getAge());
		
		
	}//main
}//class
