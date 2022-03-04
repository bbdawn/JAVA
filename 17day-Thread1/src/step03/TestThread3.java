package step03;
/*
 * step02의 TestThread2에서 extends Thread 방식으로 정의 
 * step03의 TestThread3에서는 implements Runnable방식으로 스레드를 정의해서 실행해본다
 *
 * 스레드 생성 두가지 방법 중 implements Runnable 방식을 더 권장하는 이유는
 * 자바는 단일상속이고 이후 별도의 클래스를 상속할 필요가 있는 경우를 대비해서이다
 * 인터페이스는 여러개를 implements 할 수 있다  
 */

class Worker implements Runnable{//implements Runnable 방식으로 스레드를 정의
	//run(): 스레드 실행 내용 정의, JVM에 의해 호출되는 메서드
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Worker Thread 일하다 "+i);
		}
	}
}
public class TestThread3 {
	public static void main(String[] args) {
		//스레드를 생성하는 방식이 step02의 extends Thread와 차이가 있다
		
		//Worker worker=new Worker();
		//Thread thread=new Thread(worker);
		
		//위 두 라인을 줄여서 쓰면 아래와 같이 쓸 수 있다
		Thread thread=new Thread(new Worker());
		thread.start();
		System.out.println("** main thread 종료 **");
	}
}
