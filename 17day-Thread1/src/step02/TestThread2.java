package step02;
/*
 * ��Ƽ ������ ȯ�� (main thread, Worker thread)���� �����ؼ� ����� step01(���Ͻ�����ȯ��)�� ���غ���
 */
class Worker extends Thread{//java.lang.Thread�� ��ӹ޴� ������� �����带 ����
	//run(): Worker �������� ���೻���� ���� -> jvm�� ���� �����尡 �����ٸ��� �Ǹ� ȣ��� �޼���
	@Override//������̼� -> �����ϰ� ����� ������ �ִ� �ǹ��ִ� �ּ� @Override -> ������ ������ ����üũ
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Worker Thread ���ϴ�"+i);
		}
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		Worker thread=new Worker();
		thread.start();//�����带 ���� ���� ���·� ������
		System.out.println("**main thread ����**");
	}
}
