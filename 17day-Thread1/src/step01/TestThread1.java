package step01;
/*
 *  step1 단일 스레드 환경 -> main thread 
 *  TestThread1 program이 실행중이면 process( 현재 실행 중인 프로그램 ) 1개 
 *  이 Process 내의 실행 단위인 Thread(main thread)가 하나 실행된다
 */
//아래 프로그램을 실행한 후 main thread 종료 출력 시점을 step2.TestThread2와 비교해본다 
class SingleThreadTest{
	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("thread:"+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t=new SingleThreadTest();
		t.test();
		System.out.println("**main thread 종료**");
	}
}





