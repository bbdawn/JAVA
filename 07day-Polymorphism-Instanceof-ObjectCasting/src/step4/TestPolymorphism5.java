package step4;
/*
 *  ������ ���� �Ű����� 
 *  instanceof ������ Ȱ�� 
 *  Object Casting Ȱ�� 
 */
public class TestPolymorphism5 {
	public static void main(String[] args) {
		ZooService3 service=new ZooService3();
		service.enter(new Tiger());
		service.enter(new Monkey());
		service.enter(new Person());
		/*
		 	ȣ���̰� ����ϸ� ��� 
		 	�����̰� ����Ÿ�� ��� 
		 	����� Ƽ���� �����ϴ�
		 	����� ����Ʈ�ϸ� ��� 
		 */
	}
}
