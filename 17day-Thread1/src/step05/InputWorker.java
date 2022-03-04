package step05;

public class InputWorker implements Runnable {
	//jvm에 의해 호출되는 메서드
	@Override
	public void run() {
		try {
			input();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void input() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println("친구들의 메세지를 입력받는 스레드"+i);
			Thread.sleep(1000);//1초간 중단했다가 다시 실행
		}
	}
}
