package step5;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e=new Employee("1","������",300);
		System.out.println(e.getDetails());
		//�� �ڵ带 �����ϸ� �Ʒ��� ���� ��µȴ�
		//empNo:1 name:������ salary:300
		//return �������!!
		
		Manager m=new Manager("2","�ں���",400,"��������");
		System.out.println(m.getDetails());//�������̵��� �޼��� ȣ���ϱ�
		//empNo:2 name:�ں��� salary:400 department:��������
		//empNo~salary������ super.get~ ����ϱ�! 
		
		Engineer en=new Engineer("3", "���ϴ�", 500, "�ڹ�");
		System.out.println(en.getDetails());
		//empNo.3 name:���ϴ� salary:500 skill:�ڹ�
		
	}
}
