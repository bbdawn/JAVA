package step6;

public class TestMethod2 {
	public static void main(String[] args) {
		//Friend ��ü ���� ( ������ f ) 
		Friend f=new Friend();
		// eat() �޼��带 ȣ���غ��� 
		f.eat();
		//�Ʒ� ȣ��ο� �����ϴ� �޼��带 ����
		f.eat2("����");//���� �Դ� 
		f.eat3("���",3);//��� 3�κ� �Դ� 
		String returnValue=f.eat4();
		System.out.println(returnValue);//ġ��
		
	}
}
