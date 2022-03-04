package step05;
/*
 * 멀티 스레드 예제
 * 채팅 클라이언트 프로세스(main thread + 친구들의 메세지를 서버로부터 입력받는 thread + 자신의 메세지를 서버로 출력하는 thread)
 */
public class TestThread5 {
	public static void main(String[] args) {
		Thread inputThread=new Thread(new InputWorker());
		Thread outputThread=new Thread(new OutputWorker());
		inputThread.start();
		outputThread.start();
		System.out.println("**main thread 종료**");
	}
}
