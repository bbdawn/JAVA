package step06;
/*
 * �ϳ��� Runnable ���� Ŭ�������� �ټ��� �����带 �����ؼ� �����ϴ� ����
 * 
 * step05������ ä��Ŭ���̾�Ʈ process�� �����ߴٸ� ������ ���� �ٸ� �ΰ��� ������ (�Է½�����, ��½�����)�� �����ϰ�
 * 				�ΰ��� �����带 ����
 * step06������ ä�ü��� process�� �����Ѵٸ� ������ ä�� ���񽺸� �����ϰ� "Ŭ���̾�Ʈ�� ����ŭ �������� ������"�� ����
 *	ex) ���� �˻����񽺿� �ټ��� Ŭ���̾�Ʈ�� ���ÿ� �����ؼ� ���񽺸� ������
 *		�ټ��� Ŭ���̾�Ʈ���� ������ �˻� ���񽺸� ���ÿ� ó���ؾ��Ѵ�
 */
public class TestThread06 {	
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		ServerWorker worker=new ServerWorker();
		Thread t1=new Thread(worker,"A �����");
		t1.start();//���డ�ɻ��·� ������
		Thread t2=new Thread(worker,"B �����");
		t2.start();//���డ�ɻ��·� ������
		Thread t3=new Thread(worker,"C �����");
		t3.start();//���డ�ɻ��·� ������
		System.out.println("**main thread ����**");
	}
}
