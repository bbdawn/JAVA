package step7.model;

public class TestAccessModifier2 {

	public static void main(String[] args) {
		// ������ ��Ű�������� ���� �׽�Ʈ 
		// ���� - ���ٰ��� 
		Customer c=new Customer();
		System.out.println(c.password1);
		System.out.println(c.password2);
		System.out.println(c.password3);
		//private �� �ܺ�(�ٸ� Ŭ����)���� ���ٺҰ�
		//System.out.println(c.password4);
	}

}
