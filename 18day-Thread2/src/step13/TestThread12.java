package step13;
/*
 * 	��Ƽ �������� ����ȭ ó���� �����ϴ� ���� 
 *  
 *  �ϳ��� ȭ��� �¼��� �ϳ��� �մ�(������)�� ����� �� �ֵ��� ����ȭ ó���� �Ѵ� 
 *  
 *  ����ȭ ó�� : synchronized keyword�� �̿��� Ư�� ������ ���� ������ ȯ������ ����� �� 
 */
public class TestThread12 {
	public static void main(String[] args) {
		Toilet toilet=new Toilet();
		Thread t1=new Thread(toilet,"�ں���");
		Thread t2=new Thread(toilet,"���ϴ�");
		Thread t3=new Thread(toilet,"����");
		t1.start();
		t2.start();
		t3.start();
	}
}
