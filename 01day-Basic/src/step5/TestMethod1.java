package step5;

public class TestMethod1 {
	public static void main(String[] args) {
		//��ü ���� 
		Student s=new Student();
		s.study();//calling method �޼��� ȣ�� 
		//�Ʒ� �޼��带 ȣ���ϱ� ���ؼ��� 
		//Worker �޼��忡�� �䱸�ϴ� �Ķ����(�Ű�����)
		//�� �˸´� ������ �����ؾ� ȣ�� �����ϴ� 
		s.study2("java");
		//Student�� study3 �޼��带 ȣ���ϰ� 
		//��ȯ ������ �޾Ƽ� ��� 
		String data=s.study3("spring");
		System.out.println("main:"+data);
	}
}











