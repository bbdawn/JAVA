package step7;
//java.lang.Object(��� Ŭ������ �ֻ��� Ŭ����)�� toString()�� �������̵��ؼ�
//��ü�� ������ ��� ���� �Ӽ������� ��ȯ�ϵ��� �ϴ� ��������

 


public class TestObject3ToString {
	public static void main(String[] args) {
		Employee e=new Employee("1", "������", 400);
		System.out.println(e); //empNo:1 name:������ salary:400
		Manager m=new Manager("2","���ϴ�",500, "�������");
		System.out.println(m);//empNo:2 name:���ϴ� salary:500 department:�������
	}
}
