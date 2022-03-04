package step03;
/*
 * step02�� TestThread2���� extends Thread ������� ���� 
 * step03�� TestThread3������ implements Runnable������� �����带 �����ؼ� �����غ���
 *
 * ������ ���� �ΰ��� ��� �� implements Runnable ����� �� �����ϴ� ������
 * �ڹٴ� ���ϻ���̰� ���� ������ Ŭ������ ����� �ʿ䰡 �ִ� ��츦 ����ؼ��̴�
 * �������̽��� �������� implements �� �� �ִ�  
 */

class Worker implements Runnable{//implements Runnable ������� �����带 ����
	//run(): ������ ���� ���� ����, JVM�� ���� ȣ��Ǵ� �޼���
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Worker Thread ���ϴ� "+i);
		}
	}
}
public class TestThread3 {
	public static void main(String[] args) {
		//�����带 �����ϴ� ����� step02�� extends Thread�� ���̰� �ִ�
		
		//Worker worker=new Worker();
		//Thread thread=new Thread(worker);
		
		//�� �� ������ �ٿ��� ���� �Ʒ��� ���� �� �� �ִ�
		Thread thread=new Thread(new Worker());
		thread.start();
		System.out.println("** main thread ���� **");
	}
}
