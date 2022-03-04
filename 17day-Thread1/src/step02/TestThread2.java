package step02;
/*
 * 멀티 스레드 환경 (main thread, Worker thread)에서 실행해서 결과를 step01(단일스레드환경)과 비교해본다
 */
class Worker extends Thread{//java.lang.Thread를 상속받는 방법으로 스레드를 정의
	//run(): Worker 스레드의 실행내용을 정의 -> jvm에 의해 스레드가 스케줄링이 되면 호출될 메서드
	@Override//어노테이션 -> 컴파일과 실행시 영향을 주는 의미있는 주석 @Override -> 컴파일 시점에 문법체크
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Worker Thread 일하다"+i);
		}
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		Worker thread=new Worker();
		thread.start();//스레드를 실행 가능 상태로 보낸다
		System.out.println("**main thread 종료**");
	}
}
