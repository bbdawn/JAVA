package step2;
//�������� �ߴ� ����ó�������� �����ϴ� ������
/*
 * �����������ϱ�
 * 1. �������� ������
 * 	����: a->b->c->e
 * 
 * 2. ���������� ������
 * 	����: b->d->e
 * 
 */
public class TestThrow2 {
	public static void main(String[] args) {
		ReviewService service=new ReviewService();
		int money=100; //�������� ������
		money=0; //���������� ������
		try {
			service.deposit(money);
			System.out.println("c");
		} catch (ReviewException e) {
			System.out.println("d");
			System.out.println(e.getMessage());
		}
		System.out.println("e");
		
		
		
	}//main
}//class
