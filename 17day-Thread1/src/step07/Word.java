package step07;
/*
 * word �۾� ����� �ڵ����� ����ǵ��� Backup Thread�� �����ؼ� ���� start
 */
public class Word implements Runnable{

	@Override
	public void run() {
		try {
			BackupWorker worker=new BackupWorker();
			Thread backUpThread=new Thread(worker);
			
			//backUpThread�� daemon thread�� ó���ؼ�
			//���� �����Ų Word �����尡 ����Ǹ� �Բ� ����ǵ��� ���� 
			backUpThread.setDaemon(true);
			backUpThread.start();
			execute();
			worker.backup();//���� �۾� ����Ǹ� ��������� ���ó��
			System.out.println("�����۾������尡 ����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//run
	public void execute() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println("���幮���۾� "+i);
			Thread.sleep(1000);
		}
	}//execute
}//class
