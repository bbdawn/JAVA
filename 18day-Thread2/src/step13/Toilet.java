package step13;

public class Toilet implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		try {
			use(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//동기화 처리 : synchronized keyword를 이용해 특정 영역을 단일 스레드 환경으로 만드는 것 
	// 한명의 손님이 화장실을 다 사용할 때까지 다른 손님들은 대기한다 
	//메서드에 synchronized 명시하여 메서드 전체를 동기화 처리
	/*
	public synchronized void use(String guestName) throws InterruptedException {
		System.out.println(guestName+"님 입장");
		System.out.println(guestName+"님 사용중");
		Thread.sleep(3000);
		System.out.println(guestName+"님 퇴장");
	}
	*/
	// 특정 영역에만 동기화 처리 
	public void use(String guestName) throws InterruptedException {
		// 다른 작업이 있다고 가정한다면 아래와 같이 꼭 동기화 처리가 필요한 부분만 영역을 지정할 수 있다 
		synchronized (this) {
			System.out.println(guestName+"님 입장");
			System.out.println(guestName+"님 사용중");
			Thread.sleep(3000);
			System.out.println(guestName+"님 퇴장");
		}		
	}
}













