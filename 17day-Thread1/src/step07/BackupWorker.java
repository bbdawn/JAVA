package step07;

public class BackupWorker implements Runnable{
	
	public void run() {
		try {
			while(true) {
				backup();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void backup() throws InterruptedException {
		//3�� �������� ����۾��� �����Ѵ� 
		Thread.sleep(3000);
		System.out.println("��������尡 ���幮���� ���ó��");
	}
}
