package step07;
/*
 * word 작업 진행시 자동으로 백업되도록 Backup Thread를 생성해서 실행 start
 */
public class Word implements Runnable{

	@Override
	public void run() {
		try {
			BackupWorker worker=new BackupWorker();
			Thread backUpThread=new Thread(worker);
			
			//backUpThread를 daemon thread로 처리해서
			//현재 실행시킨 Word 스레드가 종료되면 함께 종료되도록 설정 
			backUpThread.setDaemon(true);
			backUpThread.start();
			execute();
			worker.backup();//워드 작업 종료되면 명시적으로 백업처리
			System.out.println("워드작업스레드가 종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//run
	public void execute() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println("워드문서작업 "+i);
			Thread.sleep(1000);
		}
	}//execute
}//class
