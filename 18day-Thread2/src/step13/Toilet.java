package step13;

public class Toilet implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		try {
			use(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//����ȭ ó�� : synchronized keyword�� �̿��� Ư�� ������ ���� ������ ȯ������ ����� �� 
	// �Ѹ��� �մ��� ȭ����� �� ����� ������ �ٸ� �մԵ��� ����Ѵ� 
	//�޼��忡 synchronized ����Ͽ� �޼��� ��ü�� ����ȭ ó��
	/*
	public synchronized void use(String guestName) throws InterruptedException {
		System.out.println(guestName+"�� ����");
		System.out.println(guestName+"�� �����");
		Thread.sleep(3000);
		System.out.println(guestName+"�� ����");
	}
	*/
	// Ư�� �������� ����ȭ ó�� 
	public void use(String guestName) throws InterruptedException {
		// �ٸ� �۾��� �ִٰ� �����Ѵٸ� �Ʒ��� ���� �� ����ȭ ó���� �ʿ��� �κи� ������ ������ �� �ִ� 
		synchronized (this) {
			System.out.println(guestName+"�� ����");
			System.out.println(guestName+"�� �����");
			Thread.sleep(3000);
			System.out.println(guestName+"�� ����");
		}		
	}
}













