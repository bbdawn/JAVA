package step7;

public class TestReferenceType {
	public static void main(String[] args) {
		/*
		 * Product : ������ Ÿ�� reference type
		 * p: �������� reference variable 
		 */
		
		//Product p; 	// ��ü �ȸ������. ������ ����س��� ������ 
						//��ǰ��,������,���� �Է��ؾ���
		Product p=new Product("�׶�","����",1410);
		
		//�Ʒ� ��ü�� ������ ����������
		//�ּҰ��� �Ҵ��ϴ� �޸� �׸��� 
		//3���� ĥ��.pdf 4page�� ����
		//���������� stack�� �����.
		//p-> heap�� �ִ� ��ü �����ϴ� ����. 
		//��ü�� heap�� �����.(�ּҰ��� ������)
		
		Product p2=new Product("ī��","�λ�",1410);
		
		
		//p��ü �ּҰ��� p2 ������ �Ҵ���Ѽ� �����ϰ� �Ѵ�.
		p2=p;
		
		System.out.println(p.getName()); // ��� : �׶�
		System.out.println(p2.getName()); // ��� : �׶�
		
		
		
	}
}
