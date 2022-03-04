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
		//3초 간격으로 백업작업을 진행한다 
		Thread.sleep(3000);
		System.out.println("백업스레드가 워드문서를 백업처리");
	}
}
