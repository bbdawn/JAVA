package step04;
/*
 * 멀티 스레딩 예제
 * TestThread4 process (main thread + 영상+ 음향)
 * 
 */
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("**main thread 시작");
		VideoWorker worker1=new VideoWorker();
		Thread thread1=new Thread(worker1);
		thread1.start();
		AudioWorker worker2=new AudioWorker();
		Thread thread2=new Thread(worker2);
		thread2.start();
		System.out.println("**main thread 종료**");
	}
}
