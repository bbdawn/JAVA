package step04;

public class VideoWorker implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("영상서비스 스레드 실행"+i);
			try {
				Thread.sleep(200);//0.2초간 실행 멈추고 다시 재개
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//run
}//class
