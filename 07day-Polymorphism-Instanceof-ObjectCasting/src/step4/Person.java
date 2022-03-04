package step4;

public class Person extends Animal{
	//메서드 오버라이딩 
	public void play() {
		System.out.println("사람이 데이트하며 놀다");
	}
	// Person의 독자적인 멤버(메서드) 정의 
	public void ticketing() {
		System.out.println("사람이 티켓을 구매하다");
	}
}
