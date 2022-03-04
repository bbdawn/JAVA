package step06;
/*
 * 이 클래스로부터 다수의 스레드가 생성되어 실행된다
 * 다수의 스레드에 의해 run()메서드가 실행되지만
 * 스레드별로 stack 메모리 영역이 생성되므로
 * 각각의 stack 메모리 영역에 정보가 저장되므로 
 * local variable(stack에저장)은 독립적으로 저장되고 사용된다. 
 */
/*
 * 실행의 예
B 고객상담 서버일꾼 스레드 1
C 고객상담 서버일꾼 스레드 1
A 고객상담 서버일꾼 스레드 1

A 고객상담 서버일꾼 스레드 2
C 고객상담 서버일꾼 스레드 2
B 고객상담 서버일꾼 스레드 2 

111 222 333 444~ 
스레드별로 각각의 stack메모리영역에 정보가 저장되기 때문!!
 */
public class ServerWorker implements Runnable{
	//run(): 스레드의 실행내용을 정의하는 부분. jvm이 실행하는 메서드(jvm이 스케줄링하면 실행됨). 
	@Override
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void chatting() throws InterruptedException {
		//현재 실행중인 스레드의 이름을 반환받는다
		String name=Thread.currentThread().getName();
		for(int i=0; i<10; i++) {
			System.out.println(name+" 서버일꾼 스레드 "+i);
			Thread.sleep(1000);//1초간격
		}//for
	}//method
}//class
