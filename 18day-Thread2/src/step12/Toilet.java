package step12;

public class Toilet implements Runnable{
	private boolean seat;//�ν��Ͻ� ���� �⺻ �ʱ�ȭ false ( ȭ����� ������� �ʴ� ���� )
	@Override
	public void run() {
		String name=Thread.currentThread().getName();	
		try {
			use(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void use(String guestName) throws InterruptedException {
		if(seat==false) {
			System.out.println(guestName+" ����");			
			seat=true;
			System.out.println(guestName+" �����");
			Thread.sleep(3000);
			System.out.println(guestName+" ����");
		}else {
			System.out.println(guestName+"�� ���� ȭ����� ������̹Ƿ� ���� �Ұ��մϴ�");
		}
	}
}
