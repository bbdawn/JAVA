package step14;
// ��Ƽ ������ ȯ�濡�� ����ȭ ó���� �ʿ伺 �� ó���� �� 
// synchronzied �� �̿��� ����ȭ ó���� ���� ������
//���� �¼��� �����ϰ� �ȴ� -> ����ȭ ó���� �ʿ�!
// reserve() �޼��忡 synchronized�� ������� �ʴ� �Ͱ�
// �ϴ� ���� �������� ���غ��� 
public class TestThread13 {
	public static void main(String[] args) {
		Theater theater=new Theater();
		Thread t1=new Thread(theater,"�ں���");
		Thread t2=new Thread(theater,"���ϴ�");
		t1.start();
		t2.start();
	}
}
