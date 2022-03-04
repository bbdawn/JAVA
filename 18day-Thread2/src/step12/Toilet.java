package step12;

public class Toilet implements Runnable{
	private boolean seat;//인스턴스 변수 기본 초기화 false ( 화장실을 사용하지 않는 상태 )
	@Override
	public void run() {
		String name=Thread.currentThread().getName();	
		try {
			use(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void use(String guestName) throws InterruptedException {
		if(seat==false) {
			System.out.println(guestName+" 입장");			
			seat=true;
			System.out.println(guestName+" 사용중");
			Thread.sleep(3000);
			System.out.println(guestName+" 나감");
		}else {
			System.out.println(guestName+"님 현재 화장실을 사용중이므로 입장 불가합니다");
		}
	}
}
